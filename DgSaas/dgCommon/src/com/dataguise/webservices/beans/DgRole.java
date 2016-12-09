package com.dataguise.webservices.beans;



public class DgRole {
	

	private Integer roleId ;
	private Boolean active;
	private String roleName;
	private String roleDesc;
	private Integer userNos;

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}
	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @return the roleDesc
	 */
	public String getRoleDesc() {
		return roleDesc;
	}
	/**
	 * @return the userNos
	 */
	public Integer getUserNos() {
		return userNos;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * @param roleDesc the roleDesc to set
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	/**
	 * @param userNos the userNos to set
	 */
	public void setUserNos(Integer userNos) {
		this.userNos = userNos;
	}


	
	
	

}
