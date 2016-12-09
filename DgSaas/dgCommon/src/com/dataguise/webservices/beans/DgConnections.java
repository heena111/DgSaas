package com.dataguise.webservices.beans;

import java.util.Comparator;





public class DgConnections {
	
	 private Integer connId;

	 private String connName;
	 
	 private String connType;

	 private String hostName;

	 private String portNo;

	 private String vendor;

	 private String userid;

	 private String dbname;

	 private Boolean c = Boolean.FALSE;

	 private Boolean r = Boolean.FALSE;

	 private Boolean u = Boolean.FALSE;

	 private Boolean d = Boolean.FALSE;
	 
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
	 * @return the connId
	 */
	public Integer getConnId() {
		return connId;
	}

	/**
	 * @return the connName
	 */
	public String getConnName() {
		return connName;
	}

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @return the portNo
	 */
	public String getPortNo() {
		return portNo;
	}

	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @return the dbname
	 */
	public String getDbname() {
		return dbname;
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
	 * @param connId the connId to set
	 */
	public void setConnId(Integer connId) {
		this.connId = connId;
	}

	/**
	 * @param connName the connName to set
	 */
	public void setConnName(String connName) {
		this.connName = connName;
	}

	/**
	 * @param hostName the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @param portNo the portNo to set
	 */
	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @param dbname the dbname to set
	 */
	public void setDbname(String dbname) {
		this.dbname = dbname;
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
	
	// Value : DBMS | RDS | AZURE
	public String getConnType() {
		return connType;
	}

	public void setConnType(String connType) {
		this.connType = connType;
	}



	public static Comparator<DgConnections> SORT_BY_CONN_NAME=new Comparator<DgConnections>() {
		@Override
		public int compare(DgConnections o1, DgConnections o2) {
			// TODO Auto-generated method stub
			return o1.connName.compareToIgnoreCase(o2.connName);
		}
	};


}
