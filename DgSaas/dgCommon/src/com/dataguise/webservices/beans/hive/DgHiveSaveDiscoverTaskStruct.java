package com.dataguise.webservices.beans.hive;

import java.util.List;

public class DgHiveSaveDiscoverTaskStruct {
	Integer taskID;
	String taskName;
	String taskDescription;
	String taskType;
	String databaseName;
	Integer clusterId;
	Integer orgId;
	List<String> tableName;
	String policyIds;
	List<Integer> regexPatternList;
	List<DgHiveTablesStruct> hivetableStructlist;
	Boolean isInclusion;
	List<DgHiveFiltersStruct> hiveFilters;

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

	public List<Integer> getRegexPatternList() {
		return regexPatternList;
	}

	public void setRegexPatternList(List<Integer> regexPatternList) {
		this.regexPatternList = regexPatternList;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public List<String> getTableName() {
		return tableName;
	}

	public void setTableName(List<String> tableName) {
		this.tableName = tableName;
	}

	public Integer getTaskID() {
		return taskID;
	}

	public void setTaskID(Integer taskID) {
		this.taskID = taskID;
	}

	public String getPolicyIds() {
		return policyIds;
	}

	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
	}

	public List<DgHiveTablesStruct> getHivetableStructlist() {
		return hivetableStructlist;
	}

	public void setHivetableStructlist(
			List<DgHiveTablesStruct> hivetableStructlist) {
		this.hivetableStructlist = hivetableStructlist;
	}

	public Integer getClusterId() {
		return clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	
	/**
	 * @return the isInclusion
	 */
	public Boolean getIsInclusion() {
		return isInclusion;
	}

	/**
	 * @param isInclusion the isInclusion to set
	 */
	public void setIsInclusion(Boolean isInclusion) {
		this.isInclusion = isInclusion;
	}

	/**
	 * @return the hiveFilters
	 */
	public List<DgHiveFiltersStruct> getHiveFilters() {
		return hiveFilters;
	}

	/**
	 * @param hiveFilters the hiveFilters to set
	 */
	public void setHiveFilters(List<DgHiveFiltersStruct> hiveFilters) {
		this.hiveFilters = hiveFilters;
	}

}
