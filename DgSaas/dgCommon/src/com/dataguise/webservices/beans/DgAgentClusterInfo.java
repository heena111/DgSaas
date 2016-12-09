package com.dataguise.webservices.beans;

public class DgAgentClusterInfo {

	
	protected Integer  agentId;
	protected String agentName;
	protected String agentType;
	protected Boolean isSecondary =false;
	protected Boolean isPrimary =false;
	
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentType() {
		return agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public Boolean getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	public Boolean getIsSecondary() {
		return isSecondary;
	}
	public void setIsSecondary(Boolean isSecondary) {
		this.isSecondary = isSecondary;
	}
	
	
	
	

	
}
