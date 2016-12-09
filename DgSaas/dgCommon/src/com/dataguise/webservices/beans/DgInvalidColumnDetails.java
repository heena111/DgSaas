package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgInvalidColumnDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgInvalidColumnDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invalidReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgInvalidColumnDetails", propOrder = { "columnName",
		"databaseName", "invalidReason", "schemaName", "tableName" })
public class DgInvalidColumnDetails {

	protected String columnName;
	protected String databaseName;
	protected String invalidReason;
	protected String schemaName;
	protected String tableName;

	/**
	 * Gets the value of the columnName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * Sets the value of the columnName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnName(String value) {
		this.columnName = value;
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

	/**
	 * Gets the value of the invalidReason property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInvalidReason() {
		return invalidReason;
	}

	/**
	 * Sets the value of the invalidReason property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInvalidReason(String value) {
		this.invalidReason = value;
	}

	/**
	 * Gets the value of the schemaName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSchemaName() {
		return schemaName;
	}

	/**
	 * Sets the value of the schemaName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSchemaName(String value) {
		this.schemaName = value;
	}

	/**
	 * Gets the value of the tableName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * Sets the value of the tableName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTableName(String value) {
		this.tableName = value;
	}

}
