package com.dataguise.webservices.beans;

public class DgLicenseInfoBean {

	protected String notAfter;
	protected String notBefore;
	protected String productNames;
	protected String numControllers;
	protected String numDiscoverAgents;
	protected String numMaskerAgents;
	protected String numConnections;
	protected String numUsers;
	protected String issuedTo;
	protected String licenseFile;
	protected String versionNo;
	//Change for BO field in license
	protected String blackList;
	protected String branding;
	protected Boolean active;
	protected String startTime;
	 protected Integer noOfDays;

	
	/**
	 * @return the licenseFile
	 */
	public String getLicenseFile() {
		return licenseFile;
	}
	/**
	 * @param licenseFile the licenseFile to set
	 */
	public void setLicenseFile(String licenseFile) {
		this.licenseFile = licenseFile;
	}
	/**
	 * @return the issuedTo
	 */
	public String getIssuedTo() {
		return issuedTo;
	}
	/**
	 * @param issuedTo the issuedTo to set
	 */
	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}
	/**
	 * @return the notAfter
	 */
	public String getNotAfter() {
		return notAfter;
	}
	/**
	 * @param notAfter the notAfter to set
	 */
	public void setNotAfter(String notAfter) {
		this.notAfter = notAfter;
	}
	/**
	 * @return the notBefore
	 */
	public String getNotBefore() {
		return notBefore;
	}
	/**
	 * @param notBefore the notBefore to set
	 */
	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
	}
	
	/**
	 * @return the productNames
	 */
	public String getProductNames() {
		return productNames;
	}
	/**
	 * @param productNames the productNames to set
	 */
	public void setProductNames(String productNames) {
		this.productNames = productNames;
	}
	/**
	 * @return the numControllers
	 */
	public String getNumControllers() {
		return numControllers;
	}
	/**
	 * @param numControllers the numControllers to set
	 */
	public void setNumControllers(String numControllers) {
		this.numControllers = numControllers;
	}
	/**
	 * @return the numDiscoverAgents
	 */
	public String getNumDiscoverAgents() {
		return numDiscoverAgents;
	}
	/**
	 * @param numDiscoverAgents the numDiscoverAgents to set
	 */
	public void setNumDiscoverAgents(String numDiscoverAgents) {
		this.numDiscoverAgents = numDiscoverAgents;
	}
	/**
	 * @return the numMaskerAgents
	 */
	public String getNumMaskerAgents() {
		return numMaskerAgents;
	}
	/**
	 * @param numMaskerAgents the numMaskerAgents to set
	 */
	public void setNumMaskerAgents(String numMaskerAgents) {
		this.numMaskerAgents = numMaskerAgents;
	}
	/**
	 * @return the numConnections
	 */
	public String getNumConnections() {
		return numConnections;
	}
	/**
	 * @param numConnections the numConnections to set
	 */
	public void setNumConnections(String numConnections) {
		this.numConnections = numConnections;
	}
	/**
	 * @return the numUsers
	 */
	public String getNumUsers() {
		return numUsers;
	}
	/**
	 * @param numUsers the numUsers to set
	 */
	public void setNumUsers(String numUsers) {
		this.numUsers = numUsers;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getBlackList() {
		return blackList;
	}
	public void setBlackList(String blackList) {
		this.blackList = blackList;
	}


	public String getBranding() {
		return branding;
	}
	public void setBranding(String branding) {
		this.branding = branding;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Integer getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	
	
}
