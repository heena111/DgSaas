/**
 * 
 */
package com.dataguise.webservices.beans.dgmonitor;

/**
 * @author parshant.bandral
 *
 */
public class DgMonitorConnMetaDataBean {
	
	String connectionName;
	String databaseName;
	String tableName;
	String filterType;
	
	
	public String getConnectionName() {
		return connectionName;
	}
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	

}

