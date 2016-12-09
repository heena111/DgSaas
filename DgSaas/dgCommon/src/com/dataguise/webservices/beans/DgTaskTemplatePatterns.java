package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgTaskTemplatePatterns complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgTaskTemplatePatterns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consistent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="constraintName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataPrecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataScale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataTypeNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FConstraintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FUnique" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ifNullValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifValueNotFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isNullable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keepNull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maskSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maskingOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maskingPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missingValuesAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persistent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="persistentColumnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regexId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronizeWith" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tableMaskSeq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgTaskTemplatePatterns", propOrder = { "checkCode",
		"columnId", "columnName", "consistent", "constraintName", "dataLength",
		"dataPrecision", "dataScale", "dataType", "dataTypeNumber",
		"databaseName", "dbLink", "fConstraintType", "fUnique", "id",
		"ifNullValue", "ifValueNotFound", "isIdentity", "isNullable",
		"keepNull", "maskFlag", "maskSeq", "maskingOption", "maskingPolicy",
		"missingValuesAs", "param1", "param2", "param3", "param4", "param5",
		"param6", "param7", "param8", "param9", "persistent",
		"persistentColumnId", "regexId", "schemaName", "synchronizeWith",
		"tableMaskSeq", "tableName", "templateId" })
public class DgTaskTemplatePatterns {

	protected String checkCode;
	protected Integer columnId;
	protected String columnName;
	protected Boolean consistent;
	protected String constraintName;
	protected Integer dataLength;
	protected Integer dataPrecision;
	protected Integer dataScale;
	protected String dataType;
	protected Integer dataTypeNumber;
	protected String databaseName;
	protected String dbLink;
	@XmlElement(name = "FConstraintType")
	protected String fConstraintType;
	@XmlElement(name = "FUnique")
	protected Boolean fUnique;
	protected Integer id;
	protected String ifNullValue;
	protected String ifValueNotFound;
	protected Boolean isIdentity;
	protected Boolean isNullable;
	protected String keepNull;
	protected Boolean maskFlag;
	protected Integer maskSeq;
	protected Integer maskingOption;
	protected String maskingPolicy;
	protected String missingValuesAs;
	protected String param1;
	protected String param2;
	protected String param3;
	protected String param4;
	protected String param5;
	protected String param6;
	protected String param7;
	protected String param8;
	protected String param9;
	protected Boolean persistent;
	protected String persistentColumnId;
	protected Integer regexId;
	protected String schemaName;
	protected Boolean synchronizeWith;
	protected Integer tableMaskSeq;
	protected String tableName;
	protected Integer templateId;

