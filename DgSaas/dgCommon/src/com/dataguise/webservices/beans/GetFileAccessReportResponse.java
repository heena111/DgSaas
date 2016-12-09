package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for getFileAccessReportResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getFileAccessReportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservices.dataguise.com/}fileAccessReportBeanWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFileAccessReportResponse", propOrder = { "_return" })
public class GetFileAccessReportResponse {

	@XmlElement(name = "return")
	protected FileAccessReportBeanWrapper _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link FileAccessReportBeanWrapper }
	 * 
	 */
	public FileAccessReportBeanWrapper getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link FileAccessReportBeanWrapper }
	 * 
	 */
	public void setReturn(FileAccessReportBeanWrapper value) {
		this._return = value;
	}

}
