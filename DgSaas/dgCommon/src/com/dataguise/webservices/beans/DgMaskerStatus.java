package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgMaskerStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgMaskerStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowsInError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRowsProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalTables" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgMaskerStatus", propOrder = { "taskName","rowsInError", "status",
		"totalRows", "totalRowsProcessed", "totalTables","startTime","endTime" })
public class DgMaskerStatus {
	
	protected String taskName;
	protected Integer rowsInError;
	protected String status;
	protected Integer totalRows;
	protected Integer totalRowsProcessed;
	protected Integer totalTables;
	protected String startTime;
	protected String endTime;

	/**
	 * Gets the value of the rowsInError property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRowsInError() {
		return rowsInError;
	}

	/**
	 * Sets the value of the rowsInError property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRowsInError(Integer value) {
		this.rowsInError = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the totalRows property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalRows() {
		return totalRows;
	}

	/**
	 * Sets the value of the totalRows property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalRows(Integer value) {
		this.totalRows = value;
	}

	/**
	 * Gets the value of the totalRowsProcessed property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalRowsProcessed() {
		return totalRowsProcessed;
	}

	/**
	 * Sets the value of the totalRowsProcessed property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalRowsProcessed(Integer value) {
		this.totalRowsProcessed = value;
	}

	/**
	 * Gets the value of the totalTables property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalTables() {
		return totalTables;
	}

	/**
	 * Sets the value of the totalTables property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalTables(Integer value) {
		this.totalTables = value;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String date) {
		this.startTime = date;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getTaskName() {
	        return taskName;
	    }

	public void setTaskName(String value) {
	        this.taskName = value;
	    }

}
