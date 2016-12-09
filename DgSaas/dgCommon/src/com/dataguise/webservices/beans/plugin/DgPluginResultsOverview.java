package com.dataguise.webservices.beans.plugin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ftpResultOverview complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ftpResultOverview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensitiveDataCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgPluginResultOverview", propOrder = { "regexName",
		"sensitiveDataCount" })
public class DgPluginResultsOverview {

	protected String regexName;
	protected Long sensitiveDataCount;

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

	/**
	 * Gets the value of the sensitiveDataCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Long getSensitiveDataCount() {
		return sensitiveDataCount;
	}

	/**
	 * Sets the value of the sensitiveDataCount property.
	 * 
	 * @param long
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSensitiveDataCount(Long value) {
		this.sensitiveDataCount = value;
	}

}

