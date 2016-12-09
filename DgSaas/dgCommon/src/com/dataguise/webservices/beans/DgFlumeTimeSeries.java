package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgFlumeTimeSeries complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgFlumeTimeSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endIntervalTs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startIntervalTs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalBytesProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalNumSensitiveItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgFlumeTimeSeries", propOrder = { "endIntervalTs",
		"startIntervalTs", "totalBytesProcessed", "totalNumSensitiveItems" })
public class DgFlumeTimeSeries {

	protected String endIntervalTs;
	protected String startIntervalTs;
	protected Long totalBytesProcessed;
	protected Long totalNumSensitiveItems;

	/**
	 * Gets the value of the endIntervalTs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndIntervalTs() {
		return endIntervalTs;
	}

	/**
	 * Sets the value of the endIntervalTs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndIntervalTs(String value) {
		this.endIntervalTs = value;
	}

	/**
	 * Gets the value of the startIntervalTs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartIntervalTs() {
		return startIntervalTs;
	}

	/**
	 * Sets the value of the startIntervalTs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartIntervalTs(String value) {
		this.startIntervalTs = value;
	}

	/**
	 * Gets the value of the totalBytesProcessed property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Long getTotalBytesProcessed() {
		return totalBytesProcessed;
	}

	/**
	 * Sets the value of the totalBytesProcessed property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalBytesProcessed(Long value) {
		this.totalBytesProcessed = value;
	}

	/**
	 * Gets the value of the totalNumSensitiveItems property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Long getTotalNumSensitiveItems() {
		return totalNumSensitiveItems;
	}

	/**
	 * Sets the value of the totalNumSensitiveItems property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalNumSensitiveItems(Long value) {
		this.totalNumSensitiveItems = value;
	}

}
