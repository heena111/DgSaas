package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for saveFileSearchTask complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="saveFileSearchTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgDiscoverFileTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveFileSearchTask", propOrder = { "arg0" })
public class SaveFileSearchTask {

	protected DgDiscoverFileTask arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgDiscoverFileTask }
	 * 
	 */
	public DgDiscoverFileTask getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgDiscoverFileTask }
	 * 
	 */
	public void setArg0(DgDiscoverFileTask value) {
		this.arg0 = value;
	}

}
