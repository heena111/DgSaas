package com.dataguise.webservices.beans;

import java.util.List;

public class DgClusterInfo {
	protected Integer  id;
	protected String  clusterName;
	protected String distribution;
	protected Integer distributionId;
	protected String version; 
	protected Integer versionId;
	private String fsDefaultName;
	private String fsDefaultPort;
	private String mapredJobTracker;
	private String mapredDefaultPort;
	private String userName;
	private String defaultQueueName;
	private Boolean yarn;
	private String description;
	private List<DgAgentClusterInfo> agentInfo;
	private LDAPConnectionParams ldapParams;
	private String location;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getDistribution() {
		return distribution;
	}
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}
	public Integer getDistributionId() {
		return distributionId;
	}
	public void setDistributionId(Integer distributionId) {
		this.distributionId = distributionId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public String getFsDefaultName() {
		return fsDefaultName;
	}
	public void setFsDefaultName(String fsDefaultName) {
		this.fsDefaultName = fsDefaultName;
	}
	public String getFsDefaultPort() {
		return fsDefaultPort;
	}
	public void setFsDefaultPort(String fsDefaultPort) {
		this.fsDefaultPort = fsDefaultPort;
	}
	public String getMapredJobTracker() {
		return mapredJobTracker;
	}
	public void setMapredJobTracker(String mapredJobTracker) {
		this.mapredJobTracker = mapredJobTracker;
	}
	public String getMapredDefaultPort() {
		return mapredDefaultPort;
	}
	public void setMapredDefaultPort(String mapredDefaultPort) {
		this.mapredDefaultPort = mapredDefaultPort;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDefaultQueueName() {
		return defaultQueueName;
	}
	public void setDefaultQueueName(String defaultQueueName) {
		this.defaultQueueName = defaultQueueName;
	}
	public Boolean getYarn() {
		return yarn;
	}
	public void setYarn(Boolean yarn) {
		this.yarn = yarn;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<DgAgentClusterInfo> getAgentInfo() {
		return agentInfo;
	}
	public void setAgentInfo(List<DgAgentClusterInfo> agentInfo) {
		this.agentInfo = agentInfo;
	}
	public LDAPConnectionParams getLdapParams() {
		return ldapParams;
	}
	public void setLdapParams(LDAPConnectionParams ldapParams) {
		this.ldapParams = ldapParams;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
