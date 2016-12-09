package com.dataguise.webservices.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DiscoveryFileResults {

	public DiscoveryFileResults(String directoryPath,
			Date endTime, String expressionId, String fileName,
			Integer hitCount, Integer index, String hostName, String ipAddress,
			Double percentageProbability, String sampleData,
			Date startTime, Integer taskInstanceId) {

		this.directoryPath = directoryPath;
		this.endTime = endTime;
		this.expressionId = expressionId;
		this.fileName = fileName;
		this.hitCount = hitCount;
		this.index = index;
		this.hostName = hostName;
		this.ipAddress = ipAddress;
		this.percentageProbability = percentageProbability;
		this.sampleData = sampleData;
		this.startTime = startTime;
		this.taskInstanceId = taskInstanceId;
	}

	protected String directoryPath;

	public DiscoveryFileResults() {

	}

	protected Date endTime;

	protected String expressionId;

	protected String fileName;
	protected Integer hitCount;

	protected Integer index;
	protected String hostName;

	protected String ipAddress;
	protected Double percentageProbability;

	protected String sampleData;

	public String getDirectoryPath() {
		return directoryPath;
	}

	public void setDirectoryPath(String directoryPath) {
		this.directoryPath = directoryPath;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExpressionId() {
		return expressionId;
	}

	public void setExpressionId(String expressionId) {
		this.expressionId = expressionId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getHitCount() {
		return hitCount;
	}

	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Double getPercentageProbability() {
		return percentageProbability;
	}

	public void setPercentageProbability(Double percentageProbability) {
		this.percentageProbability = percentageProbability;
	}

	public String getSampleData() {
		return sampleData;
	}

	public void setSampleData(String sampleData) {
		this.sampleData = sampleData;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	protected Date startTime;
	protected Integer taskInstanceId;
}
