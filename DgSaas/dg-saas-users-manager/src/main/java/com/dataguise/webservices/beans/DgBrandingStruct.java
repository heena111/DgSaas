package com.dataguise.webservices.beans;


public class DgBrandingStruct implements java.io.Serializable{
	private static final long serialVersionUID = 1466059393732961071L;
	String branding;
	Boolean isDBAuth;
	String modValue;
	
	public String getModValue() {
		return modValue;
	}
	public void setModValue(String modValue) {
		this.modValue = modValue;
	}
	public String getBranding() {
		return branding;
	}
	public void setBranding(String branding) {
		this.branding = branding;
	}
	public Boolean getIsDBAuth() {
		return isDBAuth;
	}
	public void setIsDBAuth(Boolean isDBAuth) {
		this.isDBAuth = isDBAuth;
	}
}
