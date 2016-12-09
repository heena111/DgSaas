package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.Comparator;
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
 *         &lt;element name="numHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selectedLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskInstanceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
		"taskName","executedBy","totalSensitiveFilesFound","dirsScanned" ,"filesScanned","filesWithSensitivedata","totalDirs","totalFiles","dgTaskInstancePolicyDetails","taskType"})
public class DgSearchFileTaskInstance {

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
	protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
	
	
	protected int dirsScanned ;
	protected int filesScanned;
	protected int filesWithSensitivedata;
	protected int totalDirs;
	protected int totalFiles;
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
	 */
	public int getNumHits() {
		return numHits;
	}

	/**
	 * Sets the value of the numHits property.
	 * 
	 */
	public void setNumHits(int value) {
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
	 * @param expressionList the expressionList to set
	 */
	public void setExpressionList(List<String> expressionList) {
		this.expressionList = expressionList;
	}

	/**
	 * @param fileTypes the fileTypes to set
	 */
	public void setFileTypes(List<String> fileTypes) {
		this.fileTypes = fileTypes;
	}

	/**
	 * @param selectedLocations the selectedLocations to set
	 */
	public void setSelectedLocations(List<String> selectedLocations) {
		this.selectedLocations = selectedLocations;
	}

	/**
	 * @return the executedBy
	 */
	public String getExecutedBy() {
		return executedBy;
	}

	/**
	 * @param executedBy the executedBy to set
	 */
	public void setExecutedBy(String executedBy) {
		this.executedBy = executedBy;
	}

	/**
	 * @return the totalSensitiveFilesFound
	 */
	public int getTotalSensitiveFilesFound() {
		return totalSensitiveFilesFound;
	}

	/**
	 * @param totalSensitiveFilesFound the totalSensitiveFilesFound to set
	 */
	public void setTotalSensitiveFilesFound(int totalSensitiveFilesFound) {
		this.totalSensitiveFilesFound = totalSensitiveFilesFound;
	}

	/**
	 * @return the dirsScanned
	 */
	public int getDirsScanned() {
		return dirsScanned;
	}

	/**
	 * @param dirsScanned the dirsScanned to set
	 */
	public void setDirsScanned(int dirsScanned) {
		this.dirsScanned = dirsScanned;
	}

	/**
	 * @return the filesScanned
	 */
	public int getFilesScanned() {
		return filesScanned;
	}

	/**
	 * @param filesScanned the filesScanned to set
	 */
	public void setFilesScanned(int filesScanned) {
		this.filesScanned = filesScanned;
	}

	/**
	 * @return the filesWithSensitivedata
	 */
	public int getFilesWithSensitivedata() {
		return filesWithSensitivedata;
	}

	/**
	 * @param filesWithSensitivedata the filesWithSensitivedata to set
	 */
	public void setFilesWithSensitivedata(int filesWithSensitivedata) {
		this.filesWithSensitivedata = filesWithSensitivedata;
	}

	/**
	 * @return the totalDirs
	 */
	public int getTotalDirs() {
		return totalDirs;
	}

	/**
	 * @param totalDirs the totalDirs to set
	 */
	public void setTotalDirs(int totalDirs) {
		this.totalDirs = totalDirs;
	}

	/**
	 * @return the totalFiles
	 */
	public int getTotalFiles() {
		return totalFiles;
	}

	/**
	 * @param totalFiles the totalFiles to set
	 */
	public void setTotalFiles(int totalFiles) {
		this.totalFiles = totalFiles;
	}


	 public static Comparator<DgSearchFileTaskInstance> SORT_BY_NUM_HITS = new Comparator<DgSearchFileTaskInstance>() {
		        public int compare(DgSearchFileTaskInstance one, DgSearchFileTaskInstance other) {
		            return one.numHits.compareTo(other.numHits);
		        }
		  };
		  public static Comparator<DgSearchFileTaskInstance> SORT_BY_NUM_HITS_DESC = new Comparator<DgSearchFileTaskInstance>() {
			    public int compare(DgSearchFileTaskInstance one, DgSearchFileTaskInstance other) {
			        return other.numHits.compareTo(one.numHits);
			        } 
		  };  

	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		return dgTaskInstancePolicyDetails;
	}

	public void setDgTaskInstancePolicyDetails(
			List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails) {
		this.dgTaskInstancePolicyDetails = dgTaskInstancePolicyDetails;
	}


	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
}

