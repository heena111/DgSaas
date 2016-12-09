/**
 * 
 */
package com.dataguise.webservices.beans;

/**
 * @author Jaspaul
 *
 */
public class DgDiscoverTaskInstance {
	protected Integer taskInstanceID;
	protected String taskName;
	protected String startTime ;
	protected String endTime;
	protected String status ;
	protected Integer totalRecords ;
	protected Integer recordsScanned ;
	
	public Integer getTaskInstanceID() {
		return taskInstanceID;
	}
	
	public void setTaskInstanceID(Integer taskInstanceID) {
		this.taskInstanceID = taskInstanceID;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalRecords() {
		return totalRecords;
	}
	
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Integer getRecordsScanned() {
		return recordsScanned;
	}
	
	public void setRecordsScanned(Integer recordsScanned) {
		this.recordsScanned = recordsScanned;
	}
	
}


