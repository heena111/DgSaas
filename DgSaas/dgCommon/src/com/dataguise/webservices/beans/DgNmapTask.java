package com.dataguise.webservices.beans;

public class DgNmapTask {
	
	protected String taskName;
	protected String taskDescription;
	protected String ipAddressRange;
	protected String oraclePortRange;
	protected String sqlServerPortRange;
	protected String mySQLPortRange;
	protected String db2PortRange;
	protected String sybasePortRange;
	protected Integer sqlServerNativeSearch;
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	public String getIpAddressRange() {
		return ipAddressRange;
	}
	
	public void setIpAddressRange(String ipAddressRange) {
		this.ipAddressRange = ipAddressRange;
	}
	
	public String getOraclePortRange() {
		return oraclePortRange;
	}
	
	public void setOraclePortRange(String oraclePortRange) {
		this.oraclePortRange = oraclePortRange;
	}
	
	public String getSqlServerPortRange() {
		return sqlServerPortRange;
	}
	
	public void setSqlServerPortRange(String sqlServerPortRange) {
		this.sqlServerPortRange = sqlServerPortRange;
	}
	
	public String getMySQLPortRange() {
		return mySQLPortRange;
	}
	
	public void setMySQLPortRange(String mySQLPortRange) {
		this.mySQLPortRange = mySQLPortRange;
	}
	
	public String getDb2PortRange() {
		return db2PortRange;
	}
	
	public void setDb2PortRange(String db2PortRange) {
		this.db2PortRange = db2PortRange;
	}
	
	public String getSybasePortRange() {
		return sybasePortRange;
	}
	
	public void setSybasePortRange(String sybasePortRange) {
		this.sybasePortRange = sybasePortRange;
	}
	
	public Integer getSqlServerNativeSearch() {
		return sqlServerNativeSearch;
	}
	
	public void setSqlServerNativeSearch(Integer sqlServerNativeSearch) {
		this.sqlServerNativeSearch = sqlServerNativeSearch;
	}

}
