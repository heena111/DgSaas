/**
 * 
 */
package com.dataguise.webservices.beans.dgmonitor;

/**
 * @author Parshant
 *
 */
public class DgmDashBoardCountBean {
	
	private String name;
	private Long covered;
	private Long notCovered;
	private String label;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCovered() {
		return covered;
	}
	public void setCovered(Long covered) {
		this.covered = covered;
	}
	public Long getNotCovered() {
		return notCovered;
	}
	public void setNotCovered(Long notCovered) {
		this.notCovered = notCovered;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}

