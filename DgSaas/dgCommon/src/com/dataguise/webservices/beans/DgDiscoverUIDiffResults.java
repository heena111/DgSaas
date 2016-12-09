package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DgDiscoverUIDiffResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DgDiscoverUIDiffResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nullCount1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hitCount2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nullCount2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="probability2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInstanceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *          &lt;element name="safe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
			&lt;element name="dbId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
			&lt;element name="expressionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
			&lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
			&lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgDiscoverUIDiffResults", propOrder = { "columnName",
		"dataType", "databaseName", "expressionGroup", "expressionName",
		"hitCount", "nullCount1", "hitCount2", "nullCount2", "objectType",
		"probability", "probability2", "tableName", "hostName",
		"databaseType", "taskInstanceID","rowsCount","safe", "dbId", "expressionID", "portNumber",
		"serverId"})
public class DgDiscoverUIDiffResults {

	protected String columnName;
	protected String dataType;
	protected String databaseName;
	protected String expressionGroup;
	protected String expressionName;
	protected Integer hitCount;
	protected Integer nullCount1;
	protected Integer hitCount2;
	protected Integer nullCount2;
	protected String objectType;
	protected double probability;
	protected double probability2;
	protected String tableName;
	protected String hostName;
	protected String databaseType;
	protected Integer taskInstanceID;
	protected Integer rowsCount;
	protected boolean safe;
	protected Integer dbId;
	protected Integer expressionID;
	protected Integer portNumber;
	protected Integer serverId;


	/**
	 * Gets the value of the columnName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public boolean isSafe() {
		return safe;
	}

	public void setSafe(boolean safe) {
		this.safe = safe;
	}
	
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
	public Integer gethitCount() {
		return hitCount;
	}

	/**
	 * Sets the value of the hitCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void sethitCount(Integer value) {
		this.hitCount = value;
	}

	/**
	 * Gets the value of the nullCount1 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNullCount1() {
		return nullCount1;
	}

	/**
	 * Sets the value of the nullCount1 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNullCount1(Integer value) {
		this.nullCount1 = value;
	}

	/**
	 * Gets the value of the hitCount2 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getHitCount2() {
		return hitCount2;
	}

	/**
	 * Sets the value of the hitCount2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setHitCount2(Integer value) {
		this.hitCount2 = value;
	}

	/**
	 * Gets the value of the nullCount2 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNullCount2() {
		return nullCount2;
	}

	/**
	 * Sets the value of the nullCount2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNullCount2(Integer value) {
		this.nullCount2 = value;
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
	public void setprobability(double value) {
		this.probability = value;
	}

	/**
	 * Gets the value of the probability2 property.
	 * 
	 */
	public double getProbability2() {
		return probability2;
	}

	/**
	 * Sets the value of the probability2 property.
	 * 
	 */
	public void setProbability2(double value) {
		this.probability2 = value;
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

	public Integer getRowsCount() {
		return rowsCount;
	}

	public void setRowsCount(Integer rowsCount) {
		this.rowsCount = rowsCount;
	}

	public Integer getDbId() {
		return dbId;
	}

	public void setDbId(Integer dbId) {
		this.dbId = dbId;
	}

	public Integer getExpressionID() {
		return expressionID;
	}

	public void setExpressionID(Integer expressionID) {
		this.expressionID = expressionID;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}
	
	
}
