package com.dataguise.webservices.beans;

import java.util.List;

public class UniqueColumnValuesStructure {
	
	String columnName;
	List<String> uniqueValues;
	
	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}
	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	/**
	 * @return the uniqueValues
	 */
	public List<String> getUniqueValues() {
		return uniqueValues;
	}
	/**
	 * @param uniqueValues the uniqueValues to set
	 */
	public void setUniqueValues(List<String> uniqueValues) {
		this.uniqueValues = uniqueValues;
	}
	
}
