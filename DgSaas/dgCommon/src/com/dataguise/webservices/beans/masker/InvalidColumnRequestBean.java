package com.dataguise.webservices.beans.masker;

import java.util.List;

import com.dataguise.webservices.beans.DgColumnDetails;
import com.dataguise.webservices.beans.DgConnection;

public class InvalidColumnRequestBean {
	
	private List<DgColumnDetails>  columInfo;
	public List<DgColumnDetails> getColumInfo() {
		return columInfo;
	}
	public void setColumInfo(List<DgColumnDetails> columInfo) {
		this.columInfo = columInfo;
	}
	public DgConnection getConn() {
		return conn;
	}
	public void setConn(DgConnection conn) {
		this.conn = conn;
	}
	private DgConnection conn;

}
