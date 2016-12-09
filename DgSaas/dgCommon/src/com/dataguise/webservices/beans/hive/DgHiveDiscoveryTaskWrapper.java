package com.dataguise.webservices.beans.hive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

public class DgHiveDiscoveryTaskWrapper {

	
	protected List<DgHiveFileTask> dgHiveFileTaskList;
	protected Integer totalRecords;

	public List<DgHiveFileTask> getDgHiveFileTaskList() {
		if (dgHiveFileTaskList == null) {
			dgHiveFileTaskList = new ArrayList<DgHiveFileTask>();
		}
		return dgHiveFileTaskList;
	}

	public void setDgHiveFileTaskList(List<DgHiveFileTask> dgHiveFileTaskList) {
		this.dgHiveFileTaskList = dgHiveFileTaskList;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	

}