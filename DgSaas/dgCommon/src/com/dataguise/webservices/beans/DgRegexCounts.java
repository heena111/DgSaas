package com.dataguise.webservices.beans;

public class DgRegexCounts {
	private String regexGroupName;
	private String regexName;
	private int count;
	
	public String getRegexGroupName () {
		return regexGroupName;
	}
	
	public void setRegexGroupName (String name) {
		regexGroupName = name;
	}
	
	public String getRegexName () {
		return regexName;
	}
	
	public void setRegexName (String name) {
		regexName = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount (int count) {
		this.count = count;
	}

}
