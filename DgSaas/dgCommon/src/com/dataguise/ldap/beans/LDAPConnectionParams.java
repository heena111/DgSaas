package com.dataguise.ldap.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.dataguise.util.BeanValidator;

public class LDAPConnectionParams {

	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Server :"+ BeanValidator.INVALID_CHARACTER_SET)
	private String ldapServer;
	private Integer ldapPort;
	@Size(max=128, message="User Name:"+BeanValidator.MAX_SIZE_128)
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="User Name:"+BeanValidator.INVALID_CHARACTER_SET)
	private String ldapUser;
	@Size(max=128, message="Password:"+BeanValidator.MAX_SIZE_128)
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Password:"+BeanValidator.INVALID_CHARACTER_SET)
	private String ldapPassword;
	@Size(max=128, message="User Base:"+BeanValidator.MAX_SIZE_128)
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="User Base:"+BeanValidator.INVALID_CHARACTER_SET)
	private String ldapUserBase;
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Protocol:"+BeanValidator.INVALID_CHARACTER_SET)
	private String protocol;
	@Size(max=500, message="Attribute ACL File:"+BeanValidator.MAX_SIZE_500)
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Attribute ACL File:"+BeanValidator.INVALID_CHARACTER_SET)
	private String attributeAclFile;
	@Size(max=500, message="Page Size:"+BeanValidator.MAX_SIZE_500)
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Page Size:"+BeanValidator.INVALID_CHARACTER_SET)
	private String pageSize;
	@Size(max=500, message="User Object Class:"+BeanValidator.MAX_SIZE_500)
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="User Object Class:"+BeanValidator.INVALID_CHARACTER_SET)
	private String userObjectClass;

	private String trustStoreLocation;
	private String trustStorePassword;
	
	 
	public String getTrustStoreLocation() {
		return trustStoreLocation;
	}

	public void setTrustStoreLocation(String trustStoreLocation) {
		this.trustStoreLocation = trustStoreLocation;
	}

	public String getTrustStorePassword() {
		return trustStorePassword;
	}

	public void setTrustStorePassword(String trustStorePassword) {
		this.trustStorePassword = trustStorePassword;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getLdapServer() {
		return ldapServer;
	}

	public void setLdapServer(String ldapServer) {
		this.ldapServer = ldapServer;
	}

	public Integer getLdapPort() {
		return ldapPort;
	}

	public void setLdapPort(Integer ldapPort) {
		this.ldapPort = ldapPort;
	}

	public String getLdapUser() {
		return ldapUser;
	}

	public void setLdapUser(String ldapUser) {
		this.ldapUser = ldapUser;
	}

	public String getLdapPassword() {
		return ldapPassword;
	}

	public void setLdapPassword(String ldapPassword) {
		this.ldapPassword = ldapPassword;
	}

	public String getLdapUserBase() {
		return ldapUserBase;
	}

	public void setLdapUserBase(String ldapUserBase) {
		this.ldapUserBase = ldapUserBase;
	}

	public String getAttributeAclFile() {
		return attributeAclFile;
	}

	public void setAttributeAclFile(String attributeAclFile) {
		this.attributeAclFile = attributeAclFile;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserObjectClass() {
		return userObjectClass;
	}

	public void setUserObjectClass(String userObjectClass) {
		this.userObjectClass = userObjectClass;
	}
	
	
}
