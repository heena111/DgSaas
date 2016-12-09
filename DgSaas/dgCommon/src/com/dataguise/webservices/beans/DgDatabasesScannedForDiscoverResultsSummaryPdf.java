package com.dataguise.webservices.beans;


public class DgDatabasesScannedForDiscoverResultsSummaryPdf {
	
	private String databaseType ;
	private String connectionName;
	private String hostName;
	private String databaseUser;
	
	/**
	 * @return the databaseType
	 */
	public String getDatabaseType() {
		return databaseType;
	}
	/**
	 * @param databaseType the databaseType to set
	 */
	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
	/**
	 * @return the connectionName
	 */
	public String getConnectionName() {
		return connectionName;
	}
	/**
	 * @param connectionName the connectionName to set
	 */
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}
	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	/**
	 * @return the databaseUser
	 */
	public String getDatabaseUser() {
		return databaseUser;
	}
	/**
	 * @param databaseUser the databaseUser to set
	 */
	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
	}
	
}
