package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgDiscoveryMaskingConfig complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgDiscoveryMaskingConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maskingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgDiscoveryMaskingConfig", propOrder = { "id", "maskingName",
		"regexDescription", "regexName" })
public class DgDiscoveryMaskingConfig {

	protected Integer id;
	protected String maskingName;
	protected String regexDescription;
	protected String regexName;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Gets the value of the maskingName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaskingName() {
		return maskingName;
	}

	/**
	 * Sets the value of the maskingName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaskingName(String value) {
		this.maskingName = value;
	}

	/**
	 * Gets the value of the regexDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegexDescription() {
		return regexDescription;
	}

	/**
	 * Sets the value of the regexDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegexDescription(String value) {
		this.regexDescription = value;
	}

	/**
	 * Gets the value of the regexName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegexName() {
		return regexName;
	}

	/**
	 * Sets the value of the regexName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegexName(String value) {
		this.regexName = value;
	}

}
