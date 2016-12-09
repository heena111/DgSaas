package com.dataguise.webservices.beans;

public class DgHDFSTaskInstanceResults {	
	
	
	 Integer taskInstanceId;
	 String taskName;
	 String filePath;
	 String complainceGroup;
	 String regexGroup;
	 String regexName;
	 String regexCount; 
	 Boolean masking;
	 Boolean encryption;
	 Boolean incremental;
	 Long totalRecords;
	 String startTime;
	 String fileStatus;
	String failReason;
	String contentRead;
	String fileType;
	String discoverType;
	String taskType;
	 
	 
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getComplainceGroup() {
		return complainceGroup;
	}
	public void setComplainceGroup(String complainceGroup) {
		this.complainceGroup = complainceGroup;
	}
	public String getRegexGroup() {
		return regexGroup;
	}
	public void setRegexGroup(String regexGroup) {
		this.regexGroup = regexGroup;
	}
	public String getRegexName() {
		return regexName;
	}
	public void setRegexName(String regexName) {
		this.regexName = regexName;
	}
	
	public String getRegexCount() {
		return regexCount;
	}
	public void setRegexCount(String regexCount) {
		this.regexCount = regexCount;
	}
	public Boolean getMasking() {
		return masking;
	}
	public void setMasking(Boolean masking) {
		this.masking = masking;
	}
	public Boolean getEncryption() {
		return encryption;
	}
	public void setEncryption(Boolean encryption) {
		this.encryption = encryption;
	}
	public Boolean getIncremental() {
		return incremental;
	}
	public void setIncremental(Boolean incremental) {
		this.incremental = incremental;
	}
	
	 public Long getTotalRecords() {
			return totalRecords;
		}
		public void setTotalRecords(Long totalRecords) {
			this.totalRecords = totalRecords;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getFileStatus() {
			return fileStatus;
		}
		public void setFileStatus(String fileStatus) {
			this.fileStatus = fileStatus;
		}
		public String getFailReason() {
			return failReason;
		}
		public void setFailReason(String failReason) {
			this.failReason = failReason;
		}
		public String getContentRead() {
			return contentRead;
		}
		public void setContentRead(String contentRead) {
			this.contentRead = contentRead;
		}
		public String getFileType() {
			return fileType;
		}
		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
		public String getDiscoverType() {
			return discoverType;
		}
		public void setDiscoverType(String discoverType) {
			this.discoverType = discoverType;
		}
		
		 
	
	
	 
}
