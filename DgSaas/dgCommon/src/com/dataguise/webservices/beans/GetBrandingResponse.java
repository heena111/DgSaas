package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getBrandingResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getBrandingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservices.dataguise.com/}dgBrandingStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBrandingResponse", propOrder = { "_return" })
public class GetBrandingResponse {

	@XmlElement(name = "return")
	protected DgBrandingStruct _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link DgBrandingStruct }
	 * 
	 */
	public DgBrandingStruct getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link DgBrandingStruct }
	 * 
	 */
	public void setReturn(DgBrandingStruct value) {
		this._return = value;
	}

}
