package com.dataguise.webservices.beans;

/**
 * Bean for getting and sending creator and database name list for DB2 connections
 * 
 * @author Harinder
 *
 */

public class DatabaseCreatorsBean {

	private String creatorName;
	private String dbName;
	
	
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
		
}
