package com.dataguise.webservices.beans;

public class WSSecurityTypes {
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWsSecuritySchemeName() {
		return wsSecuritySchemeName;
	}
	public void setWsSecuritySchemeName(String wsSecuritySchemeName) {
		this.wsSecuritySchemeName = wsSecuritySchemeName;
	}
	public String getWsSecuritySchemeDesc() {
		return wsSecuritySchemeDesc;
	}
	public void setWsSecuritySchemeDesc(String wsSecuritySchemeDesc) {
		this.wsSecuritySchemeDesc = wsSecuritySchemeDesc;
	}
	
	private Integer id;
	private String wsSecuritySchemeName;
	private String wsSecuritySchemeDesc;

	
}
