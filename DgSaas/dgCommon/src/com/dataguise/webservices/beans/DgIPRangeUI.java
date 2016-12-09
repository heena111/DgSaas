package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgIPRangeUI complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgIPRangeUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgIPRangeUI", propOrder = { "agentId", "id", "name",
		"rangeDesc", "rangeFrom", "rangeTo" })
public class DgIPRangeUI {

	protected Integer agentId;
	protected int id;
	protected String name;
	protected String rangeDesc;
	protected String rangeFrom;
	protected String rangeTo;

	/**
	 * Gets the value of the agentId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAgentId() {
		return agentId;
	}

	/**
	 * Sets the value of the agentId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAgentId(Integer value) {
		this.agentId = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the rangeDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRangeDesc() {
		return rangeDesc;
	}

	/**
	 * Sets the value of the rangeDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRangeDesc(String value) {
		this.rangeDesc = value;
	}

	/**
	 * Gets the value of the rangeFrom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRangeFrom() {
		return rangeFrom;
	}

	/**
	 * Sets the value of the rangeFrom property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRangeFrom(String value) {
		this.rangeFrom = value;
	}

	/**
	 * Gets the value of the rangeTo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRangeTo() {
		return rangeTo;
	}

	/**
	 * Sets the value of the rangeTo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRangeTo(String value) {
		this.rangeTo = value;
	}

}
