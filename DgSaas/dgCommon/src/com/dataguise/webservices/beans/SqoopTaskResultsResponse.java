/**
 * 
 */
package com.dataguise.webservices.beans;

import java.util.List;

/**
 * @author Arun
 *
 */
public class SqoopTaskResultsResponse {

	private boolean success;
	private List<DgSqoopResults> result;
	private String error;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<DgSqoopResults> getResult() {
		return result;
	}
	public void setResult(List<DgSqoopResults> result) {
		this.result = result;
	}

}
