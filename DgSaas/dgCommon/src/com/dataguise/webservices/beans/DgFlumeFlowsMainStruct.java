package com.dataguise.webservices.beans;

import javax.validation.Valid;

public class DgFlumeFlowsMainStruct {


	private byte[] file;
	@Valid
	private DgFlumeFlowsStruct flowsStruct;
	private String filePath ;
	private String inFileName;
	public String getInFileName() {
		return inFileName;
	}
	public void setInFileName(String inFileName) {
		this.inFileName = inFileName;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	public DgFlumeFlowsStruct getFlowsStruct() {
		return flowsStruct;
	}
	public void setFlowsStruct(DgFlumeFlowsStruct flowsStruct) {
		this.flowsStruct = flowsStruct;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
