package com.dataguise.webservices.beans.s3;

public class DgEMRClusterInfoUI {
	
	public String errorMsg;
	public String clusterId;
	public String state;
	public String clusterName;
	public String dnsOrIp;
	public String createTime;
	public String readyTime;
	public String message;
	
	
	
	public String getClusterId() {
		return clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getDnsOrIp() {
		return dnsOrIp;
	}
	public void setDnsOrIp(String dnsOrIp) {
		this.dnsOrIp = dnsOrIp;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getReadyTime() {
		return readyTime;
	}
	public void setReadyTime(String readyTime) {
		this.readyTime = readyTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
