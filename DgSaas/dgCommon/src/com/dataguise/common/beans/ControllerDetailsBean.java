package com.dataguise.common.beans;

/**
 * @author Rahul Taneja
 *
 */
public class ControllerDetailsBean {
	
	private Integer agentId;
	private String port;
	private String ipAdress;
	private String protocol;
	private String serviceURL;
	private String agentType;
	
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getIpAdress() {
		return ipAdress;
	}
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	
	
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	
	public String getServiceURL() {
		return serviceURL;
	}
	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}
	public String getURL()
	{
		return getProtocol()+"://"+getIpAdress()+":"+getPort()+"/"+getServiceURL();
	}
	
	public String getURLTillPort()
	{
		return getProtocol()+"://"+getIpAdress()+":"+getPort();
	}
	public String getAgentType() {
		return agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	
	

}
