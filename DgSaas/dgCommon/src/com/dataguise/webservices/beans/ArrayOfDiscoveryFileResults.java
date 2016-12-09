package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ArrayOfDiscoveryFileResults {
	protected List<DiscoveryFileResults> discoveryFileResults;
	
	
	
	public ArrayOfDiscoveryFileResults() {
		this.discoveryFileResults = new ArrayList<DiscoveryFileResults>();
	}

	public void addResults(DiscoveryFileResults results)
	{
		discoveryFileResults.add(results);
	}
	public ArrayOfDiscoveryFileResults(
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
