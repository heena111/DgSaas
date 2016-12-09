/**
 * 
 */
package com.dataguise.webservices.beans;


/**
 * @author Arun
 *
 */
public class SqoopTaskStatusResponse {

	private boolean success;
	private String result;
	private String error;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

}
