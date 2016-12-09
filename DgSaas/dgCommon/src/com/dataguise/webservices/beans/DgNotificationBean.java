package com.dataguise.webservices.beans;

public class DgNotificationBean  extends  DgBaseBean{
	
	private String requestType;
	private Integer id;	
	private Long periodicity;
	private String notificationtext;
	private String sharability;
	private String emails;
	private Boolean active;
	private Integer eventTaskId;
	private Boolean softDeleteCheck;
	private Integer notifyId;
	private String idList;
	
	
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
	
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getSharability() {
		return sharability;
	}
	public void setSharability(String sharability) {
		this.sharability = sharability;
	}
	public Integer getEventTaskId() {
		return eventTaskId;
	}
	public void setEventTaskId(Integer eventTaskId) {
		this.eventTaskId = eventTaskId;
	}
	public Boolean getSoftDeleteCheck() {
		return softDeleteCheck;
	}
	public void setSoftDeleteCheck(Boolean softDeleteCheck) {
		this.softDeleteCheck = softDeleteCheck;
	}
	public Integer getNotifyId() {
		return notifyId;
	}
	public void setNotifyId(Integer notifyId) {
		this.notifyId = notifyId;
	}
	public String getIdList() {
		return idList;
	}
	public void setIdList(String idList) {
		this.idList = idList;
	}
	
	

}
