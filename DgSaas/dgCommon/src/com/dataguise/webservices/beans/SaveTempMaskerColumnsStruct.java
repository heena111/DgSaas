package com.dataguise.webservices.beans;

import java.util.List;

public class SaveTempMaskerColumnsStruct {
	
	private List<DgPolicyStruct> policyIdsList;
	private List<DgDatabasesStruct> databasesList;
	private Integer connectionId;
	public List<DgPolicyStruct> getPolicyIdsList() {
		return policyIdsList;
	}
	public void setPolicyIdsList(List<DgPolicyStruct> policyIdsList) {
		this.policyIdsList = policyIdsList;
	}
	public List<DgDatabasesStruct> getDatabasesList() {
		return databasesList;
	}
	public void setDatabasesList(List<DgDatabasesStruct> databasesList) {
		this.databasesList = databasesList;
	}
	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	
	
	

}
