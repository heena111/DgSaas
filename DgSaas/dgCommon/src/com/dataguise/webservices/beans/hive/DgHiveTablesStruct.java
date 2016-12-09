package com.dataguise.webservices.beans.hive;

import java.util.ArrayList;
import java.util.List;



public class DgHiveTablesStruct {
	
	
	String tableName;
	String databaseName;
	 List<DgHiveFieldSchema> dgHiveFieldSchema = new ArrayList<DgHiveFieldSchema>();
	
	
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
	public List<DgHiveFieldSchema> getDgHiveFieldSchema() {
		return dgHiveFieldSchema;
	}
	public void setDgHiveFieldSchema(List<DgHiveFieldSchema> dgHiveFieldSchema) {
		this.dgHiveFieldSchema = dgHiveFieldSchema;
	}
	
	
	

	
	
}
