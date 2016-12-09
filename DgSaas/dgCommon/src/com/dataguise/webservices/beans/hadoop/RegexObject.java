package com.dataguise.webservices.beans.hadoop;

import java.io.Serializable;
import java.util.regex.Pattern;

public class RegexObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String regexPattern;
	private String regexName;
	private int regexId;
	public void setRegexPattern(String regexPattern) {
		this.regexPattern = regexPattern;
	}

	public String getRegexPattern() {
		return regexPattern;
	}

	public void setRegexName(String regexName) {
		this.regexName = regexName;
	}

	public String getRegexName() {
		return regexName;
	}

	public void setRegexId(int regexId) {
		this.regexId = regexId;
	}

	public int getRegexId() {
		return regexId;
	}

	public Pattern getPattern() {
		return Pattern.compile(regexPattern);
	}

	public RegexObject(int regexId, String regexName,String regexPattern){
		this.regexId=regexId;
		this.regexName=regexName;
		this.regexPattern=regexPattern;
	}	
	
	public RegexObject() {
		
		
	}
}
