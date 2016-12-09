package com.dataguise.webservices.beans;

import java.util.List;

/**
 * @author Arun
 *
 */
public class DgSqoopImportJobBean {

	private List<DgSqoopAgentBean> sensitiveCols;

	public List<DgSqoopAgentBean> getSensitiveCols() {
		return sensitiveCols;
	}

	public void setSensitiveCols(List<DgSqoopAgentBean> sensitiveCols) {
		this.sensitiveCols = sensitiveCols;
	}

}