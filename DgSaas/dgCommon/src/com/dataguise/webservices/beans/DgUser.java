package com.dataguise.webservices.beans;

import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;


public class DgUser {
	private Integer userId=-1;
	private boolean active;
	@NotEmpty(message="User Name:"+BeanValidator.EMPTY_FIELD)
	@Size(max=100, message="User Name:"+BeanValidator.MAX_SIZE +"100")
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="User Name:"+BeanValidator.INVALID_CHARACTER_SET)
	private String userName;
	@Size(max=100, message="Last Name:"+BeanValidator.MAX_SIZE +"100")
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Last Name:"+BeanValidator.INVALID_CHARACTER_SET)
	private String lastName;
	@Size(max=100, message="First Name:"+BeanValidator.MAX_SIZE +"100")
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="First Name:"+BeanValidator.INVALID_CHARACTER_SET)
	private String firstName;
	@NotEmpty(message="Email ID:"+BeanValidator.EMPTY_FIELD)
	@Size(max=200, message="Email ID:"+BeanValidator.MAX_SIZE +"200")
	@Pattern (regexp=BeanValidator.EMAIL_ADDRESS_REGEX, message="Email ID:"+BeanValidator.INVALID_EMAIL_ADDRESS)
	private String emailAddress;
	@Size(max=500, message="Other Info:"+BeanValidator.MAX_SIZE +"500")
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="Other Info:"+BeanValidator.INVALID_CHARACTER_SET)
	private String otherInfo;
	@Pattern (regexp=BeanValidator.GENERIC_TEXT_REGEX, message="DN String:"+BeanValidator.INVALID_CHARACTER_SET)
	private String dnString;
	private Integer roleId;
	private Integer domainId;


	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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

	public String getDnString() {
		return dnString;
	}

	public void setDnString(String dnString) {
		this.dnString = dnString;
	}
	public void setDomainId(Integer domainId) {
		this.domainId = domainId;
	}

	public Integer getDomainId() {
		return domainId;
	}
}
