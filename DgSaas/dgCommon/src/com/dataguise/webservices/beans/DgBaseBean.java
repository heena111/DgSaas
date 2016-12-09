package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgBaseBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgBaseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgBaseBean", namespace = "http://masker.webservices.dataguise.com/", propOrder = { "lastUpdatedTime", "sessionId", "recordId" })
public class DgBaseBean {

	protected String lastUpdatedTime;
	protected String sessionId;
	protected Integer recordId;
	

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * Gets the value of the lastUpdatedTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	/**
	 * Sets the value of the lastUpdatedTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastUpdatedTime(String value) {
		this.lastUpdatedTime = value;
	}
	
	

}
