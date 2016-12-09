package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for loadSensitiveDataDiscoveryUnsafeResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="loadSensitiveDataDiscoveryUnsafeResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadSensitiveDataDiscoveryUnsafeResults", propOrder = {
		"arg0", "arg1", "arg2", "arg3", "arg4" })
public class LoadSensitiveDataDiscoveryUnsafeResults {

	protected String arg0;
	protected Integer arg1;
	protected Integer arg2;
	protected String arg3;
	protected Boolean arg4;

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

	/**
	 * Gets the value of the arg1 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getArg1() {
		return arg1;
	}

	/**
	 * Sets the value of the arg1 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setArg1(Integer value) {
		this.arg1 = value;
	}

	/**
	 * Gets the value of the arg2 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getArg2() {
		return arg2;
	}

	/**
	 * Sets the value of the arg2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setArg2(Integer value) {
		this.arg2 = value;
	}

	/**
	 * Gets the value of the arg3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg3() {
		return arg3;
	}

	/**
	 * Sets the value of the arg3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg3(String value) {
		this.arg3 = value;
	}

	/**
	 * Gets the value of the arg4 property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isArg4() {
		return arg4;
	}

	/**
	 * Sets the value of the arg4 property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setArg4(Boolean value) {
		this.arg4 = value;
	}

}