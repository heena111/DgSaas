package com.dataguise.webservices.beans;

public class DgSqoopAgentBean {

	private String colName;
	private Integer regexId;
	private String tableName;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColName() {
		return colName;
	}
	public void setColName(String colName) {
		this.colName = colName;
	}
	public Integer getRegexId() {
		return regexId;
	}
	public void setRegexId(Integer regexId) {
		this.regexId = regexId;
	}
	
}
