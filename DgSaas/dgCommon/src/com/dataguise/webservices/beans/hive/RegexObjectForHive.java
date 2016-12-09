package com.dataguise.webservices.beans.hive;

import java.io.Serializable;
import java.util.regex.Pattern;

public class RegexObjectForHive implements Serializable {
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public String regexPattern;
	public String regexName;
	public int regexId;
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

	
	
}
