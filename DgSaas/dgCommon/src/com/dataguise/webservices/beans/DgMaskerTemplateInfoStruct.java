package com.dataguise.webservices.beans;

import java.util.List;

public class DgMaskerTemplateInfoStruct {
	private Long totalRecords;
	private List<DgMaskerTemplateInfo> dgMaskerTemplateInfoList;
	
	
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<DgMaskerTemplateInfo> getDgMaskerTemplateInfoList() {
		return dgMaskerTemplateInfoList;
	}
	public void setDgMaskerTemplateInfoList(
			List<DgMaskerTemplateInfo> dgMaskerTemplateInfoList) {
		this.dgMaskerTemplateInfoList = dgMaskerTemplateInfoList;
	}
	
	

}
