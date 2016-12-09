package com.dataguise.webservices.beans.masker;

import java.util.List;

import com.dataguise.webservices.beans.DgColumnInfo;

public class ColumnInfoBean {
	
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<DgColumnInfo> getLstColumnInfo() {
		return lstColumnInfo;
	}
	public void setLstColumnInfo(List<DgColumnInfo> lstColumnInfo) {
		this.lstColumnInfo = lstColumnInfo;
	}
	private List<DgColumnInfo> lstColumnInfo;

}
