package com.dataguise.webservices.beans;

import java.util.List;

public class CustomTransformationWSDetails {
	
	private Integer id;
	private String transformationName;
	private String transformationDesc;
	private String targetNamespace;
	private String serviceName;
	private String portName;
	private String operationName;
	private Boolean soapWs;
	private Integer wsSecuritySchemeId; 
	private String wsURL;
	private String userName;
	private String userPassword;
	private String lastCreatedTime;
	private String lastUpdatedTime;

	public String getLastCreatedTime() {
		return lastCreatedTime;
	}
	public void setLastCreatedTime(String lastCreatedTime) {
		this.lastCreatedTime = lastCreatedTime;
	}
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	private List<CustomTransformationWSParams> wsparams;
	
	public String getTransformationName() {
		return transformationName;
	}
	public void setTransformationName(String transformationName) {
		this.transformationName = transformationName;
	}
	public String getTransformationDesc() {
		return transformationDesc;
	}
	public void setTransformationDesc(String transformationDesc) {
		this.transformationDesc = transformationDesc;
	}
	public String getTargetNamespace() {
		return targetNamespace;
	}
	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public Boolean getSoapWs() {
		return soapWs;
	}
	public void setSoapWs(Boolean soapWs) {
		this.soapWs = soapWs;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getWsSecuritySchemeId() {
		return wsSecuritySchemeId;
	}
	public void setWsSecuritySchemeId(Integer wsSecuritySchemeId) {
		this.wsSecuritySchemeId = wsSecuritySchemeId;
	}
	public String getWsURL() {
		return wsURL;
	}
	public void setWsURL(String wsURL) {
		this.wsURL = wsURL;
	}
	public void setWsparams(List<CustomTransformationWSParams> wsparams) {
		this.wsparams = wsparams;
	}
	public List<CustomTransformationWSParams> getWsparams() {
		return wsparams;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	

}
