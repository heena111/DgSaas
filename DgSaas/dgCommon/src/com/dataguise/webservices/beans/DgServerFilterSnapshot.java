package com.dataguise.webservices.beans;


public class DgServerFilterSnapshot {

	private String tableFilter;
	private String columnFilter;
	private String tableOperator;
	private String columnOperator;
	private String joinOperator;
	private String schemaList;
	
	public String getTableFilter() {
		return tableFilter;
	}
	public void setTableFilter(String tableFilter) {
		this.tableFilter = tableFilter;
	}
	public String getColumnFilter() {
		return columnFilter;
	}
	public void setColumnFilter(String columnFilter) {
		this.columnFilter = columnFilter;
	}
	public String getTableOperator() {
		return tableOperator;
	}
	public void setTableOperator(String tableOperator) {
		this.tableOperator = tableOperator;
	}
	
	public String getColumnOperator() {
		return columnOperator;
	}
	public void setColumnOperator(String columnOperator) {
		this.columnOperator = columnOperator;
	}
	public String getJoinOperator() {
		return joinOperator;
	}
	public void setJoinOperator(String joinOperator) {
		this.joinOperator = joinOperator;
	}
	public String getSchemaList() {
		return schemaList;
	}
	public void setSchemaList(String schemaList) {
		this.schemaList = schemaList;
	}

	
}
