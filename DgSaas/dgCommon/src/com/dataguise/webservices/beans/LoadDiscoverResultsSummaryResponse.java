package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for loadDiscoverResultsSummaryResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="loadDiscoverResultsSummaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservices.dataguise.com/}dgDiscoverResultsSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadDiscoverResultsSummaryResponse", propOrder = { "_return" })
public class LoadDiscoverResultsSummaryResponse {

	@XmlElement(name = "return")
	protected DgDiscoverResultsSummary _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link DgDiscoverResultsSummary }
	 * 
	 */
	public DgDiscoverResultsSummary getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link DgDiscoverResultsSummary }
	 * 
	 */
	public void setReturn(DgDiscoverResultsSummary value) {
		this._return = value;
	}

}
