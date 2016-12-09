package com.dataguise.webservices.beans.discover.findIt;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NetworkScannerBean {

	public enum nmapScanType {
		REGULAR, INTENSE
	}

	private int taskId;
	private String ipRanges;
	private String portNumber;
	private String intenseScanParams;
	private nmapScanType scanType = nmapScanType.REGULAR;
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getTaskId() {
		return taskId;
	}

	public void setIpRanges(String ipRanges) {
		this.ipRanges = ipRanges;
	}
	public String getIpRanges() {
		return ipRanges;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setIntenseScanParams(String intenseScanParams) {
		this.intenseScanParams = intenseScanParams;
	}

	public String getIntenseScanParams() {
		return intenseScanParams;
	}
	
		
	public void setScanType(nmapScanType scanType) {
		this.scanType = scanType;
	}
	public nmapScanType getScanType() {
		return scanType;
	}	

}
