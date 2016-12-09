package com.dataguise.webservices.beans;

import java.util.List;

public class DayTimeBean {

	private String  dayName;
	private List<String> timeRange;
	
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public List<String> getTimeRange() {
		return timeRange;
	}
	public void setTimeRange(List<String> timeRange) {
		this.timeRange = timeRange;
	}
}
