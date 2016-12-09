package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sampleDataBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sampleDataBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampleDataBean", propOrder = { "filePath", "sampleData" })
public class SampleDataBean {

	protected String filePath;
	protected String sampleData;

	/**
	 * Gets the value of the filePath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Sets the value of the filePath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFilePath(String value) {
		this.filePath = value;
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

}
