package com.dataguise.webservices.structures;

import java.util.List;

import com.dataguise.webservices.beans.discover.database.TableStatistics;

public class DgScannedDataUIResultsStruct {
	
	protected List<TableStatistics> ResultsArray;
	protected Integer rowsCount;
	/**
	 * @return the resultsArray
	 */
	public List<TableStatistics> getResultsArray() {
		return ResultsArray;
	}
	/**
	 * @param resultsArray the resultsArray to set
	 */
	public void setResultsArray(List<TableStatistics> resultsArray) {
		ResultsArray = resultsArray;
	}
	/**
	 * @return the rowsCount
	 */
	public Integer getRowsCount() {
		return rowsCount;
	}
	/**
	 * @param rowsCount the rowsCount to set
	 */
	public void setRowsCount(Integer rowsCount) {
		this.rowsCount = rowsCount;
	}
}
