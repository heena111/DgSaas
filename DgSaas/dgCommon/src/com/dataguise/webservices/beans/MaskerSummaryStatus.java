
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractMaskingSummaryStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMaskingSummaryStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DbLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SchemaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RowsProcessed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RowsRemaining" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RowsInError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskerSummaryStatus", propOrder = {
    "dbLink",
    "schemaName",
    "tableName",
    "rowsProcessed",
    "rowsRemaining",
    "rowsInError",
    "startTime",
    "stopTime",
    "status"
})
public class MaskerSummaryStatus {

    @XmlElement(name = "DbLink", required = true)
    protected String dbLink;
    @XmlElement(name = "SchemaName", required = true)
    protected String schemaName;
    @XmlElement(name = "TableName", required = true)
    protected String tableName;
    @XmlElement(name = "RowsProcessed")
    protected int rowsProcessed;
    @XmlElement(name = "RowsRemaining")
    protected int rowsRemaining;
    @XmlElement(name = "RowsInError")
    protected int rowsInError;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "StopTime")
    protected String stopTime;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the dbLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbLink() {
        return dbLink;
    }

    /**
     * Sets the value of the dbLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbLink(String value) {
        this.dbLink = value;
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
     * Gets the value of the rowsProcessed property.
     * 
     */
    public int getRowsProcessed() {
        return rowsProcessed;
    }

    /**
     * Sets the value of the rowsProcessed property.
     * 
     */
    public void setRowsProcessed(int value) {
        this.rowsProcessed = value;
    }

    /**
     * Gets the value of the rowsRemaining property.
     * 
     */
    public int getRowsRemaining() {
        return rowsRemaining;
    }

    /**
     * Sets the value of the rowsRemaining property.
     * 
     */
    public void setRowsRemaining(int value) {
        this.rowsRemaining = value;
    }

    /**
     * Gets the value of the rowsInError property.
     * 
     */
    public int getRowsInError() {
        return rowsInError;
    }

    /**
     * Sets the value of the rowsInError property.
     * 
     */
    public void setRowsInError(int value) {
        this.rowsInError = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }
    
    /**
     * Gets the value of startTime property
     */
    public String getStartTime() {
    	return startTime;
    }
    
    /**
     * Sets the value of the startTime property
     * @param value - value to set.
     */
    public void setStartTime(String value) {
    	this.startTime = value;
    }
    
    /**
     * Gets the value of stopTime property
     */
    public String getStopTime() {
    	return stopTime;
    }
    
    /**
     * Sets the value of the stopTime property
     * @param value - value to set.
     */
    public void setStopTime(String value) {
    	this.stopTime = value;
    }

}
