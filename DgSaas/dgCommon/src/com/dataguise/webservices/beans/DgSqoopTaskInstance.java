package com.dataguise.webservices.beans;


/**
 * @author Arun
 *
 */
public class DgSqoopTaskInstance {

	protected Integer taskInstanceID;
	protected String taskName;
	protected String startTime ;
	protected String endTime;
	protected String status ;
	protected Integer totalTables ;
	protected Integer totalProcessedTables ;
	protected Integer taskId;
	protected String taskDefType;
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
	public Integer getTotalTables() {
		return totalTables;
	}
	public void setTotalTables(Integer totalTables) {
		this.totalTables = totalTables;
	}
	public Integer getTotalProcessedTables() {
		return totalProcessedTables;
	}
	public void setTotalProcessedTables(Integer totalProcessedTables) {
		this.totalProcessedTables = totalProcessedTables;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskDefType() {
		return taskDefType;
	}
	public void setTaskDefType(String taskDefType) {
		this.taskDefType = taskDefType;
	}

}
