package com.dataguise.webservices.beans.masker;

import java.util.List;

import com.dataguise.webservices.beans.DgInvalidColumnDetails;

public class InvalidColumnResponseBean {
	
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<DgInvalidColumnDetails> getLstDgInvalidColumnDetails() {
		return lstDgInvalidColumnDetails;
	}
	public void setLstDgInvalidColumnDetails(
			List<DgInvalidColumnDetails> lstDgInvalidColumnDetails) {
		this.lstDgInvalidColumnDetails = lstDgInvalidColumnDetails;
	}
	private List<DgInvalidColumnDetails>  lstDgInvalidColumnDetails;
	
	

}
