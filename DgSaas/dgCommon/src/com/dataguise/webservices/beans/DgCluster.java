package com.dataguise.webservices.beans;

import java.util.Comparator;

public class DgCluster extends CRUDEStructure {

	private Integer clusterId;
	
	private String clusterName;

	public Integer getClusterId() {
		return clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	
	public static Comparator<DgCluster> SORT_BY_NAME = new Comparator<DgCluster>() {

		@Override
		public int compare(DgCluster o1, DgCluster o2) {
			return o1.clusterName.compareToIgnoreCase(o2.clusterName);
		}
		   
	};
	
}
