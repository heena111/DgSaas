package com.dataguise.webservices.beans.discover;

import com.dataguise.util.DBMSConstants.DBMSTaskType;

public class DBMSResultsAndStatusFactory {
	private DBMSTaskType taskType;
	private Object results;
	private Object status;
	
	public DBMSTaskType getTaskType() {
		return taskType;
	}
	
	public void setTaskType(DBMSTaskType taskType) {
		this.taskType = taskType;
	}
	
	public Object getResults() {
		return results;
	}
	
	public void setResults(Object results) {
		this.results = results;
	}
	
	public Object getStatus() {
		return status;
	}
	
	public void setStatus(Object status) {
		this.status = status;
	}
}
