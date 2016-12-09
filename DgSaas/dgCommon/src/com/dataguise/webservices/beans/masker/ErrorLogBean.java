package com.dataguise.webservices.beans.masker;

import java.util.List;

public class ErrorLogBean {

	private String status;
	private List<DgErrorMessageDetails> lstDgErrorMessageDetails;
	
	public List<DgErrorMessageDetails> getLstDgErrorMessageDetails() {
		return lstDgErrorMessageDetails;
	}
	public void setLstDgErrorMessageDetails(
			List<DgErrorMessageDetails> lstDgErrorMessageDetails) {
		this.lstDgErrorMessageDetails = lstDgErrorMessageDetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
