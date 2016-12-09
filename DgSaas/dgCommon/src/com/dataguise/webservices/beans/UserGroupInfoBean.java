package com.dataguise.webservices.beans;

import java.util.List;

public class UserGroupInfoBean {

	private String groupName;
	private Integer GID;
	private String value;
	private List<UserDetailsBean> usersInGroup;
	private boolean group;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	 
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<UserDetailsBean> getUsersInGroup() {
		return usersInGroup;
	}
	public void setUsersInGroup(List<UserDetailsBean> usersInGroup) {
		this.usersInGroup = usersInGroup;
	}
	public Integer getGID() {
		return GID;
	}
	public void setGID(Integer gID) {
		GID = gID;
	}
	public boolean isGroup() {
		return group;
	}
	public void setGroup(boolean group) {
		this.group = group;
	}
	
}
