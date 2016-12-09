
package com.dataguise.webservices.beans;

public class DgDiscoverFileTask extends DgBaseBean{
   
	protected Integer serialId;
    protected Integer taskID;
    protected String taskName;
    protected String taskDescription;
    protected String expressionList;
    protected String scanLocations;
    protected String scanServerIPAddress;
    protected String scanFileTypeIds;
    protected String createdOn;
    protected String lastExecutedOn;
    protected boolean fileTypeExclude;
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
	 */
	public String getExpressionList() {
		return expressionList;
	}
	/**
	 * @param expressionList the expressionList to set
	 */
	public void setExpressionList(String expressionList) {
		this.expressionList = expressionList;
	}
	/**
	 * @return the scanLocations
	 */
	public String getScanLocations() {
		return scanLocations;
	}
	/**
	 * @param scanLocations the scanLocations to set
	 */
	public void setScanLocations(String scanLocations) {
		this.scanLocations = scanLocations;
	}
	/**
	 * @return the scanServerIPAddress
	 */
	public String getScanServerIPAddress() {
		return scanServerIPAddress;
	}
	/**
	 * @param scanServerIPAddress the scanServerIPAddress to set
	 */
	public void setScanServerIPAddress(String scanServerIPAddress) {
		this.scanServerIPAddress = scanServerIPAddress;
	}
	/**
	 * @return the scanFileTypeIds
	 */
	public String getScanFileTypeIds() {
		return scanFileTypeIds;
	}
	/**
	 * @param scanFileTypeIds the scanFileTypeIds to set
	 */
	public void setScanFileTypeIds(String scanFileTypeIds) {
		this.scanFileTypeIds = scanFileTypeIds;
	}
	/**
	 * @return the fileTypeExclude
	 */
	public boolean isFileTypeExclude() {
		return fileTypeExclude;
	}
	/**
	 * @param fileTypeExclude the fileTypeExclude to set
	 */
	public void setFileTypeExclude(boolean fileTypeExclude) {
		this.fileTypeExclude = fileTypeExclude;
	}
	/**
	 * @return the serialId
	 */
	public Integer getSerialId() {
		return serialId;
	}
	/**
	 * @param serialId the serialId to set
	 */
	public void setSerialId(Integer serialId) {
		this.serialId = serialId;
	}
	/**
	 * @return the createdOn
	 */
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
    
}
