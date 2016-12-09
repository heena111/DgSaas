package com.dataguise.webservices.beans.masker;

public class DgMaskerSensitiveCols implements Comparable<DgMaskerSensitiveCols>{
	
	private String databaseName;
	private String schemaName;
	private String tableName;
	private String columnName;
	private String dataType;
	private Integer regexId;
	private Integer hitCount;
	private Integer dataPrecision;
	private Integer dataScale;
	private int dataLength;
	private Boolean isNullable;
	private Integer constraintType;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Integer getRegexId() {
		return regexId;
	}
	public void setRegexId(Integer regexId) {
		this.regexId = regexId;
	}
	public Integer getHitCount() {
		return hitCount;
	}
	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}
	public Integer getDataPrecision() {
		return dataPrecision;
	}
	public void setDataPrecision(Integer dataPrecision) {
		this.dataPrecision = dataPrecision;
	}
	public Integer getDataScale() {
		return dataScale;
	}
	public void setDataScale(Integer dataScale) {
		this.dataScale = dataScale;
	}
	public int getDataLength() {
		return dataLength;
	}
	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}
	public Boolean getIsNullable() {
		return isNullable;
	}
	public void setIsNullable(Boolean isNullable) {
		this.isNullable = isNullable;
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
	
	public Integer getConstraintType() {
		return constraintType;
	}
	public void setConstraintType(Integer constraintType) {
		this.constraintType = constraintType;
	}
	@Override
	public int compareTo(DgMaskerSensitiveCols sensitiveCols) {
		return this.getRegexId().compareTo(sensitiveCols.getRegexId());
		
	}

}
