package com.dataguise.webservices.beans;


public class DgUserInfo {
	  // Fields    
    private Integer userId;
    private boolean active;
    private String userName;
    private String lastName;
    private String firstName;
    private String emailAddress;
    private String otherInfo;
    private long sidId;
    private String createts;
    private String updatets;
    private Integer roleId=0;
    private String roleName;
    private String dnString;
    private  Integer domainId; 
    private String domainName;
   public Integer getUserId() {
       return this.userId;
   }
   
   public void setUserId(Integer userId) {
       this.userId = userId;
   }
   
   public Integer getRoleId() {
       return this.roleId;
   }
   
   public void setRoleId(Integer roleId) {
       this.roleId = roleId;
   } 
  
   public boolean getActive() {
       return this.active;
   }
   
   public void setActive(boolean active) {
       this.active = active;
   }
   
   
 
   public String getUserName() {
       return this.userName;
   }
   
   public void setUserName(String userName) {
       this.userName = userName;
   }
   public String getRoleName() {
       return this.roleName;
   }
   
   public void setRoleName(String roleName) {
       this.roleName = roleName;
   }
   
 
   public String getLastName() {
       return this.lastName;
   }
   
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   
  
   public String getFirstName() {
       return this.firstName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   
   
   public String getEmailAddress() {
       return this.emailAddress;
   }
   
   public void setEmailAddress(String emailAddress) {
       this.emailAddress = emailAddress;
   }
   
 
   public String getOtherInfo() {
       return this.otherInfo;
   }
   
   public void setOtherInfo(String otherInfo) {
       this.otherInfo = otherInfo;
   }
   
  
   public long getSidId() {
       return this.sidId;
   }
   
   public void setSidId(long sidId) {
       this.sidId = sidId;
   }
   
   
   public String getCreatets() {
       return this.createts;
   }
   
   public void setCreatets(String createts) {
       this.createts = createts;
   }
   
  
   public String getUpdatets() {
       return this.updatets;
   }
   
   public void setUpdatets(String updatets) {
       this.updatets = updatets;
   }

public String getDnString() {
	return dnString;
}

public void setDnString(String dnString) {
	this.dnString = dnString;
}
public void setDomainName(String domainName) {
	this.domainName = domainName;
}

public String getDomainName() {
	return domainName;
}

public void setDomainId(Integer domainId) {
	this.domainId = domainId;
}

public Integer getDomainId() {
	return domainId;
}
  


}
