package com.dataguise.webservices.beans.dgmonitor;

import java.sql.Timestamp;

;

public class DgMonitorSiteBean {
	
private Integer id;

private String siteName;



private Timestamp createts;

private Timestamp updatets;

private String application;

private String siteType;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getSiteName() {
	return siteName;
}

public void setSiteName(String siteName) {
	this.siteName = siteName;
}

public Timestamp getCreatets() {
	return createts;
}

public void setCreatets(Timestamp createts) {
	this.createts = createts;
}

public Timestamp getUpdatets() {
	return updatets;
}

public void setUpdatets(Timestamp updatets) {
	this.updatets = updatets;
}

public String getApplication() {
	return application;
}

public void setApplication(String application) {
	this.application = application;
}

public String getSiteType() {
	return siteType;
}

public void setSiteType(String siteType) {
	this.siteType = siteType;
}





}
