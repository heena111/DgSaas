package com.dataguise.webservices.beans.masker;

import java.util.List;

import com.dataguise.webservices.beans.DgTemplateDatabaseInfoStruct;


public class DgVerifyMaskerTemplateStruct {
	
	private Integer templateId;
	private Integer connId;
	private List<DgTemplateDatabaseInfoStruct> databaseInfo;
	private List<DgTemplateDatabaseInfoStruct> linkedColInfo;

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	
	public List<DgTemplateDatabaseInfoStruct> getDatabaseInfo() {
		return databaseInfo;
	}
	
	public void setDatabaseInfo(List<DgTemplateDatabaseInfoStruct> databaseInfo) {
		this.databaseInfo = databaseInfo;
	}

	public List<DgTemplateDatabaseInfoStruct> getLinkedColInfo() {
		return linkedColInfo;
	}

	public void setLinkedColInfo(List<DgTemplateDatabaseInfoStruct> linkedColInfo) {
		this.linkedColInfo = linkedColInfo;
	}

	public Integer getConnId() {
		return connId;
	}

	public void setConnId(Integer connId) {
		this.connId = connId;
	}
	

}
