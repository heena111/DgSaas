package com.dataguise.webservices.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * A class containing initial metadata i.e scan location and its file tree information.
 * @author dataguise
 *
 */
public class DgFilesInitialMetaData {

	private ScanLocation scanLocation;
	private List<String> fileTree;
	private String basePath;
	
	
	public ScanLocation getScanLocation() {
		return scanLocation;
	}
	public void setScanLocation(ScanLocation scanLocation) {
		this.scanLocation = scanLocation;
	}
	public List<String> getFileTree() {
		if(fileTree == null)
			fileTree = new ArrayList<String>();
		return fileTree;
	}
	public void setFileTree(List<String> fileTree) {
		this.fileTree = fileTree;
	}
	 
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	
	

}
