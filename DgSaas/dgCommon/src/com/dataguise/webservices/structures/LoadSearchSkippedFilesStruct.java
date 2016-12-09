package com.dataguise.webservices.structures;

import java.util.List;

import com.dataguise.webservices.beans.DiscoverySkippedFile;

public class LoadSearchSkippedFilesStruct {
	protected List<DiscoverySkippedFile> resultsArray;
	protected Long rowsCount;
	
	public List<DiscoverySkippedFile> getResultsArray() {
		return resultsArray;
	}
	public void setResultsArray(List<DiscoverySkippedFile> resultsArray) {
		this.resultsArray = resultsArray;
	}
	
	public Long getRowsCount() {
		return rowsCount;
	}
	public void setRowsCount(Long rowsCount) {
		this.rowsCount = rowsCount;
	}
}
