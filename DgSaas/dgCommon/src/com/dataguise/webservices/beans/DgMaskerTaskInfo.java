package com.dataguise.webservices.beans;

/**
 * @author Rahul
 * This is a Java class Entity to contain the information of a DgSecure Masker Task Basic Information. 
 */
public class DgMaskerTaskInfo {
	
	protected Integer taskID;
	protected String taskName;
	protected String taskDescription;
	protected String createdBy;
	protected String createdOn;
	protected String updatedOn;
	protected String taskType;
	protected String connectionList;
	

	public Integer getTaskID() {
		return taskID;
	}
	public void setTaskID(Integer taskID) {
		this.taskID = taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getConnectionList() {
		return connectionList;
	}
	public void setConnectionList(String value) {
		this.connectionList = value;
	}
}
