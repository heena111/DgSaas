package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for saveFtpTaskTemplate complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="saveFtpTaskTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}ftpTaskTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveFtpTaskTemplate", propOrder = { "arg0" })
public class SaveFtpTaskTemplate {

	protected FtpTaskTemplate arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link FtpTaskTemplate }
	 * 
	 */
	public FtpTaskTemplate getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link FtpTaskTemplate }
	 * 
	 */
	public void setArg0(FtpTaskTemplate value) {
		this.arg0 = value;
	}

}
