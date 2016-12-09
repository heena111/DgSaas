package com.dataguise.webservices.beans;

import java.sql.Timestamp;

public class DgLdapObjectClassesPredefinedBean {
	
	protected Integer id;
	protected String name;
	protected String searchDn;
	protected String filter;
	protected String searchScope;
	protected Boolean collection;
	protected Integer objectClassType;
	protected Timestamp createts;
	protected Timestamp updatets;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSearchDn() {
		return searchDn;
	}
	public void setSearchDn(String searchDn) {
		this.searchDn = searchDn;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getSearchScope() {
		return searchScope;
	}
	public void setSearchScope(String searchScope) {
		this.searchScope = searchScope;
	}
	public Boolean getCollection() {
		return collection;
	}
	public void setCollection(Boolean collection) {
		this.collection = collection;
	}
	public Integer getObjectClassType() {
		return objectClassType;
	}
	public void setObjectClassType(Integer objectClassType) {
		this.objectClassType = objectClassType;
	}
	public Timestamp getCreatets() {
		return createts;
	}
	public void setCreatets(Timestamp createts) {
		this.createts = createts;
	}
	public Timestamp getUpdatets() {
		return updatets;
	}
	public void setUpdatets(Timestamp updatets) {
		this.updatets = updatets;
	}
	
	
	
	
}
