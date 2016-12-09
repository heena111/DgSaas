package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgHDFSPolicyInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHDFSPolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgHDFSPolicyInfo", propOrder = { "policyDescription",
		"policyId", "policyName" })
public class DgHDFSPolicyInfo {

	protected String policyDescription;
	protected Integer policyId;
	protected String policyName;

	/**
	 * Gets the value of the policyDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPolicyDescription() {
		return policyDescription;
	}

	/**
	 * Sets the value of the policyDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPolicyDescription(String value) {
		this.policyDescription = value;
	}

	/**
	 * Gets the value of the policyId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPolicyId() {
		return policyId;
	}

	/**
	 * Sets the value of the policyId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPolicyId(Integer value) {
		this.policyId = value;
	}

	/**
	 * Gets the value of the policyName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPolicyName() {
		return policyName;
	}

	/**
	 * Sets the value of the policyName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPolicyName(String value) {
		this.policyName = value;
	}

}
