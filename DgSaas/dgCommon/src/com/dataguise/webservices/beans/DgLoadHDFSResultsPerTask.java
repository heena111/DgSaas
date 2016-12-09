package com.dataguise.webservices.beans;

public class DgLoadHDFSResultsPerTask {
	
	Integer taskId;
	Integer recordsOffset;
	Integer recordsCount;
	String sortColumn;
	Boolean sortByDesc;
	
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
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

}
