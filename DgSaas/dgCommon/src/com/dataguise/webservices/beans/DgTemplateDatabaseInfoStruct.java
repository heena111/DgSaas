package com.dataguise.webservices.beans;

public class DgTemplateDatabaseInfoStruct {
	
	private String targetDatabase;
	private String sourceDatabase;
	private String sourceSchema;
	private String targetSchema;
	
	public String getTargetDatabase() {
		return targetDatabase;
	}
	public void setTargetDatabase(String targetDatabase) {
		this.targetDatabase = targetDatabase;
	}
	public String getSourceDatabase() {
		return sourceDatabase;
	}
	public void setSourceDatabase(String sourceDatabase) {
		this.sourceDatabase = sourceDatabase;
	}
	public String getSourceSchema() {
		return sourceSchema;
	}
	public void setSourceSchema(String sourceSchema) {
		this.sourceSchema = sourceSchema;
	}
	public String getTargetSchema() {
		return targetSchema;
	}
	public void setTargetSchema(String targetSchema) {
		this.targetSchema = targetSchema;
	}
	
	
}
