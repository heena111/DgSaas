package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgSynchDataStructure complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgSynchDataStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consistent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dbLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maskingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persistent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgSynchDataStructure", propOrder = { "columnId", "columnName",
		"consistent", "dbLink", "maskingType", "param1", "param2", "param3",
		"param4", "param5", "param6", "param7", "param8", "param9",
		"persistent", "schemaName", "synchronize","keepNull", "tableName", "unique" })
public class DgSynchDataStructure {

	protected int columnId;
	protected String columnName;
	protected String consistent;
	protected String dbLink;
	protected int maskingType;
	protected String param1;
	protected String param2;
	protected String param3;
	protected String param4;
	protected String param5;
	protected String param6;
	protected String param7;
	protected String param8;
	protected String param9;
	protected String persistent;
	protected String schemaName;
	protected String synchronize;
	protected String keepNull;
	protected String tableName;
	protected String unique;
	/**
	 * @return the columnId
	 */
	public int getColumnId() {
		return columnId;
	}
	/**
	 * @param columnId the columnId to set
	 */
	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}
	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		return columnName;
	}
	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	/**
	 * @return the consistent
	 */
	public String getConsistent() {
		return consistent;
	}
	/**
	 * @param consistent the consistent to set
	 */
	public void setConsistent(String consistent) {
		this.consistent = consistent;
	}
	/**
	 * @return the dbLink
	 */
	public String getDbLink() {
		return dbLink;
	}
	/**
	 * @param dbLink the dbLink to set
	 */
	public void setDbLink(String dbLink) {
		this.dbLink = dbLink;
	}
	/**
	 * @return the maskingType
	 */
	public int getMaskingType() {
		return maskingType;
	}
	/**
	 * @param maskingType the maskingType to set
	 */
	public void setMaskingType(int maskingType) {
		this.maskingType = maskingType;
	}
	/**
	 * @return the param1
	 */
	public String getParam1() {
		return param1;
	}
	/**
	 * @param param1 the param1 to set
	 */
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	/**
	 * @return the param2
	 */
	public String getParam2() {
		return param2;
	}
	/**
	 * @param param2 the param2 to set
	 */
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	/**
	 * @return the param3
	 */
	public String getParam3() {
		return param3;
	}
	/**
	 * @param param3 the param3 to set
	 */
	public void setParam3(String param3) {
		this.param3 = param3;
	}
	/**
	 * @return the param4
	 */
	public String getParam4() {
		return param4;
	}
	/**
	 * @param param4 the param4 to set
	 */
	public void setParam4(String param4) {
		this.param4 = param4;
	}
	/**
	 * @return the param5
	 */
	public String getParam5() {
		return param5;
	}
	/**
	 * @param param5 the param5 to set
	 */
	public void setParam5(String param5) {
		this.param5 = param5;
	}
	/**
	 * @return the param6
	 */
	public String getParam6() {
		return param6;
	}
	/**
	 * @param param6 the param6 to set
	 */
	public void setParam6(String param6) {
		this.param6 = param6;
	}
	/**
	 * @return the param7
	 */
	public String getParam7() {
		return param7;
	}
	/**
	 * @param param7 the param7 to set
	 */
	public void setParam7(String param7) {
		this.param7 = param7;
	}
	/**
	 * @return the param8
	 */
	public String getParam8() {
		return param8;
	}
	/**
	 * @param param8 the param8 to set
	 */
	public void setParam8(String param8) {
		this.param8 = param8;
	}
	/**
	 * @return the param9
	 */
	public String getParam9() {
		return param9;
	}
	/**
	 * @param param9 the param9 to set
	 */
	public void setParam9(String param9) {
		this.param9 = param9;
	}
	/**
	 * @return the persistent
	 */
	public String getPersistent() {
		return persistent;
	}
	/**
	 * @param persistent the persistent to set
	 */
	public void setPersistent(String persistent) {
		this.persistent = persistent;
	}
	/**
	 * @return the schemaName
	 */
	public String getSchemaName() {
		return schemaName;
	}
	/**
	 * @param schemaName the schemaName to set
	 */
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	/**
	 * @return the synchronize
	 */
	public String getSynchronize() {
		return synchronize;
	}
	/**
	 * @param synchronize the synchronize to set
	 */
	public void setSynchronize(String synchronize) {
		this.synchronize = synchronize;
	}
	/**
	 * @return the keepNull
	 */
	public String getKeepNull() {
		return keepNull;
	}
	/**
	 * @param keepNull the keepNull to set
	 */
	public void setKeepNull(String keepNull) {
		this.keepNull = keepNull;
	}
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * @return the unique
	 */
	public String getUnique() {
		return unique;
	}
	/**
	 * @param unique the unique to set
	 */
	public void setUnique(String unique) {
		this.unique = unique;
	}

	

}
