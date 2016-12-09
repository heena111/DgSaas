package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hdfsPermissionsBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hdfsPermissionsBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="execute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="read" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="write" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hdfsPermissionsBean", propOrder = { "execute", "name", "read",
		"type", "write" })
public class HdfsPermissionsBean {

	protected Boolean execute;
	protected String name;
	protected Boolean read;
	protected String type;
	protected Boolean write;
	
	/**
	 * Gets the value of the execute property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isExecute() {
		return execute;
	}

	/**
	 * Sets the value of the execute property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setExecute(Boolean value) {
		this.execute = value;
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
	 * Gets the value of the read property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isRead() {
		return read;
	}

	/**
	 * Sets the value of the read property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setRead(Boolean value) {
		this.read = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the write property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isWrite() {
		return write;
	}

	/**
	 * Sets the value of the write property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setWrite(Boolean value) {
		this.write = value;
	}

	public Boolean getExecute() {
		return execute;
	}

	public Boolean getRead() {
		return read;
	}

	public Boolean getWrite() {
		return write;
	}

}
