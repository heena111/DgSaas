package com.dataguise.webservices.beans;

import java.util.List;

/**
 * @author Arun
 *
 */
public class DgSqoopTaskInfo {

	private List<DgSqoopTaskParam> loadSqoopTaskList;
	private int totalRecords;
	
	public List<DgSqoopTaskParam> getLoadSqoopTaskList() {
		return loadSqoopTaskList;
	}
	public void setLoadSqoopTaskList(List<DgSqoopTaskParam> loadSqoopTaskList) {
		this.loadSqoopTaskList = loadSqoopTaskList;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	
}
