package com.dataguise.webservices.beans;

import java.util.List;

import javax.validation.Valid;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

@XmlRootElement
public class DgSearchFileTask extends DgBaseBean {

	protected Integer serialId;
	protected Integer taskID;
	
	@NotEmpty(message = "Task Name:"+BeanValidator.EMPTY_FIELD)
	@Size(max=128 , message = "Task Name:"+BeanValidator.MAX_SIZE_128)
	@Pattern(regexp = BeanValidator.FILE_NAME_REGEX , message = BeanValidator.INVALID_TASK_NAME)
	protected String taskName;
	
	@NotEmpty(message = "Task Description:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Task Description:"+BeanValidator.INVALID_CHARACTER_SET)
	@Size(max=256 , message = "Task Description:"+BeanValidator.MAX_SIZE_256)
	protected String taskDescription;
	// protected String expressionList;
	
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Scan Locations:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String scanLocations;
	protected String scanServerIPAddress;
	@NotEmpty(message = "File Types to scan:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "File Types to scan:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String scanFileTypeIds;
	protected String createdOn;
	protected String lastExecutedOn;
	protected boolean fileTypeExclude;
	protected String networkMapIdList;
	protected String createdBy;
	@NotEmpty(message = "Task Type:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Task Type:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String taskType;
	protected Boolean incrementalDiscovery;
	
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Policy Ids:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String policyIds;
	protected List<DgExpressionListBean> expressionList;
	@Valid
	protected List<DgFileConnectionBean> connList;

	public DgSearchFileTask() {

	}

	public List<DgFileConnectionBean> getConnList() {
		return connList;
	}

	public void setConnList(List<DgFileConnectionBean> connList) {
		this.connList = connList;
	}

	public List<DgExpressionListBean> getExpressionList() {
		return expressionList;
	}

	public void setExpressionList(List<DgExpressionListBean> expressionList) {
		this.expressionList = expressionList;
	}

	/**
	 * @return the taskID
	 */
	public Integer getTaskID() {
		return taskID;
	}

	/**
	 * @param taskID
	 *            the taskID to set
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
	 * @param taskName
	 *            the taskName to set
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
	 * @param taskDescription
	 *            the taskDescription to set
	 */
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	/**
	 * @return the expressionList
	 */
	// public String getExpressionList() {
	// return expressionList;
	// }
	// /**
	// * @param expressionList the expressionList to set
	// */
	// public void setExpressionList(String expressionList) {
	// this.expressionList = expressionList;
	// }
	/**
	 * @return the scanLocations
	 */
	public String getScanLocations() {
		return scanLocations;
	}

	/**
	 * @param scanLocations
	 *            the scanLocations to set
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
	 * @param scanServerIPAddress
	 *            the scanServerIPAddress to set
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
	 * @param scanFileTypeIds
	 *            the scanFileTypeIds to set
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
	 * @param fileTypeExclude
	 *            the fileTypeExclude to set
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
	 * @param serialId
	 *            the serialId to set
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
	 * @param createdOn
	 *            the createdOn to set
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
	 * @param lastExecutedOn
	 *            the lastExecutedOn to set
	 */
	public void setLastExecutedOn(String lastExecutedOn) {
		this.lastExecutedOn = lastExecutedOn;
	}

	/**
	 * @return the networkMapIdList
	 */
	public String getNetworkMapIdList() {
		return networkMapIdList;
	}

	/**
	 * @param networkMapIdList
	 *            the networkMapIdList to set
	 */
	public void setNetworkMapIdList(String networkMapIdList) {
		this.networkMapIdList = networkMapIdList;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Boolean getIncrementalDiscovery() {
		return incrementalDiscovery;
	}

	public void setIncrementalDiscovery(Boolean incrementalDiscovery) {
		this.incrementalDiscovery = incrementalDiscovery;
	}

	public String getPolicyIds() {
		return policyIds;
	}

	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
	}
}
