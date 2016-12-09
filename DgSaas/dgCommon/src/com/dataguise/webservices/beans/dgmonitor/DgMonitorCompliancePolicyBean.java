package com.dataguise.webservices.beans.dgmonitor;

import java.sql.Timestamp;

public class DgMonitorCompliancePolicyBean {
	
	private Integer id;

	private String compliancePolicyName;

	private Timestamp createts;

	private Timestamp updatets;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompliancePolicyName() {
		return compliancePolicyName;
	}

	public void setCompliancePolicyName(String compliancePolicyName) {
		this.compliancePolicyName = compliancePolicyName;
	}

	public Timestamp getCreatets() {
		return createts;
	}

	public void setCreatets(Timestamp createts) {
		this.createts = createts;
	}

	public Timestamp getUpdatets() {
		return updatets;
	}

	public void setUpdatets(Timestamp updatets) {
		this.updatets = updatets;
	}

}
