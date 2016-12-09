package com.dataguise.webservices.beans;

import java.io.Serializable;


public class DgBrowserDirInfoList implements Serializable{
	
	private DgBowserDirInfoWrapper results;
	
	private boolean success;

	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public DgBowserDirInfoWrapper getResults() {
		return results;
	}

	public void setResults(DgBowserDirInfoWrapper results) {
		this.results = results;
	}


	
}