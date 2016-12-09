package com.dataguise.webservices.beans;



public class DiscoverySkippedFile {
	private int taskInstDtId;
	private String fileName;
	private String filePath;
	private String cause;
	
	public DiscoverySkippedFile(Integer taskInstanceId, String fileName,
			String filePath, String cause) {
		this.taskInstDtId =taskInstanceId;
		this.fileName = fileName;
		this.filePath = filePath;
		this.cause = cause;
	}
	public DiscoverySkippedFile() {
		// TODO Auto-generated constructor stub
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setTaskInstDtId(int taskInstDtId) {
		this.taskInstDtId = taskInstDtId;
	}
	public int getTaskInstDtId() {
		return taskInstDtId;
	}
}
