package com.dataguise.webservices.beans;

public class AgentResponse {
	
	private boolean success;
	private Integer errorCode;
	private String errorText;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
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
