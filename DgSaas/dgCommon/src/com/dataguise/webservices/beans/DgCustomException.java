package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgCustomException", propOrder = { "faultInfo", "message" })
public class DgCustomException extends Exception{

	protected FaultType faultInfo;
	
	protected String message;
	
	public DgCustomException(String message, FaultType faultInfo){
		super(message);
		this.message	= message;
		this.faultInfo	= faultInfo;
	}

	/**
	 * Gets the value of the faultInfo property.
	 * 
	 * @return possible object is {@link FaultType }
	 * 
	 */
	public FaultType getFaultInfo() {
		return faultInfo;
	}

	/**
	 * Sets the value of the faultInfo property.
	 * 
	 * @param value
	 *            allowed object is {@link FaultType }
	 * 
	 */
	public void setFaultInfo(FaultType value) {
		this.faultInfo = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return super.getMessage();
	}

}
