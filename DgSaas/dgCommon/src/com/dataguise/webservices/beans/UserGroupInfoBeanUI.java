package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

public class UserGroupInfoBeanUI {

	protected List<GroupUsersBean> children;
	protected String text;
	protected String value;
	protected Boolean leaf;
	protected Integer id;
	protected Boolean checked;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public List<GroupUsersBean> getChildren() {
		if (children == null) {
			children = new ArrayList<GroupUsersBean>();
		}
		return this.children;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}

	public Boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean value) {
		this.leaf = value;
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
