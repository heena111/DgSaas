package com.dataguise.webservices.beans.dgmonitor;

public class DgMonitorSiteAlertGraphBean {
	
	private String alertMonth;
	private Integer alertYear;
	private String siteName;
	private Long alertCount;
	public String getAlertMonth() {
		return alertMonth;
	}
	public void setAlertMonth(String alertMonth) {
		this.alertMonth = alertMonth;
	}
	public Integer getAlertYear() {
		return alertYear;
	}
	public void setAlertYear(Integer alertYear) {
		this.alertYear = alertYear;
	}
	
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Long getAlertCount() {
		return alertCount;
	}
	public void setAlertCount(Long alertCount) {
		this.alertCount = alertCount;
	}

}
