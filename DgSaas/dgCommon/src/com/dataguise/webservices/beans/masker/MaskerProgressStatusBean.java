package com.dataguise.webservices.beans.masker;

import com.dataguise.webservices.beans.MaskerProgressStatus;

public class MaskerProgressStatusBean {

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public MaskerProgressStatus getObjMaskerProgressStatus() {
		return objMaskerProgressStatus;
	}
	public void setObjMaskerProgressStatus(
			MaskerProgressStatus objMaskerProgressStatus) {
		this.objMaskerProgressStatus = objMaskerProgressStatus;
	}
	private String status;
	private MaskerProgressStatus objMaskerProgressStatus;
	
	
}
