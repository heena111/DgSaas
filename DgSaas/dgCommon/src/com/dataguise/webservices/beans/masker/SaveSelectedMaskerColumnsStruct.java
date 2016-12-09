package com.dataguise.webservices.beans.masker;

import java.util.List;

import javax.validation.Valid;

public class SaveSelectedMaskerColumnsStruct {
	
	@Valid
	private List<DgMaskerColumn> columnInfo;

	public List<DgMaskerColumn> getColumnInfo() {
		return columnInfo;
	}

	public void setColumnInfo(List<DgMaskerColumn> columnInfo) {
		this.columnInfo = columnInfo;
	}
	
	

}
