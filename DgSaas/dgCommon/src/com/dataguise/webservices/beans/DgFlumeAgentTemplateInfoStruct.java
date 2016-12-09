package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgFlumeAgentTemplateInfoStruct complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgFlumeAgentTemplateInfoStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="structureId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgFlumeAgentTemplateInfoStruct", propOrder = { "clusterId",
"flowId" })
public class DgFlumeAgentTemplateInfoStruct {



	protected Integer clusterId;
	protected Integer flowId;


	/**
	 * Gets the value of the agentId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public Integer getClusterId() {
		return clusterId;
	}

	/**
	 * Sets the value of the agentId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClusterId(Integer value) {
		this.clusterId = value;
	}

	/**
	 * Gets the value of the structureId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */

	public Integer getFlowId() {
		return flowId;
	}

	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}


}
