package com.dataguise.webservices.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;


public class DgFlumeFlowsStruct extends DgBaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer templateId;
	private Integer structureId;
	@NotEmpty(message="Flow Name"+BeanValidator.EMPTY_FIELD)
    @Size(max=128,message="Flow Name:"+BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="Flow Name:"+BeanValidator.INVALID_CHARACTER_SET)
	private String name;
	@NotEmpty(message="Flow Description"+BeanValidator.EMPTY_FIELD)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX,message="Flow Description:"+BeanValidator.INVALID_CHARACTER_SET)
	private String description;
	private Integer clusterId;
	private Integer flags;


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTemplateId() {

		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStructureId() {
		return structureId;
	}
	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}
	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public Integer getFlags() {
		return flags;
	}
	public void setFlags(Integer flags) {
		this.flags = flags;
	}

 

}
