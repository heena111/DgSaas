package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgSearchFileUIError complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgSearchFileUIError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dirPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgSearchFileUIError", propOrder = { "dirPath", "errorMessage",
		"fileName", "taskInstanceId" })
public class DgSearchFileUIError {

	protected String dirPath;
	protected String errorMessage;
	protected String fileName;
	protected Integer taskInstanceId;

	/**
	 * Gets the value of the dirPath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDirPath() {
		return dirPath;
	}

	/**
	 * Sets the value of the dirPath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDirPath(String value) {
		this.dirPath = value;
	}

	/**
	 * Gets the value of the errorMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the value of the errorMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorMessage(String value) {
		this.errorMessage = value;
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
	 * Gets the value of the taskInstanceId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	/**
	 * Sets the value of the taskInstanceId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTaskInstanceId(Integer value) {
		this.taskInstanceId = value;
	}

}
