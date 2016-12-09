package com.dataguise.ldap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;

public class LdapTest {
	  public static void main(String[] args) throws DgException  {
		  String url = "ldap://localhost:10389";
			String userName = "uid=admin,ou=system";
			String password = "secret";
			 String userBase = "ou=dataguise,dc=example,dc=com";
			 
			 
			 DirContext ctx = null;
			try {		 
				 ctx = getLdapContext(userName,password,url);
				 SearchControls sc = new SearchControls();
				 sc.setSearchScope(SearchControls.ONELEVEL_SCOPE);
				 
				 List<String> usersList = getUsers(ctx,sc,userBase);
				// System.out.println(usersList);
				 
				 HashMap<String, List<String>> map = getGroupUsersMap(ctx,sc,userBase,usersList);
				// System.out.println(map);
			} catch(Exception e){
				throw DgExceptionUtil.createException(ErrorConstants.LDAP_ERROR,e.getMessage(), e.getCause().getMessage());
			}
			finally{
				if(ctx!=null){
					LDAPConnectionUtil.closeConnection(ctx);	
				}
			}
	    }

	private static HashMap<String, List<String>> getGroupUsersMap(DirContext ctx, SearchControls sc , String userBase, List<String> usersList) {
		
		HashMap<String,List<String>> groupUsersMap = new HashMap<String, List<String>>();	
		
		for(String userName:usersList){        
			   
			String[] groupNamesArr = getGroupNameFromUserName(ctx,sc,userBase,userName);
			     //TODO: harmin: Ideally, we should send all the users also which are not part of any group,
			     //but since right now monitoring agent also does not sends these users therefore keeping it as it is
			     if(groupNamesArr!= null){
			    	 for(String groupName:groupNamesArr){
				    	 if(groupUsersMap.containsKey(groupName)){
								groupUsersMap.get(groupName).add(userName);
							 }else{
								List<String> groupUsersList=new ArrayList<String>();
								groupUsersList.add(userName);
	
								groupUsersMap.put(groupName, groupUsersList);
							}
				     }
			     }
			     
		}
		
		return groupUsersMap;
	}

	private static String[] getGroupNameFromUserName(DirContext ctx, SearchControls sc , String userBase, String userName) {

		List<String> groupNameList = new ArrayList<String>();
		
		String filter = "(|(&(member= cn="+ userName +","+ userBase + ")(objectclass=groupOfNames))(&(uid= "+ userName +")(objectclass=posixGroup)))";
	    
	    NamingEnumeration results;
		try {
			results = ctx.search(userBase, filter, sc);
			while (results.hasMore()) {
			      SearchResult sr = (SearchResult) results.next();
			      Attributes attrs = sr.getAttributes();

			      Attribute attr = attrs.get("cn");
			      String groupName = (String) attr.get();
		          groupNameList.add(groupName);
			      
			    }
			    
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
        String[] groupNamesArr = groupNameList.toArray(new String[groupNameList.size()]);

		return groupNamesArr;
	}

	private static List<String> getUsers(DirContext ctx, SearchControls sc , String userBase) {
		
		List<String> usersList=new ArrayList<String>();	 
	    String filter = "(|(objectclass=organizationalPerson)(objectClass=person)(objectClass=posixAccount)(objectClass=user))";
	    
	    NamingEnumeration results;
		try {
			results = ctx.search(userBase, filter, sc);
			while (results.hasMore()) {
			      SearchResult sr = (SearchResult) results.next();
			      Attributes attrs = sr.getAttributes();

			      Attribute attr = attrs.get("cn");
			      String userName = (String) attr.get();
		          usersList.add(userName);
			      
			    }
			    
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return usersList;
	}
	
	public static DirContext getLdapContext(String userName, String password,String url)
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
			DirContext ctx = new InitialDirContext(env);
			return ctx;
		}
		catch (NamingException e) {
			e.printStackTrace();
		}
		return null;

	}
}
