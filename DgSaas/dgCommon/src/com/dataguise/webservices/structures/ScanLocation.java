package com.dataguise.webservices.structures;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ScanLocation {

	public ScanLocation() {

	}

	public ScanLocation(String password, String uncPath, String userName) {
		super();
		this.password = password;
		this.uncPath = uncPath;
		this.userName = userName;
	}

	protected String password;

	protected String uncPath;

	protected String userName;

	protected String branchPoint;
	
	protected String directory;
	
	protected String destinationDirectory;
	
	protected String destUserName;
	
	protected String destPassword;
	
	protected Integer scanPathId;	
	
	protected String ipAddr;
	protected Long inetIp;
	
	protected Integer connectionId;
	
	
	


	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Long getInetIp() {
		return inetIp;
	}

	public void setInetIp(Long inetIp) {
		this.inetIp = inetIp;
	}

	public String getDestUserName() {
		return destUserName;
	}

	public void setDestUserName(String destUserName) {
		this.destUserName = destUserName;
	}

	public String getDestPassword() {
		return destPassword;
	}

	public void setDestPassword(String destPassword) {
		this.destPassword = destPassword;
	}

	public String getPassword() {
		return password;
	}

	public String getBranchPoint() {
		return branchPoint;
	}

	public void setBranchPoint(String branchPoint) {
		this.branchPoint = branchPoint;
	}

	

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getDestinationDirectory() {
		return destinationDirectory;
	}

	public void setDestinationDirectory(String destinationDirectory) {
		this.destinationDirectory = destinationDirectory;
	}

	

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUncPath() {
		return uncPath;
	}

	public void setUncPath(String uncPath) {
		this.uncPath = uncPath;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public Integer getScanPathId() {
		return scanPathId;
	}

	public void setScanPathId(Integer scanPathId) {
		this.scanPathId = scanPathId;
	}
		
	
	

	
	public Integer getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}

	public static Comparator<ScanLocation> SORT_BY_CONN_ID=new Comparator<ScanLocation>() {
		@Override
		public int compare(ScanLocation s1, ScanLocation s2) {
			// TODO Auto-generated method stub
			return s1.scanPathId.compareTo(s2.scanPathId);
		}
	};

}



