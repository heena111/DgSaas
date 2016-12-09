package com.dataguise.webservices.beans;

public class DgAllNotificationBean  extends  DgBaseBean{
	
	private String requestType;
	private Integer notifyid;	
	private Long periodicity;
	private String notificationtext;
	private String notificationTime;
	private Integer eventTaskId;
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	
	public Long getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(Long periodicity) {
		this.periodicity = periodicity;
	}
	
	public String getNotificationtext() {
		return notificationtext;
	}
	public void setNotificationtext(String notificationtext) {
		this.notificationtext = notificationtext;
	}
	
	
	
	public Integer getNotifyid() {
		return notifyid;
	}
	public void setNotifyid(Integer notifyid) {
		this.notifyid = notifyid;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getNotificationTime() {
		return notificationTime;
	}
	public void setNotificationTime(String notificationTime) {
		this.notificationTime = notificationTime;
	}
	public Integer getEventTaskId() {
		return eventTaskId;
	}
	public void setEventTaskId(Integer eventTaskId) {
		this.eventTaskId = eventTaskId;
	}
	
	
	

}
