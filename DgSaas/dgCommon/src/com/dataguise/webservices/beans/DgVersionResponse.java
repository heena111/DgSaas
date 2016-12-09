package com.dataguise.webservices.beans;

public class DgVersionResponse {

	private Integer seed;
	private Boolean dbEncrypt;
	private Boolean pwdEncrypt;
	
	public Integer getSeed() {
		return seed;
	}
	public void setSeed(Integer seed) {
		this.seed = seed;
	}
	public Boolean getDbEncrypt() {
		return dbEncrypt;
	}
	public void setDbEncrypt(Boolean dbEncrypt) {
		this.dbEncrypt = dbEncrypt;
	}
	public Boolean getPwdEncrypt() {
		return pwdEncrypt;
	}
	public void setPwdEncrypt(Boolean pwdEncrypt) {
		this.pwdEncrypt = pwdEncrypt;
	}
	
	
}
