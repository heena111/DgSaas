
package com.dataguise.webservices.beans.masker;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DgMaskerLinkedColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgMaskerLinkedColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceDatabase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetDatabase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetTable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableMaskSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgMaskerLinkedColumn", namespace = "http://webservices.dataguise.com/", propOrder = {
    "sourceDatabase",
    "sourceSchema",
    "sourceTable",
    "sourceColumn",
    "targetConnection",
    "targetDatabase",
    "targetSchema",
    "targetTable",
    "targetColumn",
    "tableMaskSequence"
})
public class DgMaskerLinkedColumn {

    protected String sourceDatabase;
    protected String sourceSchema;
    protected String sourceTable;
    protected String sourceColumn;
    protected String targetConnection;
    protected String targetDatabase;
    protected String targetSchema;
    protected String targetTable;
    protected String targetColumn;
    protected String tableMaskSequence;

    /**
     * Gets the value of the sourceDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDatabase() {
        return sourceDatabase;
    }

    /**
     * Sets the value of the sourceDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDatabase(String value) {
        this.sourceDatabase = value;
    }

    /**
     * Gets the value of the sourceSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSchema() {
        return sourceSchema;
    }

    /**
     * Sets the value of the sourceSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSchema(String value) {
        this.sourceSchema = value;
    }

    /**
     * Gets the value of the sourceTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTable() {
        return sourceTable;
    }

    /**
     * Sets the value of the sourceTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTable(String value) {
        this.sourceTable = value;
    }

    /**
     * Gets the value of the sourceColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceColumn() {
        return sourceColumn;
    }

    /**
     * Sets the value of the sourceColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceColumn(String value) {
        this.sourceColumn = value;
    }

    /**
     * Gets the value of the targetConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConnection() {
        return targetConnection;
    }

    /**
     * Sets the value of the targetConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConnection(String value) {
        this.targetConnection = value;
    }

    /**
     * Gets the value of the targetDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDatabase() {
        return targetDatabase;
    }

    /**
     * Sets the value of the targetDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDatabase(String value) {
        this.targetDatabase = value;
    }

    /**
     * Gets the value of the targetSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSchema() {
        return targetSchema;
    }

    /**
     * Sets the value of the targetSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSchema(String value) {
        this.targetSchema = value;
    }

    /**
     * Gets the value of the targetTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTable() {
        return targetTable;
    }

    /**
     * Sets the value of the targetTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTable(String value) {
        this.targetTable = value;
    }

    /**
     * Gets the value of the targetColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetColumn() {
        return targetColumn;
    }

    /**
     * Sets the value of the targetColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetColumn(String value) {
        this.targetColumn = value;
    }

    /**
     * Gets the value of the tableMaskSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableMaskSequence() {
        return tableMaskSequence;
    }

    /**
     * Sets the value of the tableMaskSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableMaskSequence(String value) {
        this.tableMaskSequence = value;
    }

}
