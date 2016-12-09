package com.dataguise.webservices.beans.hive;

import java.util.List;

import com.dataguise.webservices.beans.DgBaseBean;

public class DgHiveSaveMaskerTaskStruct extends DgBaseBean {
	public  Integer taskID;
	public String taskName;
	public String taskDescription;
	public String taskType;
	public String databaseName;
	public List<DgHiveTablesStruct> hivetableStructList;
	public String policyIds;
	
	
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
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public List<DgHiveTablesStruct> getHivetableStructList() {
		return hivetableStructList;
	}
	public void setHivetableStructList(List<DgHiveTablesStruct> hivetableStructList) {
		this.hivetableStructList = hivetableStructList;
	}
	public String getPolicyIds() {
		return policyIds;
	}
	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
	}
	
	
	
	
		
	
}
