package com.dataguise.webservices.beans;

public class HadoopTaskInfoBean {
	
	Integer taskInstanceId;
	Integer jobId;
	String jtIdentifier;
	String jobStartInfo;
	
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}
	
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	
	public Integer getJobId() {
		return jobId;
	}
	
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	
	public String getJobStartInfo() {
		return jobStartInfo;
	}
	
	public void setJobStartInfo(String jobStartInfo) {
		this.jobStartInfo = jobStartInfo;
	}
	
	public String getJtIdentifier() {
		return jtIdentifier;
	}
	
	public void setJtIdentifier(String jtIdentifier) {
		this.jtIdentifier = jtIdentifier;
	}

}
