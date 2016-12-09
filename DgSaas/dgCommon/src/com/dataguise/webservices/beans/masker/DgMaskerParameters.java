package com.dataguise.webservices.beans.masker;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;
import com.dataguise.webservices.beans.DgBaseBean;

/**
 * <p>
 * Java class for DgMaskerParameters complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DgMaskerParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://masker.webservices.dataguise.com/}dgBaseBean">
 *       &lt;sequence>
 *         &lt;element name="taskID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commitSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxWorkers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workerWaitTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="oracleEnableFlash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleEnableLogging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sqlServerSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sqlServerDLLFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableWaterMark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgMaskerParameters", propOrder = { "taskID", "taskName",
		"taskDescription", "commitSize", "maxWorkers", "workerWaitTime",
		"oracleEnableFlash", "oracleEnableLogging", "sqlServerSchema",
		"sqlServerDLLFilePath", "connectionList", "enableWaterMark","taskType","templateID","schemaList","globalDomain","isGlobal", "consistentKey", "persistentKey" })
public class DgMaskerParameters extends DgBaseBean {

	protected Integer taskID;
	@NotEmpty(message = "Task Name:" +BeanValidator.EMPTY_FIELD)
    @Size(max=128, message= "Task Name:" + BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Task Name: " +BeanValidator.INVALID_CHARACTER_SET)
	protected String taskName;
	@NotEmpty(message = "Task Description:" +BeanValidator.EMPTY_FIELD)
	@Size(max=256, message= "Task Description:" + BeanValidator.MAX_SIZE_256)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Task Description:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String taskDescription;
	@Max(value=10000000, message="Commit Size:"+BeanValidator.INVALID_COMMIT_SIZE)
	protected int commitSize;
	@Max(value=1000, message="Max Workers:"+BeanValidator.INVALID_MAX_WORKERS)
	protected int maxWorkers;
	protected float workerWaitTime;
	protected String oracleEnableFlash;
	protected String oracleEnableLogging;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String sqlServerSchema;
	protected String sqlServerDLLFilePath;
	protected String connectionList;
	protected Integer enableWaterMark;
	protected String taskType;
	protected Integer templateID;
	protected String schemaList;
	protected String globalDomain;
	protected String isGlobal;
	protected String consistentKey;
	protected String persistentKey;
	

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
	 * Gets the value of the commitSize property.
	 * 
	 */
	public int getCommitSize() {
		return commitSize;
	}

	/**
	 * Sets the value of the commitSize property.
	 * 
	 */
	public void setCommitSize(int value) {
		this.commitSize = value;
	}

	/**
	 * Gets the value of the maxWorkers property.
	 * 
	 */
	public int getMaxWorkers() {
		return maxWorkers;
	}

	/**
	 * Sets the value of the maxWorkers property.
	 * 
	 */
	public void setMaxWorkers(int value) {
		this.maxWorkers = value;
	}

	/**
	 * Gets the value of the workerWaitTime property.
	 * 
	 */
	public float getWorkerWaitTime() {
		return workerWaitTime;
	}

	/**
	 * Sets the value of the workerWaitTime property.
	 * 
	 */
	public void setWorkerWaitTime(float value) {
		this.workerWaitTime = value;
	}

	/**
	 * Gets the value of the oracleEnableFlash property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleEnableFlash() {
		return oracleEnableFlash;
	}

	/**
	 * Sets the value of the oracleEnableFlash property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleEnableFlash(String value) {
		this.oracleEnableFlash = value;
	}

	/**
	 * Gets the value of the oracleEnableLogging property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleEnableLogging() {
		return oracleEnableLogging;
	}

	/**
	 * Sets the value of the oracleEnableLogging property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleEnableLogging(String value) {
		this.oracleEnableLogging = value;
	}

	/**
	 * Gets the value of the sqlServerSchema property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSqlServerSchema() {
		return sqlServerSchema;
	}

	/**
	 * Sets the value of the sqlServerSchema property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSqlServerSchema(String value) {
		this.sqlServerSchema = value;
	}

	/**
	 * Gets the value of the sqlServerDLLFilePath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSqlServerDLLFilePath() {
		return sqlServerDLLFilePath;
	}

	/**
	 * Sets the value of the sqlServerDLLFilePath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSqlServerDLLFilePath(String value) {
		this.sqlServerDLLFilePath = value;
	}

	/**
	 * Gets the value of the connectionList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionList() {
		return connectionList;
	}

	/**
	 * Sets the value of the connectionList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionList(String value) {
		this.connectionList = value;
	}

	/**
	 * Gets the value of the enableWaterMark property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getEnableWaterMark() {
		return enableWaterMark;
	}

	/**
	 * Sets the value of the enableWaterMark property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setEnableWaterMark(Integer value) {
		this.enableWaterMark = value;
	}


	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Integer getTemplateID() {
		return templateID;
	}

	public void setTemplateID(Integer templateID) {
		this.templateID = templateID;
	}

	public String getSchemaList() {
		return schemaList;
	}

	public void setSchemaList(String schemaList) {
		this.schemaList = schemaList;
	}

	public String getGlobalDomain() {
		return globalDomain;
	}

	public void setGlobalDomain(String globalDomain) {
		this.globalDomain = globalDomain;
	}

	public String getIsGlobal() {
		return isGlobal;
	}

	public void setIsGlobal(String isGlobal) {
		this.isGlobal = isGlobal;
	}
	
	public String getConsistentKey() {
		return consistentKey;
	}

	public void setConsistentKey(String consistentKey) {
		this.consistentKey = consistentKey;
	}

	public String getPersistentKey() {
		return persistentKey;
	}

	public void setPersistentKey(String persistentKey) {
		this.persistentKey = persistentKey;
	}
}
