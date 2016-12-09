package com.dataguise.webservices.beans;

public class Operation {

	
	public enum OperationNames{
		INSERT,UPDATE,DELETE,EXECUTE,RESULTVIEW
	};
	
	OperationNames operationName;
	Integer recordId;
	

	public Operation(OperationNames operationName, Integer recordId) {
		super();
		this.operationName = operationName;
		this.recordId = recordId;
	}
	/**
	 * @return the operationName
	 */
	public OperationNames getOperationName() {
		return operationName;
	}
	/**
	 * @param operationName the operationName to set
	 */
	public void setOperationName(OperationNames operationName) {
		this.operationName = operationName;
	}
	
	/**
	 * @return the operationName
	 */

	/**
	 * @return the recordId
	 */
	public Integer getRecordId() {
		return recordId;
	}
	/**
	 * @param recordId the recordId to set
	 */
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	
	
	
	
}
