package com.dataguise.webservices.beans;

import java.util.List;

import javax.validation.Valid;

public class DgSqoopTaskBean {
	
	@Valid
	private DgSqoopTaskParam taskParams;
	private List<DgSqoopColumnList> columnList;
	private Integer clusterId;
	private List<DgSqoopTaskParam> loadSqoopTaskList;
	

	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public DgSqoopTaskParam getTaskParams() {
		return taskParams;
	}
	public void setTaskParams(DgSqoopTaskParam taskParams) {
		this.taskParams = taskParams;
	}
	public List<DgSqoopColumnList> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<DgSqoopColumnList> columnList) {
		this.columnList = columnList;
	}
	public List<DgSqoopTaskParam> getLoadSqoopTaskList() {
		return loadSqoopTaskList;
	}
	public void setLoadSqoopTaskList(List<DgSqoopTaskParam> loadSqoopTaskList) {
		this.loadSqoopTaskList = loadSqoopTaskList;
	}

	
}
