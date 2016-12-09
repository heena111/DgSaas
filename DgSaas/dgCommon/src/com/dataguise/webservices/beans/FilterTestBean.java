package com.dataguise.webservices.beans;

import com.dataguise.webservices.beans.discover.database.SchemaFilterDetails;

public class FilterTestBean {
	SchemaFilterDetails schemaFilter ;
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
	public SchemaFilterDetails getSchemaFilter() {
		return schemaFilter;
	}
	public void setSchemaFilter(SchemaFilterDetails schemaFilter) {
		this.schemaFilter = schemaFilter;
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
