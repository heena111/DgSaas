package com.dataguise.webservices.beans;

public class DgHadoopScanPathInfo {

	protected String scanPath;
	protected String domainName;
	protected String structName;
	protected Boolean verifyStruct;
	
	
	public String getScanPath() {
		return scanPath;
	}
	public void setScanPath(String scanPath) {
		this.scanPath = scanPath;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getStructName() {
		return structName;
	}
	public void setStructName(String structName) {
		this.structName = structName;
	}
	public Boolean getVerifyStruct() {
		return verifyStruct;
	}
	public void setVerifyStruct(Boolean verifyStruct) {
		this.verifyStruct = verifyStruct;
	}
	

}
