package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgHadoopTimeSeriesBean complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHadoopTimeSeriesBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endIntervalTs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filesEncrypted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filesMasked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filesSearched" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sensitiveFilesFound" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sensitiveItemsFound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sizeOfFilesSearched" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startIntervalTs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSizeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgHadoopTimeSeriesBean", propOrder = { "endIntervalTs",
		"filesEncrypted", "filesMasked", "filesSearched",
		"sensitiveFilesFound", "sensitiveItemsFound", "sizeOfFilesSearched",
		"startIntervalTs", "fileSizeUnit", "structured", "unStructured","skippedFileCount","filesDecrypted" })
public class DgHadoopTimeSeriesBean {

	protected String endIntervalTs;
	protected Integer filesEncrypted;
	protected Integer filesMasked;
	protected Integer filesDecrypted;
	protected Long filesSearched;
	protected Long sensitiveFilesFound;
	protected Long sensitiveItemsFound;
	protected Long sizeOfFilesSearched;
	protected String startIntervalTs;
	protected String fileSizeUnit;
	protected Long structured;
	protected Long unStructured;
	protected Long skippedFileCount;
	protected Long nonsensitiveFilesFound;

	/**
	 * Gets the value of the endIntervalTs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndIntervalTs() {
		return endIntervalTs;
	}

	/**
	 * Sets the value of the endIntervalTs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndIntervalTs(String value) {
		this.endIntervalTs = value;
	}

	/**
	 * Gets the value of the filesEncrypted property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getFilesEncrypted() {
		return filesEncrypted;
	}

	/**
	 * Sets the value of the filesEncrypted property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setFilesEncrypted(Integer value) {
		this.filesEncrypted = value;
	}

	/**
	 * Gets the value of the filesMasked property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getFilesMasked() {
		return filesMasked;
	}

	/**
	 * Sets the value of the filesMasked property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setFilesMasked(Integer value) {
		this.filesMasked = value;
	}

	/**
	 * Gets the value of the filesSearched property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getFilesSearched() {
		return filesSearched;
	}

	/**
	 * Sets the value of the filesSearched property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setFilesSearched(Long value) {
		this.filesSearched = value;
	}

	/**
	 * Gets the value of the sensitiveFilesFound property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getSensitiveFilesFound() {
		return sensitiveFilesFound;
	}

	/**
	 * Sets the value of the sensitiveFilesFound property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setSensitiveFilesFound(Long value) {
		this.sensitiveFilesFound = value;
	}

	/**
	 * Gets the value of the sensitiveItemsFound property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Long getSensitiveItemsFound() {
		return sensitiveItemsFound;
	}

	/**
	 * Sets the value of the sensitiveItemsFound property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setSensitiveItemsFound(Long value) {
		this.sensitiveItemsFound = value;
	}

	/**
	 * Gets the value of the sizeOfFilesSearched property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getSizeOfFilesSearched() {
		return sizeOfFilesSearched;
	}

	/**
	 * Sets the value of the sizeOfFilesSearched property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setSizeOfFilesSearched(Long value) {
		this.sizeOfFilesSearched = value;
	}

	/**
	 * Gets the value of the startIntervalTs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartIntervalTs() {
		return startIntervalTs;
	}

	/**
	 * Sets the value of the startIntervalTs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStartIntervalTs(String value) {
		this.startIntervalTs = value;
	}

	/**
	 * Gets the value of the fileSizeUnit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFileSizeUnit() {
		return fileSizeUnit;
	}

	/**
	 * Sets the value of the fileSizeUnit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFileSizeUnit(String value) {
		this.fileSizeUnit = value;
	}

	public Long getStructured() {
		return structured;
	}

	public void setStructured(Long structured) {
		this.structured = structured;
	}

	public Long getUnStructured() {
		return unStructured;
	}

	public void setUnStructured(Long unStructured) {
		this.unStructured = unStructured;
	}

	public Long getSkippedFileCount() {
		return skippedFileCount;
	}

	public void setSkippedFileCount(Long skippedFileCount) {
		this.skippedFileCount = skippedFileCount;
	}

	public Long getNonsensitiveFilesFound() {
		return nonsensitiveFilesFound;
	}

	public void setNonsensitiveFilesFound(Long nonsensitiveFilesFound) {
		this.nonsensitiveFilesFound = nonsensitiveFilesFound;
	}

	public Integer getFilesDecrypted() {
		return filesDecrypted;
	}

	public void setFilesDecrypted(Integer filesDecrypted) {
		this.filesDecrypted = filesDecrypted;
	}
	
	

}
