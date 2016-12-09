package com.dataguise.webservices.beans.discover.database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ErrorInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="errorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ErrorInfo", namespace = "http://schemas.datacontract.org/2004/07/DgDiscoverAgent", propOrder = {
		"connectionId", "databaseName", "errorTime", "errorType",
		"functionName", "index", "message", "stackTrace", "tableName",
		"taskId", "taskType" })
@XmlRootElement
public class ErrorInfo {

	protected Integer connectionId;
	@XmlElement(nillable = true)
	protected String databaseName;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar errorTime;
	@XmlElement(nillable = true)
	protected String errorType;
	@XmlElement(nillable = true)
	protected String functionName;
	protected Integer index;
	@XmlElement(nillable = true)
	protected String message;
	@XmlElement(nillable = true)
	protected String stackTrace;
	@XmlElement(nillable = true)
	protected String tableName;
	protected Integer taskId;
	@XmlElement(nillable = true)
	protected String taskType;

	public ErrorInfo(Integer searchTaskInstanceID, String taskType,
			Integer connectionId, String databaseName, String tableName,
			String functionName, String errorType, Exception ex) {
		this.taskId = searchTaskInstanceID;
		this.taskType = taskType;
		this.connectionId = connectionId;
		this.databaseName = databaseName;
		this.tableName = tableName;
		this.functionName = functionName;
		this.errorType = errorType;
		this.stackTrace = ex.getStackTrace().toString();
		this.message = ex.getMessage();
	}

	public ErrorInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the value of the connectionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConnectionId() {
		return connectionId;
	}

	/**
	 * Sets the value of the connectionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConnectionId(Integer value) {
		this.connectionId = value;
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
	 * Gets the value of the errorTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getErrorTime() {
		return errorTime;
	}

	/**
	 * Sets the value of the errorTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setErrorTime(XMLGregorianCalendar value) {
		this.errorTime = value;
	}

	/**
	 * Gets the value of the errorType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorType() {
		return errorType;
	}

	/**
	 * Sets the value of the errorType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorType(String value) {
		this.errorType = value;
	}

	/**
	 * Gets the value of the functionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * Sets the value of the functionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFunctionName(String value) {
		this.functionName = value;
	}

	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIndex(Integer value) {
		this.index = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
	}

	/**
	 * Gets the value of the stackTrace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * Sets the value of the stackTrace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStackTrace(String value) {
		this.stackTrace = value;
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
	 * Gets the value of the taskId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * Sets the value of the taskId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskId(Integer value) {
		this.taskId = value;
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
