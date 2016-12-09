package com.dataguise.webservices.structures;

import java.sql.Timestamp;

import javax.validation.constraints.Pattern;

import com.dataguise.util.BeanValidator;

public class DgPreferenceStruct {

	private String prefName;
	private Integer prefId;
	private Boolean isEnable;
	private Integer paramId;
	private Integer valueId;
	private String prefParamName;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	private String prefParamValue;
	private Timestamp creates;
	private Timestamp updates;
	
	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public Integer getPrefId() {
		return prefId;
	}

	public void setPrefId(Integer prefId) {
		this.prefId = prefId;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	public Integer getParamId() {
		return paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public Integer getValueId() {
		return valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	public String getPrefParamName() {
		return prefParamName;
	}

	public void setPrefParamName(String prefParamName) {
		this.prefParamName = prefParamName;
	}

	public String getPrefParamValue() {
		return prefParamValue;
	}

	public void setPrefParamValue(String prefParamValue) {
		this.prefParamValue = prefParamValue;
	}

	public Timestamp getCreates() {
		return creates;
	}

	public void setCreates(Timestamp creates) {
		this.creates = creates;
	}

	public Timestamp getUpdates() {
		return updates;
	}

	public void setUpdates(Timestamp updates) {
		this.updates = updates;
	}


	
	/*public Map<String, String> getPrefParamNameValueMap() {
		return prefParamNameValueMap;
	}

	public void setPrefParamNameValueMap(Map<String, String> prefParamNameValueMap) {
		this.prefParamNameValueMap = prefParamNameValueMap;
	}*/
		
}
