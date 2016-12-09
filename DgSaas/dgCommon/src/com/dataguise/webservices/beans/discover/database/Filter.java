package com.dataguise.webservices.beans.discover.database;

import java.util.List;

public class Filter {

	String joinOperator;
	String tabOperator;
	String tableFilter;
	String colOperator;
	String columnFilter;
	List<FilterConnectionDetails> filterConnectionDetails;
	
	public String getJoinOperator() {
		return joinOperator;
	}
	public void setJoinOperator(String joinOperator) {
		this.joinOperator = joinOperator;
	}
	public String getTabOperator() {
		return tabOperator;
	}
	public void setTabOperator(String tabOperator) {
		this.tabOperator = tabOperator;
	}
	public String getTableFilter() {
		return tableFilter;
	}
	public void setTableFilter(String tableFilter) {
		this.tableFilter = tableFilter;
	}
	public String getColOperator() {
		return colOperator;
	}
	public void setColOperator(String colOperator) {
		this.colOperator = colOperator;
	}
	public String getColumnFilter() {
		return columnFilter;
	}
	public void setColumnFilter(String columnFilter) {
		this.columnFilter = columnFilter;
	}
	public List<FilterConnectionDetails> getFilterConnectionDetails() {
		return filterConnectionDetails;
	}
	public void setFilterConnectionDetails(
			List<FilterConnectionDetails> filterConnectionDetails) {
		this.filterConnectionDetails = filterConnectionDetails;
	}	
	
}
