package com.dataguise.webservices.beans;

import java.util.List;

public class DgTaskInstancePolicyDetails {
	
	String policyName;
	List<String> expressionNames;
	
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public List<String> getExpressionNames() {
		return expressionNames;
	}
	public void setExpressionNames(List<String> expressionNames) {
		this.expressionNames = expressionNames;
	}
		
	@Override
	public String toString() {
		if(policyName==null)
			policyName="";
		if(expressionNames!=null && !expressionNames.isEmpty())
		return policyName +": "+expressionNames.toString();
		else if(!policyName.equals(""))
			return policyName+":";
		else return "";
	}

}
