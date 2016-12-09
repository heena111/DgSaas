/**
 * 
 */
package com.dataguise.webservices.beans.dgmonitor;

/**
 * @author parshant.bandral
 *
 */
public class DgDBMetaDataTree {
	
	String text;
	Boolean leaf;
	Boolean checked;
	String connectionAgent;
	Integer connectionId;
	String lastUpdatedTime;
	Integer recordId;
	String result;
	String sessionId;
	Boolean expanded;
	
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getConnectionAgent() {
		return connectionAgent;
	}
	public void setConnectionAgent(String connectionAgent) {
		this.connectionAgent = connectionAgent;
	}
	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Boolean getExpanded() {
		return expanded;
	}
	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Boolean getLeaf() {
		return leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	

}

