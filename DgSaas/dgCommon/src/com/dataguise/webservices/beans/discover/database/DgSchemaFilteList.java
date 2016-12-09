package com.dataguise.webservices.beans.discover.database;

import java.util.ArrayList;
import java.util.List;

public class DgSchemaFilteList {

	String schemaName;
	private List<Filter> schemaFilterList;
	
	public DgSchemaFilteList(){
		schemaFilterList = new ArrayList<Filter>();
	}
	
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public List<Filter> getSchemaFilterList() {
		return schemaFilterList;
	}
	public void setSchemaFilterList(List<Filter> schemaFilterList) {
		this.schemaFilterList = schemaFilterList;
	}
	
}
