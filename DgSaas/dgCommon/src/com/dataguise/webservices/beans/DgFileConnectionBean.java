package com.dataguise.webservices.beans;

import javax.validation.constraints.Pattern;

import com.dataguise.util.BeanValidator;

public class DgFileConnectionBean {
	Integer connId;
	Integer agentId;
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Scan Location:"+BeanValidator.INVALID_CHARACTER_SET)
	String scanLocation;
	
	public Integer getConnId() {
		return connId;
	}
	public void setConnId(Integer connId) {
		this.connId = connId;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public String getScanLocation() {
		return scanLocation;
	}
	public void setScanLocation(String scanLocation) {
		this.scanLocation = scanLocation;
	}
	
	
}
