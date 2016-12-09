package com.dataguise.webservices.beans;

/**
 * @author Rahul
 * This is a POJO class to carry Template Info of Masker Tasks.
 */
public class DgMaskerTemplateInfo {
	
	private Integer templateId;
	private String templateName;
	private String templateDescription;
	private String createdBy;
	private String createdOn;
	private String connectionType;
	private String connectionId;
	private String lastUpdatedTime;
	
	
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	public String getTemplateDescription() {
		return templateDescription;
	}
	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	
	
}
