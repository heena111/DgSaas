package com.dataguise.webservices.beans;

import java.util.List;

public class DgDiscoverResultsSummaryForPdf {
	private List<DgRegexCounts> regexCounts;
	private int totalTablesScanned;
	private int totalTablesInTask;
	private String searchType;
	private List<String> selectedRegexNames;
	private List<String> missingRegexNames;
	private int totalSensitiveColumns;
	private String endTime; // seconds
	private String startTime; // seconds
	private String taskName; 
	private String reportPreparedTime;
	private List<DgDatabasesScannedForDiscoverResultsSummaryPdf> databasesScanned;
	private String samplingMethodology;
	private String userName;
	

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	
	public List<DgRegexCounts> getRegexCounts () {
		return regexCounts;
	}
	
	public void setRegexCounts (List<DgRegexCounts> counts) {
		regexCounts = counts;
	}
	
	public int getTotalTablesScanned() {
		return totalTablesScanned;
	}
	
	public void setTotalTablesScanned (int numTables) {
		totalTablesScanned = numTables;
	}
	
	public int getTotalTablesInTask() {
		return totalTablesInTask;
	}
	
	public void setTotalTablesInTask (int numTables) {
		totalTablesInTask = numTables;
	}
	
	public String getSearchType() {
		return searchType;
	}
	
	public void setSearchType (String searchType) {
		this.searchType = searchType;
	}
	
	public List<String> getSelectedRegexNames() {
		return selectedRegexNames;
	}
	
	public void setSelectedRegexNames (List<String> regexNames) {
		selectedRegexNames = regexNames;
	}
	
	public List<String> getMissingRegexNames() {
		return missingRegexNames;
	}
	
	public void setMissingRegexNames (List<String> regexNames) {
		missingRegexNames = regexNames;
	}
	
	public int getTotalSensitiveColumns() {
		return totalSensitiveColumns;
	}
	
	public void setTotalSensitiveColumns (int columns) {
		totalSensitiveColumns = columns;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @param reportPreparedTime the reportPreparedTime to set
	 */
	public void setReportPreparedTime(String reportPreparedTime) {
		this.reportPreparedTime = reportPreparedTime;
	}

	/**
	 * @return the reportPreparedTime
	 */
	public String getReportPreparedTime() {
		return reportPreparedTime;
	}

	/**
	 * @param databasesScanned the databasesScanned to set
	 */
	public void setDatabasesScanned(List<DgDatabasesScannedForDiscoverResultsSummaryPdf> databasesScanned) {
		this.databasesScanned = databasesScanned;
	}

	/**
	 * @return the databasesScanned
	 */
	public List<DgDatabasesScannedForDiscoverResultsSummaryPdf> getDatabasesScanned() {
		return databasesScanned;
	}

	/**
	 * @param samplingMethodology the samplingMethodology to set
	 */
	public void setSamplingMethodology(String samplingMethodology) {
		this.samplingMethodology = samplingMethodology;
	}

	/**
	 * @return the samplingMethodology
	 */
	public String getSamplingMethodology() {
		return samplingMethodology;
	}

	
	
}
