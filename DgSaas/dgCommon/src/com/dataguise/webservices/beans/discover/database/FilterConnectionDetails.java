package com.dataguise.webservices.beans.discover.database;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class FilterConnectionDetails {

	Integer connectionId;
	@NotEmpty(message = "Schema Name:"+BeanValidator.EMPTY_FIELD)
	@Size(max=128 , message = "Schema Name:"+BeanValidator.MAX_SIZE_500)
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	String schemaName;
	
	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	
}
