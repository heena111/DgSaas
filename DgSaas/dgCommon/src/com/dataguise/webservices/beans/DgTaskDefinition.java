

package com.dataguise.webservices.beans;

import java.util.Comparator;




public class DgTaskDefinition {
	
	
	private Integer tdefId;

    private String tdefName;

    private String tdefType;         

    private String tdefDesc;
   
    private String tdefTaskType;

    private String connList ;
    


	private Boolean c = Boolean.FALSE;

	private Boolean r = Boolean.FALSE;

	private Boolean u = Boolean.FALSE;

	private Boolean d = Boolean.FALSE;
	
	private Boolean e = Boolean.FALSE;
	
	private Boolean w = Boolean.FALSE;

	
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

	/**
	 * @return the e
	 */
	public Boolean getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(Boolean e) {
		this.e = e;
	}

	/**
	 * @return the connList
	 */
	public String getConnList() {
		return connList;
	}

	/**
	 * @param connList the connList to set
	 */
	public void setConnList(String connList) {
		this.connList = connList;
	}
	
	
	/**
	 * @return the tdefId
	 */
	public Integer getTdefId() {
		return tdefId;
	}

	/**
	 * @return the tdefName
	 */
	public String getTdefName() {
		return tdefName;
	}

	/**
	 * @return the tdefType
	 */
	public String getTdefType() {
		return tdefType;
	}

	/**
	 * @return the tdefDesc
	 */
	public String getTdefDesc() {
		return tdefDesc;
	}


	/**
	 * @return the c
	 */
	public Boolean getC() {
		return c;
	}

	/**
	 * @return the r
	 */
	public Boolean getR() {
		return r;
	}

	/**
	 * @return the u
	 */
	public Boolean getU() {
		return u;
	}

	/**
	 * @return the d
	 */
	public Boolean getD() {
		return d;
	}

	/**
	 * @param tdefId the tdefId to set
	 */
	public void setTdefId(Integer tdefId) {
		this.tdefId = tdefId;
	}

	/**
	 * @param tdefName the tdefName to set
	 */
	public void setTdefName(String tdefName) {
		this.tdefName = tdefName;
	}

	/**
	 * @param tdefType the tdefType to set
	 */
	public void setTdefType(String tdefType) {
		this.tdefType = tdefType;
	}

	/**
	 * @param tdefDesc the tdefDesc to set
	 */
	public void setTdefDesc(String tdefDesc) {
		this.tdefDesc = tdefDesc;
	}



	/**
	 * @param c the c to set
	 */
	public void setC(Boolean c) {
		this.c = c;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(Boolean r) {
		this.r = r;
	}

	/**
	 * @param u the u to set
	 */
	public void setU(Boolean u) {
		this.u = u;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(Boolean d) {
		this.d = d;
	}


	public void setTdefTaskType(String tdefTaskType) {
		this.tdefTaskType = tdefTaskType;
	}

	public String getTdefTaskType() {
		return tdefTaskType;
	}


	public static Comparator<DgTaskDefinition> DG_TASK_COMPARATOR =  new Comparator<DgTaskDefinition>() {
		
		@Override
		public int compare(DgTaskDefinition arg0, DgTaskDefinition arg1) {
			
			return  arg0.getTdefName().compareTo(arg1.getTdefName());
		}
	};

	
}


