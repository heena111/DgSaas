package com.dataguise.webservices.beans.s3;

public class DgEMRClusterInfo {
	private Integer clusterId;
	private String clusterName;
	private String releaseLabel;
	private String amiVersion;
	private String instanceType;
	private Boolean useDefaultRoles;
	private String serviceRoles;
	private String logUri;
	private Boolean visibleToAllUsers;
	private String tags;
	private String keyPair;
	private String accessKeyId;
	private String secretAccessKey;
	private Integer instanceCount;
	private String subnetId;
	private String command ;
	private String agentName;
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getReleaseLabel() {
		return releaseLabel;
	}
	public void setReleaseLabel(String releaseLabel) {
		this.releaseLabel = releaseLabel;
	}
	public String getAmiVersion() {
		return amiVersion;
	}
	public void setAmiVersion(String amiVersion) {
		this.amiVersion = amiVersion;
	}
	public String getInstanceType() {
		return instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}
	public Boolean getUseDefaultRoles() {
		return useDefaultRoles;
	}
	public void setUseDefaultRoles(Boolean useDefaultRoles) {
		this.useDefaultRoles = useDefaultRoles;
	}
	public String getServiceRoles() {
		return serviceRoles;
	}
	public void setServiceRoles(String serviceRoles) {
		this.serviceRoles = serviceRoles;
	}
	public String getLogUri() {
		return logUri;
	}
	public void setLogUri(String logUri) {
		this.logUri = logUri;
	}
	public Boolean getVisibleToAllUsers() {
		return visibleToAllUsers;
	}
	public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
		this.visibleToAllUsers = visibleToAllUsers;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	public String getKeyPair() {
		return keyPair;
	}
	public void setKeyPair(String keyPair) {
		this.keyPair = keyPair;
	}
	public String getAccessKeyId() {
		return accessKeyId;
	}
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}
	public String getSecretAccessKey() {
		return secretAccessKey;
	}
	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}
	
	
	public Integer getInstanceCount() {
		return instanceCount;
	}
	public void setInstanceCount(Integer instanceCount) {
		this.instanceCount = instanceCount;
	}
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getSubnetId() {
		return subnetId;
	}
	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
	}
	

}
