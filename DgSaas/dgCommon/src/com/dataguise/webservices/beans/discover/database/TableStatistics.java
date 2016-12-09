package com.dataguise.webservices.beans.discover.database;

public class TableStatistics {
	private String hostName;
	private String databaseName;
	private String tableName;
	private Long totalRows;
	private Long rowsScanned;
	private Long extrapolatedData;
	private Long sampledData;
	
	public TableStatistics(){}
	
	public TableStatistics(String hostName, String databaseName, String tableName){
		this.hostName = hostName;
		this.databaseName = databaseName;
		this.tableName = tableName;
	}
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
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
	public Long getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(Long totalRows) {
		this.totalRows = totalRows;
	}
	public Long getRowsScanned() {
		return rowsScanned;
	}
	public void setRowsScanned(Long rowsScanned) {
		this.rowsScanned = rowsScanned;
	}
	public Long getExtrapolatedData() {
		return extrapolatedData;
	}
	public void setExtrapolatedData(Long extrapolatedData) {
		this.extrapolatedData = extrapolatedData;
	}
	public Long getSampledData() {
		return sampledData;
	}
	public void setSampledData(Long sampledData) {
		this.sampledData = sampledData;
	}
	
}
