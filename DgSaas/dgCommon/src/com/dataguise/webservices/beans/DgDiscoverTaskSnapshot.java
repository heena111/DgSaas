package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgDiscoverTaskSnapshot complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgDiscoverTaskSnapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionInfo" type="{http://masker.webservices.dataguise.com/}dgConnection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expressionInfo" type="{http://webservices.dataguise.com/}dgDiscoverExpression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sampleDataStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sampleSizeSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showSampleData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showViews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskInstanceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "dgDiscoverTaskSnapshot", propOrder = { "connectionInfo",
		"expressionInfo", "sampleDataStart", "sampleSize",
		"sampleSizeSpecification", "searchType", "showSampleData", "showViews",
		"taskDescription", "taskID", "taskInstanceID", "taskName","policyNames","dgTaskInstancePolicyDetails", "taskType" ,"additionalSampleSize"})
public class DgDiscoverTaskSnapshot {

	@XmlElement(nillable = true)
	protected List<DgConnection> connectionInfo;
	@XmlElement(nillable = true)
	protected List<DgDiscoverExpression> expressionInfo;
	protected String sampleDataStart;
	protected Integer sampleSize;
	protected Double additionalSampleSize;
	protected String sampleSizeSpecification;
	protected String searchType;
	protected Boolean showSampleData;
	protected Boolean showViews;
	protected String taskDescription;
	protected Integer taskID;
	protected Integer taskInstanceID;
	protected String taskName;
	protected String policyNames;
	protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
	protected String taskType;
	protected List<DgServerFilterSnapshot> dgServerFilterSnapshotList;
	protected  Long extrapolatedData;
	protected Long sampledData;

	/**
	 * Gets the value of the connectionInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the connectionInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getConnectionInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgConnection }
	 * 
	 * 
	 */
	public List<DgConnection> getConnectionInfo() {
		if (connectionInfo == null) {
			connectionInfo = new ArrayList<DgConnection>();
		}
		return this.connectionInfo;
	}

	/**
	 * Gets the value of the expressionInfo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the expressionInfo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getExpressionInfo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgDiscoverExpression }
	 * 
	 * 
	 */
	public List<DgDiscoverExpression> getExpressionInfo() {
		if (expressionInfo == null) {
			expressionInfo = new ArrayList<DgDiscoverExpression>();
		}
		return this.expressionInfo;
	}

	/**
	 * Gets the value of the sampleDataStart property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSampleDataStart() {
		return sampleDataStart;
	}

	/**
	 * Sets the value of the sampleDataStart property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSampleDataStart(String value) {
		this.sampleDataStart = value;
	}

	/**
	 * Gets the value of the sampleSize property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSampleSize() {
		return sampleSize;
	}

	/**
	 * Sets the value of the sampleSize property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSampleSize(Integer value) {
		this.sampleSize = value;
	}

	/**
	 * Gets the value of the sampleSizeSpecification property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSampleSizeSpecification() {
		return sampleSizeSpecification;
	}

	/**
	 * Sets the value of the sampleSizeSpecification property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSampleSizeSpecification(String value) {
		this.sampleSizeSpecification = value;
	}

	/**
	 * Gets the value of the searchType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSearchType() {
		return searchType;
	}

	/**
	 * Sets the value of the searchType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSearchType(String value) {
		this.searchType = value;
	}

	/**
	 * Gets the value of the showSampleData property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isShowSampleData() {
		return showSampleData;
	}

	/**
	 * Sets the value of the showSampleData property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setShowSampleData(Boolean value) {
		this.showSampleData = value;
	}

	/**
	 * Gets the value of the showViews property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isShowViews() {
		return showViews;
	}

	/**
	 * Sets the value of the showViews property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setShowViews(Boolean value) {
		this.showViews = value;
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
	 * Gets the value of the taskID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskID() {
		return taskID;
	}

	/**
	 * Sets the value of the taskID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskID(Integer value) {
		this.taskID = value;
	}

	/**
	 * Gets the value of the taskInstanceID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskInstanceID() {
		return taskInstanceID;
	}

	/**
	 * Sets the value of the taskInstanceID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskInstanceID(Integer value) {
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
	 * @return the showSampleData
	 */
	public Boolean getShowSampleData() {
		return showSampleData;
	}

	/**
	 * @return the showViews
	 */
	public Boolean getShowViews() {
		return showViews;
	}

	/**
	 * @param connectionInfo the connectionInfo to set
	 */
	public void setConnectionInfo(List<DgConnection> connectionInfo) {
		this.connectionInfo = connectionInfo;
	}

	/**
	 * @param expressionInfo the expressionInfo to set
	 */
	public void setExpressionInfo(List<DgDiscoverExpression> expressionInfo) {
		this.expressionInfo = expressionInfo;
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
	

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	
	public void setAdditionalSampleSize(Double additionalSampleSize) {
		this.additionalSampleSize = additionalSampleSize==null?0f:additionalSampleSize;
	}

	public Double getAdditionalSampleSize() {
	      return additionalSampleSize;
	 }

	public List<DgServerFilterSnapshot> getDgServerFilterSnapshotList() {
		return dgServerFilterSnapshotList;
	}

	public void setDgServerFilterSnapshotList(
			List<DgServerFilterSnapshot> dgServerFilterSnapshotList) {
		this.dgServerFilterSnapshotList = dgServerFilterSnapshotList;
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
