package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for connection complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="connection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostNameOrIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleConnectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleServicesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connection", propOrder = { "connectionId", "connectionName",
		"connectionType", "database", "hostNameOrIPAddress",
		"oracleConnectionType", "oracleServicesName", "password", "portNumber",
		"userName", "oracleSID" })
public class Connection {

	protected Integer connectionId;
	protected String connectionName;
	protected String connectionType;
	protected String database;
	protected String hostNameOrIPAddress;
	protected String oracleConnectionType;
	protected String oracleServicesName;
	protected String password;
	protected Integer portNumber;
	protected String userName;
	protected String oracleSID;

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
	 * Gets the value of the connectionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionName() {
		return connectionName;
	}

	/**
	 * Sets the value of the connectionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionName(String value) {
		this.connectionName = value;
	}

	/**
	 * Gets the value of the connectionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * Sets the value of the connectionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionType(String value) {
		this.connectionType = value;
	}

	/**
	 * Gets the value of the database property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * Sets the value of the database property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabase(String value) {
		this.database = value;
	}

	/**
	 * Gets the value of the hostNameOrIPAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHostNameOrIPAddress() {
		return hostNameOrIPAddress;
	}

	/**
	 * Sets the value of the hostNameOrIPAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHostNameOrIPAddress(String value) {
		this.hostNameOrIPAddress = value;
	}

	/**
	 * Gets the value of the oracleConnectionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleConnectionType() {
		return oracleConnectionType;
	}

	/**
	 * Sets the value of the oracleConnectionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleConnectionType(String value) {
		this.oracleConnectionType = value;
	}

	/**
	 * Gets the value of the oracleServicesName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleServicesName() {
		return oracleServicesName;
	}

	/**
	 * Sets the value of the oracleServicesName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleServicesName(String value) {
		this.oracleServicesName = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Gets the value of the portNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPortNumber() {
		return portNumber;
	}

	/**
	 * Sets the value of the portNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPortNumber(Integer value) {
		this.portNumber = value;
	}

	/**
	 * Gets the value of the userName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/**
	 * Gets the value of the oracleSID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleSID() {
		return oracleSID;
	}

	/**
	 * Sets the value of the oracleSID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleSID(String value) {
		this.oracleSID = value;
	}

}
