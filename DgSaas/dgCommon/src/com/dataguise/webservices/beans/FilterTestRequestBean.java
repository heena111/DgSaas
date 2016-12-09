package com.dataguise.webservices.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class FilterTestRequestBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<DgConnection> connectionList;
	Integer page;
	Integer recordsOffset;
	Integer recordsCount;
	Long requestId;
	
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public List<DgConnection> getConnectionList() {
		return connectionList;
	}
	public void setConnectionList(List<DgConnection> connectionList) {
		this.connectionList = connectionList;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRecordsOffset() {
		return recordsOffset;
	}
	public void setRecordsOffset(Integer recordsOffset) {
		this.recordsOffset = recordsOffset;
	}
	public Integer getRecordsCount() {
		return recordsCount;
	}
	public void setRecordsCount(Integer recordsCount) {
		this.recordsCount = recordsCount;
	}
	
	
}
