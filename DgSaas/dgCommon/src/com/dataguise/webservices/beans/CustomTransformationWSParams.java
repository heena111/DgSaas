package com.dataguise.webservices.beans;

public class CustomTransformationWSParams {
	
	private Integer Id;
	private String pName;
	private String pValue;
	private String pType;
	private String pFormat;
	private Integer pOrder;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpValue() {
		return pValue;
	}
	public void setpValue(String pValue) {
		this.pValue = pValue;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpFormat() {
		return pFormat;
	}
	public void setpFormat(String pFormat) {
		this.pFormat = pFormat;
	}
	public Integer getpOrder() {
		return pOrder;
	}
	public void setpOrder(Integer pOrder) {
		this.pOrder = pOrder;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getId() {
		return Id;
	}
	
}
