package com.dataguise.webservices.beans;

import java.math.BigInteger;




public class DgAdminUserMaskBean implements java.io.Serializable {


	private Integer mask;
	private boolean permitted = false;
	
	public DgAdminUserMaskBean() {
		
	}

	/**
	 * @param mask
	 * @param permitted
	 */
	public DgAdminUserMaskBean(Integer mask, boolean permitted) {
	
		this.mask = mask;
		this.permitted = permitted;
	}	
	
	
	/**
	 * @return the mask
	 */
	public Integer getMask() {
		return mask;
	}
	/**
	 * @return the permitted
	 */
	public boolean isPermitted() {
		return permitted;
	}
	/**
	 * @param mask the mask to set
	 */
	public void setMask(Integer mask) {
		this.mask = mask;
	}
	/**
	 * @param permitted the permitted to set
	 */
	public void setPermitted(boolean permitted) {
		this.permitted = permitted;
	}

	
		
}