
package com.dataguise.webservices.beans.s3;

public class DgEMRClusterResponseInfo {
	
	
	public String message;
	public Boolean success;
	public CreateClusterResponse result;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public CreateClusterResponse getResult() {
		return result;
	}
	public void setResult(CreateClusterResponse result) {
		this.result = result;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}