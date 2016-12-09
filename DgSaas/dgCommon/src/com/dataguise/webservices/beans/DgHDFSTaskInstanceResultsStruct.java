package com.dataguise.webservices.beans;

public class DgHDFSTaskInstanceResultsStruct {

	private Integer taskInstanceId;
	private Integer recordsOffset;
	private Integer recordsCount;
	private String sortColumn;
	private Boolean sortByDesc;	
	private String status;
	private String taskType;
	private Integer clusterId;
	private Boolean groupResults;

	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public Integer getRecordsOffset() {
		return recordsOffset;
	}

	public void setRecordsOffset(Integer recordsOffset) {
		this.recordsOffset = recordsOffset;
	}

	public Integer getRecordsCount() {
		return recordsCount;
	}

	public void setRecordsCount(Integer recordsCount) {
		this.recordsCount = recordsCount;
	}

	public String getSortColumn() {
		return sortColumn;
	}

	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public Boolean getSortByDesc() {
		return sortByDesc;
	}

	public void setSortByDesc(Boolean sortByDesc) {
		this.sortByDesc = sortByDesc;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}


	public Integer getClusterId() {
		return clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}


	public Boolean getGroupResults() {
		return groupResults;
	}

	public void setGroupResults(Boolean groupResults) {
		this.groupResults = groupResults;
	}

	
}
