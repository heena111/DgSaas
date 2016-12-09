package com.dataguise.webservices.beans;

public class DgComponentVersionDetails {
	String componentName;
	String componentVersion;
	String revision;
	String patchDetail;
	
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getComponentVersion() {
		return componentVersion;
	}
	public void setComponentVersion(String componentVersion) {
		this.componentVersion = componentVersion;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getPatchDetail() {
		return patchDetail;
	}
	public void setPatchDetail(String patchDetail) {
		this.patchDetail = patchDetail;
	}
}
