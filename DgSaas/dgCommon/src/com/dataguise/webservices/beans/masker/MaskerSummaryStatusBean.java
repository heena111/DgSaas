package com.dataguise.webservices.beans.masker;

import java.util.List;

import com.dataguise.webservices.beans.MaskerSummaryStatus;

public class MaskerSummaryStatusBean {

	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<MaskerSummaryStatus> getLstMaskerSummaryStatus() {
		return lstMaskerSummaryStatus;
	}
	public void setLstMaskerSummaryStatus(
			List<MaskerSummaryStatus> lstMaskerSummaryStatus) {
		this.lstMaskerSummaryStatus = lstMaskerSummaryStatus;
	}
	private List<MaskerSummaryStatus> lstMaskerSummaryStatus;
}
