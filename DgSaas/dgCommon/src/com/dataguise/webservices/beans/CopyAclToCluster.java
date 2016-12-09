package com.dataguise.webservices.beans;


import java.util.List;
public class CopyAclToCluster {
	private Integer clusterId;
	private  List<Integer> destClusterIdList;
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public List<Integer> getDestClusterIdList() {
		return destClusterIdList;
	}
	public void setDestClusterIdList(List<Integer> destClusterIdList) {
		this.destClusterIdList = destClusterIdList;
	}

	
	 
}
