package com.dataguise.webservices.beans;

public class DgConstraints {

	private String tableName;
	private String columnName;
	private String schemaName;
	private String constraintType;

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

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getConstraintType() {
		return constraintType;
	}

	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}

}
