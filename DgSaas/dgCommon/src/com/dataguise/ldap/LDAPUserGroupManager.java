package com.dataguise.ldap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.Control;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.PagedResultsControl;
import javax.naming.ldap.PagedResultsResponseControl;

import org.apache.log4j.Logger;

import com.dataguise.ldap.beans.LDAPConnectionParams;
import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.LdapObjectClassesInfo;


public class LDAPUserGroupManager {

	private static Logger logger = Logger.getLogger(LDAPUserGroupManager.class);
	public static  List<LdapUserStruct> getUserGroupInfo(LdapObjectClassesInfo objectClassesInfo,LDAPConnectionParams connectionParams, String aclFileAttribute,Integer pageSize,String ObjectClassesForUser,LinkedHashMap<String,Boolean> objectClassCollectionMap) throws DgException{
		List<LdapUserStruct> usersList = new ArrayList<LdapUserStruct>();
		return getLdapObjects(objectClassesInfo,connectionParams,aclFileAttribute,usersList,pageSize,ObjectClassesForUser,objectClassCollectionMap);
	}

	private static  List<LdapUserStruct> getLdapObjects(LdapObjectClassesInfo objectClassesInfo,LDAPConnectionParams connectionParams, String aclFileAttribute,List<LdapUserStruct> usersList,Integer pageSize,String ObjectClassesForUser,LinkedHashMap<String,Boolean> objectClassCollectionMap) throws DgException {
		LdapContext ctx = null;

		try {
			ctx  = LDAPConnectionUtil.openConnection(connectionParams);			
			SearchControls sc = new SearchControls();
			sc.setSearchScope(objectClassesInfo.getSearchScope().equals("ONELEVEL_SCOPE")? SearchControls.ONELEVEL_SCOPE : (objectClassesInfo.getSearchScope().equals("SUBTREE_SCOPE")? SearchControls.SUBTREE_SCOPE : SearchControls.OBJECT_SCOPE ));		
			String filter = objectClassesInfo.getFilter();
			return getPagedResults(ctx,pageSize,objectClassesInfo.getSearchDn(), filter, sc,usersList,aclFileAttribute,ObjectClassesForUser,objectClassCollectionMap);
		}
		catch(DgException e){
			throw e;
		}
		catch(Exception e){
			throw DgExceptionUtil.createException(e, ErrorConstants.LDAP_ERROR,"User Base passed is incorrect",null);
		}
		finally {
			if(ctx!=null){
				try {
					ctx.close();
				} catch (NamingException e) {
					logger.error("Error while closing the DirContext");
					e.printStackTrace();
				}
			}
		}
	}

	private static  List<LdapUserStruct> getPagedResults(LdapContext ctx,int pageSize,String searchDn,String filter,SearchControls searchScope,List<LdapUserStruct> usersList,String aclFileAttribute,String ObjectClassesForUser,LinkedHashMap<String,Boolean> objectClassCollectionMap) throws NamingException, IOException, DgException{
		// Activate paged results
		byte[] cookie = null;
		ctx.setRequestControls(new Control[] { new PagedResultsControl(pageSize,Control.NONCRITICAL) });


		NamingEnumeration<SearchResult> results = null;
		do {

			results =  ctx.search(searchDn,filter,searchScope);
			//	        if(results == null || !(results.hasMoreElements())){
			//				logger.info("No results found for the passed base DN String");
			//				throw DgExceptionUtil.createException(ErrorConstants.LDAP_ERROR,"No results found for the passed base DN String",null);
			//			}
		
				getUserList(results,usersList,aclFileAttribute,ObjectClassesForUser,objectClassCollectionMap);
		
			// Examine the paged results control response
			Control[] controls = ctx.getResponseControls();
			if (controls != null) {
				for (int i = 0; i < controls.length; i++) {
					if (controls[i] instanceof PagedResultsResponseControl) {
						PagedResultsResponseControl prrc = (PagedResultsResponseControl) controls[i];
						cookie = prrc.getCookie();
					}
				}
			} else {
				System.out.println("No controls were sent from the server");
			}
			// Re-activate paged results
			ctx.setRequestControls(new Control[] { new PagedResultsControl(
					pageSize, cookie, Control.CRITICAL) });
		} while (cookie != null);

//		try{
//			if(usersList == null || usersList.size()==0){
//				logger.info("No results found for the passed base DN String");
//				throw DgExceptionUtil.createException(ErrorConstants.LDAP_ERROR,"No results found for the passed base DN String","No results found for the passed base DN String");
//			}
//		}
//		catch(DgException e){
//			e.printStackTrace();
//			throw e;
//		}
		return  usersList;
	}

