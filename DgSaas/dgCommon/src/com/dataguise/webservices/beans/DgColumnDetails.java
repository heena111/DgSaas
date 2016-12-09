package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgColumnDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgColumnDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataPrecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataScale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dgColumnDetails", propOrder = { "columnName", "dataLength",
		"dataPrecision", "dataScale", "dataType", "databaseName", "schemaName",
		"tableName" })
public class DgColumnDetails {

	protected String columnName;
	protected int dataLength;
	protected Integer dataPrecision;
	protected Integer dataScale;
	protected String dataType;
	protected String databaseName;
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
	 * Gets the value of the dataLength property.
	 * 
	 */
	public int getDataLength() {
		return dataLength;
	}

	/**
	 * Sets the value of the dataLength property.
	 * 
	 */
	public void setDataLength(int value) {
		this.dataLength = value;
	}

	/**
	 * Gets the value of the dataPrecision property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDataPrecision() {
		return dataPrecision;
	}

	/**
	 * Sets the value of the dataPrecision property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDataPrecision(Integer value) {
		this.dataPrecision = value;
	}

	/**
	 * Gets the value of the dataScale property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDataScale() {
		return dataScale;
	}

	/**
	 * Sets the value of the dataScale property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDataScale(Integer value) {
		this.dataScale = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataType(String value) {
		this.dataType = value;
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