	/**
	 * Gets the value of the checkCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCheckCode() {
		return checkCode;
	}

	/**
	 * Sets the value of the checkCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCheckCode(String value) {
		this.checkCode = value;
	}

	/**
	 * Gets the value of the columnId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getColumnId() {
		return columnId;
	}

	/**
	 * Sets the value of the columnId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setColumnId(Integer value) {
		this.columnId = value;
	}

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
	 * Gets the value of the consistent property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isConsistent() {
		return consistent;
	}

	/**
	 * Sets the value of the consistent property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setConsistent(Boolean value) {
		this.consistent = value;
	}

	/**
	 * Gets the value of the constraintName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * Sets the value of the constraintName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConstraintName(String value) {
		this.constraintName = value;
	}

	/**
	 * Gets the value of the dataLength property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDataLength() {
		return dataLength;
	}

	/**
	 * Sets the value of the dataLength property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDataLength(Integer value) {
		this.dataLength = value;
	}

	/**
	 * Gets the value of the dataPrecision property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDataPrecision() {
		return dataPrecision;
	}

	/**
	 * Sets the value of the dataPrecision property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDataPrecision(Integer value) {
		this.dataPrecision = value;
	}

	/**
	 * Gets the value of the dataScale property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDataScale() {
		return dataScale;
	}

	/**
	 * Sets the value of the dataScale property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDataScale(Integer value) {
		this.dataScale = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataType(String value) {
		this.dataType = value;
	}

	/**
	 * Gets the value of the dataTypeNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDataTypeNumber() {
		return dataTypeNumber;
	}

	/**
	 * Sets the value of the dataTypeNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDataTypeNumber(Integer value) {
		this.dataTypeNumber = value;
	}

	/**
	 * Gets the value of the databaseName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * Sets the value of the databaseName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabaseName(String value) {
		this.databaseName = value;
	}

	/**
	 * Gets the value of the dbLink property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDbLink() {
		return dbLink;
	}

	/**
	 * Sets the value of the dbLink property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDbLink(String value) {
		this.dbLink = value;
	}

	/**
	 * Gets the value of the fConstraintType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFConstraintType() {
		return fConstraintType;
	}

	/**
	 * Sets the value of the fConstraintType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFConstraintType(String value) {
		this.fConstraintType = value;
	}

	/**
	 * Gets the value of the fUnique property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFUnique() {
		return fUnique;
	}

	/**
	 * Sets the value of the fUnique property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFUnique(Boolean value) {
		this.fUnique = value;
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
	 * Gets the value of the ifNullValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIfNullValue() {
		return ifNullValue;
	}

	/**
	 * Sets the value of the ifNullValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIfNullValue(String value) {
		this.ifNullValue = value;
	}

	/**
	 * Gets the value of the ifValueNotFound property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIfValueNotFound() {
		return ifValueNotFound;
	}

	/**
	 * Sets the value of the ifValueNotFound property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIfValueNotFound(String value) {
		this.ifValueNotFound = value;
	}

	/**
	 * Gets the value of the isIdentity property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsIdentity() {
		return isIdentity;
	}

	/**
	 * Sets the value of the isIdentity property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsIdentity(Boolean value) {
		this.isIdentity = value;
	}

	/**
	 * Gets the value of the isNullable property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsNullable() {
		return isNullable;
	}

	/**
	 * Sets the value of the isNullable property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsNullable(Boolean value) {
		this.isNullable = value;
	}

	/**
	 * Gets the value of the keepNull property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKeepNull() {
		return keepNull;
	}

	/**
	 * Sets the value of the keepNull property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKeepNull(String value) {
		this.keepNull = value;
	}

	/**
	 * Gets the value of the maskFlag property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isMaskFlag() {
		return maskFlag;
	}

	/**
	 * Sets the value of the maskFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setMaskFlag(Boolean value) {
		this.maskFlag = value;
	}

	/**
	 * Gets the value of the maskSeq property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMaskSeq() {
		return maskSeq;
	}

	/**
	 * Sets the value of the maskSeq property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMaskSeq(Integer value) {
		this.maskSeq = value;
	}

	/**
	 * Gets the value of the maskingOption property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMaskingOption() {
		return maskingOption;
	}

	/**
	 * Sets the value of the maskingOption property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMaskingOption(Integer value) {
		this.maskingOption = value;
	}

	/**
	 * Gets the value of the maskingPolicy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaskingPolicy() {
		return maskingPolicy;
	}

	/**
	 * Sets the value of the maskingPolicy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaskingPolicy(String value) {
		this.maskingPolicy = value;
	}

	/**
	 * Gets the value of the missingValuesAs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMissingValuesAs() {
		return missingValuesAs;
	}

	/**
	 * Sets the value of the missingValuesAs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMissingValuesAs(String value) {
		this.missingValuesAs = value;
	}

	/**
	 * Gets the value of the param1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam1() {
		return param1;
	}

	/**
	 * Sets the value of the param1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam1(String value) {
		this.param1 = value;
	}

	/**
	 * Gets the value of the param2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam2() {
		return param2;
	}

	/**
	 * Sets the value of the param2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam2(String value) {
		this.param2 = value;
	}

	/**
	 * Gets the value of the param3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam3() {
		return param3;
	}

	/**
	 * Sets the value of the param3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam3(String value) {
		this.param3 = value;
	}

	/**
	 * Gets the value of the param4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam4() {
		return param4;
	}

	/**
	 * Sets the value of the param4 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam4(String value) {
		this.param4 = value;
	}

	/**
	 * Gets the value of the param5 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam5() {
		return param5;
	}

	/**
	 * Sets the value of the param5 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam5(String value) {
		this.param5 = value;
	}

	/**
	 * Gets the value of the param6 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam6() {
		return param6;
	}

	/**
	 * Sets the value of the param6 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam6(String value) {
		this.param6 = value;
	}

	/**
	 * Gets the value of the param7 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam7() {
		return param7;
	}

	/**
	 * Sets the value of the param7 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam7(String value) {
		this.param7 = value;
	}

	/**
	 * Gets the value of the param8 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam8() {
		return param8;
	}

	/**
	 * Sets the value of the param8 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam8(String value) {
		this.param8 = value;
	}

	/**
	 * Gets the value of the param9 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParam9() {
		return param9;
	}

	/**
	 * Sets the value of the param9 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParam9(String value) {
		this.param9 = value;
	}

	/**
	 * Gets the value of the persistent property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPersistent() {
		return persistent;
	}

	/**
	 * Sets the value of the persistent property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPersistent(Boolean value) {
		this.persistent = value;
	}

	/**
	 * Gets the value of the persistentColumnId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPersistentColumnId() {
		return persistentColumnId;
	}

	/**
	 * Sets the value of the persistentColumnId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPersistentColumnId(String value) {
		this.persistentColumnId = value;
	}

	/**
	 * Gets the value of the regexId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getRegexId() {
		return regexId;
	}

	/**
	 * Sets the value of the regexId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setRegexId(Integer value) {
		this.regexId = value;
	}

	/**
	 * Gets the value of the schemaName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSchemaName() {
		return schemaName;
	}

	/**
	 * Sets the value of the schemaName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSchemaName(String value) {
		this.schemaName = value;
	}

	/**
	 * Gets the value of the synchronizeWith property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isSynchronizeWith() {
		return synchronizeWith;
	}

	/**
	 * Sets the value of the synchronizeWith property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setSynchronizeWith(Boolean value) {
		this.synchronizeWith = value;
	}

	/**
	 * Gets the value of the tableMaskSeq property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTableMaskSeq() {
		return tableMaskSeq;
	}

	/**
	 * Sets the value of the tableMaskSeq property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTableMaskSeq(Integer value) {
		this.tableMaskSeq = value;
	}

	/**
	 * Gets the value of the tableName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * Sets the value of the tableName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTableName(String value) {
		this.tableName = value;
	}

	/**
	 * Gets the value of the templateId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTemplateId() {
		return templateId;
	}

	/**
	 * Sets the value of the templateId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTemplateId(Integer value) {
		this.templateId = value;
	}

}
