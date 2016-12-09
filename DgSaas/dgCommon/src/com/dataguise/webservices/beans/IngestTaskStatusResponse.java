/**
 * 
 */
package com.dataguise.webservices.beans;


/**
 * @author Arun
 *
 */
public class IngestTaskStatusResponse {

	private boolean success;
	private String result;
	private Integer errorCode;
	private String errorText;
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
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorText() {
		return errorText;
	}
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
	
	

	
}
