package com.dataguise.webservices.beans.hive;

import java.util.List;

public class DgHiveTaskResults {

	String columnName;
	String columnType;
	String databaseName;
	String sensitiveType;
	String tableName;
	Long totalCount;
	Long hitCount;
	Long nullCount;
	List<DgHiveTaskResults> subColumnList;
	String maskingOption;
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public String getSensitiveType() {
		return sensitiveType;
	}
	public void setSensitiveType(String sensitiveType) {
		this.sensitiveType = sensitiveType;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<DgHiveTaskResults> getSubColumnList() {
		return subColumnList;
	}
	public void setSubColumnList(List<DgHiveTaskResults> subColumnList) {
		this.subColumnList = subColumnList;
	}
	public String getColumnType() {
		return columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getHitCount() {
		return hitCount;
	}
	public void setHitCount(Long hitCount) {
		this.hitCount = hitCount;
	}
	public Long getNullCount() {
		return nullCount;
	}
	public void setNullCount(Long nullCount) {
		this.nullCount = nullCount;
	}
	public String getMaskingOption() {
		return maskingOption;
	}
	public void setMaskingOption(String maskingOption) {
		this.maskingOption = maskingOption;
	}
	
	
	

}
