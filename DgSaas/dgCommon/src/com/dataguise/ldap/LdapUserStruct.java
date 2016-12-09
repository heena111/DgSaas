package com.dataguise.ldap;

import java.util.ArrayList;
import java.util.List;

public class LdapUserStruct {
	
	
	private String cn;
	private String aclUserNameAttributeValue;
	private String dn;
	private String memeber;
	private List<String> memberOf =new  ArrayList<String>();
	private List<String> objectClass =new  ArrayList<String>();
	private String text;
	private String value;
	private Boolean leaf; 
	private Boolean collection;
	private Boolean expanded;
	private List<LdapUserStruct> children=new  ArrayList<LdapUserStruct>();
	private ArrayList<LdapGroupStruct> groupNames = new ArrayList<LdapGroupStruct>();
	
	public List<String> getObjectClass() {
		return objectClass;
	}
	public void setObjectClass(List<String> objectClass) {
		this.objectClass = objectClass;
	}
	public List<String> getMemberOf() {
		return memberOf;
	}
	public void setMemberOf(List<String> memberOf) {
		this.memberOf = memberOf;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getMemeber() {
		return memeber;
	}
	public void setMemeber(String memeber) {
		this.memeber = memeber;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getAclUserNameAttributeValue() {
		return aclUserNameAttributeValue;
	}
	public void setAclUserNameAttributeValue(String aclUserNameAttributeValue) {
		this.aclUserNameAttributeValue = aclUserNameAttributeValue;
	}
	public void setGroupNames(ArrayList<LdapGroupStruct> groupNames) {
		this.groupNames = groupNames;
	}
	public ArrayList<LdapGroupStruct> getGroupNames() {
		return groupNames;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	public Boolean getLeaf() {
		return leaf;
	}
	public void setCollection(Boolean collection) {
		this.collection = collection;
	}
	public Boolean getCollection() {
		return collection;
	}
	public List<LdapUserStruct> getChildren() {
		return children;
	}
	public void setChildren(List<LdapUserStruct> children) {
		this.children = children;
	}
	public Boolean getExpanded() {
		return expanded;
	}
	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
