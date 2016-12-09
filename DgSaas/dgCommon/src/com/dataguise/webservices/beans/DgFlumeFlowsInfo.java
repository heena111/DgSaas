package com.dataguise.webservices.beans;

import java.util.List;

public class DgFlumeFlowsInfo {
	private List<DgFlumeFlowsStruct> list;
	private int totalRecords;
	
	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<DgFlumeFlowsStruct> getList() {
		return list;
	}

	public void setList(List<DgFlumeFlowsStruct> list) {
		this.list = list;
	}

}
