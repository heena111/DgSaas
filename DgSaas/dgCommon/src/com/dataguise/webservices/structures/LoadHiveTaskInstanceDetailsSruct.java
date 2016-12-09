package com.dataguise.webservices.structures;

public class LoadHiveTaskInstanceDetailsSruct {
	
	private Integer taskInstanceId;
	private Integer recordsOffset;
	private Integer recordsCount;
	private String sortColumn;
	private Boolean sortByDesc;	

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
	

}
