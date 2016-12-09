package com.dataguise.webservices.beans.masker;

import java.util.List;



public class DgSensitiveMaskerColumnsStruct {
	private Integer totalRecords;
	private List<DgMaskerColumn> dgMaskerColumnList;
	
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<DgMaskerColumn> getDgMaskerColumnList() {
		return dgMaskerColumnList;
	}
	public void setDgMaskerColumnList(List<DgMaskerColumn> dgMaskerColumnList) {
		this.dgMaskerColumnList = dgMaskerColumnList;
	}
}
