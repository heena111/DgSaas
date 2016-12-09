package com.dataguise.webservices.beans;

public class FaultType {
	
	private String errorTxt;
	private String errorCode;
	private String errorSeverityType;
	
	public void setErrorText(String errorTextInput) {
		this.errorTxt = errorTextInput;
	}
	
	public String getErrorText() {
		return this.errorTxt;
	}
	
	public void setErrorCode(String errorCodeInput) {
		this.errorCode = errorCodeInput;
	}
	
	public String getErrorCode() {
		return this.errorCode;
	}
	
	public void setErrorSeverityType(String errorSeverityTypeInput) {
		this.errorSeverityType = errorSeverityTypeInput;
	}
	
	public String getErrorSeverityType() {
		return this.errorSeverityType;
	}
}
