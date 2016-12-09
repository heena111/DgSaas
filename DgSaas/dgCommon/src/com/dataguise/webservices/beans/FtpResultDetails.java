package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ftpResultDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ftpResultDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bytesProcessed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clientAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensitiveDataCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ftpResultDetails", propOrder = { "bytesProcessed",
		"clientAddress", "destDir", "fileName", "fileSize", "regexName",
		"sensitiveDataCount", "sessionId", "userName","count","discoverTime"})
public class FtpResultDetails {

	protected Integer bytesProcessed;
	protected String clientAddress;
	protected String destDir;
	protected String fileName;
	protected String fileSize;
	protected String regexName;
	protected Integer sensitiveDataCount;
	protected String sessionId;
	protected String userName;
	protected Integer count;
	protected String discoverTime;

	/**
	 * Gets the value of the bytesProcessed property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getBytesProcessed() {
		return bytesProcessed;
	}

	/**
	 * Sets the value of the bytesProcessed property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setBytesProcessed(Integer value) {
		this.bytesProcessed = value;
	}

	/**
	 * Gets the value of the clientAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientAddress() {
		return clientAddress;
	}

	/**
	 * Sets the value of the clientAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientAddress(String value) {
		this.clientAddress = value;
	}

	/**
	 * Gets the value of the destDir property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDestDir() {
		return destDir;
	}

	/**
	 * Sets the value of the destDir property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDestDir(String value) {
		this.destDir = value;
	}

	/**
	 * Gets the value of the fileName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the value of the fileName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileName(String value) {
		this.fileName = value;
	}

	/**
	 * Gets the value of the fileSize property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileSize() {
		return fileSize;
	}

	/**
	 * Sets the value of the fileSize property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileSize(String value) {
		this.fileSize = value;
	}

	/**
	 * Gets the value of the regexName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRegexName() {
		return regexName;
	}

	/**
	 * Sets the value of the regexName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRegexName(String value) {
		this.regexName = value;
	}

	/**
	 * Gets the value of the sensitiveDataCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getSensitiveDataCount() {
		return sensitiveDataCount;
	}

	/**
	 * Sets the value of the sensitiveDataCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSensitiveDataCount(Integer value) {
		this.sensitiveDataCount = value;
	}

	/**
	 * Gets the value of the sessionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * Sets the value of the sessionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSessionId(String value) {
		this.sessionId = value;
	}

	/**
	 * Gets the value of the userName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getDiscoverTime() {
		return discoverTime;
	}

	public void setDiscoverTime(String discoverTime) {
		this.discoverTime = discoverTime;
	}

}
