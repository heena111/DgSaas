package com.dataguise.webservices.beans;

import java.util.List;


public class DgMaskerTaskInfoStruct {
	private Integer totalRecords;
	private List<DgMaskerTaskInfo> dgMaskerTaskInfoList;
	
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<DgMaskerTaskInfo> getDgMaskerTaskInfoList() {
		return dgMaskerTaskInfoList;
	}
	public void setDgMaskerTaskInfoList(List<DgMaskerTaskInfo> dgMaskerTaskInfoList) {
		this.dgMaskerTaskInfoList = dgMaskerTaskInfoList;
	}

}
