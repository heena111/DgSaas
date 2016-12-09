
package com.dataguise.webservices.beans;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;


public class DgHadoopFileTask extends DgBaseBean{
   
	protected Integer serialId;
    protected Integer taskID;
    
    @NotEmpty(message="Task Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=128,message="Task Name:"+BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.HADOOP_NAME_REGEX , message=BeanValidator.INVALID_TASK_NAME)
    protected String taskName;
    
	@NotEmpty(message="Task Description:"+BeanValidator.EMPTY_FIELD)
	@Size(max=256,message="Task Description:"+BeanValidator.MAX_SIZE_256)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Task Description:"+BeanValidator.INVALID_CHARACTER_SET)
    protected String taskDescription;
   //protected String expressionList;
    @Valid
	protected List<HadoopScanPathInfo> hadoopScanPathInfoList;
    protected String scanServerIPAddress;
    protected String scanFileTypeIds;
    protected String createdOn;
    protected String lastExecutedOn;
    protected boolean fileTypeExclude;
    protected String networkMapIdList;
    protected String createdBy;
    protected String hadoopAgent;
    protected List<DgExpressionListBean> expressionList;
 
    @NotEmpty(message="Task Type:"+BeanValidator.EMPTY_FIELD)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Task Type:"+BeanValidator.INVALID_CHARACTER_SET)
    protected String taskType;
    protected String creatorName;
    protected Boolean incrementalDiscovery;
    protected String policyIds;
    protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;  
    protected String outputColumnForm;
    protected Boolean deleteOriginal;
    protected Boolean structured;
    protected String valueSeparator;
    protected Boolean verifyStructure;
    protected String taskDefPolicies;
    protected Integer clusterId;
    protected Integer orgId;
    protected Integer samplingPercentage;
    protected Boolean discoveryCriteria;
    protected String numberOfRows;
    protected Boolean fullFileScan;
    protected Boolean skippedFlag;
    protected Integer skipCounter;
    protected String fileModStartTime;
    protected String fileModEndTime;
    protected List<String> excludedFileExtensions;
    protected List<String> excludedScanPathList;
    protected Boolean deleteExclusionList;
    protected Integer batchSize;
    protected String batchOption;
    
    public Boolean getDeleteExclusionList() {
		return deleteExclusionList;
	}
	public void setDeleteExclusionList(Boolean deleteExclusionList) {
		this.deleteExclusionList = deleteExclusionList;
	}
	public List<String> getExcludedFileExtensions() {
		return excludedFileExtensions;
	}
	public void setExcludedFileExtensions(List<String> excludedFileExtensions) {
		this.excludedFileExtensions = excludedFileExtensions;
	}
	public List<String> getExcludedScanPathList() {
		return excludedScanPathList;
	}
	public void setExcludedScanPathList(List<String> excludedScanPathList) {
		this.excludedScanPathList = excludedScanPathList;
	}
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
	/**
	 * @return the networkMapIdList
	 */
	public String getNetworkMapIdList() {
		return networkMapIdList;
	}
	/**
	 * @param networkMapIdList the networkMapIdList to set
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
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
    
	
	/**
	 * @return the hadoopAgent
	 */
	public String getHadoopAgent() {
		return hadoopAgent;
	}
	/**
	 * @param hadoopAgent the hadoopAgent to set
	 */
	public void setHadoopAgent(String hadoopAgent) {
		this.hadoopAgent = hadoopAgent;
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
	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		return dgTaskInstancePolicyDetails;
	}
	public void setDgTaskInstancePolicyDetails(
			List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails) {
		this.dgTaskInstancePolicyDetails = dgTaskInstancePolicyDetails;
	}
	
	public List<HadoopScanPathInfo> getHadoopScanPathInfoList() {
		return hadoopScanPathInfoList;
	}
	public void setHadoopScanPathInfoList(
			List<HadoopScanPathInfo> hadoopScanPathInfoList) {
		this.hadoopScanPathInfoList = hadoopScanPathInfoList;
	}
	
	public static Comparator<DgHadoopFileTask> SORT_BY_CREATED_BY=new Comparator<DgHadoopFileTask>() {

		@Override
		public int compare(DgHadoopFileTask o1, DgHadoopFileTask o2) {
			// TODO Auto-generated method stub
			return o1.createdBy.compareToIgnoreCase(o2.createdBy);
		}
	};
	
	public static Comparator<DgHadoopFileTask> SORT_BY_CREATED_BY_DESC=new Comparator<DgHadoopFileTask>() {

		@Override
		public int compare(DgHadoopFileTask o1, DgHadoopFileTask o2) {
			// TODO Auto-generated method stub
			return o2.createdBy.compareToIgnoreCase(o1.createdBy);
		}
	};
	
	public static Comparator<DgHadoopFileTask> SORT_BY_RUN_ON=new Comparator<DgHadoopFileTask>() {

		@Override
		public int compare(DgHadoopFileTask o1, DgHadoopFileTask o2) {
			Timestamp fromTS1=null;
			Timestamp fromTS2 =null;
			try {
				SimpleDateFormat monthDayformatter = new SimpleDateFormat(
				"MMM-dd-yyyy HH:mm");			
				Date fromDate1 = monthDayformatter.parse(o1.lastExecutedOn);

				fromTS1 = new Timestamp(fromDate1.getTime());

				Date fromDate2 = monthDayformatter.parse(o2.lastExecutedOn);

				fromTS2 = new Timestamp(fromDate2.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new NullPointerException(e.getMessage());
			}
			return fromTS1.compareTo(fromTS2);
		}
	};
	
	public static Comparator<DgHadoopFileTask> SORT_BY_RUN_ON_DESC=new Comparator<DgHadoopFileTask>() {

		@Override
		public int compare(DgHadoopFileTask o1, DgHadoopFileTask o2) {
			Timestamp fromTS1=null;
			Timestamp fromTS2 =null;
			try {
				SimpleDateFormat monthDayformatter = new SimpleDateFormat(
				"MMM-dd-yyyy HH:mm");			
				Date fromDate1 = monthDayformatter.parse(o1.lastExecutedOn);

				fromTS1 = new Timestamp(fromDate1.getTime());

				Date fromDate2 = monthDayformatter.parse(o2.lastExecutedOn);

				fromTS2 = new Timestamp(fromDate2.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new NullPointerException(e.getMessage());
			}
				return fromTS2.compareTo(fromTS1);
		}
	};


	public Boolean getDeleteOriginal() {
		return deleteOriginal;
	}
	public void setDeleteOriginal(Boolean deleteOriginal) {
		this.deleteOriginal = deleteOriginal;
	}
	public Boolean getStructured() {
		return structured;
	}
	public void setStructured(Boolean structured) {
		this.structured = structured;
	}
	public String getOutputColumnForm() {
		return outputColumnForm;
	}
	public void setOutputColumnForm(String outputColumnForm) {
		this.outputColumnForm = outputColumnForm;
	}
	public String getValueSeparator() {
		return valueSeparator;
	}
	public void setValueSeparator(String valueSeparator) {
		this.valueSeparator = valueSeparator;
	}
	public Boolean getVerifyStructure() {
		return verifyStructure;
	}
	public void setVerifyStructure(Boolean verifyStructure) {
		this.verifyStructure = verifyStructure;
	}
	public String getTaskDefPolicies() {
		return taskDefPolicies;
	}
	public void setTaskDefPolicies(String taskDefPolicies) {
		this.taskDefPolicies = taskDefPolicies;
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
	public Integer getSamplingPercentage() {
		return samplingPercentage;
	}
	public void setSamplingPercentage(Integer samplingPercentage) {
		this.samplingPercentage = samplingPercentage;
	}
	public Boolean getDiscoveryCriteria() {
		return discoveryCriteria;
	}
	public void setDiscoveryCriteria(Boolean discoveryCriteria) {
		this.discoveryCriteria = discoveryCriteria;
	}
	
	public String getNumberOfRows() {
		return numberOfRows;
	}
	public void setNumberOfRows(String numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public Boolean getFullFileScan() {
		return fullFileScan;
	}
	public void setFullFileScan(Boolean fullFileScan) {
		this.fullFileScan = fullFileScan;
	}
	public Boolean getSkippedFlag() {
		return skippedFlag;
	}
	public void setSkippedFlag(Boolean skippedFlag) {
		this.skippedFlag = skippedFlag;
	}
	public Integer getSkipCounter() {
		return skipCounter;
	}
	public void setSkipCounter(Integer skipCounter) {
		this.skipCounter = skipCounter;
	}
	public String getFileModStartTime() {
		return fileModStartTime;
	}
	public void setFileModStartTime(String fileModStartTime) {
		this.fileModStartTime = fileModStartTime;
	}
	public String getFileModEndTime() {
		return fileModEndTime;
	}
	public void setFileModEndTime(String fileModEndTime) {
		this.fileModEndTime = fileModEndTime;
	}
	public Integer getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}
	public String getBatchOption() {
		return batchOption;
	}
	public void setBatchOption(String batchOption) {
		this.batchOption = batchOption;
	}
	
}
