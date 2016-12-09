package com.dataguise.webservices.beans.masker;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "KeepAlive", propOrder = { "arg0", "arg1" })
@XmlRootElement
public class KeepAliveBean {

	private String agentId;
	private String controllerUrl;
	
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getControllerUrl() {
		return controllerUrl;
	}
	public void setControllerUrl(String controllerUrl) {
		this.controllerUrl = controllerUrl;
	}


	
}
