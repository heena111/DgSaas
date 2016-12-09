package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DiscoveryFileStatus {

	public DiscoveryFileStatus(Integer directoriesScanned,
			Integer filesScanned, Integer filesWithSensitiveData,
			String status, Integer taskInstanceId, Integer totalDirectories,
			Integer totalFiles) {
		
		this.directoriesScanned = directoriesScanned;
		this.filesScanned = filesScanned;
		this.filesWithSensitiveData = filesWithSensitiveData;
		this.status = status;
		this.taskInstanceId = taskInstanceId;
		this.totalDirectories = totalDirectories;
		this.totalFiles = totalFiles;
	}

	public DiscoveryFileStatus() {
		
	}

	public Integer directoriesScanned = 0;
	public Integer filesScanned = 0;
	public Integer filesWithSensitiveData = 0;
	protected String status;
	protected Integer taskInstanceId = 0;
	protected Integer totalDirectories = 0;
	protected Integer totalFiles = 0;

	public Integer getDirectoriesScanned() {
		return directoriesScanned;
	}

	public void setDirectoriesScanned(Integer directoriesScanned) {
		this.directoriesScanned = directoriesScanned;
	}

	public Integer getFilesScanned() {
		return filesScanned;
	}

	public void setFilesScanned(Integer filesScanned) {
		this.filesScanned = filesScanned;
	}
	public Integer getFilesWithSensitiveData() {
		return filesWithSensitiveData;
	}

	public void setFilesWithSensitiveData(Integer filesWithSensitiveData) {
		this.filesWithSensitiveData = filesWithSensitiveData;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public Integer getTotalDirectories() {
		return totalDirectories;
	}

	public void setTotalDirectories(Integer totalDirectories) {
		this.totalDirectories = totalDirectories;
	}

	public Integer getTotalFiles() {
		return totalFiles;
	}

	public void setTotalFiles(Integer totalFiles) {
		this.totalFiles = totalFiles;
	}

}
