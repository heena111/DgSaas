package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for fileAccessReportBeanWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="fileAccessReportBeanWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileAccessReportBeanList" type="{http://webservices.dataguise.com/}fileAccessReportBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfRecords" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileAccessReportBeanWrapper", propOrder = {
		"fileAccessReportBeanList", "numberOfRecords" })
public class FileAccessReportBeanWrapper {

	@XmlElement(nillable = true)
	protected List<FileAccessReportBean> fileAccessReportBeanList;
	protected Long numberOfRecords;

	/**
	 * Gets the value of the fileAccessReportBeanList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the fileAccessReportBeanList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFileAccessReportBeanList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link FileAccessReportBean }
	 * 
	 * 
	 */
	public List<FileAccessReportBean> getFileAccessReportBeanList() {
		if (fileAccessReportBeanList == null) {
			fileAccessReportBeanList = new ArrayList<FileAccessReportBean>();
		}
		return this.fileAccessReportBeanList;
	}

	/**
	 * Gets the value of the numberOfRecords property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getNumberOfRecords() {
		return numberOfRecords;
	}

	/**
	 * Sets the value of the numberOfRecords property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setNumberOfRecords(Long value) {
		this.numberOfRecords = value;
	}

}
