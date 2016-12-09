package com.dataguise.webservices.beans.hive;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.dataguise.webservices.beans.DiscoveryFileResults;
@XmlRootElement
public class DgHiveDiscover {
	protected List<DiscoveryFileResults> discoveryFileResults;
	
	
	
	public DgHiveDiscover() {
		this.discoveryFileResults = new ArrayList<DiscoveryFileResults>();
	}

	public void addResults(DiscoveryFileResults results)
	{
		discoveryFileResults.add(results);
	}
	public DgHiveDiscover(
			List<DiscoveryFileResults> discoveryFileResults) {
		
		this.discoveryFileResults = discoveryFileResults;
	}

	

	public List<DiscoveryFileResults> getDiscoveryFileResults() {
		return discoveryFileResults;
	}

	public void setDiscoveryFileResults(
			List<DiscoveryFileResults> discoveryFileResults) {
		this.discoveryFileResults = discoveryFileResults;
	}
	
}
