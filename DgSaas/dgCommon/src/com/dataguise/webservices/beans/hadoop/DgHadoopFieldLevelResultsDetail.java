package com.dataguise.webservices.beans.hadoop;

public class DgHadoopFieldLevelResultsDetail {
	
	String fileName;
	String field;
	Integer matchCount;
	Integer totalCount;
	String sensitiveType;
	String sampleMode;
	Integer confidence;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public Integer getMatchCount() {
		return matchCount;
	}
	public void setMatchCount(Integer matchCount) {
		this.matchCount = matchCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public String getSensitiveType() {
		return sensitiveType;
	}
	public void setSensitiveType(String sensitiveType) {
		this.sensitiveType = sensitiveType;
	}
	public String getSampleMode() {
		return sampleMode;
	}
	public void setSampleMode(String sampleMode) {
		this.sampleMode = sampleMode;
	}
	public Integer getConfidence() {
		return confidence;
	}
	public void setConfidence(Integer confidence) {
		this.confidence = confidence;
	}
	
	
}
