package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgHadoopDiscoveryResults complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHadoopDiscoveryResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="byteEndOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="byteStartOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lineEndOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lineStartOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sensitiveData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensitiveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgHadoopDiscoveryResults", propOrder = { "blockNumber",
		"byteEndOffset", "byteStartOffset", "filePath", "id", "lineEndOffset",
		"lineStartOffset", "sensitiveData", "sensitiveType", "taskInstanceId",
		"totalRowCount","taskId" })
public class DgHadoopDiscoveryResults {

	protected Integer blockNumber;
	protected Integer byteEndOffset;
	protected Integer byteStartOffset;
	protected String filePath;
	protected Integer id;
	protected Integer lineEndOffset;
	protected Integer lineStartOffset;
	protected String sensitiveData;
	protected String sensitiveType;
	protected Integer taskInstanceId;
	protected Integer totalRowCount;
	protected Integer taskId;

	/**
	 * Gets the value of the blockNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getBlockNumber() {
		return blockNumber;
	}

	/**
	 * Sets the value of the blockNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setBlockNumber(Integer value) {
		this.blockNumber = value;
	}

	/**
	 * Gets the value of the byteEndOffset property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getByteEndOffset() {
		return byteEndOffset;
	}

	/**
	 * Sets the value of the byteEndOffset property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setByteEndOffset(Integer value) {
		this.byteEndOffset = value;
	}

	/**
	 * Gets the value of the byteStartOffset property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getByteStartOffset() {
		return byteStartOffset;
	}

	/**
	 * Sets the value of the byteStartOffset property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setByteStartOffset(Integer value) {
		this.byteStartOffset = value;
	}

	/**
	 * Gets the value of the filePath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Sets the value of the filePath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFilePath(String value) {
		this.filePath = value;
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
	 * Gets the value of the lineEndOffset property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLineEndOffset() {
		return lineEndOffset;
	}

	/**
	 * Sets the value of the lineEndOffset property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLineEndOffset(Integer value) {
		this.lineEndOffset = value;
	}

	/**
	 * Gets the value of the lineStartOffset property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getLineStartOffset() {
		return lineStartOffset;
	}

	/**
	 * Sets the value of the lineStartOffset property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setLineStartOffset(Integer value) {
		this.lineStartOffset = value;
	}

	/**
	 * Gets the value of the sensitiveData property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSensitiveData() {
		return sensitiveData;
	}

	/**
	 * Sets the value of the sensitiveData property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSensitiveData(String value) {
		this.sensitiveData = value;
	}

	/**
	 * Gets the value of the sensitiveType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSensitiveType() {
		return sensitiveType;
	}

	/**
	 * Sets the value of the sensitiveType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSensitiveType(String value) {
		this.sensitiveType = value;
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

	/**
	 * Gets the value of the totalRowCount property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalRowCount() {
		return totalRowCount;
	}

	/**
	 * Sets the value of the totalRowCount property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalRowCount(Integer value) {
		this.totalRowCount = value;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

}
