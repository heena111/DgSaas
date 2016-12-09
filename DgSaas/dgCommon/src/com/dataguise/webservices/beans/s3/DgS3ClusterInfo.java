package com.dataguise.webservices.beans.s3;

public class DgS3ClusterInfo {
	
	
	protected String clusterName;
	protected String clusterEmrId;
	protected Integer clusterId;
	protected String state;
	protected String clusterType;
	protected String dnsOrIp;
	protected Boolean isClusterActive;
	
	
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getClusterEmrId() {
		return clusterEmrId;
	}
	public void setClusterEmrId(String clusterEmrId) {
		this.clusterEmrId = clusterEmrId;
	}
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getClusterType() {
		return clusterType;
	}
	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}
	public String getDnsOrIp() {
		return dnsOrIp;
	}
	public void setDnsOrIp(String dnsOrIp) {
		this.dnsOrIp = dnsOrIp;
	}
	public Boolean getIsClusterActive() {
		return isClusterActive;
	}
	public void setIsClusterActive(Boolean isClusterActive) {
		this.isClusterActive = isClusterActive;
	}
	
	
	

}
