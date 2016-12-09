package com.dataguise.webservices.beans;

import java.math.BigInteger;




public class DgAdminUserAclBean implements java.io.Serializable {

	/**
	 * 
	 */
	

	private Integer mask;
	private BigInteger objectIdClass;
	private BigInteger sid;
	
	public DgAdminUserAclBean() {
		
	}
	
	
	/**
	 * @param sid
	 * @param granting
	 * @param mask
	 * @param objectIdClass
	 */
	public DgAdminUserAclBean(BigInteger sid, Integer mask,	BigInteger objectIdClass) {
		super();
		this.sid = sid;
		this.mask = mask;
		this.objectIdClass = objectIdClass;
	}


	

	/**
	 * @return the objectIdClass
	 */
	public BigInteger getObjectIdClass() {
		return objectIdClass;
	}

	/**
	 * @return the sid
	 */
	public BigInteger getSid() {
		return sid;
	}

	

	/**
	 * @return the mask
	 */
	public Integer getMask() {
		return mask;
	}

	/**
	 * @param objectIdClass the objectIdClass to set
	 */
	public void setObjectIdClass(BigInteger objectIdClass) {
		this.objectIdClass = objectIdClass;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(BigInteger sid) {
		this.sid = sid;
	}

	
	/**
	 * @param mask the mask to set
	 */
	public void setMask(Integer mask) {
		this.mask = mask;
	}





	
}