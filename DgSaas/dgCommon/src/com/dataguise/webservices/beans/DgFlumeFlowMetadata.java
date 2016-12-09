package com.dataguise.webservices.beans;

import java.io.Serializable;

public class DgFlumeFlowMetadata implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer flowId;
	private String agentName;
	private String sourceName;
	private String sourceProperties;
	private String sinkName;
	private String sinkProperties;
	private String channelName;
	private String channelProperties;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFlowId() {
		return flowId;
	}
	public void setFlowId(Integer flowId) {
		this.flowId = flowId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getSourceProperties() {
		return sourceProperties;
	}
	public void setSourceProperties(String sourceProperties) {
		this.sourceProperties = sourceProperties;
	}
	public String getSinkName() {
		return sinkName;
	}
	public void setSinkName(String sinkName) {
		this.sinkName = sinkName;
	}
	public String getSinkProperties() {
		return sinkProperties;
	}
	public void setSinkProperties(String sinkProperties) {
		this.sinkProperties = sinkProperties;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelProperties() {
		return channelProperties;
	}
	public void setChannelProperties(String channelProperties) {
		this.channelProperties = channelProperties;
	}
	
	
 
	 

 

}
