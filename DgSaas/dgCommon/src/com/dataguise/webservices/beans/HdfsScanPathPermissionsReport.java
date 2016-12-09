package com.dataguise.webservices.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hdfsScanPathPermissionsReport complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hdfsScanPathPermissionsReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="report" type="{http://webservices.dataguise.com/}hdfsAbsPathPermissionsReport" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hdfsScanPathPermissionsReport", propOrder = { "inputPath","reportPreparedTime","currentUser",
		"report" })
public class HdfsScanPathPermissionsReport {

	protected String inputPath;
	protected String reportPreparedTime;
	protected String currentUser;
	@XmlElement(nillable = true)
	protected List<HdfsAbsPathPermissionsReport> report;

	/**
	 * Gets the value of the inputPath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInputPath() {
		return inputPath;
	}

	/**
	 * Sets the value of the inputPath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInputPath(String value) {
		this.inputPath = value;
	}

	public List<HdfsAbsPathPermissionsReport> getReport() {
		return report;
	}

	public void setReport(List<HdfsAbsPathPermissionsReport> report) {
		this.report = report;
	}

	public String getReportPreparedTime() {
		return reportPreparedTime;
	}

	public void setReportPreparedTime(String reportPreparedTime) {
		this.reportPreparedTime = reportPreparedTime;
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	

}
