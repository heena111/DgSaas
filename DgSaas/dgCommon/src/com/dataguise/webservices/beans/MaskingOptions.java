package com.dataguise.webservices.beans;

import java.util.List;

public class MaskingOptions {

	Integer code;
	String name;
	String C;
	String U;
	String P;
	String S;
	boolean sl;
	List subType;
	String relatedOptions;
	String keepNull;

	public String getKeepNull() {
		return keepNull;
	}

	public void setKeepNull(String keepNull) {
		this.keepNull = keepNull;
	}

	public List getSubType() {
		return subType;
	}

	public void setSubType(List subType) {
		this.subType = subType;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getU() {
		return U;
	}

	public void setU(String u) {
		U = u;
	}

	public String getP() {
		return P;
	}

	public void setP(String p) {
		P = p;
	}

	public String getS() {
		return S;
	}

	public void setS(String s) {
		S = s;
	}

	public String getRelatedOptions() {
		return relatedOptions;
	}

	public void setRelatedOptions(String relatedOptions) {
		this.relatedOptions = relatedOptions;
	}
	
	public boolean getSl() {
		return sl;
	}

	public void setSl(boolean sl) {
		this.sl = sl;
	}

}
