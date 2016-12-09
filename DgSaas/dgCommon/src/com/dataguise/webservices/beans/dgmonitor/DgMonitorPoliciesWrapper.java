package com.dataguise.webservices.beans.dgmonitor;

import java.util.ArrayList;
import java.util.List;

public class DgMonitorPoliciesWrapper {
	
 protected List<DgMonitorPolicyBean> lstDgmPolicy;
	
 protected Integer totalRecords;
   
	public List<DgMonitorPolicyBean> getDgmPolicies() {
		if (lstDgmPolicy == null) {
			lstDgmPolicy = new ArrayList<DgMonitorPolicyBean>();
		}
		return this.lstDgmPolicy;
	}
	public void setDgmPolicies(List<DgMonitorPolicyBean> lstDgmPolicy) {
			this.lstDgmPolicy = lstDgmPolicy;
		}
	
	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer value) {
		this.totalRecords = value;
	}

}
