package com.dataguise.webservices.beans.dgmonitor;

import java.util.ArrayList;
import java.util.List;

public class DgMonitorGraphBeanData {
	
	private String keyName;
	
	private List<DgMonitorCompPolicyGraphBean> graphData=new ArrayList<DgMonitorCompPolicyGraphBean>();


	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public List<DgMonitorCompPolicyGraphBean> getGraphData() {
		return graphData;
	}

	public void setGraphData(List<DgMonitorCompPolicyGraphBean> graphData) {
		this.graphData = graphData;
	}

	

}
