package com.dataguise.webservices.beans;

public class LDAPConnectionParams {

	private String ldapServer;
	private Integer ldapPort;
	private String ldapUser;
	private String ldapPassword;
	private String ldapUserBase;
	private String protocol;
	private String attributeAclFile;
	private String pageSize;
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
