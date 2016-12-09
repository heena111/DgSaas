package com.dataguise.webservices.beans.discover.database;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ColumnInfo {
	private Integer connectionId;
	private Integer taskInstanceId;
	private String databaseName;
	private String tableName;
	private String columnName;
	private String dataType;
	private String connectionName;
	private Integer count;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getConnectionName() {
		return connectionName;
	}
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}
	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
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
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
}
