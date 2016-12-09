package com.dataguise.webservices.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;


/**
 * <p>
 * Java class for hadoopStructColumnUI complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hadoopStructColumnUI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maskingId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maskingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="structureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="complexStructureId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopStructColumnUI", propOrder = { "columnName",
		"columnNumber", "command", "id", "length", "maskingId", "maskingType","start",
		"structureId","complexStructureId" })
public class HadoopStructColumnUI {

	@NotEmpty(message="Column Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=64 , message ="Column Name:"+BeanValidator.MAX_SIZE_64)
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message="Column Name:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String columnName;
	protected Integer columnNumber;
	
	protected String command;
	protected Integer id;
	protected Integer length;
	protected Integer maskingId;
	protected String maskingType;
	protected Integer start;
	protected Integer structureId;
	protected Integer complexStructureId;

	/**
	 * Gets the value of the columnName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * Sets the value of the columnName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnName(String value) {
		this.columnName = value;
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
	public void setColumnNumber(Integer value) {
		this.columnNumber = value;
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
	 * Gets the value of the maskingId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMaskingId() {
		return maskingId;
	}

	/**
	 * Sets the value of the maskingId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMaskingId(Integer value) {
		this.maskingId = value;
	}

	/**
	 * Gets the value of the maskingType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaskingType() {
		return maskingType;
	}

	/**
	 * Sets the value of the maskingType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaskingType(String value) {
		this.maskingType = value;
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
	public void setStructureId(Integer value) {
		this.structureId = value;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getComplexStructureId() {
		return complexStructureId;
	}

	public void setComplexStructureId(Integer complexStructureId) {
		this.complexStructureId = complexStructureId;
	}

	
}
