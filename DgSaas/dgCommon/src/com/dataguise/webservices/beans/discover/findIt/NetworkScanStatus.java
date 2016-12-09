package com.dataguise.webservices.beans.discover.findIt;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NetworkScanStatus {
	public enum ScanStatus {
		NO_STATUS, COMPLETED, IN_PROGRESS, ERROR, CANCELLED, FAILED
	}
	
	private ScanStatus status = ScanStatus.NO_STATUS;

	public ScanStatus getStatus() {
		return status;
	}

	public void setStatus(ScanStatus status) {
		this.status = status;
	}
}
