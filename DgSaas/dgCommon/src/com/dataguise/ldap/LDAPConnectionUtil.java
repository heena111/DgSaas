package com.dataguise.ldap;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

import org.apache.log4j.Logger;

import com.dataguise.ldap.beans.LDAPConnectionParams;
import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;

public class LDAPConnectionUtil {

	private static Logger logger = Logger.getLogger(LDAPConnectionUtil.class);
	
	public static LdapContext openConnection(LDAPConnectionParams connectionParams) throws DgException {
	        
        String url = connectionParams.getProtocol()+ "://"+connectionParams.getLdapServer()+":"+connectionParams.getLdapPort();
        if(connectionParams.getProtocol().equals("ldaps")){
        	loadSSLProperties(connectionParams.getTrustStoreLocation(),connectionParams.getTrustStorePassword());
        }
        return getLdapContext(connectionParams.getLdapUser(),connectionParams.getLdapPassword(),url);
        
		
	}

	public static void closeConnection(DirContext ctx) throws DgException {
		try {
			ctx.close();
		} catch (Exception e) {
			throw DgExceptionUtil.createException(e, ErrorConstants.LDAP_ERROR,e.getMessage(), null);
		}
	}
	

	public static void loadSSLProperties(String trustStoreLocation, String trustStorePassword) {
		if (trustStoreLocation != null &&trustStoreLocation.length() > 1) {
	   	 		System.setProperty("javax.net.ssl.trustStore", trustStoreLocation);
	   	 	}
	   	 	
	   	 	if (trustStorePassword != null && trustStorePassword.length() > 1) {
	   	 		System.setProperty("javax.net.ssl.trustStorePassword",trustStorePassword);
	   	 	}	
	    }

	/**
	 * Gets the Directory context.
	 * @param userName
	 * @param password
	 * @param url
	 * @return
	 * @throws DgException 
	 */
	public static LdapContext getLdapContext(String userName, String password,String url) throws DgException
	{
		
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.PROVIDER_URL, url );
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
  
		if (userName != null && userName.length() > 0){
			env.put(Context.SECURITY_AUTHENTICATION, "simple");
			env.put(Context.SECURITY_PRINCIPAL, userName);
			if (password != null && password.length() > 0){
				env.put(Context.SECURITY_CREDENTIALS, password);
			}
		}
		try {
			LdapContext ctx = new InitialLdapContext(env, null);
			logger.debug("Connection to AD is successful");
			return ctx;
		}
		catch (Exception e) {
			logger.error("Error getting Directory Context ",e);
			return null;
			//throw DgExceptionUtil.createException(e, ErrorConstants.LDAP_ERROR,"Connection to AD is not successful.Please try with the correct credentials",null);
		}
	 
	}//getLdapContext
	public static LdapContext validateLogin(String userName, String userPassword,String url) {
		Hashtable<String, String> env = new Hashtable<String, String>();

		env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL,url);

		if (userName != null && userName.length() > 0){
			env.put(Context.SECURITY_AUTHENTICATION, "simple");
			env.put(Context.SECURITY_PRINCIPAL,userName);
			if (userPassword != null && userPassword.length() > 0){
				env.put(Context.SECURITY_CREDENTIALS, userPassword);
			}
		}
		// To get rid of the PartialResultException when using Active Directory
		env.put(Context.REFERRAL, "follow");
		LdapContext ctx;
		try {
			ctx = new InitialLdapContext(env,null);
		} catch (NamingException e) {
			return null;
		}

		NamingEnumeration<SearchResult> results = null;

		try {
			SearchControls controls = new SearchControls();
			controls.setSearchScope(SearchControls.SUBTREE_SCOPE); // Search Entire Subtree
			controls.setCountLimit(1);   //Sets the maximum number of entries to be returned as a result of the search
			controls.setTimeLimit(5000); // Sets the time limit of these SearchControls in milliseconds

			String searchString = "(&(objectCategory=user)(userPrincipalName=" + userName + "))";

			results = ctx.search("", searchString, controls);

			if (results.hasMore()) {

				SearchResult result = (SearchResult) results.next();
				Attributes attrs = result.getAttributes();
				Attribute dnAttr = attrs.get("distinguishedName");
				String dn = (String) dnAttr.get();
				// User Exists, Validate the Password
				env.put(Context.SECURITY_PRINCIPAL, dn);
				env.put(Context.SECURITY_CREDENTIALS, userPassword);
				new InitialLdapContext(env,null); // Exception will be thrown on Invalid case
				return ctx;
			} 
			else {	return null; }
		} catch (Exception e) { // Invalid Login
			return null;
		}
		finally {
			if (results != null) {
				try { results.close(); } catch (Exception e) { }

				if (ctx != null) {
					try { ctx.close(); } catch (Exception e) {  }
				}
			}
		}
	}
}
