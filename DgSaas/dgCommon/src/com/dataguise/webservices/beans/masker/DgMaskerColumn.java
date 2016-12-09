
package com.dataguise.webservices.beans.masker;

import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.dataguise.util.BeanValidator;


/**
 * <p>Java class for DgMaskerColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgMaskerColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataTypeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataPrecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataScale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maskFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskingOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consistent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persistent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronizeWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persistentColumnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="missingValuesAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tableMaskSeq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="keepNull" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constraintName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constraintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isNullable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ifValueNotFound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifNullValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgMaskerColumn", namespace = "http://webservices.dataguise.com/", propOrder = {
	"id",
    "databaseName",
    "schemaName",
    "tableName",
    "columnName",
    "columnID",
    "dataType",
    "dataTypeNumber",
    "dataPrecision",
    "dataScale",
    "dataLength",
    "maskFlag",
    "maskingOption",
    "param1",
    "param2",
    "param3",
    "param4",
    "param5",
    "param6",
    "param7",
    "param8",
    "param9",
    "consistent",
    "unique",
    "persistent",
    "synchronizeWith",
    "persistentColumnID",
    "missingValuesAs",
    "maskSeq",
    "tableMaskSeq",
    "keepNull",
    "dbLink",
    "constraintName",
    "constraintType",
    "isNullable",
    "isIdentity",
    "ifValueNotFound",
    "ifNullValue",
    "checkCode",
    "isNumeric",
    "isFph",
    "regexId",
    "hitCount",
    "checkValid",
    "policyId"
})
public class DgMaskerColumn {

	protected int id;
    protected String databaseName;
    protected String schemaName;
    protected String tableName;
    protected String columnName;
    protected int columnID;
    protected String dataType;
    protected int dataTypeNumber;
    protected Integer dataPrecision;
    protected Integer dataScale;
    protected int dataLength;
    protected String maskFlag;
    protected int maskingOption;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param1;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param2;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param3;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param4;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param5;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param6;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param7;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param8;
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String param9;
    protected String consistent;
    protected String unique;
    protected String persistent;
    protected String synchronizeWith;
    protected String persistentColumnID="";
    protected String missingValuesAs;
    protected int maskSeq;
    protected int tableMaskSeq;
    protected String keepNull;
    protected String dbLink;
    protected String constraintName;
    protected String constraintType;
    protected Boolean isNullable;
    protected Boolean isIdentity;
    protected String ifValueNotFound;
    protected String ifNullValue;
    protected String checkCode;
    protected Boolean isNumeric;
    protected Boolean isFph;
    protected Integer regexId;
    protected Integer hitCount;
    protected String checkValid;
    protected Integer policyId;

    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnID property.
     * 
     */
    public int getColumnID() {
        return columnID;
    }

    /**
     * Sets the value of the columnID property.
     * 
     */
    public void setColumnID(int value) {
        this.columnID = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dataTypeNumber property.
     * 
     */
    public int getDataTypeNumber() {
        return dataTypeNumber;
    }

    /**
     * Sets the value of the dataTypeNumber property.
     * 
     */
    public void setDataTypeNumber(int value) {
        this.dataTypeNumber = value;
    }

    /**
     * Gets the value of the dataPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataPrecision() {
        return dataPrecision;
    }

    /**
     * Sets the value of the dataPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataPrecision(Integer value) {
        this.dataPrecision = value;
    }

    /**
     * Gets the value of the dataScale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataScale() {
        return dataScale;
    }

    /**
     * Sets the value of the dataScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataScale(Integer value) {
        this.dataScale = value;
    }

    /**
     * Gets the value of the dataLength property.
     * 
     */
    public int getDataLength() {
        return dataLength;
    }

    /**
     * Sets the value of the dataLength property.
     * 
     */
    public void setDataLength(int value) {
        this.dataLength = value;
    }

    /**
     * Gets the value of the maskFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskFlag() {
        return maskFlag;
    }

    /**
     * Sets the value of the maskFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskFlag(String value) {
        this.maskFlag = value;
    }

    /**
     * Gets the value of the maskingOption property.
     * 
     */
    public int getMaskingOption() {
        return maskingOption;
    }

    /**
     * Sets the value of the maskingOption property.
     * 
     */
    public void setMaskingOption(int value) {
        this.maskingOption = value;
    }

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1 == null ? "" : param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam2() {
    	return param2 == null ? "" : param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam2(String value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the param3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam3() {
    	return param3 == null ? "" : param3;
    }

    /**
     * Sets the value of the param3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam3(String value) {
        this.param3 = value;
    }

    /**
     * Gets the value of the param4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam4() {
    	return param4 == null ? "" : param4;
    }

    /**
     * Sets the value of the param4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam4(String value) {
        this.param4 = value;
    }

    /**
     * Gets the value of the param5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam5() {
    	return param5 == null ? "" : param5;
    }

    /**
     * Sets the value of the param5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam5(String value) {
        this.param5 = value;
    }

    /**
     * Gets the value of the param6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam6() {
    	return param6 == null ? "" : param6;
    }

    /**
     * Sets the value of the param6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam6(String value) {
        this.param6 = value;
    }

    /**
     * Gets the value of the param7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam7() {
    	return param7 == null ? "" : param7;
    }

    /**
     * Sets the value of the param7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam7(String value) {
        this.param7 = value;
    }

    /**
     * Gets the value of the param8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam8() {
    	return param8 == null ? "" : param8;
    }

    /**
     * Sets the value of the param8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam8(String value) {
        this.param8 = value;
    }

    /**
     * Gets the value of the param9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam9() {
    	return param9 == null ? "" : param9;
    }

    /**
     * Sets the value of the param9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam9(String value) {
        this.param9 = value;
    }

    /**
     * Gets the value of the consistent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsistent() {
        return consistent;
    }

    /**
     * Sets the value of the consistent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsistent(String value) {
        this.consistent = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnique(String value) {
        this.unique = value;
    }

    /**
     * Gets the value of the persistent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistent() {
        return persistent;
    }

    /**
     * Sets the value of the persistent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistent(String value) {
        this.persistent = value;
    }

    /**
     * Gets the value of the synchronizeWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchronizeWith() {
        return synchronizeWith;
    }

    /**
     * Sets the value of the synchronizeWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchronizeWith(String value) {
        this.synchronizeWith = value;
    }

    /**
     * Gets the value of the persistentColumnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistentColumnID() {
        return persistentColumnID;
    }

    /**
     * Sets the value of the persistentColumnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistentColumnID(String value) {
        this.persistentColumnID = value;
    }

    /**
     * Gets the value of the missingValuesAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingValuesAs() {
        return missingValuesAs;
    }

    /**
     * Sets the value of the missingValuesAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingValuesAs(String value) {
        this.missingValuesAs = value;
    }

    /**
     * Gets the value of the maskSeq property.
     * 
     */
    public int getMaskSeq() {
        return maskSeq;
    }

    /**
     * Sets the value of the maskSeq property.
     * 
     */
    public void setMaskSeq(int value) {
        this.maskSeq = value;
    }

    /**
     * Gets the value of the tableMaskSeq property.
     * 
     */
    public int getTableMaskSeq() {
        return tableMaskSeq;
    }

    /**
     * Sets the value of the tableMaskSeq property.
     * 
     */
    public void setTableMaskSeq(int value) {
        this.tableMaskSeq = value;
    }

    /**
     * Gets the value of the keepNull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepNull() {
        return keepNull;
    }

    /**
     * Sets the value of the keepNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepNull(String value) {
        this.keepNull = value;
    }

    /**
     * Gets the value of the dbLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbLink() {
        return dbLink;
    }

    /**
     * Sets the value of the dbLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbLink(String value) {
        this.dbLink = value;
    }

    /**
     * Gets the value of the constraintName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * Sets the value of the constraintName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintName(String value) {
        this.constraintName = value;
    }

    /**
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintType(String value) {
        this.constraintType = value;
    }

    /**
     * Gets the value of the isNullable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNullable() {
        return isNullable;
    }

    /**
     * Sets the value of the isNullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNullable(Boolean value) {
        this.isNullable = value;
    }

    /**
     * Gets the value of the isIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIdentity() {
        return isIdentity;
    }

    /**
     * Sets the value of the isIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdentity(Boolean value) {
        this.isIdentity = value;
    }

    /**
     * Gets the value of the ifValueNotFound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfValueNotFound() {
        return ifValueNotFound;
    }

    /**
     * Sets the value of the ifValueNotFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfValueNotFound(String value) {
        this.ifValueNotFound = value;
    }

    /**
     * Gets the value of the ifNullValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfNullValue() {
        return ifNullValue;
    }

    /**
     * Sets the value of the ifNullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfNullValue(String value) {
        this.ifNullValue = value;
    }

    /**
     * Gets the value of the checkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * Sets the value of the checkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCode(String value) {
        this.checkCode = value;
    }

	public Boolean getIsNumeric() {
		return isNumeric;
	}

	public void setIsNumeric(Boolean isNumeric) {
		this.isNumeric = isNumeric;
	}
	
	public Boolean getIsFph() {
			return isFph;
	}

	public void setIsFph(Boolean isFph) {
			this.isFph = isFph;
	}

	public Integer getRegexId() {
		return regexId;
	}

	public void setRegexId(Integer regexId) {
		this.regexId = regexId;
	}

	public Integer getHitCount() {
		return hitCount;
	}

	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}

	public String getCheckValid() {
		return checkValid;
	}

	public void setCheckValid(String checkValid) {
		this.checkValid = checkValid;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	
	
    
    

}
