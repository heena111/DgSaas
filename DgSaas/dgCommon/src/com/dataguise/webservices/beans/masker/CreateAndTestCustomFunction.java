package com.dataguise.webservices.beans.masker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.dataguise.webservices.beans.DgConnection;
import com.dataguise.webservices.beans.DgCustomFunctionsBean;

/**
 * <p>
 * Java class for createAndTestCustomFunction complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="createAndTestCustomFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://masker.webservices.dataguise.com/}dgConnection" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://webservices.dataguise.com/}dgCustomFunctionsBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAndTestCustomFunction", propOrder = { "arg0", "arg1" })
public class CreateAndTestCustomFunction {

	protected DgConnection arg0;
	protected DgCustomFunctionsBean arg1;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgConnection }
	 * 
	 */
	public DgConnection getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgConnection }
	 * 
	 */
	public void setArg0(DgConnection value) {
		this.arg0 = value;
	}

	/**
	 * Gets the value of the arg1 property.
	 * 
	 * @return possible object is {@link DgCustomFunctionsBean }
	 * 
	 */
	public DgCustomFunctionsBean getArg1() {
		return arg1;
	}

	/**
	 * Sets the value of the arg1 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgCustomFunctionsBean }
	 * 
	 */
	public void setArg1(DgCustomFunctionsBean value) {
		this.arg1 = value;
	}

}
