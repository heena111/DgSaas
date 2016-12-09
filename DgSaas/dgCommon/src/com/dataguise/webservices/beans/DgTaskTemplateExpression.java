package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgTaskTemplateExpression complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgTaskTemplateExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expressionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maskingOptions" type="{http://webservices.dataguise.com/}dgTaskTemplatePatterns" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgTaskTemplateExpression", propOrder = { "expressionID",
		"maskingOptions" })
public class DgTaskTemplateExpression {

	protected Integer expressionID;
	protected DgTaskTemplatePatterns maskingOptions;

	/**
	 * Gets the value of the expressionID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getExpressionID() {
		return expressionID;
	}

	/**
	 * Sets the value of the expressionID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setExpressionID(Integer value) {
		this.expressionID = value;
	}

	/**
	 * Gets the value of the maskingOptions property.
	 * 
	 * @return possible object is {@link DgTaskTemplatePatterns }
	 * 
	 */
	public DgTaskTemplatePatterns getMaskingOptions() {
		return maskingOptions;
	}

	/**
	 * Sets the value of the maskingOptions property.
	 * 
	 * @param value
	 *            allowed object is {@link DgTaskTemplatePatterns }
	 * 
	 */
	public void setMaskingOptions(DgTaskTemplatePatterns value) {
		this.maskingOptions = value;
	}

}
