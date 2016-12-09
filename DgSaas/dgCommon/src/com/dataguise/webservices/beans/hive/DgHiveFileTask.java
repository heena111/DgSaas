
package com.dataguise.webservices.beans.hive;

import java.util.List;
import com.dataguise.webservices.beans.DgBaseBean;
import com.dataguise.webservices.beans.DgExpressionListBean;
import com.dataguise.webservices.beans.DgTaskInstancePolicyDetails;

public class DgHiveFileTask extends DgBaseBean{
   
	
    protected Integer taskID;
    protected String taskName;
    protected String taskDescription;
    protected String createdOn;
    protected String lastExecutedOn;
    protected String createdBy;
    protected List<DgExpressionListBean> expressionList;
    protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
    protected String taskType;
    protected String creatorName;
    protected String policyIds;
    protected String databaseName;
    protected List<String> tableName;
    protected List<DgHiveFieldSchema> hivetableStructlist;
    protected Boolean isInclusion;
	protected List<DgHiveFiltersStruct> hiveFilters;
    
	/**
	 * @return the taskID
	 */
	public Integer getTaskID() {
		return taskID;
	}
	/**
	 * @param taskID the taskID to set
	 */
	public void setTaskID(Integer taskID) {
		this.taskID = taskID;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the taskDescription
	 */
	public String getTaskDescription() {
		return taskDescription;
	}
	/**
	 * @param taskDescription the taskDescription to set
	 */
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	/**
	 * @return the expressionList
	 *//*
	public String getExpressionList() {
		return expressionList;
	}
	*//**
	 * @param expressionList the expressionList to set
	 *//*
	public void setExpressionList(String expressionList) {
		this.expressionList = expressionList;
	}*/
	
	
	public String getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the lastExecutedOn
	 */
	public String getLastExecutedOn() {
		return lastExecutedOn;
	}
	/**
	 * @param lastExecutedOn the lastExecutedOn to set
	 */
	public void setLastExecutedOn(String lastExecutedOn) {
		this.lastExecutedOn = lastExecutedOn;
	}
	
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
    
	
	
	/**
	 * @return the expressionList
	 */
	public List<DgExpressionListBean> getExpressionList() {
		return expressionList;
	}
	/**
	 * @param expressionList the expressionList to set
	 */
	public void setExpressionList(List<DgExpressionListBean> expressionList) {
		this.expressionList = expressionList;
	}
	
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
		
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	
	public String getPolicyIds() {
		return policyIds;
	}
	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
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
	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		return dgTaskInstancePolicyDetails;
	}
	public void setDgTaskInstancePolicyDetails(
			List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails) {
		this.dgTaskInstancePolicyDetails = dgTaskInstancePolicyDetails;
	}
	public List<DgHiveFieldSchema> getHivetableStructlist() {
		return hivetableStructlist;
	}
	public void setHivetableStructlist(List<DgHiveFieldSchema> hivetableStructlist) {
		this.hivetableStructlist = hivetableStructlist;
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
