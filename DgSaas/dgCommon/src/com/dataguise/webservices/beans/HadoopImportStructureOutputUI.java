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
*			 &lt;element name="structureCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *          &lt;element name="fileInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnStructureList" type="{http://www.w3.org/2001/XMLSchema}ColumnStructureUI" minOccurs="0"/>
 *          
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "columnStructureUI", propOrder = { "structureCheck","fileInformation","columnStructureList" })
public class HadoopImportStructureOutputUI {

	protected String structureCheck;
	protected String fileInformation;
	protected List<ColumnStructureUI> columnStructureList;

	
	/**
	 * Gets the value of the structureCheck property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStructureCheck() {
		return structureCheck;
	}
	/**
	 * Sets the value of the structureCheck property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStructureCheck(String structureCheck) {
		this.structureCheck = structureCheck;
	}
	/**
	 * Gets the value of the fileInformation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileInformation() {
		return fileInformation;
	}
	/**
	 * Sets the value of the fileInformation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileInformation(String fileInformation) {
		this.fileInformation = fileInformation;
	}
	/**
	 * Gets the value of the columnStructureList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public List<ColumnStructureUI> getColumnStructureList() {
		return columnStructureList;
	}
	/**
	 * Sets the value of the columnStructureList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnStructureList(List<ColumnStructureUI> columnStructureList) {
		this.columnStructureList = columnStructureList;
	}
	
	
	

	
	
	
	
	
}
