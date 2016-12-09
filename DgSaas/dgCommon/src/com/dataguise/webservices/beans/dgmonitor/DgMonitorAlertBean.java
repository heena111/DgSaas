package com.dataguise.webservices.beans.dgmonitor;

import java.util.Comparator;

public class DgMonitorAlertBean {
	
	private Integer id;
	
	private String alertPolicyName="";
	
	private String source="";
	
	private String user="";
	
	private String host="";
	
	private String alertMessage="";
	
	private String alertTime;
	
	private Boolean allowed;
	
	private String policyDetailUrl;
	
	private String securityZone;
	
	private String dst;
	 
	private String alertEvent;
	
	private long timeStamp;
	
	private String cmd;
	
	private String alertDetailUrl;
	
	private String sourceStreams;
	
	private String sensitivityType;
	
	private String src;
	
	private Boolean alertFlag;
	
	private String alertStatus;
	
	private String key;
	private String bucketOwner;
	private String bucket;
	private String httpStatus;
	private String userID;
	
	private String sourceType;
	
	
	
	
	
	
	public String getAlertStatus() {
		return alertStatus;
	}

	public void setAlertStatus(String alertStatus) {
		this.alertStatus = alertStatus;
	}

	public Boolean getAlertFlag() {
		return alertFlag;
	}

	public void setAlertFlag(Boolean alertFlag) {
		this.alertFlag = alertFlag;
	}

	public Boolean getAllowed() {
		return allowed;
	}

	public void setAllowed(Boolean allowed) {
		this.allowed = allowed;
	}

	public String getPolicyDetailUrl() {
		return policyDetailUrl;
	}

	public void setPolicyDetailUrl(String policyDetailUrl) {
		this.policyDetailUrl = policyDetailUrl;
	}

	public String getSecurityZone() {
		return securityZone;
	}

	public void setSecurityZone(String securityZone) {
		this.securityZone = securityZone;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public String getAlertEvent() {
		return alertEvent;
	}

	public void setAlertEvent(String alertEvent) {
		this.alertEvent = alertEvent;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getAlertDetailUrl() {
		return alertDetailUrl;
	}

	public void setAlertDetailUrl(String alertDetailUrl) {
		this.alertDetailUrl = alertDetailUrl;
	}

	public String getSourceStreams() {
		return sourceStreams;
	}

	public void setSourceStreams(String sourceStreams) {
		this.sourceStreams = sourceStreams;
	}

	public String getSensitivityType() {
		return sensitivityType;
	}

	public void setSensitivityType(String senstivityType) {
		this.sensitivityType = senstivityType;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getAlertPolicyName() {
		return alertPolicyName;
	}

	public void setAlertPolicyName(String alertPolicyName) {
		this.alertPolicyName = alertPolicyName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlertMessage() {
		return alertMessage;
	}

	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}

	public String getAlertTime() {
		return alertTime;
	}

	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
	}

	
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	

	public String getBucketOwner() {
		return bucketOwner;
	}

	public void setBucketOwner(String bucketOwner) {
		this.bucketOwner = bucketOwner;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}

	

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}



	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}



	public static Comparator<DgMonitorAlertBean> SORT_BY_ID = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getId().compareTo(other.getId());
	      }
	};
	public static Comparator<DgMonitorAlertBean> SORT_BY_ID_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getId().compareTo(one.getId());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_ALERT_POLICYNAME = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getAlertPolicyName().compareTo(other.getAlertPolicyName());
	      }
	};
	public static Comparator<DgMonitorAlertBean> SORT_BY_ALERT_POLICYNAME_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getAlertPolicyName().compareTo(one.getAlertPolicyName());
	      }
	};
	
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_SOURCE = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getSource().compareTo(other.getSource());
	      }
	};
	public static Comparator<DgMonitorAlertBean> SORT_BY_SOURCE_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getSource().compareTo(one.getSource());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_USER= new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getUser().compareTo(other.getUser());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_USER_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getUser().compareTo(one.getUser());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_HOST= new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getHost().compareTo(other.getHost());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_HOST_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getHost().compareTo(one.getHost());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_ALERTMESSAGE= new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getAlertMessage().compareTo(other.getAlertMessage());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_ALERTMESSAGE_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getAlertMessage().compareTo(one.getAlertMessage());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_ALERTTIME= new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return one.getAlertTime().compareTo(other.getAlertTime());
	      }
	};
	
	public static Comparator<DgMonitorAlertBean> SORT_BY_ALERTTIME_DESC = new Comparator<DgMonitorAlertBean>() {
	      public int compare(DgMonitorAlertBean one, DgMonitorAlertBean other) {
	          return other.getAlertTime().compareTo(one.getAlertTime());
	      }
	};
	

}
