package com.dataguise.webservices.beans;

import java.util.Comparator;

public class DgCustomFunction {
	
	 private Integer funcID;

	 private String funcName;
	 
	 private String vendor;

	 private Boolean c = Boolean.FALSE;

	 private Boolean r = Boolean.FALSE;

	 private Boolean u = Boolean.FALSE;

	 private Boolean d = Boolean.FALSE;
	 
	 private Boolean w = Boolean.FALSE;
	

	 /**
	 * @return the funcID
	 */
	public Integer getFuncID() {
		return funcID;
	}

	/**
	 * @param funcID the funcID to set
	 */
	public void setFuncID(Integer funcID) {
		this.funcID = funcID;
	}

	/**
	 * @return the funcName
	 */
	public String getFuncName() {
		return funcName;
	}

	/**
	 * @param funcName the funcName to set
	 */
	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}

	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * @return the c
	 */
	public Boolean getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(Boolean c) {
		this.c = c;
	}

	/**
	 * @return the r
	 */
	public Boolean getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(Boolean r) {
		this.r = r;
	}

	/**
	 * @return the u
	 */
	public Boolean getU() {
		return u;
	}

	/**
	 * @param u the u to set
	 */
	public void setU(Boolean u) {
		this.u = u;
	}

	/**
	 * @return the d
	 */
	public Boolean getD() {
		return d;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(Boolean d) {
		this.d = d;
	}

	/**
	 * @return the w
	 */
	public Boolean getW() {
		return w;
	}

	/**
	 * @param w the w to set
	 */
	public void setW(Boolean w) {
		this.w = w;
	}

	
	
   public static Comparator<DgCustomFunction> SORT_BY_NAME = new Comparator<DgCustomFunction>() {

	@Override
	public int compare(DgCustomFunction o1, DgCustomFunction o2) {
		return o1.funcName.compareToIgnoreCase(o2.funcName);
	}
	   
};
	 
	 
}
