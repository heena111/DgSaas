package com.dataguise.webservices.structures;

public class DgDiscoverFileTaskParameters {
	protected Double fileSizeToBeScanned;
	protected Integer nodesToScan;
	protected Integer searchTaskInstanceID;
	protected Integer showSampleData;
	protected Integer structuredFilesRows;
	protected String taskType;
	protected Integer agentId;
	
	public Double getFileSizeToBeScanned() {
		return fileSizeToBeScanned;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public void setFileSizeToBeScanned(Double fileSizeToBeScanned) {
		this.fileSizeToBeScanned = fileSizeToBeScanned;
	}
	public Integer getNodesToScan() {
		return nodesToScan;
	}
	public void setNodesToScan(Integer nodesToScan) {
		this.nodesToScan = nodesToScan;
	}
	public Integer getSearchTaskInstanceID() {
		return searchTaskInstanceID;
	}
	public void setSearchTaskInstanceID(Integer searchTaskInstanceID) {
		this.searchTaskInstanceID = searchTaskInstanceID;
	}
	public Integer getShowSampleData() {
		return showSampleData;
	}
	public void setShowSampleData(Integer showSampleData) {
		this.showSampleData = showSampleData;
	}
	public Integer getStructuredFilesRows() {
		return structuredFilesRows;
	}
	public void setStructuredFilesRows(Integer structuredFilesRows) {
		this.structuredFilesRows = structuredFilesRows;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	
	
}
