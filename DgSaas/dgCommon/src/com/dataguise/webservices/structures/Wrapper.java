package com.dataguise.webservices.structures;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wrapper {
	private DgDiscoverFileTaskParameters dgDiscFileParam;
	private ArrayOfScanLocation arrayarrScanLoc;
	private ArrayOfstring arrTaskFIlter;
	private ArrayOfDgExpressionWithMasking arrExpression;
	private String controllerUrl;
	
	
	public Wrapper()// JAXB needs this
	{
		}
	
	
	public Wrapper(DgDiscoverFileTaskParameters dgDiscFileParam,
			ArrayOfScanLocation arrayarrScanLoc,
			ArrayOfstring arrTaskFIlter,
			ArrayOfDgExpressionWithMasking arrExpression) {
		
		this.dgDiscFileParam = dgDiscFileParam;
		this.arrayarrScanLoc = arrayarrScanLoc;
		this.arrTaskFIlter = arrTaskFIlter;
		this.arrExpression = arrExpression;
	}
	
	
	public DgDiscoverFileTaskParameters getDgDiscFileParam() {
		return dgDiscFileParam;
	}
	public void setDgDiscFileParam(DgDiscoverFileTaskParameters dgDiscFileParam) {
		this.dgDiscFileParam = dgDiscFileParam;
	}
	public ArrayOfScanLocation getArrayarrScanLoc() {
		return arrayarrScanLoc;
	}
	public void setArrayarrScanLoc(ArrayOfScanLocation arrayarrScanLoc) {
		this.arrayarrScanLoc = arrayarrScanLoc;
	}
	public ArrayOfstring getArrTaskFIlter() {
		return arrTaskFIlter;
	}
	public void setArrTaskFIlter(ArrayOfstring arrTaskFIlter) {
		this.arrTaskFIlter = arrTaskFIlter;
	}
	public ArrayOfDgExpressionWithMasking getArrExpression() {
		return arrExpression;
	}
	public void setArrExpression(ArrayOfDgExpressionWithMasking arrExpression) {
		this.arrExpression = arrExpression;
	}

	public String getControllerUrl() {
		return controllerUrl;
	}
	public void setControllerUrl(String controllerUrl) {
		this.controllerUrl = controllerUrl;
	}
	
	
	
}
