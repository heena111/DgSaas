package com.dataguise.webservices.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hadoopImportStructureUI complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hadoopImportStructureUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;element name="showSampleRows" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="structureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowsToSample" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="structType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="columnStructureList" type="{http://www.w3.org/2001/XMLSchema}ColumnStructureUI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopImportStructureUI", propOrder = { "path","showSampleRows",
		 "command", "structureId", "header", "rowsToSample","columnStructureList","structType"
		})
public class HadoopImportStructureUI {

	protected String path;
	protected String showSampleRows;
	protected String command;
	protected Integer structureId;
	protected Integer rowsToSample;
	protected String header;
	protected String structType;
	protected List<ColumnStructureUI> columnStructureList; 

	
	/**
	 * Gets the value of the showSampleRows property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShowSampleRows() {
		return showSampleRows;
	}
	/**
	 * Sets the value of the showSampleRows property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShowSampleRows(String showSampleRows) {
		this.showSampleRows = showSampleRows;
	}

	/**
	 * Gets the value of the command property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * Sets the value of the command property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCommand(String value) {
		this.command = value;
	}

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
	 * Gets the value of the path property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPath() {
		return path;
	}

	

	

	/**
	 * Sets the value of the path property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * Gets the value of the rowsToSample property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public Integer getRowsToSample() {
		return rowsToSample;
	}
	/**
	 * Sets the value of the rowsToSample property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRowsToSample(Integer rowsToSample) {
		this.rowsToSample = rowsToSample;
	}
	/**
	 * Gets the value of the header property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHeader() {
		return header;
	}
	/**
	 * Sets the value of the header property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHeader(String header) {
		this.header = header;
	}
	/**
	 * Gets the value of the header property.
	 * 
	 * @return possible object is {@link ColumnStructureUI }
	 * 
	 */
	public List<ColumnStructureUI> getColumnStructureList() {
		return columnStructureList;
	}
	/**
	 * Sets the value of the header property.
	 * 
	 * @param value
	 *            allowed object is {@link ColumnStructureUI }
	 * 
	 */
	public void setColumnStructureList(List<ColumnStructureUI> columnStructureList) {
		this.columnStructureList = columnStructureList;
	}
	/**
	 * Gets the value of the structType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStructType() {
		return structType;
	}
	/**
	 * Sets the value of the structType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStructType(String structType) {
		this.structType = structType;
	}
	

}