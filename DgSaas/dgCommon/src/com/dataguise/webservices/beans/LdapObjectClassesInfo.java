package com.dataguise.webservices.beans;

import java.sql.Timestamp;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class LdapObjectClassesInfo {

	private Integer id;
	private String name;
	@NotEmpty(message = "Search DN:"+BeanValidator.EMPTY_FIELD)
	@Size(max=1024, message = "Search DN::"+BeanValidator.MAX_SIZE_1024)
	private String searchDn;
	private String filter;
	private String searchScope;
	private Boolean collection;
	private Integer objectClassType;
	private Timestamp createts;
	private Timestamp updatets;
	private Integer clusterId;
	private Boolean defaultObjectClass; 
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
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
	public Timestamp getCreatets() {
		return createts;
	}
	public void setCreatets(Timestamp createts) {
		this.createts = createts;
	}
	public void setDefaultObjectClass(Boolean defaultObjectClass) {
		this.defaultObjectClass = defaultObjectClass;
	}
	public Boolean getDefaultObjectClass() {
		return defaultObjectClass;
	}
	public void setObjectClassType(Integer objectClassType) {
		this.objectClassType = objectClassType;
	}
	public Integer getObjectClassType() {
		return objectClassType;
	}	
	public void setUpdatets(Timestamp updatets) {
		this.updatets = updatets;
	}
	public Timestamp getUpdatets() {
		return updatets;
	}
}
