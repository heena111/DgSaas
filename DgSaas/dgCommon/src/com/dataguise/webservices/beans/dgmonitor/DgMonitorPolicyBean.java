package com.dataguise.webservices.beans.dgmonitor;

import java.util.Comparator;
import java.util.List;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class DgMonitorPolicyBean {
	private List<DgmOperValBean> user;
	private List<DgmOperValBean> cmd;
	private List<DgmOperValBean> sensitiveDataType;
	private List<DgmOperValBean> dst;
	private List<DgmOperValBean> src;
	private List<DgmOperValBean> host;
	private List<DgmOperValBean> securityZone;
	private List<DgmOperValBean> timeStamp;
	private Integer id=0;
	private Integer siteId;
	private String siteName;
	@NotEmpty(message="Alert Rule:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Alert Rule:"+BeanValidator.INVALID_CHARACTER_SET)
	private String policyName;
	@NotEmpty(message="Description:"+BeanValidator.EMPTY_FIELD)
	private String description;
	private Boolean enabled;
	private Boolean allowed;
	private String createts;
	private String updatets;
	private Integer deDuplicationTime;
    private Long flagCount;
    private String notificationDescription;
    private String type="";
    private String applicaiton;
	private String alertExecutorId ;
    private String policyType ;
    @Pattern(regexp=BeanValidator.EMAIL_ADDRESS_REGEX , message="Email:"+BeanValidator.INVALID_EMAIL_ADDRESS)
    private String sender = "";
    @Pattern(regexp=BeanValidator.EMAIL_ADDRESS_REGEX , message="Email:"+BeanValidator.INVALID_EMAIL_ADDRESS)
    private String recipients = "";
    private String subject = "";
    private String compliancePolicyName;
    private Integer compPolicyId;
    private Boolean deDuplication;
    private List<DgmOperValBean> bucketOwner;
    private List<DgmOperValBean> bucket;
    private List<DgmOperValBean> userId;
    private List<DgmOperValBean> httpStatus;
    private List<DgmOperValBean> key;
    private String source;
    private String sourceType;
    private String dbmsType;
    
	
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<DgmOperValBean> getUser() {
		return user;
	}
	public void setUser(List<DgmOperValBean> user) {
		this.user = user;
	}
	public List<DgmOperValBean> getCmd() {
		return cmd;
	}
	public void setCmd(List<DgmOperValBean> cmd) {
		this.cmd = cmd;
	}
	public List<DgmOperValBean> getSensitiveDataType() {
		return sensitiveDataType;
	}
	public void setSensitiveDataType(List<DgmOperValBean> sensitiveDataType) {
		this.sensitiveDataType = sensitiveDataType;
	}
	public List<DgmOperValBean> getDst() {
		return dst;
	}
	public void setDst(List<DgmOperValBean> dst) {
		this.dst = dst;
	}
	public List<DgmOperValBean> getSrc() {
		return src;
	}
	public void setSrc(List<DgmOperValBean> src) {
		this.src = src;
	}
	public List<DgmOperValBean> getHost() {
		return host;
	}
	public void setHost(List<DgmOperValBean> host) {
		this.host = host;
	}
	public List<DgmOperValBean> getSecurityZone() {
		return securityZone;
	}
	public void setSecurityZone(List<DgmOperValBean> securityZone) {
		this.securityZone = securityZone;
	}
	public List<DgmOperValBean> getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(List<DgmOperValBean> timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Boolean getAllowed() {
		return allowed;
	}
	public void setAllowed(Boolean allowed) {
		this.allowed = allowed;
	}
	public String getCreatets() {
		return createts;
	}
	public void setCreatets(String createts) {
		this.createts = createts;
	}
	public String getUpdatets() {
		return updatets;
	}
	public void setUpdatets(String updatets) {
		this.updatets = updatets;
	}
	public Integer getDeDuplicationTime() {
		return deDuplicationTime;
	}
	public void setDeDuplicationTime(Integer deDuplicationTime) {
		this.deDuplicationTime = deDuplicationTime;
	}
	public Long getFlagCount() {
		return flagCount;
	}
	public void setFlagCount(Long flagCount) {
		this.flagCount = flagCount;
	}
	public String getNotificationDescription() {
		return notificationDescription;
	}
	public void setNotificationDescription(String notificationDescription) {
		this.notificationDescription = notificationDescription;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApplicaiton() {
			return applicaiton;
	}
	public void setApplicaiton(String applicaiton) {
			this.applicaiton = applicaiton;
	}
	public String getAlertExecutorId() {
		return alertExecutorId;
	}
	public void setAlertExecutorId(String alertExecutorId) {
		this.alertExecutorId = alertExecutorId;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCompliancePolicyName() {
		return compliancePolicyName;
	}
	public void setCompliancePolicyName(String compliancePolicyName) {
		this.compliancePolicyName = compliancePolicyName;
	}
	public Integer getCompPolicyId() {
		return compPolicyId;
	}
	public void setCompPolicyId(Integer compPolicyId) {
		this.compPolicyId = compPolicyId;
	}
	public Boolean getDeDuplication() {
		return deDuplication;
	}
	public void setDeDuplication(Boolean deDuplication) {
		this.deDuplication = deDuplication;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}



   
	
	
	





	public List<DgmOperValBean> getBucketOwner() {
		return bucketOwner;
	}
	public void setBucketOwner(List<DgmOperValBean> bucketOwner) {
		this.bucketOwner = bucketOwner;
	}
	public List<DgmOperValBean> getBucket() {
		return bucket;
	}
	public void setBucket(List<DgmOperValBean> bucket) {
		this.bucket = bucket;
	}
	
	public List<DgmOperValBean> getUserId() {
		return userId;
	}
	public void setUserId(List<DgmOperValBean> userId) {
		this.userId = userId;
	}
	public List<DgmOperValBean> getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(List<DgmOperValBean> httpStatus) {
		this.httpStatus = httpStatus;
	}
	




	public List<DgmOperValBean> getKey() {
		return key;
	}
	public void setKey(List<DgmOperValBean> key) {
		this.key = key;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}






	public static Comparator<DgMonitorPolicyBean> SORT_BY_ID = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return one.getId().compareTo(other.getId());
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_ID_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return other.getId().compareTo(one.getId());
	      }
	};
	
	
	public static Comparator<DgMonitorPolicyBean> SORT_BY_POLICYNAME = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return one.getPolicyName().compareTo(other.getPolicyName());
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_POLICYNAME_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return other.getPolicyName().compareTo(one.getPolicyName());
	      }
	};
	
	public static Comparator<DgMonitorPolicyBean> SORT_BY_POLICYTYPE = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return one.getPolicyType().compareTo(other.getPolicyType());
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_POLICYTYPE_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return other.getPolicyType().compareTo(one.getPolicyType());
	      }
	};
	
	public static Comparator<DgMonitorPolicyBean> SORT_BY_DESCRIPTION = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return one.getDescription().compareTo(other.getDescription());
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_DESCRIPTION_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return other.getDescription().compareTo(one.getDescription());
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_ALLOWED = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	    	  return Boolean.valueOf(one.getAllowed()).compareTo(Boolean.valueOf(other.getAllowed()));
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_ALLOWED_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	    	  return Boolean.valueOf(other.getAllowed()).compareTo(Boolean.valueOf(one.getAllowed()));
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_STATUS = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return Boolean.valueOf(one.getEnabled()).compareTo(Boolean.valueOf(other.getEnabled()));
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_STATUS_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	    	  return Boolean.valueOf(other.getEnabled()).compareTo(Boolean.valueOf(one.getEnabled()));
	      }
	};
	
	
	public static Comparator<DgMonitorPolicyBean> SORT_BY_CREATETS = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	    	  return one.getId().compareTo(other.getId());
	    	  
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_CREATETS_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	    	  
	          return other.getId().compareTo(one.getId());
	      }
	      
	      
	};
	
	public static Comparator<DgMonitorPolicyBean> SORT_BY_SOURCE = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	          return one.getSiteName().compareTo(other.getSiteName());
	      }
	};
	public static Comparator<DgMonitorPolicyBean> SORT_BY_SOURCE_DESC = new Comparator<DgMonitorPolicyBean>() {
	      public int compare(DgMonitorPolicyBean one, DgMonitorPolicyBean other) {
	    	  return other.getSiteName().compareTo(one.getSiteName());
	      }
	};


	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getDbmsType() {
		return dbmsType;
	}
	public void setDbmsType(String dbmsType) {
		this.dbmsType = dbmsType;
	}

}
