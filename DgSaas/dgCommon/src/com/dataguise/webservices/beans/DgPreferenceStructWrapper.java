package com.dataguise.webservices.beans;

import java.util.List;

import javax.validation.Valid;

import com.dataguise.webservices.structures.DgPreferenceStruct;

public class DgPreferenceStructWrapper {
	
	@Valid
	protected List<DgPreferenceStruct> dgPrefStructList;

	public List<DgPreferenceStruct> getDgPrefStructList() {
		return dgPrefStructList;
	}

	public void setDgPrefStructList(List<DgPreferenceStruct> dgPrefStructList) {
		this.dgPrefStructList = dgPrefStructList;
	}
	
}
