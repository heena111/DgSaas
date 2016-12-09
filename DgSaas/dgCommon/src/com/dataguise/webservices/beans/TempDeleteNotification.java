
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
/*
 * <p>
 * Java class for tempDeleteNotification complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="tempDeleteNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *        &lt;element name="arg0" type="{http://masker.webservices.dataguise.com/}string" minOccurs="0"/>
 *       
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tempDeleteNotification", namespace = "http://webservices.dataguise.com/" , propOrder = { "arg0"})
public class TempDeleteNotification {
	
	protected String arg0;
	
	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg0(String value) {
		this.arg0 = value;
	}

	
	


  }
