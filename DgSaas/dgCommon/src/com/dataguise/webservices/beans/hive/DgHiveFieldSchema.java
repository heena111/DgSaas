package com.dataguise.webservices.beans.hive;

import java.util.List;



public class DgHiveFieldSchema {
	
	String tableName;
	String databaseName;
	String name;
	String type;
	String comment;
	Integer regexId;
	String maskingOption;
	Integer maskingCode;
	String param1;
	String param2;
	String param3;
	String param4;
	String param5;
	String param6;
	String param7;
	String param8;
	String param9;
	Boolean persistent ;   
	Boolean consistent  ;     
	Boolean unique       ;   
	String synchronizeWith       ;
	String valueNotFound   ;    
	String valueNull        ;   
	Integer persistentColumnID  ; 
	Integer dataLength ;
	String dataType;
	
	List<DgHiveFieldSchema> subcolsIterator;

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Integer getRegexId() {
		return regexId;
	}
	public void setRegexId(Integer regexId) {
		this.regexId = regexId;
	}
	public List<DgHiveFieldSchema> getSubcolsIterator() {
		return subcolsIterator;
	}
	public void setSubcolsIterator(List<DgHiveFieldSchema> subcolsIterator) {
		this.subcolsIterator = subcolsIterator;
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
	public String getMaskingOption() {
		return maskingOption;
	}
	public void setMaskingOption(String maskingOption) {
		this.maskingOption = maskingOption;
	}
	public Integer getMaskingCode() {
		return maskingCode;
	}
	public void setMaskingCode(Integer maskingCode) {
		this.maskingCode = maskingCode;
	}
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public String getParam3() {
		return param3;
	}
	public void setParam3(String param3) {
		this.param3 = param3;
	}
	public String getParam4() {
		return param4;
	}
	public void setParam4(String param4) {
		this.param4 = param4;
	}
	public String getParam5() {
		return param5;
	}
	public void setParam5(String param5) {
		this.param5 = param5;
	}
	public String getParam6() {
		return param6;
	}
	public void setParam6(String param6) {
		this.param6 = param6;
	}
	public String getParam7() {
		return param7;
	}
	public void setParam7(String param7) {
		this.param7 = param7;
	}
	public String getParam8() {
		return param8;
	}
	public void setParam8(String param8) {
		this.param8 = param8;
	}
	public String getParam9() {
		return param9;
	}
	public void setParam9(String param9) {
		this.param9 = param9;
	}
	public Boolean getPersistent() {
		return persistent;
	}
	public void setPersistent(Boolean persistent) {
		this.persistent = persistent;
	}
	public Boolean getConsistent() {
		return consistent;
	}
	public void setConsistent(Boolean consistent) {
		this.consistent = consistent;
	}
	public Boolean getUnique() {
		return unique;
	}
	public void setUnique(Boolean unique) {
		this.unique = unique;
	}
	public String getSynchronizeWith() {
		return synchronizeWith;
	}
	public void setSynchronizeWith(String synchronizeWith) {
		this.synchronizeWith = synchronizeWith;
	}
	public String getValueNotFound() {
		return valueNotFound;
	}
	public void setValueNotFound(String valueNotFound) {
		this.valueNotFound = valueNotFound;
	}
	public String getValueNull() {
		return valueNull;
	}
	public void setValueNull(String valueNull) {
		this.valueNull = valueNull;
	}
	public Integer getPersistentColumnID() {
		return persistentColumnID;
	}
	public void setPersistentColumnID(Integer persistentColumnID) {
		this.persistentColumnID = persistentColumnID;
	}
	public Integer getDataLength() {
		return dataLength;
	}
	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	
	
}
