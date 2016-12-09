package com.dataguise.webservices.beans.hadoop;


public class SensitiveBytesRange {
	private Long startByte;
	private Long endByte;
	MaskingType maskingType;
	
	public MaskingType getMaskingType() {
		return maskingType;
	}

	public void setMaskingType(MaskingType maskingType) {
		this.maskingType = maskingType;
	}

	public SensitiveBytesRange(){
		super();
	}
	
	public SensitiveBytesRange(Long startByte, Long endByte){
		this.setStartByte(startByte);
		this.setEndByte(endByte);
	}
	
	public SensitiveBytesRange(Long startByte, Long endByte, MaskingType m){
		this.setStartByte(startByte);
		this.setEndByte(endByte);
		this.maskingType = m;
	}

	public void setStartByte(Long startByte) {
		this.startByte = startByte;
	}

	public Long getStartByte() {
		return startByte;
	}

	public void setEndByte(Long endByte) {
		this.endByte = endByte;
	}

	public Long getEndByte() {
		return endByte;
	}
}
