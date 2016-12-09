package com.dataguise.webservices.beans;

import java.io.Serializable;

public class DbFilterOutput implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String connectionName;
	private String schemaName;
	private String tableName;
	private String columnName;
	public String getConnectionName() {
		return connectionName;
	}
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
}
