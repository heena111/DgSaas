package com.dataguise.common.beans;

public class MonitoringAgentInfoBean {

	private Integer agentId;
	private String controllerServiceUrl;
	private String hdfsInfoProcessingEngineUrl;
	private String monitoringAgentUrl;

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getControllerServiceUrl() {
		return controllerServiceUrl;
	}

	public void setControllerServiceUrl(String controllerServiceUrl) {
		this.controllerServiceUrl = controllerServiceUrl;
	}

	public String getHdfsInfoProcessingEngineUrl() {
		return hdfsInfoProcessingEngineUrl;
	}

	public void setHdfsInfoProcessingEngineUrl(
			String hdfsInfoProcessingEngineUrl) {
		this.hdfsInfoProcessingEngineUrl = hdfsInfoProcessingEngineUrl;
	}

	public String getMonitoringAgentUrl() {
		return monitoringAgentUrl;
	}

	public void setMonitoringAgentUrl(String monitoringAgentUrl) {
		this.monitoringAgentUrl = monitoringAgentUrl;
	}

}
