package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgHDFSTaskInstanceDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHDFSTaskInstanceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastExecutedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanlocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgHDFSTaskInstanceDetails", propOrder = { "createdBy",
		"fileType", "lastExecutedOn", "hadoopScanPathInfoList", "taskDescription",
		"taskName", "taskType" ,"incrementalDiscovery","expressionNames","policyNames","dgTaskInstancePolicyDetails","outputFormat","deleteOriginal",
		"valueSeparator","structured","clusterName", "numberOfRows" , "discoverCriteria" ,"samplePercentage", "fullFileScan" ,"skippedFlag" ,"skipCounter", "fileModStartTime", "fileModEndTime","excludedFileExtensions","excludedScanPathList","sampledData","extrapolatedData"})
public class DgHDFSTaskInstanceDetails {

	protected String createdBy;
	protected String fileType;
	protected String lastExecutedOn;
	@XmlElement(nillable = true)
	protected List<HadoopScanPathInfo> hadoopScanPathInfoList;
	protected String taskDescription;
	protected String taskName;
	protected String taskType;
	protected Boolean incrementalDiscovery;
	@XmlElement(nillable = true)
	protected List<String> expressionNames;
	protected String policyNames;
	protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
	protected String outputFormat;
	protected Boolean deleteOriginal;
	protected String valueSeparator;
	protected Boolean structured;
	protected String clusterName;
	
	protected String numberOfRows ; 		
	protected Boolean discoverCriteria ;	
	protected Integer samplePercentage ;	
	protected Boolean fullFileScan ;		
	protected Boolean skippedFlag ;		
	protected Integer skipCounter ; 
	protected String fileModStartTime;
    protected String fileModEndTime;
    protected List<String> excludedFileExtensions;
    protected List<String> excludedScanPathList;
    protected Long sampledData;
    protected Long extrapolatedData;


	/**
	 * Gets the value of the createdBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the value of the createdBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedBy(String value) {
		this.createdBy = value;
	}

	/**
	 * Gets the value of the fileType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * Sets the value of the fileType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileType(String value) {
		this.fileType = value;
	}

	/**
	 * Gets the value of the lastExecutedOn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastExecutedOn() {
		return lastExecutedOn;
	}

	/**
	 * Sets the value of the lastExecutedOn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastExecutedOn(String value) {
		this.lastExecutedOn = value;
	}

	/**
	 * Gets the value of the scanlocations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the scanlocations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getScanlocations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<HadoopScanPathInfo> gethadoopScanPathInfoList() {
		if (hadoopScanPathInfoList == null) {
			hadoopScanPathInfoList = new ArrayList<HadoopScanPathInfo>();
		}
		return this.hadoopScanPathInfoList;
	}

	/**
	 * Gets the value of the taskDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskDescription() {
		return taskDescription;
	}

	/**
	 * Sets the value of the taskDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskDescription(String value) {
		this.taskDescription = value;
	}

	/**
	 * Gets the value of the taskName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * Sets the value of the taskName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskName(String value) {
		this.taskName = value;
	}

	/**
	 * Gets the value of the taskType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskType() {
		return taskType;
	}

	/**
	 * Sets the value of the taskType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskType(String value) {
		this.taskType = value;
	}

	public Boolean getIncrementalDiscovery() {
		return incrementalDiscovery;
	}

	public void setIncrementalDiscovery(Boolean incrementalDiscovery) {
		this.incrementalDiscovery = incrementalDiscovery;
	}

	public List<String> getExpressionNames() {
		if (expressionNames == null) {
			expressionNames = new ArrayList<String>();
		}
		return this.expressionNames;
	}

	public String getPolicyNames() {
		return policyNames;
	}

	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
	}

	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		return dgTaskInstancePolicyDetails;
	}

	public void setDgTaskInstancePolicyDetails(
			List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails) {
		this.dgTaskInstancePolicyDetails = dgTaskInstancePolicyDetails;
	}
	
	public String getOutputFormat() {
		return outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}

	public Boolean getDeleteOriginal() {
		return deleteOriginal;
	}

	public void setDeleteOriginal(Boolean deleteOriginal) {
		this.deleteOriginal = deleteOriginal;
	}

	public String getValueSeparator() {
		return valueSeparator;
	}

	public void setValueSeparator(String valueSeparator) {
		this.valueSeparator = valueSeparator;
	}

	/**
	 * Gets the value of the structured property.
	 * 
	 * @return structured 
	 * 
	 */
	public Boolean getStructured() {
		return structured;
	}
	
	/**
	 * Sets the value of the structured property.
	 * 
	 * @param structured
	 * 
	 */
	public void setStructured(Boolean structured) {
		this.structured = structured;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(String numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public Boolean getDiscoverCriteria() {
		return discoverCriteria;
	}

	public void setDiscoverCriteria(Boolean discoverCriteria) {
		this.discoverCriteria = discoverCriteria;
	}

	public Integer getSamplePercentage() {
		return samplePercentage;
	}

	public void setSamplePercentage(Integer samplePercentage) {
		this.samplePercentage = samplePercentage;
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

	public Long getSampledData() {
		return sampledData;
	}

	public void setSampledData(Long sampledData) {
		this.sampledData = sampledData;
	}

	public Long getExtrapolatedData() {
		return extrapolatedData;
	}

	public void setExtrapolatedData(Long extrapolatedData) {
		this.extrapolatedData = extrapolatedData;
	}
	
	
}
