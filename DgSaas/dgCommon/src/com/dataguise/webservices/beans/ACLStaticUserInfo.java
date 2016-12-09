package com.dataguise.webservices.beans;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class ACLStaticUserInfo {

	@NotEmpty(message = "User Name:"+BeanValidator.EMPTY_FIELD)
	@Size(max=256 , message = "User Name:"+BeanValidator.MAX_SIZE_256)
	private  List<String> userName;
	private Integer clusterId;
	private List<Integer> id; 
	private Timestamp createts;

	
	public List<String> getUserName() {
		return userName;
	}
	public void setUserName(List<String> userName) {
		this.userName = userName;
	}
	public List<Integer> getId() {
		return id;
	}
	public void setId(List<Integer> id) {
		this.id = id;
	}
	
	public Timestamp getCreatets() {
		return createts;
	}
	public void setCreatets(Timestamp createts) {
		this.createts = createts;
	}
	
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	 
}
