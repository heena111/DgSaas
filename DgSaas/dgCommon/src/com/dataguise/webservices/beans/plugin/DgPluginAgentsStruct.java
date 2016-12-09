package com.dataguise.webservices.beans.plugin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgFlumeAgentsStruct complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgFlumeAgentsStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgPluginAgentsStruct", propOrder = { "agentDesc", "agentID",
		"agentName", "configId", "createdOn", "startTime", "status","structureId" })
public class DgPluginAgentsStruct {

	protected String agentDesc;
	protected Integer agentID;
	protected String agentName;
	protected Integer configId;
	protected String createdOn;
	
	protected String startTime;
	protected Integer status;
	protected Integer structureId;

	/**
	 * Gets the value of the agentDesc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgentDesc() {
		return agentDesc;
	}

	/**
	 * Sets the value of the agentDesc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgentDesc(String value) {
		this.agentDesc = value;
	}

	/**
	 * Gets the value of the agentID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getAgentID() {
		return agentID;
	}

	/**
	 * Sets the value of the agentID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setAgentID(Integer value) {
		this.agentID = value;
	}

	/**
	 * Gets the value of the agentName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * Sets the value of the agentName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAgentName(String value) {
		this.agentName = value;
	}

	/**
	 * Gets the value of the configId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConfigId() {
		return configId;
	}

	/**
	 * Sets the value of the configId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConfigId(Integer value) {
		this.configId = value;
	}

	/**
	 * Gets the value of the createdOn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * Sets the value of the createdOn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedOn(String value) {
		this.createdOn = value;
	}

	

	/**
	 * Gets the value of the startTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the startTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartTime(String value) {
		this.startTime = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(Integer value) {
		this.status = value;
	}

	/**
	 * @return the structureId
	 */
	public Integer getStructureId() {
		return structureId;
	}

	/**
	 * @param structureId the structureId to set
	 */
	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}

}
