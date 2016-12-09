package com.dataguise.webservices.beans.s3;

public class BrowserDirTree   {
	
	
	public Boolean leaf;
	public String text;
	public String id;
	private String structure;
	private String structureType;
	private String domain;
	private Integer domainId;
	
	public Boolean getLeaf() {
		return leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getStructureType() {
		return structureType;
	}
	public void setStructureType(String structureType) {
		this.structureType = structureType;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Integer getDomainId() {
		return domainId;
	}
	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}
	
	
	
	

}
