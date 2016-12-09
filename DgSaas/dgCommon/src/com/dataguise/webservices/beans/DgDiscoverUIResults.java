package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgDiscoverUIResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgDiscoverUIResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expressionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nullCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="quickSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="safe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sampleData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dgDiscoverUIResults", propOrder = { "columnName", "dataType",
		"databaseName", "databaseType", "expressionGroup", "expressionID",
		"expressionName", "hitCount", "hostName", "masked", "nullCount",
		"objectType", "portNumber", "probability", "quickSearch", "safe",
		"sampleData", "startTime", "tableName", "taskInstanceID", "taskName","dbuser","rowsCount","mismatchCount","serverId","dbId", "expressionGroupConfidence","referringTo","constraintType"})
public class DgDiscoverUIResults {

	protected String columnName;
	protected String dataType;
	protected String databaseName;
	protected String databaseType;
	protected String expressionGroup;
	protected Integer expressionID;
	protected String expressionName;
	protected Integer hitCount;
	protected String hostName;
	protected boolean masked;
	protected Integer nullCount;
	protected String objectType;
	protected Integer portNumber;
	protected double probability;
	protected boolean quickSearch;
	protected boolean safe;
	protected String sampleData;
	protected String startTime;
	protected String tableName;
	protected Integer taskInstanceID;
	protected String taskName;
	protected String dbuser;
	protected Integer rowsCount;
    protected Integer mismatchCount;
    protected Integer serverId;
    protected Integer dbId;
    protected Double expressionGroupConfidence;
    protected String referringTo;
	protected String constraintType;
    
    /**
	 * @return the serverId
	 */
	public Integer getServerId() {
		return serverId;
	}

	/**
	 * @param serverId the serverId to set
	 */
	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	
	
 
	/**
	 * Gets the value of the columnName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * Sets the value of the columnName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnName(String value) {
		this.columnName = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataType(String value) {
		this.dataType = value;
	}

	/**
	 * Gets the value of the databaseName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * Sets the value of the databaseName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabaseName(String value) {
		this.databaseName = value;
	}

	/**
	 * Gets the value of the databaseType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabaseType() {
		return databaseType;
	}

	/**
	 * Sets the value of the databaseType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabaseType(String value) {
		this.databaseType = value;
	}

	/**
	 * Gets the value of the expressionGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionGroup() {
		return expressionGroup;
	}

	/**
	 * Sets the value of the expressionGroup property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionGroup(String value) {
		this.expressionGroup = value;
	}

	/**
	 * Gets the value of the expressionID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getExpressionID() {
		return expressionID;
	}

	/**
	 * Sets the value of the expressionID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setExpressionID(Integer value) {
		this.expressionID = value;
	}

	/**
	 * Gets the value of the expressionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionName() {
		return expressionName;
	}

	/**
	 * Sets the value of the expressionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionName(String value) {
		this.expressionName = value;
	}

	/**
	 * Gets the value of the hitCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getHitCount() {
		return hitCount;
	}

	/**
	 * Sets the value of the hitCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setHitCount(Integer value) {
		this.hitCount = value;
	}

	/**
	 * Gets the value of the hostName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Sets the value of the hostName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHostName(String value) {
		this.hostName = value;
	}

	/**
	 * Gets the value of the masked property.
	 * 
	 */
	public boolean isMasked() {
		return masked;
	}

	/**
	 * Sets the value of the masked property.
	 * 
	 */
	public void setMasked(boolean value) {
		this.masked = value;
	}

	/**
	 * Gets the value of the nullCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNullCount() {
		return nullCount;
	}

	/**
	 * Sets the value of the nullCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNullCount(Integer value) {
		this.nullCount = value;
	}

	/**
	 * Gets the value of the objectType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * Sets the value of the objectType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectType(String value) {
		this.objectType = value;
	}

	/**
	 * Gets the value of the portNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPortNumber() {
		return portNumber;
	}

	/**
	 * Sets the value of the portNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPortNumber(Integer value) {
		this.portNumber = value;
	}

	/**
	 * Gets the value of the probability property.
	 * 
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * Sets the value of the probability property.
	 * 
	 */
	public void setProbability(double value) {
		this.probability = value;
	}

	/**
	 * Gets the value of the quickSearch property.
	 * 
	 */
	public boolean isQuickSearch() {
		return quickSearch;
	}

	/**
	 * Sets the value of the quickSearch property.
	 * 
	 */
	public void setQuickSearch(boolean value) {
		this.quickSearch = value;
	}

	/**
	 * Gets the value of the safe property.
	 * 
	 */
	public boolean isSafe() {
		return safe;
	}

	/**
	 * Sets the value of the safe property.
	 * 
	 */
	public void setSafe(boolean value) {
		this.safe = value;
	}

	/**
	 * Gets the value of the sampleData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSampleData() {
		return sampleData;
	}

	/**
	 * Sets the value of the sampleData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSampleData(String value) {
		this.sampleData = value;
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
	 * Gets the value of the tableName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * Sets the value of the tableName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTableName(String value) {
		this.tableName = value;
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
	
	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}
	
	public Integer getRowsCount() {
		return rowsCount;
	}

	public void setRowsCount(Integer rowsCount) {
		this.rowsCount = rowsCount;
	}
    
	public Integer getMismatchCount() {
		return mismatchCount;
	}

	public void setMismatchCount(Integer mismatchCount) {
		this.mismatchCount = mismatchCount;
	}

	public Integer getDbId() {
		return dbId;
	}

	public void setDbId(Integer dbId) {
		this.dbId = dbId;
	}

	public Double getExpressionGroupConfidence() {
		return expressionGroupConfidence;
	}

	public void setExpressionGroupConfidence(Double expressionGroupConfidence) {
		this.expressionGroupConfidence = expressionGroupConfidence;
	}
	
	public String getReferringTo() {
		return referringTo;
	}

	public void setReferringTo(String referringTo) {
		this.referringTo = referringTo;
	}

	public String getConstraintType() {
		return constraintType;
	}

	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}
	
}
