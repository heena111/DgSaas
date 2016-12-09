package com.dataguise.webservices.beans.hive;

public class DgHiveFiltersStruct {
	private String databaseName;
	private String tableName;
	private String columnName;
	
	public DgHiveFiltersStruct() {
		
	}
	/**
	 * @param databaseName
	 * @param tableName
	 * @param columnName
	 */
	public DgHiveFiltersStruct(String databaseName, String tableName, String columnName) {
		this.databaseName = databaseName;
		this.tableName = tableName;
		this.columnName = columnName;
	}
	
	/**
	 * @return the databaseName
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * @param databaseName
	 *            the databaseName to set
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName
	 *            the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * @param columnName
	 *            the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	@Override
	public boolean equals(Object object){
		boolean result = false;
		if(object == null || object.getClass() != getClass()){
			result = false;
		}else{
			DgHiveFiltersStruct dgHiveFiltersStruct = (DgHiveFiltersStruct) object;
			if(this.databaseName.equals(dgHiveFiltersStruct.getDatabaseName()) &&
					this.tableName.equals(dgHiveFiltersStruct.getTableName()) &&
					this.columnName.equals(dgHiveFiltersStruct.getColumnName())){
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((databaseName == null) ? 0 : databaseName.hashCode());
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
		return result;
	}
	
}

