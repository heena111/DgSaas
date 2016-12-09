package com.dataguise.webservices.beans;

public class ChangePassStruct {
	private String userName;
	private String newPassword;
	private String oldPassword;
	private Integer rndNum;
	
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String value) 
	{
		userName=value;	
	}
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	public Integer getRndNum() {
		return rndNum;
	}
	public void setRndNum(Integer rndNum) {
		this.rndNum = rndNum;
	}

	
}
