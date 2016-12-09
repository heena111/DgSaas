/**
 * 
 */
package com.dataguise.webservices.beans;

/**
 * @author dg11
 *
 */

public class DgDiscoverSafe extends DgBaseBean {
	
	
	protected String columnName;
	protected String databaseName;
	protected int expressionID;
	protected String expressionName;
	protected String hostName;
	protected Integer portNumber;
	protected String tableName;
	protected Integer serverId;
	protected Integer hitCount;
	protected Integer probability;
	protected Integer dbId;
	
	
	/**
	 * @return the serverId
	 */
	public Integer getServerId() {
		return serverId;
	}
	/**
	 * @param serverId the serverId to set
	 */
	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}
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
	 * @return the databaseName
	 */
	public String getDatabaseName() {
		return databaseName;
	}
	/**
	 * @param databaseName the databaseName to set
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	/**
	 * @return the expressionID
	 */
	public int getExpressionID() {
		return expressionID;
	}
	/**
	 * @param expressionID the expressionID to set
	 */
	public void setExpressionID(int expressionID) {
		this.expressionID = expressionID;
	}
	/**
	 * @return the expressionName
	 */
	public String getExpressionName() {
		return expressionName;
	}
	/**
	 * @param expressionName the expressionName to set
	 */
	public void setExpressionName(String expressionName) {
		this.expressionName = expressionName;
	}
	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}
	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	/**
	 * @return the portNumber
	 */
	public Integer getPortNumber() {
		return portNumber;
	}
	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Integer getHitCount() {
		return hitCount;
	}
	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}
	public Integer getProbability() {
		return probability;
	}
	public void setProbability(Integer probability) {
		this.probability = probability;
	}
	public Integer getDbId() {
		return dbId;
	}
	public void setDbId(Integer dbId) {
		this.dbId = dbId;
	}
}
