package com.dataguise.webservices.beans;

public class DgBrowserDirTreeInfo {
	private Boolean leaf;
	private String id;
	private String text;
	private String path;
	private Integer agentId;
	private Integer connId;
	
	public Boolean getLeaf() {
		return leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public Integer getConnId() {
		return connId;
	}
	public void setConnId(Integer connId) {
		this.connId = connId;
	}
	
}
