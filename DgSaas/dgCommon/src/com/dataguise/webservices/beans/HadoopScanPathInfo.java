package com.dataguise.webservices.beans;


import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;


/**
 * <p>
 * Java class for hadoopScanPathInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="hadoopScanPathInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="structName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verifyStruct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopScanPathInfo", propOrder = { "domainName", "scanPath",
		"structName", "verifyStruct","structureType", "destinationDirectory" })
public class HadoopScanPathInfo {

	@Pattern(regexp="("+BeanValidator.DOMAIN_NAME_REGEX+"){0,1}" ,  message=BeanValidator.INVALID_DOMAIN_NAME)
	protected String domainName;
	@NotEmpty(message="Scan Path:"+BeanValidator.EMPTY_FIELD)
	protected String scanPath;
	@Pattern(regexp="("+BeanValidator.STRUCTURE_NAME_REGEX+"){0,1}" ,  message=BeanValidator.INVALID_STRUCTURE_NAME)
	protected String structName;
	protected Boolean verifyStruct;
	protected String structureType;
	protected String destinationDirectory;

	/**
	 * Gets the value of the domainName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * @return the destinationDirectory
	 */
	public String getDestinationDirectory() {
		return destinationDirectory;
	}

	/**
	 * @param destinationDirectory the destinationDirectory to set
	 */
	public void setDestinationDirectory(String destinationDirectory) {
		this.destinationDirectory = destinationDirectory;
	}

	/**
	 * Sets the value of the domainName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDomainName(String value) {
		this.domainName = value;
	}

	/**
	 * Gets the value of the scanPath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScanPath() {
		return scanPath;
	}

	/**
	 * Sets the value of the scanPath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScanPath(String value) {
		this.scanPath = value;
	}

	/**
	 * Gets the value of the structName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStructName() {
		return structName;
	}

	/**
	 * Sets the value of the structName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStructName(String value) {
		this.structName = value;
	}

	/**
	 * Gets the value of the verifyStruct property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isVerifyStruct() {
		return verifyStruct;
	}

	/**
	 * Sets the value of the verifyStruct property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setVerifyStruct(Boolean value) {
		this.verifyStruct = value;
	}

	public String getStructureType() {
		return structureType;
	}

	public void setStructureType(String structureType) {
		this.structureType = structureType;
	}

}
