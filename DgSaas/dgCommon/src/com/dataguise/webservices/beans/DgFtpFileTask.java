
package com.dataguise.webservices.beans;

import java.util.Date;

public class DgFtpFileTask extends DgBaseBean{
   
		protected Integer Id;
	    protected String policyIds;
	    protected String name;
	    protected Date  last_updated_time;
	    protected String taskType;
    protected Integer clusterId;
   
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	public Date getLast_updated_time() {
			return last_updated_time;
		}
		public void setLast_updated_time(Date lastUpdatedTime) {
			last_updated_time = lastUpdatedTime;
		}
	public String getPolicyIds() {
		return policyIds;
	}
	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	
}
