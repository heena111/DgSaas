package com.dataguise.webservices.beans;

import java.util.List;

public class DgDecryptUsersAclBean {
	
	String userName;
	String regexIds;
	List<DayTimeBean> dayTimeRange;
	String decryptionMethod;
	String domain;
	List<String> sourceIpAddressRange;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRegexIds() {
		return regexIds;
	}
	public void setRegexIds(String regexIds) {
		this.regexIds = regexIds;
	}
	public List<DayTimeBean> getDayTimeRange() {
		return dayTimeRange;
	}
	public void setDayTimeRange(List<DayTimeBean> dayTimeRange) {
		this.dayTimeRange = dayTimeRange;
	}
	public String getDecryptionMethod() {
		return decryptionMethod;
	}
	public void setDecryptionMethod(String decryptionMethod) {
		this.decryptionMethod = decryptionMethod;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public List<String> getSourceIpAddressRange() {
		return sourceIpAddressRange;
	}
	public void setSourceIpAddressRange(List<String> sourceIpAddressRange) {
		this.sourceIpAddressRange = sourceIpAddressRange;
	}
	
}
	
	