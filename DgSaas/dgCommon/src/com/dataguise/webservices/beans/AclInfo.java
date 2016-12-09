package com.dataguise.webservices.beans;

import java.util.List;

import com.dataguise.ldap.LdapUserStruct;

public class AclInfo {
 
	protected Integer roleId;
	private List<LdapUserStruct> collections;
	private List<LdapUserStruct> users;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public List<LdapUserStruct> getUsers() {
		return users;
	}

	public void setUsers(List<LdapUserStruct> users) {
		this.users = users;
	}
	public List<LdapUserStruct> getCollections() {
		return collections;
	}

	public void setCollections(List<LdapUserStruct> collections) {
		this.collections = collections;
	}

}
