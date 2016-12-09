package com.dataguise.webservices.beans;

import java.util.List;

public class DgDiscoverResultsSummary {
	private List<DgRegexCounts> regexCounts;
	private int totalTablesScanned;
	private int totalTablesInTask;
	private String searchType;
	private List<String> selectedRegexNames;
	private List<String> missingRegexNames;
	private int totalSensitiveColumns;
	private long elapsedTime; // seconds

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
	
	
	public long getElapsedTime() {
		return elapsedTime;
	}
	
	public void setElapsedTime (long time) {
		elapsedTime = time;
	}
	
}
