package com.dataguise.webservices.beans;

import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class DgSqoopTaskParam {

	private Integer taskID;
	@NotEmpty(message="Task Name"+BeanValidator.EMPTY_FIELD)
    @Size(max=128,message="Task Name:"+BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="Task Name:"+BeanValidator.INVALID_CHARACTER_SET)
	private String taskName;
	@NotEmpty(message="Task Description"+BeanValidator.EMPTY_FIELD)
    @Size(max=256,message="Task Description:"+BeanValidator.MAX_SIZE_256)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="Task Description:"+BeanValidator.INVALID_CHARACTER_SET)
	private String taskDescription;
	private String lastUpdatedTime;
	private Integer connectionId;	
	private String policyIds;
	private String destDir;
	@NotEmpty(message="TaskType"+BeanValidator.EMPTY_FIELD)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="TaskType:"+BeanValidator.INVALID_CHARACTER_SET)
	private String taskType;
	@NotEmpty(message="OutputFormat"+BeanValidator.EMPTY_FIELD)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="OutputFormat:"+BeanValidator.INVALID_CHARACTER_SET)
	private String outputFormat;
	private Integer mappersNumber;
	private Integer reducersNumber;
	
	private List<DgSqoopColumnList> columnList;
	
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
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	public String getPolicyIds() {
		return policyIds;
	}
	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public List<DgSqoopColumnList> getColumnList() {
		return columnList;
	}
	public void setColumnList(List<DgSqoopColumnList> columnList) {
		this.columnList = columnList;
	}
	public String getDestDir() {
		return destDir;
	}
	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public void setMappersNumber(Integer mappersNumber) {
		this.mappersNumber = mappersNumber;
	}
	public Integer getMappersNumber() {
		return mappersNumber;
	}
	public void setReducersNumber(Integer reducersNumber) {
		this.reducersNumber = reducersNumber;
	}
	public Integer getReducersNumber() {
		return reducersNumber;
	}

}
