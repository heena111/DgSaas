package com.dataguise.webservices.beans;

import java.util.List;


public class DgBowserDirInfoWrapper {
		
		Integer totalCount;
		List<DgBrowserDirInfo> filesList;
		
		public Integer getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
		public List<DgBrowserDirInfo> getFilesList() {
			return filesList;
		}
		public void setFilesList(List<DgBrowserDirInfo> filesList) {
			this.filesList = filesList;
		}
		
		
}
