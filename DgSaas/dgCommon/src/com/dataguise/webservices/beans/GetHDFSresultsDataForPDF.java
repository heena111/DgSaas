package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getHDFSresultsDataForPDF complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getHDFSresultsDataForPDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgHDFSTaskInstanceResultsStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHDFSresultsDataForPDF", propOrder = { "arg0" })
public class GetHDFSresultsDataForPDF {

	protected DgHDFSTaskInstanceResultsStruct arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgHDFSTaskInstanceResultsStruct }
	 * 
	 */
	public DgHDFSTaskInstanceResultsStruct getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgHDFSTaskInstanceResultsStruct }
	 * 
	 */
	public void setArg0(DgHDFSTaskInstanceResultsStruct value) {
		this.arg0 = value;
	}

}
