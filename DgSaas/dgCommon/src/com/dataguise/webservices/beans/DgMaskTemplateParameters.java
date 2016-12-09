package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DgMaskTemplateParameters complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DgMaskTemplateParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://masker.webservices.dataguise.com/}dgBaseBean">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgMaskTemplateParameters", propOrder = { "templateId",
		"templateName", "templateDescription", "connectionList" })
public class DgMaskTemplateParameters extends DgBaseBean {

	protected Integer templateId;
	protected String templateName;
	protected String templateDescription;
	protected String connectionList;

	/**
	 * Gets the value of the templateId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTemplateId() {
		return templateId;
	}

	/**
	 * Sets the value of the templateId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTemplateId(Integer value) {
		this.templateId = value;
	}

	/**
	 * Gets the value of the templateName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * Sets the value of the templateName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTemplateName(String value) {
		this.templateName = value;
	}

	/**
	 * Gets the value of the templateDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTemplateDescription() {
		return templateDescription;
	}

	/**
	 * Sets the value of the templateDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTemplateDescription(String value) {
		this.templateDescription = value;
	}

	/**
	 * Gets the value of the connectionList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionList() {
		return connectionList;
	}

	/**
	 * Sets the value of the connectionList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionList(String value) {
		this.connectionList = value;
	}

}
