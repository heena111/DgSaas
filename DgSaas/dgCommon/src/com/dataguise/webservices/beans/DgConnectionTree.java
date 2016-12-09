package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;

public class DgConnectionTree extends DgBaseBean {

	
	@NotEmpty(message = "Connection Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=64 , message = "Connection Name:"+BeanValidator.MAX_SIZE_64)
    @Pattern(regexp=BeanValidator.DBMS_CONNECTION_NAME , message=BeanValidator.INVALID_CONNECTION_NAME)
	protected String text;
	protected List<DgConnectionTree> result = new ArrayList<DgConnectionTree>();
	protected Boolean leaf;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String connectionAgent;
	protected Boolean checked;
	protected Integer connectionId;
	
	public Integer getConnectionId() {
		return connectionId;
	}
	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public List<DgConnectionTree> getResult() {
		return result;
	}
	public void setResult(List<DgConnectionTree> result) {
		this.result = result;
	}
	public Boolean getLeaf() {
		return leaf;
	}
	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}
	public String getConnectionAgent() {
		return connectionAgent;
	}
	public void setConnectionAgent(String connectionAgent) {
		this.connectionAgent = connectionAgent;
	}
}
