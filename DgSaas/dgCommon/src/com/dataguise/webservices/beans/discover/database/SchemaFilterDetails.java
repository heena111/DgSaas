package com.dataguise.webservices.beans.discover.database;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

public class SchemaFilterDetails implements Serializable{

	private boolean isInclusion;
	
	@Valid
	private List<Filter> schemaFilterList;
	
	
	public List<Filter> getSchemaFilterList() {
		return schemaFilterList;
	}
	public void setSchemaFilterList(List<Filter> schemaFilterList) {
		this.schemaFilterList = schemaFilterList;
	}
	public boolean isInclusion() {
		return isInclusion;
	}
	public void setInclusion(boolean isInclusion) {
		this.isInclusion = isInclusion;
	}
	
	
	
}
