package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgFileScanTaskInstance complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgFileScanTaskInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ipRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latestExecutionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfRuns" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numHits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="selectedLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskInstanceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalSensitiveFilesFound" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dirsScanned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filesScanned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filesWithSensitivedata" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalDirs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalFiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dgTaskInstancePolicyDetails" type="{http://webservices.dataguise.com/}dgTaskInstancePolicyDetails" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "dgFileScanTaskInstance", propOrder = { "createdBy",
		"createdOn", "endTime", "expressionList", "fileTypes", "ipRange",
		"latestExecutionTime", "noOfRuns", "numHits", "selectedLocations",
		"startTime", "status", "taskDesc", "taskID", "taskInstanceID",
		"taskName", "executedBy", "totalSensitiveFilesFound", "dirsScanned",
		"filesScanned", "filesWithSensitivedata", "totalDirs", "totalFiles",
		"dgTaskInstancePolicyDetails", "taskType" })
public class DgFileScanTaskInstance {

	protected String createdBy;
	protected String createdOn;
	protected String endTime;
	@XmlElement(nillable = true)
	protected List<String> expressionList;
	@XmlElement(nillable = true)
	protected List<String> fileTypes;
	protected String ipRange;
	protected String latestExecutionTime;
	protected int noOfRuns;
	protected Integer numHits;
	@XmlElement(nillable = true)
	protected List<String> selectedLocations;
	protected String startTime;
	protected String status;
	protected String taskDesc;
	protected int taskID;
	protected int taskInstanceID;
	protected String taskName;
	protected String executedBy;
	protected int totalSensitiveFilesFound;
	protected int dirsScanned;
	protected int filesScanned;
	protected int filesWithSensitivedata;
	protected int totalDirs;
	protected int totalFiles;
	@XmlElement(nillable = true)
	protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
	protected String taskType;

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
	 * Gets the value of the createdOn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * Sets the value of the createdOn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedOn(String value) {
		this.createdOn = value;
	}

	/**
	 * Gets the value of the endTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the value of the endTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndTime(String value) {
		this.endTime = value;
	}

	/**
	 * Gets the value of the expressionList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the expressionList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExpressionList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getExpressionList() {
		if (expressionList == null) {
			expressionList = new ArrayList<String>();
		}
		return this.expressionList;
	}

	/**
	 * Gets the value of the fileTypes property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the fileTypes property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFileTypes().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getFileTypes() {
		if (fileTypes == null) {
			fileTypes = new ArrayList<String>();
		}
		return this.fileTypes;
	}

	/**
	 * Gets the value of the ipRange property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIpRange() {
		return ipRange;
	}

	/**
	 * Sets the value of the ipRange property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpRange(String value) {
		this.ipRange = value;
	}

	/**
	 * Gets the value of the latestExecutionTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLatestExecutionTime() {
		return latestExecutionTime;
	}

	/**
	 * Sets the value of the latestExecutionTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLatestExecutionTime(String value) {
		this.latestExecutionTime = value;
	}

	/**
	 * Gets the value of the noOfRuns property.
	 * 
	 */
	public int getNoOfRuns() {
		return noOfRuns;
	}

	/**
	 * Sets the value of the noOfRuns property.
	 * 
	 */
	public void setNoOfRuns(int value) {
		this.noOfRuns = value;
	}

	/**
	 * Gets the value of the numHits property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNumHits() {
		return numHits;
	}

	/**
	 * Sets the value of the numHits property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNumHits(Integer value) {
		this.numHits = value;
	}

	/**
	 * Gets the value of the selectedLocations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the selectedLocations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSelectedLocations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getSelectedLocations() {
		if (selectedLocations == null) {
			selectedLocations = new ArrayList<String>();
		}
		return this.selectedLocations;
	}

	/**
	 * Gets the value of the startTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the startTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartTime(String value) {
		this.startTime = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the taskDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskDesc() {
		return taskDesc;
	}

	/**
	 * Sets the value of the taskDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskDesc(String value) {
		this.taskDesc = value;
	}

	/**
	 * Gets the value of the taskID property.
	 * 
	 */
	public int getTaskID() {
		return taskID;
	}

	/**
	 * Sets the value of the taskID property.
	 * 
	 */
	public void setTaskID(int value) {
		this.taskID = value;
	}

	/**
	 * Gets the value of the taskInstanceID property.
	 * 
	 */
	public int getTaskInstanceID() {
		return taskInstanceID;
	}

	/**
	 * Sets the value of the taskInstanceID property.
	 * 
	 */
	public void setTaskInstanceID(int value) {
		this.taskInstanceID = value;
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
	 * Gets the value of the executedBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExecutedBy() {
		return executedBy;
	}

	/**
	 * Sets the value of the executedBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExecutedBy(String value) {
		this.executedBy = value;
	}

	/**
	 * Gets the value of the totalSensitiveFilesFound property.
	 * 
	 */
	public int getTotalSensitiveFilesFound() {
		return totalSensitiveFilesFound;
	}

	/**
	 * Sets the value of the totalSensitiveFilesFound property.
	 * 
	 */
	public void setTotalSensitiveFilesFound(int value) {
		this.totalSensitiveFilesFound = value;
	}

	/**
	 * Gets the value of the dirsScanned property.
	 * 
	 */
	public int getDirsScanned() {
		return dirsScanned;
	}

	/**
	 * Sets the value of the dirsScanned property.
	 * 
	 */
	public void setDirsScanned(int value) {
		this.dirsScanned = value;
	}

	/**
	 * Gets the value of the filesScanned property.
	 * 
	 */
	public int getFilesScanned() {
		return filesScanned;
	}

	/**
	 * Sets the value of the filesScanned property.
	 * 
	 */
	public void setFilesScanned(int value) {
		this.filesScanned = value;
	}

	/**
	 * Gets the value of the filesWithSensitivedata property.
	 * 
	 */
	public int getFilesWithSensitivedata() {
		return filesWithSensitivedata;
	}

	/**
	 * Sets the value of the filesWithSensitivedata property.
	 * 
	 */
	public void setFilesWithSensitivedata(int value) {
		this.filesWithSensitivedata = value;
	}

	/**
	 * Gets the value of the totalDirs property.
	 * 
	 */
	public int getTotalDirs() {
		return totalDirs;
	}

	/**
	 * Sets the value of the totalDirs property.
	 * 
	 */
	public void setTotalDirs(int value) {
		this.totalDirs = value;
	}

	/**
	 * Gets the value of the totalFiles property.
	 * 
	 */
	public int getTotalFiles() {
		return totalFiles;
	}

	/**
	 * Sets the value of the totalFiles property.
	 * 
	 */
	public void setTotalFiles(int value) {
		this.totalFiles = value;
	}

	/**
	 * Gets the value of the dgTaskInstancePolicyDetails property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dgTaskInstancePolicyDetails property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDgTaskInstancePolicyDetails().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgTaskInstancePolicyDetails }
	 * 
	 * 
	 */
	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		if (dgTaskInstancePolicyDetails == null) {
			dgTaskInstancePolicyDetails = new ArrayList<DgTaskInstancePolicyDetails>();
		}
		return this.dgTaskInstancePolicyDetails;
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

}
