package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgDiscoverExpression complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgDiscoverExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnDataRegex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="columnNameRegex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expressionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isExpNumeric" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *          &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgDiscoverExpression", propOrder = { "columnDataRegex",
		"columnNameRegex", "expressionDescription", "expressionGroup",
		"expressionGroupType", "expressionID", "expressionName",
		"expressionType", "isExpNumeric", "referenceDataPath","exclusionDataPath",
		"columnNameWhiteListPath","columnNameBlackListPath","validationFunctionName",
		"reportInResults", "peckingOrder","minColumnLengthReq"

})
public class DgDiscoverExpression extends DgBaseBean {

	protected String columnDataRegex;
	protected String columnNameRegex;
	protected String expressionDescription;
	protected String expressionGroup;
	protected Integer expressionID;
	protected String expressionName;
	protected String expressionType;
	protected String expressionGroupType;
	private Short isExpNumeric;
	private String referenceDataPath;
	private String exclusionDataPath;
	private String columnNameWhiteListPath;
	private String columnNameBlackListPath;
	private String validationFunctionName;
	private Boolean reportInResults = true;
	private Integer peckingOrder;
	private Integer minColumnLengthReq;

	

	public Integer getPeckingOrder() {
		return peckingOrder;
	}

	public void setPeckingOrder(Integer peckingOrder) {
		this.peckingOrder = peckingOrder;
	}

	/**
	 * Gets the value of the columnDataRegex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnDataRegex() {
		return columnDataRegex;
	}

	/**
	 * Sets the value of the columnDataRegex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnDataRegex(String value) {
		this.columnDataRegex = value;
	}

	/**
	 * Gets the value of the columnNameRegex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColumnNameRegex() {
		return columnNameRegex;
	}

	/**
	 * Sets the value of the columnNameRegex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColumnNameRegex(String value) {
		this.columnNameRegex = value;
	}

	/**
	 * Gets the value of the expressionDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionDescription() {
		return expressionDescription;
	}

	/**
	 * Sets the value of the expressionDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionDescription(String value) {
		this.expressionDescription = value;
	}

	/**
	 * Gets the value of the expressionGroup property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionGroup() {
		return expressionGroup;
	}

	/**
	 * Sets the value of the expressionGroup property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionGroup(String value) {
		this.expressionGroup = value;
	}

	/**
	 * Gets the value of the expressionGroupType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */

	public String getExpressionGroupType() {
		return expressionGroupType;
	}

	/**
	 * Sets the value of the expressionGroupType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionGroupType(String expressionGroupType) {
		this.expressionGroupType = expressionGroupType;
	}

	/**
	 * Gets the value of the expressionID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getExpressionID() {
		return expressionID;
	}

	/**
	 * Sets the value of the expressionID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setExpressionID(Integer value) {
		this.expressionID = value;
	}

	/**
	 * Gets the value of the expressionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionName() {
		return expressionName;
	}

	/**
	 * Sets the value of the expressionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionName(String value) {
		this.expressionName = value;
	}

	/**
	 * Gets the value of the expressionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpressionType() {
		return expressionType;
	}

	/**
	 * Sets the value of the expressionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpressionType(String value) {
		this.expressionType = value;
	}

	@Override
	public String toString() {

		return expressionName;
	}

	public void setIsExpNumeric(Short isExpNumeric) {
		this.isExpNumeric = isExpNumeric;
	}

	public Short getIsExpNumeric() {
		return isExpNumeric;
	}

	public String getReferenceDataPath() {
		return referenceDataPath;
	}

	public void setReferenceDataPath(String referenceDataPath) {
		this.referenceDataPath = referenceDataPath;
	}
	

	public String getExclusionDataPath() {
		return exclusionDataPath;
	}


	public void setExclusionDataPath(String exclusionDataPath) {
		this.exclusionDataPath = exclusionDataPath;
	}

	
	public String getColumnNameWhiteListPath() {
		return columnNameWhiteListPath;
	}


	public void setColumnNameWhiteListPath(String columnNameWhiteList) {
		this.columnNameWhiteListPath = columnNameWhiteList;
	}


	public String getColumnNameBlackListPath() {
		return columnNameBlackListPath;
	}


	public void setColumnNameBlackListPath(String columnNameBlackList) {
		this.columnNameBlackListPath = columnNameBlackList;
	}

	public String getValidationFunctionName() {
		return validationFunctionName;
	}

	public void setValidationFunctionName(String validationFunctionName) {
		this.validationFunctionName = validationFunctionName;
	}

	public Boolean getReportInResults() {
		return reportInResults;
	}

	public void setReportInResults(Boolean reportInResults) {
		this.reportInResults = reportInResults;
	}
	
	public Integer getMinColumnLengthReq() {
		return minColumnLengthReq;
	}

	public void setMinColumnLengthReq(Integer minColumnLengthReq) {
		this.minColumnLengthReq = minColumnLengthReq;
	}

}
