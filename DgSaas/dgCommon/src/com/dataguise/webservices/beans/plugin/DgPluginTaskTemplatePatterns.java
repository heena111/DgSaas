package com.dataguise.webservices.beans.plugin;

import com.dataguise.webservices.beans.masker.DgMaskerColumn;

public class DgPluginTaskTemplatePatterns extends DgMaskerColumn implements java.io.Serializable {

	protected String maskingPolicy;
	
	public String getMaskingPolicy() {
		return maskingPolicy;
	}

	public void setMaskingPolicy(String value) {
		this.maskingPolicy = value;
	}
}
