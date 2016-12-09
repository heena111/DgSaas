package com.dataguise.webservices.beans.hive;

import java.util.List;

import com.dataguise.webservices.beans.DgTaskInstancePolicyDetails;


public class DgHiveTaskInstanceDetails {

	protected String createdBy;
	protected List<DgHiveTaskResults> dgHiveTaskResultList;
	protected String taskDescription;
	protected String taskName;
	protected String taskType;
	protected List<String> expressionNames;
	protected String policyNames;
	protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
	protected Long totalRows;
	protected String startTime;
	protected Integer taskInstanceId;
	protected String databaseName;
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public List<DgHiveTaskResults> getDgHiveTaskResultList() {
		return dgHiveTaskResultList;
	}
	public void setDgHiveTaskResultList(List<DgHiveTaskResults> dgHiveTaskResultList) {
		this.dgHiveTaskResultList = dgHiveTaskResultList;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public List<String> getExpressionNames() {
		return expressionNames;
	}
	public void setExpressionNames(List<String> expressionNames) {
		this.expressionNames = expressionNames;
	}
	public String getPolicyNames() {
		return policyNames;
	}
	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
	}
	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		return dgTaskInstancePolicyDetails;
	}
	public void setDgTaskInstancePolicyDetails(
			List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails) {
		this.dgTaskInstancePolicyDetails = dgTaskInstancePolicyDetails;
	}
	public Long getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(Long totalRows) {
		this.totalRows = totalRows;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	
	
}
