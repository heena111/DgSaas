package com.dataguise.webservices.beans;

import java.util.Comparator;

public class DgDomain extends CRUDEStructure {

	private Integer domainId;
	
	private String domainName;

	/**
	 * @return the domainId
	 */
	public Integer getDomainId() {
		return domainId;
	}

	/**
	 * @param domainId the domainId to set
	 */
	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}

	/**
	 * @return the domainName
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * @param domainName the domainName to set
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	

	public static Comparator<DgDomain> SORT_BY_NAME = new Comparator<DgDomain>() {

		@Override
		public int compare(DgDomain o1, DgDomain o2) {
			return o1.domainName.compareToIgnoreCase(o2.domainName);
		}
		   
	};

}
