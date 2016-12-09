package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgHdpConformantFiles complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHdpConformantFiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conformant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgHdpConformantFiles", propOrder = { "conformant", "errorTxt",
		"filePath" })
public class DgHdpConformantFiles {

	protected boolean conformant;
	protected String errorTxt;
	protected String filePath;

	/**
	 * Gets the value of the conformant property.
	 * 
	 */
	public boolean isConformant() {
		return conformant;
	}

	/**
	 * Sets the value of the conformant property.
	 * 
	 */
	public void setConformant(boolean value) {
		this.conformant = value;
	}

	/**
	 * Gets the value of the errorTxt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorTxt() {
		return errorTxt;
	}

	/**
	 * Sets the value of the errorTxt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorTxt(String value) {
		this.errorTxt = value;
	}

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

}
