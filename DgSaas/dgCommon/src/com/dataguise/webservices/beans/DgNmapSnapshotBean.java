package com.dataguise.webservices.beans;

import java.util.List;
import java.util.Map;

public class DgNmapSnapshotBean {

	private String taskName;
	private String taskDescription;
	private List<String> ipRange;
	private Map<String,String> dbPorts;
	private String scanType;
	
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public List<String> getIpRange() {
		return ipRange;
	}
	public void setIpRange(List<String> ipRange) {
		this.ipRange = ipRange;
	}
	public Map<String, String> getDbPorts() {
		return dbPorts;
	}
	public void setDbPorts(Map<String, String> dbPorts) {
		this.dbPorts = dbPorts;
	}
	/**
	 * @return the scanType
	 */
	public String getScanType() {
		return scanType;
	}
	/**
	 * @param scanType the scanType to set
	 */
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}
	
}
