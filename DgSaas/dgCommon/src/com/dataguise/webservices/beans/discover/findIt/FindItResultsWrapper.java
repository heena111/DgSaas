package com.dataguise.webservices.beans.discover.findIt;

import java.util.ArrayList;

import com.dataguise.webservices.beans.DatabaseInfo;

public class FindItResultsWrapper {
	private ArrayList<DatabaseInfo> results;

	public ArrayList<DatabaseInfo> getResults() {
		return results;
	}

	public void setResults(ArrayList<DatabaseInfo> results) {
		this.results = results;
	}
}
