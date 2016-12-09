package com.dataguise.webservices.beans.discover.database;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * Java class for DiscoveryStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnsWithSensitiveData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="connectionsScanned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tablesScanned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalTables" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dbBeingScanned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
public class DiscoveryStatus implements Cloneable{

	protected Integer columnsWithSensitiveData;
	protected Integer connectionsScanned;
	protected String status;
	protected Integer tablesScanned;
	protected Integer taskInstanceId;
	protected Integer totalConnections;
	protected Integer totalTables;
	protected String dbBeingScanned;
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public String getDbBeingScanned() {
		return dbBeingScanned;
	}
	
	public void setDbBeingScanned(String dbBeingScanned) {
		this.dbBeingScanned = dbBeingScanned;
	}

	/**
	 * Gets the value of the columnsWithSensitiveData property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getColumnsWithSensitiveData() {
		return columnsWithSensitiveData;
	}

	/**
	 * Sets the value of the columnsWithSensitiveData property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setColumnsWithSensitiveData(Integer value) {
		this.columnsWithSensitiveData = value;
	}

	/**
	 * Gets the value of the connectionsScanned property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConnectionsScanned() {
		return connectionsScanned;
	}

	/**
	 * Sets the value of the connectionsScanned property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConnectionsScanned(Integer value) {
		this.connectionsScanned = value;
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
	 * Gets the value of the tablesScanned property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTablesScanned() {
		return tablesScanned;
	}

	/**
	 * Sets the value of the tablesScanned property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTablesScanned(Integer value) {
		this.tablesScanned = value;
	}

	/**
	 * Gets the value of the taskInstanceId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	/**
	 * Sets the value of the taskInstanceId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskInstanceId(Integer value) {
		this.taskInstanceId = value;
	}

	/**
	 * Gets the value of the totalConnections property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalConnections() {
		return totalConnections;
	}

	/**
	 * Sets the value of the totalConnections property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalConnections(Integer value) {
		this.totalConnections = value;
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

}
