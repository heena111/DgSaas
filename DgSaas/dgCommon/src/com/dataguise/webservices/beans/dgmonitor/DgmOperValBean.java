/* Bean for DgMonitor's operator type and value */

package com.dataguise.webservices.beans.dgmonitor;

/**
 * @author Parshant
 *
 */
public class DgmOperValBean {
	
	
	private Integer operatorId;
	private String operatorValue;
	private String operatorIdVal;
	private String condition;
	
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getOperatorIdVal() {
		return operatorIdVal;
	}
	public void setOperatorIdVal(String operatorIdVal) {
		this.operatorIdVal = operatorIdVal;
	}
	public Integer getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorValue() {
		return operatorValue;
	}
	public void setOperatorValue(String operatorValue) {
		this.operatorValue = operatorValue;
	}
	
	

}

