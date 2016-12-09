package com.dataguise.webservices.beans.hadoop;

import java.util.List;

public class SensitiveFileInfo {
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public List<SensitiveBytesRange> getSensitiveBytes() {
		return sensitiveBytes;
	}
	public void setSensitiveBytes(List<SensitiveBytesRange> sensitiveBytes) {
		this.sensitiveBytes = sensitiveBytes;
	}
	String filePath;
	List<SensitiveBytesRange> sensitiveBytes;
}
