package com.dataguise.webservices.beans;

import java.io.Serializable;

public class FilterStruct implements Serializable {

	private String field;
	private String type;
	private String value;
	private String comparison;
	
	
	public FilterStruct(){
		
	}
	
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param camparison the comparison to set
	 */
	public void setComparison(String comparison) {
		this.comparison = comparison;
	}
	
	/**
	 * @return the comparison
	 */
	public String getComparison() {
		return comparison;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
