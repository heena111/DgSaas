package com.dataguise.webservices.beans.discover.database;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DiscoveryResults {

	public DiscoveryResults() {
		
	}
	
	protected String columnName;
	protected Integer connectionId;
	protected String dataType;
	protected String databaseName;
	protected String endTime;
	protected String expressionId;
	protected Integer hitCount;
	protected Integer index;
	protected Integer nullCount;
	protected String objectType;
	protected Double percentageProbability;
	protected Boolean quickSearch;
	protected String sampleData;
	protected String startTime;
	protected String tableName;
	protected Integer taskInstanceId;
	protected Boolean masked;
	protected Integer mismatchCount;
	protected Integer precision;
	protected Integer scale;
	protected Integer dataLength;
	protected Boolean isNullable;
	protected String expressionGroup;
	protected Double expressionGroupConfidence;
	protected String referringTo;
	protected Integer constraintType;

	public Integer getMismatchCount() {
		return mismatchCount;
	}

	public void setMismatchCount(Integer mismatchCount) {
		this.mismatchCount = mismatchCount;
	}

	/**
	 * Gets the value of the columnName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * Sets the value of the columnName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnName(String value) {
		this.columnName = value;
	}

	/**
	 * Gets the value of the connectionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConnectionId() {
		return connectionId;
	}

	/**
	 * Sets the value of the connectionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConnectionId(Integer value) {
		this.connectionId = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataType(String value) {
		this.dataType = value;
	}

	/**
	 * Gets the value of the databaseName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * Sets the value of the databaseName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabaseName(String value) {
		this.databaseName = value;
	}

	/**
	 * Gets the value of the endTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * Sets the value of the endTime property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setEndTime(String value) {
		this.endTime = value;
	}

	/**
	 * Gets the value of the expressionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionId() {
		return expressionId;
	}

	/**
	 * Sets the value of the expressionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionId(String value) {
		this.expressionId = value;
	}

	/**
	 * Gets the value of the hitCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getHitCount() {
		return hitCount;
	}

	/**
	 * Sets the value of the hitCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setHitCount(Integer value) {
		this.hitCount = value;
	}

	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIndex(Integer value) {
		this.index = value;
	}

	/**
	 * Gets the value of the nullCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNullCount() {
		return nullCount;
	}

	/**
	 * Sets the value of the nullCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNullCount(Integer value) {
		this.nullCount = value;
	}

	/**
	 * Gets the value of the objectType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * Sets the value of the objectType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setObjectType(String value) {
		this.objectType = value;
	}

	/**
	 * Gets the value of the percentageProbability property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPercentageProbability() {
		return percentageProbability;
	}

	/**
	 * Sets the value of the percentageProbability property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setPercentageProbability(Double value) {
		this.percentageProbability = value;
	}

	/**
	 * Gets the value of the quickSearch property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isQuickSearch() {
		return quickSearch;
	}

	/**
	 * Sets the value of the quickSearch property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setQuickSearch(Boolean value) {
		this.quickSearch = value;
	}

	/**
	 * Gets the value of the sampleData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSampleData() {
		return sampleData;
	}

	/**
	 * Sets the value of the sampleData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSampleData(String value) {
		this.sampleData = value;
	}

	/**
	 * Gets the value of the startTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * Sets the value of the startTime property.
	 * 
	 * @param sTime
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setStartTime(String sTime) {
		this.startTime = sTime;
	}

	/**
	 * Gets the value of the tableName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * Sets the value of the tableName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTableName(String value) {
		this.tableName = value;
	}

	/**
	 * Gets the value of the taskInstanceId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	/**
	 * Sets the value of the taskInstanceId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskInstanceId(Integer value) {
		this.taskInstanceId = value;
	}
	
	/**
	 * Gets the value of the masked property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean getMasked() {
		return masked;
	}

	/**
	 * Sets the value of the masked property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setMasked(Boolean value) {
		this.masked = value;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public Integer getDataLength() {
		return dataLength;
	}

	public void setDataLength(Integer dataLength) {
		this.dataLength = dataLength;
	}

	public Boolean getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(Boolean isNullable) {
		this.isNullable = isNullable;
	}

	public String getExpressionGroup() {
		return expressionGroup;
	}

	public void setExpressionGroup(String expressionGroup) {
		this.expressionGroup = expressionGroup;
	}

	public Double getExpressionGroupConfidence() {
		return expressionGroupConfidence;
	}

	public void setExpressionGroupConfidence(Double expressionGroupConfidence) {
		this.expressionGroupConfidence = expressionGroupConfidence;
	}

	public String getReferringTo() {
		return referringTo;
	}

	public void setReferringTo(String referringTo) {
		this.referringTo = referringTo;
	}

	public Integer getConstraintType() {
		return constraintType;
	}

	public void setConstraintType(Integer contraintType) {
		this.constraintType = contraintType;
	}
	

}
