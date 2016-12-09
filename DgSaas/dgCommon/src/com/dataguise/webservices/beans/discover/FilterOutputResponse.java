package com.dataguise.webservices.beans.discover;

import java.util.ArrayList;

import com.dataguise.webservices.beans.DbFilterOutput;

public class FilterOutputResponse {
	private ArrayList<DbFilterOutput> dbFilterList = new ArrayList<DbFilterOutput>();
	private Integer totalCount;
	private Long requestId;
	
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public ArrayList<DbFilterOutput> getDbFilterList() {
		return dbFilterList;
	}
	public void setDbFilterList(ArrayList<DbFilterOutput> dbFilterList) {
		this.dbFilterList = dbFilterList;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	} 
}
