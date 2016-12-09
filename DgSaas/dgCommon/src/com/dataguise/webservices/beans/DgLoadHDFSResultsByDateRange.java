package com.dataguise.webservices.beans;

public class DgLoadHDFSResultsByDateRange {
	
	String fromDate;
	String toDate;
	Integer recordsOffset;
	Integer recordsCount;
	String sortColumn;
	Boolean sortByDesc;
	Integer clusterId;
	Boolean groupResults;
	String taskType;
	
	
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
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
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	
	

}
