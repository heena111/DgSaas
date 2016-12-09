package com.dataguise.webservices.beans;

import java.util.List;



public class HadoopDetailStructure {
	
private String arrayDelimiter;
private Integer arrayRegexId;
private String keyValueDelimiter;
private String elementDelimiter;
private Integer keyRegexId;
private Integer valueRegexId;
private List<HadoopKeyValueList> keyValueRegexList;



public Integer getArrayRegexId() {
	return arrayRegexId;
}
public void setArrayRegexId(Integer arrayRegexId) {
	this.arrayRegexId = arrayRegexId;
}

public String getArrayDelimiter() {
	return arrayDelimiter;
}
public void setArrayDelimiter(String arrayDelimiter) {
	this.arrayDelimiter = arrayDelimiter;
}
public String getKeyValueDelimiter() {
	return keyValueDelimiter;
}
public void setKeyValueDelimiter(String keyValueDelimiter) {
	this.keyValueDelimiter = keyValueDelimiter;
}
public String getElementDelimiter() {
	return elementDelimiter;
}
public void setElementDelimiter(String elementDelimiter) {
	this.elementDelimiter = elementDelimiter;
}
public Integer getKeyRegexId() {
	return keyRegexId;
}
public void setKeyRegexId(Integer keyRegexId) {
	this.keyRegexId = keyRegexId;
}
public Integer getValueRegexId() {
	return valueRegexId;
}
public void setValueRegexId(Integer valueRegexId) {
	this.valueRegexId = valueRegexId;
}
public List<HadoopKeyValueList> getKeyValueRegexList() {
	return keyValueRegexList;
}
public void setKeyValueRegexList(List<HadoopKeyValueList> keyValueRegexList) {
	this.keyValueRegexList = keyValueRegexList;
}






}
