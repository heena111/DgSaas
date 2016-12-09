package com.dataguise.webservices.beans;


public class GroupUsersBean {

	private  String text;
	private  Boolean leaf;
	private String id;
	private Boolean checked;
	private String value;  
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getLeaf() {
		return leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	 
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
