package com.dataguise.webservices.beans;

public class DgUser {
	private Integer userId=-1;
	private boolean active;
	private String userName;
	private String lastName;
	private String firstName;
	private String emailAddress;
	private String otherInfo;
	private String dnString;
	private Integer roleId;
	private Integer domainId;


	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public String getOtherInfo() {
		return this.otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getDnString() {
		return dnString;
	}

	public void setDnString(String dnString) {
		this.dnString = dnString;
	}
	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}

	public Integer getDomainId() {
		return domainId;
	}
}
