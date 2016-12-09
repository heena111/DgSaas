package com.dataguise.webservices.beans;

public class RoleAclInfoBean extends AclInfo{
	
	private String roleName;
	private String roleDesc;

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
}
