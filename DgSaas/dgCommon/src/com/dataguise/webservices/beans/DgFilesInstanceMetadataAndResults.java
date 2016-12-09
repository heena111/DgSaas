package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

import com.dataguise.webservices.structures.DgFilesInitialMetaData;

/**
 * A class containing information like initial metadata, running state metadata , results , status of a task instance.
 * @author dataguise
 *
 */
public class DgFilesInstanceMetadataAndResults {

	private Integer taskInstanceId;
	private List<DiscoveryFileResults> discoveryFileResults;
	private DiscoveryFileStatus discoveryFileStatus;
	private String state = "Running";
	private DgFilesMetadata fileMetaData;
	private List<DgFilesInitialMetaData> dgFilesInitialMetadata;
	private List<DiscoverySkippedFile> discoverySkippedFiles;

	public List<DiscoveryFileResults> getDiscoveryFileResults() {
		if (discoveryFileResults == null)
			discoveryFileResults = new ArrayList<DiscoveryFileResults>();
		return discoveryFileResults;
	}

	public void setDiscoveryFileResults(
			List<DiscoveryFileResults> discoveryFileResults) {
		this.discoveryFileResults = discoveryFileResults;
	}

	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;

	}

	public DgFilesMetadata getFileMetaData() {
		return fileMetaData;
	}

	public void setFileMetaData(DgFilesMetadata fileMetaData) {
		this.fileMetaData = fileMetaData;
	}

	public void setDiscoveryFileStatus(DiscoveryFileStatus discoveryFileStatus) {
		this.discoveryFileStatus = discoveryFileStatus;
	}

	public DiscoveryFileStatus getDiscoveryFileStatus() {
		return discoveryFileStatus;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<DgFilesInitialMetaData> getDgFilesInitialMetadata() {
		return dgFilesInitialMetadata;
	}

	public void setDgFilesInitialMetadata(
			List<DgFilesInitialMetaData> dgFilesInitialMetadata) {
		this.dgFilesInitialMetadata = dgFilesInitialMetadata;
	}

	public void setDiscoverySkippedFiles(List<DiscoverySkippedFile> discoverySkippedFiles) {
		this.discoverySkippedFiles = discoverySkippedFiles;
	}

	public List<DiscoverySkippedFile> getDiscoverySkippedFiles() {
		if (discoverySkippedFiles == null)
			discoverySkippedFiles = new ArrayList<DiscoverySkippedFile>();
		return discoverySkippedFiles;
	}



}
