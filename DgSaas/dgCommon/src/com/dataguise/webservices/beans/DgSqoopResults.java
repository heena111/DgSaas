package com.dataguise.webservices.beans;



/**
 * @author Arun
 *
 */
public class DgSqoopResults {

	private String columnName;
	private String tableName;
	private String schemaName;
	private String regexName;
	private String regexGroup;
	private Integer regexCount;
	private String startTime;
	private String taskName;

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

	public String getRegexName() {
		return regexName;
	}

	public void setRegexName(String regexName) {
		this.regexName = regexName;
	}

	public Integer getRegexCount() {
		return regexCount;
	}

	public void setRegexCount(Integer regexCount) {
		this.regexCount = regexCount;
	}
	
	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
    public String getTaskName() {
        return this.taskName;
    }

	public String getRegexGroup() {
		return regexGroup;
	}

	public void setRegexGroup(String regexGroup) {
		this.regexGroup = regexGroup;
	}
    
}
