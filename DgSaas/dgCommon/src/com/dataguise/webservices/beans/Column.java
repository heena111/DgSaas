
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Column">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPrecision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataScale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="constraintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isNullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Column", propOrder = {
    "dbName",
    "schemaName",
    "tableName",
    "columnName",
    "columnId",
    "dataType",
    "dataPrecision",
    "dataScale",
    "dataLength",
    "constraintType",
    "isNullable",
    "isIdentity"
})
public class Column {

    protected String dbName;
    protected String schemaName;
    protected String tableName;
    protected String columnName;
    protected String columnId;
    protected String dataType;
    protected int dataPrecision;
    protected int dataScale;
    protected int dataLength;
    protected String constraintType;
    protected boolean isNullable;
    protected boolean isIdentity;

    /**
     * Gets the value of the dbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbName(String value) {
        this.dbName = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * Sets the value of the columnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnId(String value) {
        this.columnId = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dataPrecision property.
     * 
     */
    public int getDataPrecision() {
        return dataPrecision;
    }

    /**
     * Sets the value of the dataPrecision property.
     * 
     */
    public void setDataPrecision(int value) {
        this.dataPrecision = value;
    }

    /**
     * Gets the value of the dataScale property.
     * 
     */
    public int getDataScale() {
        return dataScale;
    }

    /**
     * Sets the value of the dataScale property.
     * 
     */
    public void setDataScale(int value) {
        this.dataScale = value;
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
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintType(String value) {
        this.constraintType = value;
    }

    /**
     * Gets the value of the isNullable property.
     * 
     */
    public boolean isIsNullable() {
        return isNullable;
    }

    /**
     * Sets the value of the isNullable property.
     * 
     */
    public void setIsNullable(boolean value) {
        this.isNullable = value;
    }

    /**
     * Gets the value of the isIdentity property.
     * 
     */
    public boolean isIsIdentity() {
        return isIdentity;
    }

    /**
     * Sets the value of the isIdentity property.
     * 
     */
    public void setIsIdentity(boolean value) {
        this.isIdentity = value;
    }

}
