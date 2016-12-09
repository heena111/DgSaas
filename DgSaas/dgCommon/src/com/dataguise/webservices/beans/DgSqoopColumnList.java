package com.dataguise.webservices.beans;

public class DgSqoopColumnList {

	private Integer expressionId;
	private String columnName;
	private String tableName;
	private String databaseName;
	private String schemaName;
	private Boolean importColumn;
	
	public Integer getExpressionId() {
		return expressionId;
	}
	public void setExpressionId(Integer expressionId) {
		this.expressionId = expressionId;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public Boolean getImportColumn() {
		return importColumn;
	}
	public void setImportColumn(Boolean importColumn) {
		this.importColumn = importColumn;
	}
}
