package com.dataguise.webservices.beans.plugin;

import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;
import com.dataguise.webservices.beans.DgBaseBean;

public class DgPluginFileTask extends DgBaseBean{

		protected Integer Id;
		@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="Policy Ids:"+BeanValidator.INVALID_CHARACTER_SET)
	    protected String policyIds;
	    @NotEmpty(message="Config Name:"+BeanValidator.EMPTY_FIELD)
	    @Size(max=128,message="Config Name:"+BeanValidator.MAX_SIZE_128)
	    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="Config Name:"+BeanValidator.INVALID_CHARACTER_SET)
	    protected String name;
	    protected Date  last_updated_time;
	    @NotEmpty(message="Config Type:"+BeanValidator.EMPTY_FIELD)
	    protected String taskType;
	    protected Integer clusterId;
    
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getPolicyIds() {
		return policyIds;
	}
	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
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
	public void setLast_updated_time(Date last_updated_time) {
		this.last_updated_time = last_updated_time;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
    
    
}
