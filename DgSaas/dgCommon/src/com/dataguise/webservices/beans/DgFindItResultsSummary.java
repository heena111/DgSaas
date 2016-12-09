package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgFindItResultsSummary complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgFindItResultsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgFindItResultsSummary", propOrder = { "count", "databaseType" })
public class DgFindItResultsSummary {

	protected Integer count;
	protected String databaseType;

	/**
	 * Gets the value of the count property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Sets the value of the count property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setCount(Integer value) {
		this.count = value;
	}

	/**
	 * Gets the value of the databaseType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabaseType() {
		return databaseType;
	}

	/**
	 * Sets the value of the databaseType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabaseType(String value) {
		this.databaseType = value;
	}

}
