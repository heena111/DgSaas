package com.dataguise.webservices.beans;
public class DgInfraStructureNodeBean {
	private Integer agentId;
    private String agentName;
    private String hostName;
    private String portNumber;
    private String agentType;
    private Boolean isDefault;
    private Integer status;
    private String agentStartTime;
    
    public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAgentStartTime() {
		return agentStartTime;
	}
	public void setAgentStartTime(String agentStartTime) {
		this.agentStartTime = agentStartTime;
	}
	/**
	 * @return the isDefault
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}
	/**
	 * @param isDefault the isDefault to set
	 */
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	private String createts;
    private String updatets;
	
	/**
	 * @return the agentId
	 */
	public Integer getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}
	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}
	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	/**
	 * @return the portNumber
	 */
	public String getPortNumber() {
		return portNumber;
	}
	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	/**
	 * @return the agentType
	 */
	public String getAgentType() {
		return agentType;
	}
	/**
	 * @param agentType the agentType to set
	 */
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	/**
	 * @return the createts
	 */
	public String getCreatets() {
		return createts;
	}
	/**
	 * @param createts the createts to set
	 */
	public void setCreatets(String createts) {
		this.createts = createts;
	}
	/**
	 * @return the updatets
	 */
	public String getUpdatets() {
		return updatets;
	}
	/**
	 * @param updatets the updatets to set
	 */
	public void setUpdatets(String updatets) {
		this.updatets = updatets;
	}
	
}
