package com.dataguise.webservices.beans;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;
import com.dataguise.util.BeanValidator;


public class DgFilesEncryptMaskingDirStruct implements java.io.Serializable{
	
	private Integer id;
	
	@NotEmpty(message = "Source Connection:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Source Connection:"+BeanValidator.INVALID_CHARACTER_SET) 
	private String scanDir;
	private String branchPoint;
	
	@NotEmpty(message = "Destination Directory:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Destination Directory:"+BeanValidator.INVALID_CHARACTER_SET)
	private String destDir;
	
	@NotEmpty(message = "Destination UserName:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Destination UserName:"+BeanValidator.INVALID_CHARACTER_SET)
	private String destUserName;
	
	@NotEmpty(message = "Destination Password:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Destination Password:"+BeanValidator.INVALID_CHARACTER_SET)
	private String destPassWord;
	
	public String getDestUserName() {
		return destUserName;
	}
	public void setDestUserName(String destUserName) {
		this.destUserName = destUserName;
	}
	
	public String getDestPassWord() {
		return destPassWord;
	}
	public void setDestPassWord(String destPassWord) {
		this.destPassWord = destPassWord;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getScanDir() {
		return scanDir;
	}
	public void setScanDir(String scanDir) {
		this.scanDir = scanDir;
	}
	public String getBranchPoint() {
		return branchPoint;
	}
	public void setBranchPoint(String branchPoint) {
		this.branchPoint = branchPoint;
	}
	public String getDestDir() {
		return destDir;
	}
	public void setDestDir(String destDir) {
		this.destDir = destDir;
	}
 
	 
}