	public static List<LdapUserStruct> getUserList(NamingEnumeration<SearchResult> searchResults,List<LdapUserStruct> usersList, String aclFileAttribute,String ObjectClassesForUser,LinkedHashMap<String, Boolean> objectClassCollectionMap) {

		Attribute attrKey = null;
		Attributes attrs = null;
		try {

			while (searchResults.hasMore()) {
				LdapUserStruct ldapBean = new LdapUserStruct();
				attrs = searchResults.next().getAttributes();
				if (attrs==null || attrs.size()==0){
					logger.debug("No attributes found for the User.");
					continue;
				}
				attrKey = attrs.get("cn");
				if (attrKey == null)
					logger.debug("cn attribute not found for a user entity. This user will not be picked up for ACL");
				else
					ldapBean.setCn((String) attrKey.get());

				Attribute attr1 = attrs.get(aclFileAttribute);
				ldapBean.setAclUserNameAttributeValue((attr1 != null) ? (String) attr1.get() : ldapBean.getCn());//TODO: check for cnUserName 		
				if (ldapBean.getAclUserNameAttributeValue()!=null)
					ldapBean.setValue(ldapBean.getAclUserNameAttributeValue());

				else{
					attrKey = attrs.get("name");
					if (attrKey == null)
						logger.debug("name attribute not found for a user entity. This user will be diplayed without text");
					else
						ldapBean.setValue((String) attrKey.get());
				}
				
				attrKey = attrs.get("distinguishedName");
				String dnText = "";
				
				if (attrKey == null)
					logger.debug("distinguished name attribute not found for a user entity. This user will be diplayed without dn string ");				
				else {
					ldapBean.setDn(((String)attrKey.get()).toLowerCase());
					dnText = "{" + ldapBean.getDn() + "}";
				}
				
				ldapBean.setText(ldapBean.getValue() + dnText);
				
								
				attrKey =attrs.get("member");
				if (attrKey == null)  
					logger.debug("member attribute not found for a user entity. This user will be diplayed without member attribute ");
				else  
					ldapBean.setMemeber((String)attrKey.get());

				ldapBean.setLeaf(false);
				ldapBean.setCollection(false);
				ldapBean.setExpanded(false);
				List<String> memberOfString =new  ArrayList<String>();
				Attribute memberOfAttr = attrs.get("memberOf");
				if (memberOfAttr != null) {
					NamingEnumeration<?>  vals =   memberOfAttr.getAll();					
					while (vals.hasMoreElements()) {
						memberOfString.add((String) vals.nextElement());   
					}
					ldapBean.setMemberOf(memberOfString);
				}

				List<String> objectClassString =new  ArrayList<String>();
				Attribute objectClass = attrs.get("objectClass");  
				String objectClassVal="";
				if (objectClass != null) {
					NamingEnumeration<?> values = objectClass.getAll();	
					boolean isLeaf = false;
					while (values.hasMoreElements()) {
						objectClassVal=(String) values.nextElement();
						objectClassString.add(objectClassVal);

						// Set leaf value
						if (!isLeaf && Pattern.compile("\\b" + objectClassVal + "\\b",Pattern.CASE_INSENSITIVE).matcher(ObjectClassesForUser).find()) {
							ldapBean.setLeaf(true);
							isLeaf = true;
						}
					}
					// Find the collection value
					boolean keyFound = false;
					mainloop:
					for (String e : objectClassCollectionMap.keySet()) {
						for(String classVal: objectClassString){
							if (e.equalsIgnoreCase(classVal)) {
								ldapBean.setCollection(objectClassCollectionMap.get(e));
								keyFound = true;
								break mainloop;
							}
						}
					}
					
					// If class not defined, set the collection value of default class
					if (!keyFound) {
						ldapBean.setCollection(objectClassCollectionMap.get("default"));
					}
				}
				ldapBean.setObjectClass(objectClassString); 
				usersList.add(ldapBean);
			}
		
		}catch (NamingException e) {
			e.printStackTrace();
		}
		return usersList;

	} 
}




