package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

public class DgSearchFileTaskWrapper
{
	protected List<DgSearchFileTask> lstDgDiscoverFileTask;
	

	protected Integer totalRecords;
   
	public List<DgSearchFileTask> getDgSearchFileTask() {
		if (lstDgDiscoverFileTask == null) {
			lstDgDiscoverFileTask = new ArrayList<DgSearchFileTask>();
		}
		return this.lstDgDiscoverFileTask;
	}
	public void setDgSearchFileTask(List<DgSearchFileTask> lstDgDiscoverFileTask) {
			this.lstDgDiscoverFileTask = lstDgDiscoverFileTask;
		}
	
	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer value) {
		this.totalRecords = value;
	}
	
}