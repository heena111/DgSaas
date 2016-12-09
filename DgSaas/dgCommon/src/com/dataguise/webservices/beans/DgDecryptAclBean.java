package com.dataguise.webservices.beans;

import java.util.List;

public class DgDecryptAclBean {

	private Integer clusterId;
	private List<RoleAclInfoBean> roleAclInfoBeanList;
	
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public List<RoleAclInfoBean> getRoleAclInfoBeanList() {
		return roleAclInfoBeanList;
	}
	public void setRoleAclInfoBeanList(List<RoleAclInfoBean> roleAclInfoBeanList) {
		this.roleAclInfoBeanList = roleAclInfoBeanList;
	}
	
}
