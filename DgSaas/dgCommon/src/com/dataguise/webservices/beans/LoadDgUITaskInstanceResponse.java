package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for loadDgUITaskInstanceResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="loadDgUITaskInstanceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservices.dataguise.com/}dgUITaskInstanceWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadDgUITaskInstanceResponse", propOrder = { "_return" })
public class LoadDgUITaskInstanceResponse {

	@XmlElement(name = "return")
	protected DgUITaskInstanceWrapper _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link DgUITaskInstanceWrapper }
	 * 
	 */
	public DgUITaskInstanceWrapper getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link DgUITaskInstanceWrapper }
	 * 
	 */
	public void setReturn(DgUITaskInstanceWrapper value) {
		this._return = value;
	}

}
