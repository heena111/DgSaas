package com.dataguise.util;

public class RegexTokenParams {

	private String regexData;
	private String regexExpression;
	private boolean isCaseInsensitive = false;

	public String getRegexData() {
		return regexData;
	}

	public void setRegexData(String regexData) {
		this.regexData = regexData;
	}

	public String getRegexExpression() {
		return regexExpression;
	}

	public void setRegexExpression(String regexExpression) {
		this.regexExpression = regexExpression;
	}

	public boolean isCaseInsensitive() {
		return isCaseInsensitive;
	}

	public void setCaseInsensitive(boolean isCaseInsensitive) {
		this.isCaseInsensitive = isCaseInsensitive;
	}

}
