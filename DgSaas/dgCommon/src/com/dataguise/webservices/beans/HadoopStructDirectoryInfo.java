package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for hadoopStructDirectoryInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hadoopStructDirectoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://webservices.dataguise.com/}hadoopStructColumnUI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directories" type="{http://webservices.dataguise.com/}hadoopStructDirectoryUI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*          &lt;element name="positionCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *          &lt;element name="structType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="textStructureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="columns" type="{http://webservices.dataguise.com/}hadoopDetailStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopStructDirectoryInfo", propOrder = { "columnDelimiter",
		"columns", "description", "directories", "filePattern", "id", "name","positionCounter","structType","clusterId","orgId","textStructureType","hadoopDetailStructure" })
public class HadoopStructDirectoryInfo {

	protected String columnDelimiter;
	@XmlElement(nillable = true)
	protected List<HadoopStructColumnUI> columns;
	protected String description;
	@XmlElement(nillable = true)
	protected List<HadoopStructDirectoryUI> directories;
	protected String filePattern;
	protected Integer id;
	protected String name;
	protected Integer clusterId;
	protected Integer orgId;
	protected String positionCounter;
	protected String structType;
	protected String textStructureType;
	protected HadoopDetailStructure hadoopDetailStructure;

	/**
	 * Gets the value of the columnDelimiter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnDelimiter() {
		return columnDelimiter;
	}

	/**
	 * Sets the value of the columnDelimiter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnDelimiter(String value) {
		this.columnDelimiter = value;
	}

	/**
	 * Gets the value of the columns property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the columns property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getColumns().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HadoopStructColumnUI }
	 * 
	 * 
	 */
	public List<HadoopStructColumnUI> getColumns() {
		if (columns == null) {
			columns = new ArrayList<HadoopStructColumnUI>();
		}
		return this.columns;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the directories property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the directories property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDirectories().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link HadoopStructDirectoryUI }
	 * 
	 * 
	 */
	public List<HadoopStructDirectoryUI> getDirectories() {
		if (directories == null) {
			directories = new ArrayList<HadoopStructDirectoryUI>();
		}
		return this.directories;
	}

	/**
	 * Gets the value of the filePattern property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFilePattern() {
		return filePattern;
	}

	/**
	 * Sets the value of the filePattern property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFilePattern(String value) {
		this.filePattern = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	public Integer getClusterId() {
		return clusterId;
	}
	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}


	/**
	 * Gets the value of the positionCounter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPositionCounter() {
		return positionCounter;
	}

	/**
	 * Sets the value of the positionCounter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPositionCounter(String positionCounter) {
		this.positionCounter = positionCounter;
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


	public String getTextStructureType() {
		return textStructureType;
	}

	public void setTextStructureType(String textStructureType) {
		this.textStructureType = textStructureType;
	}

	public HadoopDetailStructure getHadoopDetailStructure() {
		return hadoopDetailStructure;
	}

	public void setHadoopDetailStructure(HadoopDetailStructure hadoopDetailStructure) {
		this.hadoopDetailStructure = hadoopDetailStructure;
	}
	
	


}
