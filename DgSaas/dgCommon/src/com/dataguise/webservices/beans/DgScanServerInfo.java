package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgScanServerInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgScanServerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastScanTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgScanServerInfo", propOrder = { "hostName", "id",
		"ipAddress", "lastScanTime","agentName" })
public class DgScanServerInfo {

	protected String hostName;
	protected Integer id;
	protected String ipAddress;
	protected String lastScanTime;
	protected String agentName;

	/**
	 * Gets the value of the hostName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Sets the value of the hostName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHostName(String value) {
		this.hostName = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Gets the value of the ipAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the value of the ipAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpAddress(String value) {
		this.ipAddress = value;
	}

	/**
	 * Gets the value of the lastScanTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastScanTime() {
		return lastScanTime;
	}

	/**
	 * Sets the value of the lastScanTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastScanTime(String value) {
		this.lastScanTime = value;
	}

	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

}
