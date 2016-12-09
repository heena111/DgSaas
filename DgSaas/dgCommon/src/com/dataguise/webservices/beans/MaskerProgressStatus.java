
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Masking Progress Status Info
 * 
 * <p>Java class for AbstractMaskingProgressStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMaskingProgressStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskerProgressStatus")
public class MaskerProgressStatus {
	@XmlElement(name = "totalTables")
    protected int totalTables;
    @XmlElement(name = "totalRows")
    protected int totalRows;
    @XmlElement(name = "rowsProcessed")
    protected int rowsProcessed;
    @XmlElement(name = "rowsInError")
    protected int rowsInError;
    @XmlElement(name = "percentComplete")
    protected int percentComplete;
    @XmlElement(name = "status")
    protected String status;
    
    /**
     * Gets the value of the totalTables property.
     * 
     */
    public int getTotalTables() {
        return totalTables;
    }

    /**
     * Sets the value of the totalSeconds property.
     * 
     */
    public void setTotalTables(int value) {
        this.totalTables = value;
    }
    
    /**
     * Gets the value of the totalRows property.
     * 
     */
    public int getTotalRows() {
        return totalRows;
    }

    /**
     * Sets the value of the totalSeconds property.
     * 
     */
    public void setTotalRows(int value) {
        this.totalRows = value;
    }
    
    /**
     * Gets the value of the rowsProcessed property.
     * 
     */
    public int getRowsProcessed() {
        return rowsProcessed;
    }

    /**
     * Sets the value of the totalSeconds property.
     * 
     */
    public void setRowsProcessed(int value) {
        this.rowsProcessed = value;
    }
    
    /**
     * Gets the value of the rowsInError property.
     * 
     */
    public int getRowsInError() {
        return rowsInError;
    }

    /**
     * Sets the value of the totalSeconds property.
     * 
     */
    public void setRowsInError(int value) {
        this.rowsInError = value;
    }
    
    /**
     * Gets the value of the percentComplete property.
     * 
     */
    public int getPercentComplete() {
        return percentComplete;
    }

    /**
     * Sets the value of the totalSeconds property.
     * 
     */
    public void setPercentComplete(int value) {
        this.percentComplete = value;
    }
    
    /**
     * Gets the value of the percentComplete property.
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the totalSeconds property.
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }
}
