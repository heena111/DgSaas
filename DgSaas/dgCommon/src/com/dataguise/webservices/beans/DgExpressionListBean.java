package com.dataguise.webservices.beans;

import javax.validation.Valid;

import javax.validation.constraints.Pattern;

import com.dataguise.util.BeanValidator;

import com.dataguise.webservices.beans.masker.DgMaskerColumn;

public class DgExpressionListBean {


	private Integer expressionID;
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Masking Policy:"+BeanValidator.INVALID_CHARACTER_SET)
	private String maskingPolicy;
	@Valid
	private DgMaskerColumn maskingOption;
	private Integer policyId;

	public Integer getExpressionID() {
		return expressionID;
	}
	public void setExpressionID(Integer expressionID) {
		this.expressionID = expressionID;
	}
	public String getMaskingPolicy() {
		return maskingPolicy;
	}
	public void setMaskingPolicy(String maskingPolicy) {
		this.maskingPolicy = maskingPolicy;
	}
	public DgMaskerColumn getMaskingOption() {
		return maskingOption;
	}
	public void setMaskingOption(DgMaskerColumn maskingOption) {
		this.maskingOption = maskingOption;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}



}
