package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class DgValidationFunction {
	
	String validationFunctionName;
	String validationFunctionDescription;
	
	public DgValidationFunction()
	{
		
	}
	
	public String getValidationFunctionName() {
		return validationFunctionName;
	}
	public void setValidationFunctionName(String validationFunctionName) {
		this.validationFunctionName = validationFunctionName;
	}
	public String getValidationFunctionDescription() {
		return validationFunctionDescription;
	}
	public void setValidationFunctionDescription(String validationFunctionDescription) {
		this.validationFunctionDescription = validationFunctionDescription;
	}

	
}
