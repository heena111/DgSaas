package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgFileScanResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DgSearchFileResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipHostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfHits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="percentProb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="scanTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensitiveElementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sensitiveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgSearchFileResults", propOrder = { "filename", "ipHostname",
		"location", "noOfHits", "percentProb", "scanTimestamp",
		"sensitiveElementCount", "sensitiveType","sensitiveGroup", "totalRowCount", "taskInstanceId", "taskId" })
public class DgSearchFileResults {

	protected String filename;
	protected String ipHostname;
	protected String location;
	protected Integer noOfHits;
	protected Double percentProb;
	protected String scanTimestamp;
	protected Integer sensitiveElementCount;
	protected String sensitiveType;
	protected String sensitiveGroup;
	protected Integer totalRowCount;
	protected Integer taskInstanceId;
	protected Integer taskId;

	/**
	 * Gets the value of the filename property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * Sets the value of the filename property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFilename(String value) {
		this.filename = value;
	}

	/**
	 * Gets the value of the ipHostname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIpHostname() {
		return ipHostname;
	}

	/**
	 * Sets the value of the ipHostname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpHostname(String value) {
		this.ipHostname = value;
	}

	/**
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocation(String value) {
		this.location = value;
	}

	/**
	 * Gets the value of the noOfHits property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNoOfHits() {
		return noOfHits;
	}

	/**
	 * Sets the value of the noOfHits property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNoOfHits(Integer value) {
		this.noOfHits = value;
	}

	/**
	 * Gets the value of the percentProb property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPercentProb() {
		return percentProb;
	}

	/**
	 * Sets the value of the percentProb property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setPercentProb(Double value) {
		this.percentProb = value;
	}

	/**
	 * Gets the value of the scanTimestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScanTimestamp() {
		return scanTimestamp;
	}

	/**
	 * Sets the value of the scanTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScanTimestamp(String value) {
		this.scanTimestamp = value;
	}

	/**
	 * Gets the value of the sensitiveElementCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSensitiveElementCount() {
		return sensitiveElementCount;
	}

	/**
	 * Sets the value of the sensitiveElementCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSensitiveElementCount(Integer value) {
		this.sensitiveElementCount = value;
	}

	/**
	 * Gets the value of the sensitiveType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSensitiveType() {
		return sensitiveType;
	}

	/**
	 * Sets the value of the sensitiveType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSensitiveType(String value) {
		this.sensitiveType = value;
	}

	/**
	 * Gets the value of the totalRowCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalRowCount() {
		return totalRowCount;
	}

	/**
	 * Sets the value of the totalRowCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalRowCount(Integer value) {
		this.totalRowCount = value;
	}

	/**
	 * @return the taskInstanceId
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	/**
	 * @param taskInstanceId the taskInstanceId to set
	 */
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	/**
	 * @return the taskId
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getSensitiveGroup() {
		return sensitiveGroup;
	}

	public void setSensitiveGroup(String sensitiveGroup) {
		this.sensitiveGroup = sensitiveGroup;
	}

}
