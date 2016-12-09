package com.dataguise.webservices.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.dataguise.webservices.structures.DgFilesInitialMetaData;
import com.dataguise.webservices.structures.Wrapper;

@XmlRootElement
public class DgFilesResumeInfo {

	private Wrapper wrapper;
	private DgFilesMetadata fileMetaData;
	private DiscoveryFileStatus discoveryFileStatus;
	private List<DgFilesInitialMetaData> dgFilesInitialMetaDataList;

	public DgFilesResumeInfo() {
		super();
	}

	public Wrapper getWrapper() {
		return wrapper;
	}

	public void setWrapper(Wrapper wrapper) {
		this.wrapper = wrapper;
	}

	public DgFilesMetadata getFileMetaData() {
		return fileMetaData;
	}

	public void setFileMetaData(DgFilesMetadata fileMetaData) {
		this.fileMetaData = fileMetaData;
	}

	public DiscoveryFileStatus getDiscoveryFileStatus() {
		return discoveryFileStatus;
	}

	public void setDiscoveryFileStatus(DiscoveryFileStatus discoveryFileStatus) {
		this.discoveryFileStatus = discoveryFileStatus;
	}

	public List<DgFilesInitialMetaData> getDgFilesInitialMetaDataList() {
		return dgFilesInitialMetaDataList;
	}

	public void setDgFilesInitialMetaDataList(
			List<DgFilesInitialMetaData> dgFilesInitialMetaDataList) {
		this.dgFilesInitialMetaDataList = dgFilesInitialMetaDataList;
	}

}
