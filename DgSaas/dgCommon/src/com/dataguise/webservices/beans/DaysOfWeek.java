package com.dataguise.webservices.beans;

public class DaysOfWeek {
	private Integer id;
	private String day;
	private Boolean enable = Boolean.FALSE;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	
}
