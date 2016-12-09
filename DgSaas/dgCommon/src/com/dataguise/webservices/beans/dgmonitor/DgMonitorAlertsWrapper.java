package com.dataguise.webservices.beans.dgmonitor;

import java.util.ArrayList;
import java.util.List;

public class DgMonitorAlertsWrapper {
	
 protected List<DgMonitorAlertBean> lstDgmAlerts;
	
 protected Integer totalRecords;
   
	public List<DgMonitorAlertBean> getDgmAlerts() {
		if (lstDgmAlerts == null) {
			lstDgmAlerts = new ArrayList<DgMonitorAlertBean>();
		}
		return this.lstDgmAlerts;
	}
	public void setDgmAlerts(List<DgMonitorAlertBean> lstDgmAlerts) {
			this.lstDgmAlerts = lstDgmAlerts;
		}
	
	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer value) {
		this.totalRecords = value;
	}

}
