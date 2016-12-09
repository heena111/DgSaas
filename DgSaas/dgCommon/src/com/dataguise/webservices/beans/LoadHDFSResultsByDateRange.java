package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for loadHDFSResultsByDateRange complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="loadHDFSResultsByDateRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgLoadHDFSResultsByDateRange" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadHDFSResultsByDateRange", propOrder = { "arg0", "arg1",
		"arg2" })
public class LoadHDFSResultsByDateRange {

	protected DgLoadHDFSResultsByDateRange arg0;
	protected Boolean arg1;
	protected String arg2;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgLoadHDFSResultsByDateRange }
	 * 
	 */
	public DgLoadHDFSResultsByDateRange getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgLoadHDFSResultsByDateRange }
	 * 
	 */
	public void setArg0(DgLoadHDFSResultsByDateRange value) {
		this.arg0 = value;
	}

	/**
	 * Gets the value of the arg1 property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isArg1() {
		return arg1;
	}

	/**
	 * Sets the value of the arg1 property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setArg1(Boolean value) {
		this.arg1 = value;
	}

	/**
	 * Gets the value of the arg2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg2() {
		return arg2;
	}

	/**
	 * Sets the value of the arg2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg2(String value) {
		this.arg2 = value;
	}

}
