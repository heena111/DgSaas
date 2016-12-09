package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for fileAccessReportBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="fileAccessReportBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmdAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cmdSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HDFScmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomingHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomingPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="incomingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pathAccessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileAccessReportBean", propOrder = { "cmdAllowed",
		"cmdSucceeded", "hdfScmd", "incomingHost", "incomingPort",
		"incomingUser", "pathAccessed", "timeStamp","regexesAllowed","regexesFound","regexesViolated","violated"})
public class FileAccessReportBean {

	protected Boolean cmdAllowed;
	protected Boolean cmdSucceeded;
	@XmlElement(name = "HDFScmd")
	protected String hdfScmd;
	protected String incomingHost;
	protected Integer incomingPort;
	protected String incomingUser;
	protected String pathAccessed;
	protected String timeStamp;
	protected String regexesAllowed;
	protected String regexesFound;
	protected String regexesViolated;
	protected Boolean violated;

	/**
	 * Gets the value of the cmdAllowed property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCmdAllowed() {
		return cmdAllowed;
	}

	/**
	 * Sets the value of the cmdAllowed property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCmdAllowed(Boolean value) {
		this.cmdAllowed = value;
	}

	/**
	 * Gets the value of the cmdSucceeded property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCmdSucceeded() {
		return cmdSucceeded;
	}

	/**
	 * Sets the value of the cmdSucceeded property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCmdSucceeded(Boolean value) {
		this.cmdSucceeded = value;
	}

	/**
	 * Gets the value of the hdfScmd property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHDFScmd() {
		return hdfScmd;
	}

	/**
	 * Sets the value of the hdfScmd property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHDFScmd(String value) {
		this.hdfScmd = value;
	}

	/**
	 * Gets the value of the incomingHost property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncomingHost() {
		return incomingHost;
	}

	/**
	 * Sets the value of the incomingHost property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIncomingHost(String value) {
		this.incomingHost = value;
	}

	/**
	 * Gets the value of the incomingPort property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIncomingPort() {
		return incomingPort;
	}

	/**
	 * Sets the value of the incomingPort property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIncomingPort(Integer value) {
		this.incomingPort = value;
	}

	/**
	 * Gets the value of the incomingUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIncomingUser() {
		return incomingUser;
	}

	/**
	 * Sets the value of the incomingUser property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIncomingUser(String value) {
		this.incomingUser = value;
	}

	/**
	 * Gets the value of the pathAccessed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPathAccessed() {
		return pathAccessed;
	}

	/**
	 * Sets the value of the pathAccessed property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPathAccessed(String value) {
		this.pathAccessed = value;
	}

	/**
	 * Gets the value of the timeStamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the timeStamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTimeStamp(String value) {
		this.timeStamp = value;
	}

	public String getRegexesAllowed() {
		return regexesAllowed;
	}

	public void setRegexesAllowed(String regexesAllowed) {
		this.regexesAllowed = regexesAllowed;
	}

	public String getRegexesFound() {
		return regexesFound;
	}

	public void setRegexesFound(String regexesFound) {
		this.regexesFound = regexesFound;
	}

	public String getRegexesViolated() {
		return regexesViolated;
	}

	public void setRegexesViolated(String regexesViolated) {
		this.regexesViolated = regexesViolated;
	}

	public Boolean getViolated() {
		return violated;
	}

	public void setViolated(Boolean violated) {
		this.violated = violated;
	}
	
	
	

}
