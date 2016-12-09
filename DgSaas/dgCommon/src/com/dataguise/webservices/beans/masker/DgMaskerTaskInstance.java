package com.dataguise.webservices.beans.masker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgMaskerTaskInstance complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgMaskerTaskInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordsMasked" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInstanceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgMaskerTaskInstance", propOrder = { "endTime",
		"recordsMasked", "startTime", "status", "taskInstanceID", "taskName",
		"totalRecords","isGlobal","globalDomain" })
public class DgMaskerTaskInstance {

	protected String endTime;
	protected long recordsMasked;
	protected String startTime;
	protected String status;
	protected Integer taskInstanceID;
	protected String taskName;
	protected long totalRecords;
	protected String isGlobal;
	protected String globalDomain;

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
	 * Gets the value of the recordsMasked property.
	 * 
	 */
	public long getRecordsMasked() {
		return recordsMasked;
	}

	/**
	 * Sets the value of the recordsMasked property.
	 * 
	 */
	public void setRecordsMasked(long value) {
		this.recordsMasked = value;
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
	 * Gets the value of the totalRecords property.
	 * 
	 */
	public long getTotalRecords() {
		return totalRecords;
	}

	/**
	 * Sets the value of the totalRecords property.
	 * 
	 */
	public void setTotalRecords(long value) {
		this.totalRecords = value;
	}

	public String getIsGlobal() {
		return isGlobal;
	}

	public void setIsGlobal(String isGlobal) {
		this.isGlobal = isGlobal;
	}

	public String getGlobalDomain() {
		return globalDomain;
	}

	public void setGlobalDomain(String globalDomain) {
		this.globalDomain = globalDomain;
	}
}
