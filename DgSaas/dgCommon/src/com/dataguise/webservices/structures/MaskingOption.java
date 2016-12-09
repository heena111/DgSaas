package com.dataguise.webservices.structures;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MaskingOption {

	private Integer Id = 0;
	private String masking_policy;
	private Boolean consistent = false;
	private Boolean f_unique = false;
	private Boolean synchronize_with = false;
	private Boolean persistent = false;
	private String param1;
	private String param2;
	private String param3;
	private String param4;
	private String param5;
	private String param6;
	private String param7;
	private String param8;
	private String param9;
	protected int maskingOption;

	public MaskingOption() {
	
	}

	public int getMaskingOption() {
		return maskingOption;
	}

	public void setMaskingOption(int maskingOption) {
		this.maskingOption = maskingOption;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getMasking_policy() {
		return masking_policy;
	}

	public void setMasking_policy(String maskingPolicy) {
		masking_policy = maskingPolicy;
	}

	public Boolean getConsistent() {
		return consistent;
	}

	public void setConsistent(Boolean consistent) {
		this.consistent = consistent;
	}

	public Boolean getF_unique() {
		return f_unique;
	}

	public void setF_unique(Boolean fUnique) {
		f_unique = fUnique;
	}

	public Boolean getSynchronize_with() {
		return synchronize_with;
	}

	public void setSynchronize_with(Boolean synchronizeWith) {
		synchronize_with = synchronizeWith;
	}

	public Boolean getPersistent() {
		return persistent;
	}

	public void setPersistent(Boolean persistent) {
		this.persistent = persistent;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getParam4() {
		return param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
	}

	public String getParam5() {
		return param5;
	}

	public void setParam5(String param5) {
		this.param5 = param5;
	}

	public String getParam6() {
		return param6;
	}

	public void setParam6(String param6) {
		this.param6 = param6;
	}

	public String getParam7() {
		return param7;
	}

	public void setParam7(String param7) {
		this.param7 = param7;
	}

	public String getParam8() {
		return param8;
	}

	public void setParam8(String param8) {
		this.param8 = param8;
	}

	public String getParam9() {
		return param9;
	}

	public void setParam9(String param9) {
		this.param9 = param9;
	}

}
