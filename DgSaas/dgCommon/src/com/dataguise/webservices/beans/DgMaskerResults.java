package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for dgMaskerResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgMaskerResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cupsOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowsInError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowsProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgMaskerResults", propOrder = { "columnName",
		"connectionName", "cupsOptions", "dbName", "endTime", "maskingType",
		"rowsInError", "rowsProcessed", "startTime", "status", "tableName" })
public class DgMaskerResults {

	protected String columnName;
	protected String connectionName;
	protected String cupsOptions;
	protected String dbName;
	protected String endTime;
	protected String maskingType;
	protected Integer rowsInError;
	protected Integer rowsProcessed;
	protected String startTime;
	protected String status;
	protected String tableName;

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
	 * Gets the value of the connectionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionName() {
		return connectionName;
	}

	/**
	 * Sets the value of the connectionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionName(String value) {
		this.connectionName = value;
	}

	/**
	 * Gets the value of the cupsOptions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCupsOptions() {
		return cupsOptions;
	}

	/**
	 * Sets the value of the cupsOptions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCupsOptions(String value) {
		this.cupsOptions = value;
	}

	/**
	 * Gets the value of the dbName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * Sets the value of the dbName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbName(String value) {
		this.dbName = value;
	}

	/**
	 * Gets the value of the endTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the value of the endTime property.
	 * 
	 * @param endTime2
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * Gets the value of the maskingType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaskingType() {
		return maskingType;
	}

	/**
	 * Sets the value of the maskingType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaskingType(String value) {
		this.maskingType = value;
	}

	/**
	 * Gets the value of the rowsInError property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRowsInError() {
		return rowsInError;
	}

	/**
	 * Sets the value of the rowsInError property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRowsInError(Integer value) {
		this.rowsInError = value;
	}

	/**
	 * Gets the value of the rowsProcessed property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRowsProcessed() {
		return rowsProcessed;
	}

	/**
	 * Sets the value of the rowsProcessed property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRowsProcessed(Integer value) {
		this.rowsProcessed = value;
	}

	/**
	 * Gets the value of the startTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the startTime property.
	 * 
	 * @param date
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setStartTime(String date) {
		this.startTime = date;
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

}
