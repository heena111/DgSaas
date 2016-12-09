package com.dataguise.webservices.beans;


public class DgConnectionGroup {

	private int cgId=-1;
	private String conngrpName;
	private String conngrpDesc;
	/**
	 * @return the cgId
	 */
	public int getCgId() {
		return cgId;
	}
	/**
	 * @param cgId the cgId to set
	 */
	public void setCgId(int cgId) {
		this.cgId = cgId;
	}
	/**
	 * @return the conngrpName
	 */
	public String getConngrpName() {
		return conngrpName;
	}
	/**
	 * @param conngrpName the conngrpName to set
	 */
	public void setConngrpName(String conngrpName) {
		this.conngrpName = conngrpName;
	}
	/**
	 * @return the conngrpDesc
	 */
	public String getConngrpDesc() {
		return conngrpDesc;
	}
	/**
	 * @param conngrpDesc the conngrpDesc to set
	 */
	public void setConngrpDesc(String conngrpDesc) {
		this.conngrpDesc = conngrpDesc;
	}
}
