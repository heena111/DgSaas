package com.dataguise.webservices.beans;

public class DgBrowserDirInfo {
	
	private String name;
	private boolean leaf;
	private Long size;
	private String type;
	private Long time;
	private String path;
	private Integer connId;
	
	
	
	public Integer getConnId() {
		return connId;
	}
	public void setConnId(Integer connId) {
		this.connId = connId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

}
