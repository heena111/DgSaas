package com.dataguise.webservices.beans;

import java.util.HashMap;

public class SystemStatus {

	protected SystemGeneralStatus generalStatus;
	protected HashMap<String, SystemSubInfo> subStatus;

	/**
	 * @return the generalStatus
	 */
	public SystemGeneralStatus getGeneralStatus() {
		return generalStatus;
	}

	/**
	 * @param generalStatus
	 *            the generalSystemStatus to set
	 */
	public void setGeneralStatus(SystemGeneralStatus generalStatus) {
		this.generalStatus = generalStatus;
	}

	public HashMap<String, SystemSubInfo> getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(HashMap<String, SystemSubInfo> subStatus) {
		this.subStatus = subStatus;
	}

}
