package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

public class DgDiscoverTaskWrapper {
	protected List<DgDiscoverTask> lstDgDiscoverTask;
	

	protected Integer totalRecords;
   
	public List<DgDiscoverTask> getDgDiscoverTask() {
		if (lstDgDiscoverTask == null) {
			lstDgDiscoverTask = new ArrayList<DgDiscoverTask>();
		}
		return this.lstDgDiscoverTask;
	}
	public void setDgDiscoverTask(List<DgDiscoverTask> lstDgDiscoverTask) {
			this.lstDgDiscoverTask = lstDgDiscoverTask;
		}
	
	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer value) {
		this.totalRecords = value;
	}
	
}