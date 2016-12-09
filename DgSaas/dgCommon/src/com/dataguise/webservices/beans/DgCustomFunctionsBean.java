package com.dataguise.webservices.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class DgCustomFunctionsBean {
	private Integer functionId;
	
	@NotEmpty(message = "Function Name:" +BeanValidator.EMPTY_FIELD)
    @Size(max=128, message= "Function Name:" + BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Function Name: " +BeanValidator.INVALID_CHARACTER_SET)
    private String functionName;
	
	@NotEmpty(message = "Function Description:" +BeanValidator.EMPTY_FIELD)
	@Size(max=256, message= "Function Description:" + BeanValidator.MAX_SIZE_256)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Function Description:"+BeanValidator.INVALID_CHARACTER_SET)
    private String functionDescription;
	
	private String functionBody;
	private String dbType;

	private int createdBy;
	private String createdOn;
	private String updtedOn;
	private String tableName;
	private String schemaName;
	private String functionCall;
	private String databaseName;
	private String	module;
	
	public DgCustomFunctionsBean(Integer functionId, String functionName,
			String functionDescription, String functionBody, String dbType,
			String functionCall, int createdBy, String createdOn,
			String updtedOn, String schemaName, String tableName, String databaseName, String module) {

		this.functionId = functionId;
		this.functionName = functionName;
		this.functionDescription = functionDescription;
		this.functionBody = functionBody;
		this.dbType = dbType;

		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updtedOn = updtedOn;
		this.functionCall = functionCall;
		this.schemaName = schemaName;
		this.tableName = tableName;
		this.databaseName=databaseName;
		this.module		= module;
	}

	public DgCustomFunctionsBean() {

	}

	public Integer getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Integer functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionDescription() {
		return functionDescription;
	}

	public void setFunctionBody(String functionBody) {
		functionBody = specialCharReplace(functionBody);
		this.functionBody = functionBody;
	}

	public String getFunctionBody() {
		return functionBody;
	}

	public void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdtedOn() {
		return updtedOn;
	}

	public void setUpdtedOn(String updtedOn) {
		this.updtedOn = updtedOn;
	}

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

	
	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getFunctionCall() {
		return functionCall;
	}

	public void setFunctionCall(String functionCall) {
		this.functionCall = functionCall;
	}
	
	private  String specialCharReplace(String value){
		  value = value.replace("<", "&lt;");
		  value = value.replace(">", "&gt;");
		  value = value.replace("'", "&#39;");
		  value = value.replace("\"", "&quot;");
		  return value;
		  
		 }

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
}