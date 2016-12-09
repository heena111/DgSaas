package com.dataguise.webservices.beans;

import java.util.List;

/**
 * @author Arun
 *
 */
public class DgSqoopTaskInstanceWrraper {

	private List<DgUITaskInstance> dgUITaskInstanceList;
	
	private int totalRecords;
	public List<DgUITaskInstance> getDgUITaskInstanceList() {
		return dgUITaskInstanceList;
	}
	public void setDgUITaskInstanceList(List<DgUITaskInstance> dgUITaskInstanceList) {
		this.dgUITaskInstanceList = dgUITaskInstanceList;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
}
