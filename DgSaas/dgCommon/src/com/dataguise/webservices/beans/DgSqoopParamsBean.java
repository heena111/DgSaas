/**
 * 
 */
package com.dataguise.webservices.beans;

/**
 * @author Arun
 *
 */
public class DgSqoopParamsBean {

	private String schemaName;
	private String tableName;
	private String partitionColumn;
	private String destDir;
	private String outputFormat;
	private Integer mappersNumber;
	private Integer reducersNumber;
	private String driverClass;
	private String columnName;
	private String connString;
	private String username;
	private String password;
	private String sqoopServerAddress;
	private Integer taskInstanceId;
	private String taskName;
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
	public String getPartitionColumn() {
		return partitionColumn;
	}
	public void setPartitionColumn(String partitionColumn) {
		this.partitionColumn = partitionColumn;
	}
	public String getDestDir() {
		return destDir;
	}
	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getConnString() {
		return connString;
	}
	public void setConnString(String connString) {
		this.connString = connString;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSqoopServerAddress() {
		return sqoopServerAddress;
	}
	public void setSqoopServerAddress(String sqoopServerAddress) {
		this.sqoopServerAddress = sqoopServerAddress;
	}
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public void setMappersNumber(Integer mappersNumber) {
		this.mappersNumber = mappersNumber;
	}
	public Integer getMappersNumber() {
		return mappersNumber;
	}
	public void setReducersNumber(Integer reducersNumber) {
		this.reducersNumber = reducersNumber;
	}
	public Integer getReducersNumber() {
		return reducersNumber;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
}
