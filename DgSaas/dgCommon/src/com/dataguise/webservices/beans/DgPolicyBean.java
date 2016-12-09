package com.dataguise.webservices.beans;

import java.util.List;


public class DgPolicyBean {

	protected String policyDescription;
	protected Integer policyId;
	protected String policyName;
	protected String regexIds;
	protected List<DgPolicyTaskTemplate> dgPolicyTaskTemplate;


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

	/**
	 * Gets the value of the regexIds property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegexIds() {
		return regexIds;
	}

	/**
	 * Sets the value of the regexIds property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegexIds(String value) {
		this.regexIds = value;
	}


	public List<DgPolicyTaskTemplate> getDgPolicyTaskTemplate() {
		return dgPolicyTaskTemplate;
	}

	public void setDgPolicyTaskTemplate(List<DgPolicyTaskTemplate> dgPolicyTaskTemplate) {
		this.dgPolicyTaskTemplate = dgPolicyTaskTemplate;
	}



}
