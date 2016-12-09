package com.dataguise.webservices.beans.hive;

import java.util.Map;



public class DgHiveSerdeInfo {
	
	
	String name;
	String serializationLib;
	Integer parametersSize;
	Map<String,String> parameters;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSerializationLib() {
		return serializationLib;
	}
	public void setSerializationLib(String serializationLib) {
		this.serializationLib = serializationLib;
	}
	public Integer getParametersSize() {
		return parametersSize;
	}
	public void setParametersSize(Integer parametersSize) {
		this.parametersSize = parametersSize;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	
	
	
	
	
	
	
	
}
