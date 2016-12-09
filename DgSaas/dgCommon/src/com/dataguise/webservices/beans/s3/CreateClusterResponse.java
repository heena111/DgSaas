package com.dataguise.webservices.beans.s3;

public class CreateClusterResponse   {
	
	public String clusterId;

	
	
	public String name;
	public String dnsOrIP;
	public String state;
	public ClusterStateResponse stateChangeReason;
	public ClusterStateResponse getStateChangeReason() {
		return stateChangeReason;
	}
	public void setStateChangeReason(ClusterStateResponse stateChangeReason) {
		this.stateChangeReason = stateChangeReason;
	}

	public CreationDetailsForCluster details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDnsOrIP() {
		return dnsOrIP;
	}
	public void setDnsOrIP(String dnsOrIP) {
		this.dnsOrIP = dnsOrIP;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public CreationDetailsForCluster getDetails() {
		return details;
	}
	public void setDetails(CreationDetailsForCluster details) {
		this.details = details;
	}
	
	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

}
