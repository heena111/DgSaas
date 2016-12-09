package com.dataguise.webservices.beans;

public class SystemGeneralStatus {
	protected int noOfConnections;
	protected int noOfUsersRegistered;
	protected int noOfRoles;
	protected int noOfLoggedUsers;
	protected int noOfAgentsConnected;
	protected String controllerUpsince;
	protected String version;
	
	/**
	 * @return the noOfConnections
	 */
	public int getNoOfConnections() {
		return noOfConnections;
	}
	/**
	 * @param noOfConnections the noOfConnections to set
	 */
	public void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}
	/**
	 * @return the noOfUsersRegestered
	 */
	public int getNoOfUsersRegistered() {
		return noOfUsersRegistered;
	}
	/**
	 * @param noOfUsersRegestered the noOfUsersRegistered to set
	 */
	public void setNoOfUsersRegistered(int noOfUsersRegistered) {
		this.noOfUsersRegistered = noOfUsersRegistered;
	}
	/**
	 * @return the noOfRoles
	 */
	public int getNoOfRoles() {
		return noOfRoles;
	}
	/**
	 * @param noOfRoles the noOfRoles to set
	 */
	public void setNoOfRoles(int noOfRoles) {
		this.noOfRoles = noOfRoles;
	}
	/**
	 * @return the noOfLoggedUsers
	 */
	public int getNoOfLoggedUsers() {
		return noOfLoggedUsers;
	}
	/**
	 * @param noOfLoggedUsers the noOfLoggedUsers to set
	 */
	public void setNoOfLoggedUsers(int noOfLoggedUsers) {
		this.noOfLoggedUsers = noOfLoggedUsers;
	}
	/**
	 * @return the noOfAgentsConnected
	 */
	public int getNoOfAgentsConnected() {
		return noOfAgentsConnected;
	}
	/**
	 * @param noOfAgentsConnected the noOfAgentsConnected to set
	 */
	public void setNoOfAgentsConnected(int noOfAgentsConnected) {
		this.noOfAgentsConnected = noOfAgentsConnected;
	}
	/**
	 * @return the controllerUpsince
	 */
	public String getControllerUpsince() {
		return controllerUpsince;
	}
	/**
	 * @param controllerUpsince the controllerUptime to set
	 */
	public void setControllerUpsince(String controllerUpsince) {
		this.controllerUpsince = controllerUpsince;
	}
	
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	
}
