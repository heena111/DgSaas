package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

import com.dataguise.webservices.beans.masker.DgMaskerTask;



public class DgMaskerTaskWrapper {

	protected List<DgMaskerTask> dgMaskerTaskList;
	protected Integer totalRecords;
	
	
	public List<DgMaskerTask> getDgMaskerTaskList() {
		if(dgMaskerTaskList==null)
		{
			dgMaskerTaskList=new ArrayList<DgMaskerTask>();
		}
		return dgMaskerTaskList;
	}
	
	public void setDgMaskerTaskList(List<DgMaskerTask> dgMaskerTaskList) {
		this.dgMaskerTaskList = dgMaskerTaskList;
	}
	
	
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	

}
