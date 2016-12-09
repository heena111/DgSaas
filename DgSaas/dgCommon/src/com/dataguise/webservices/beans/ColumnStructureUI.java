package com.dataguise.webservices.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for columnStructureUI complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="columnStructureUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;element name="structureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;element name="columnNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="columnHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleColumnList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *          &lt;element name="discoveryResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="discoveryResultId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "columnStructureUI", propOrder = { "structureId","columnNumber","columnHeader", "format","sampleColumnList","discoveryResult" ,"discoveryResultId"})
public class ColumnStructureUI {

	protected Integer structureId;
	protected Integer columnNumber;
	protected String columnHeader;
	protected String format;
	protected List<String> sampleColumnList;
	protected String discoveryResult;
	protected Integer discoveryResultId;
	
	/**
	 * Gets the value of the structureId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getStructureId() {
		return structureId;
	}
	/**
	 * Sets the value of the structureId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}

	/**
	 * Gets the value of the columnNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	
	public Integer getColumnNumber() {
		return columnNumber;
	}
	
	/**
	 * Sets the value of the columnNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setColumnNumber(Integer columnNumber) {
		this.columnNumber = columnNumber;
	}
	/**
	 * Gets the value of the columnHeader property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	
	public String getColumnHeader() {
		return columnHeader;
	}
	/**
	 * Sets the value of the columnHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnHeader(String columnHeader) {
		this.columnHeader = columnHeader;
	}

	/**
	 * Gets the value of the format property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	
	public String getFormat() {
		return format;
	}
	/**
	 * Sets the value of the format property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	

	/**
	 * Gets the value of the sampleColumnList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	
	public List<String> getSampleColumnList() {
		return sampleColumnList;
	}
	/**
	 * Sets the value of the sampleColumnList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSampleColumnList(List<String> sampleColumnList) {
		this.sampleColumnList = sampleColumnList;
	}
	

	/**
	 * Gets the value of the discoveryResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	
	public String getDiscoveryResult() {
		return discoveryResult;
	}
	/**
	 * Sets the value of the discoveryResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDiscoveryResult(String discoveryResult) {
		this.discoveryResult = discoveryResult;
	}
	/**
	 * Gets the value of the discoveryResultId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDiscoveryResultId() {
		return discoveryResultId;
	}
	/**
	 * Sets the value of the discoveryResultId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDiscoveryResultId(Integer discoveryResultId) {
		this.discoveryResultId = discoveryResultId;
	}
	
	
	
	
	
}
