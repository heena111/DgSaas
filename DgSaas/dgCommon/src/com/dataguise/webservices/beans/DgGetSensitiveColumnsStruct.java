package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgGetSensitiveColumnsStruct complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgGetSensitiveColumnsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgGetSensitiveColumnsStruct", propOrder = { "connectionId",
		"databaseName" })
public class DgGetSensitiveColumnsStruct {

	protected Integer connectionId;
	protected String databaseName;

	/**
	 * Gets the value of the connectionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConnectionId() {
		return connectionId;
	}

	/**
	 * Sets the value of the connectionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConnectionId(Integer value) {
		this.connectionId = value;
	}

	/**
	 * Gets the value of the databaseName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * Sets the value of the databaseName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabaseName(String value) {
		this.databaseName = value;
	}

}
