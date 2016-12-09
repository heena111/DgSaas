package com.dataguise.common.beans;

import java.util.Properties;

public class DgDbConnectionParams {

	String dbms = null;
	String serverName = null;
	String portNumber = null;
	String database = null;
	private String instanceName =null;
	private String sslFlag =null; 
	private String authType=null;
	private String sid=null;
	private String serviceName=null;
	private String tnsName=null;

	Properties connectionProps = null;
	
	
	public String getDbms() {
		return dbms;
	}

	public void setDbms(String dbms) {
		this.dbms = dbms;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public Properties getConnectionProps() {
		return connectionProps;
	}

	public void setConnectionProps(Properties connectionProps) {
		this.connectionProps = connectionProps;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setSslFlag(String sslFlag) {
		this.sslFlag = sslFlag;
	}

	public String getSslFlag() {
		return sslFlag;
	}
	
	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getTnsName() {
		return tnsName;
	}

	public void setTnsName(String tnsName) {
		this.tnsName = tnsName;
	}

	
}
