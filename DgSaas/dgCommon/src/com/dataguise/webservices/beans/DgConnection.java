package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;


import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;
import com.dataguise.webservices.beans.discover.database.DgSchemaFilteList;

/**
 * <p>
 * Java class for dgConnection complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgConnection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://masker.webservices.dataguise.com/}dgBaseBean">
 *       &lt;sequence>
 *         &lt;element name="connectionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostNameOrIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleConnectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleInstanceIDMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oracleTNSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sqlServerAuthentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgConnection", namespace = "http://masker.webservices.dataguise.com/", propOrder = {
		"connectionId", "connectionName", "connectionAgent", "connectionType",
		"database", "hostNameOrIPAddress", "oracleConnectionType", "oracleSID",
		"oracleServiceName", "password", "portNumber", "userName",
		"oracleInstanceIDMethod", "oracleTNSName", "sqlServerAuthentication","creatorDbList","schemaFilter","IPAddress","schemaName","instanceName","filterList","module","groupId","groupName","location","clusterId"})
public class DgConnection extends DgBaseBean {

	protected Integer connectionId;
	
	@NotEmpty(message = "Connection Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=64 , message = "Connection Name:"+BeanValidator.MAX_SIZE_64)
    @Pattern(regexp=BeanValidator.DBMS_CONNECTION_NAME , message=BeanValidator.INVALID_CONNECTION_NAME)
	protected String connectionName;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String connectionAgent;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String connectionType;
	protected List<String> database = new ArrayList<String>();
	
	
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String hostNameOrIPAddress;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String oracleConnectionType;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String oracleSID;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String oracleServiceName;

    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String password;
	
    @Max(value=65535, message="Invalid port number value")
	protected Integer portNumber;
	
	//@NotEmpty(message = "User Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=64 , message = "User Name:"+BeanValidator.MAX_SIZE_64)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String userName;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String oracleInstanceIDMethod;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String oracleTNSName;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String sqlServerAuthentication;
	protected List<String> schemaFilter = new ArrayList<String>();
	protected List<DatabaseCreatorsBean> creatorDbList = new ArrayList<DatabaseCreatorsBean>();
	
//	@NotEmpty(message = "IP Address:"+BeanValidator.EMPTY_FIELD)
    @Size(max=64 , message = "IP Address:"+BeanValidator.MAX_SIZE_64)
    @Pattern(regexp=BeanValidator.IP_ADDRESS_REGEX_DBMS_CONNECTION , message=BeanValidator.INVALID_IP_ADDRESS)
	protected String IPAddress;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String schemaName;
	@Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
	protected String instanceName;
	protected String module;
	protected Integer groupId;
	protected String groupName;
	protected String location;
	protected Integer clusterId;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	protected List<DgSchemaFilteList> filterList;
	
	public List<DgSchemaFilteList> getFilterList() {
		return filterList;
	}

	public void setFilterList(List<DgSchemaFilteList> filterList) {
		this.filterList = filterList;
	}

	/**
	 * Gets the value of the connectionId property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getConnectionId() {
		return connectionId;
	}

	/**
	 * Sets the value of the connectionId property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setConnectionId(Integer value) {
		this.connectionId = value;
	}

	/**
	 * Gets the value of the connectionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionName() {
		return connectionName;
	}

	/**
	 * Sets the value of the connectionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionName(String value) {
		this.connectionName = value;
	}

	/**
	 * Gets the value of the connectionAgent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionAgent() {
		return connectionAgent;
	}

	/**
	 * Sets the value of the connectionAgent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionAgent(String value) {
		this.connectionAgent = value;
	}

	/**
	 * Gets the value of the connectionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConnectionType() {
		return connectionType;
	}

	/**
	 * Sets the value of the connectionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConnectionType(String value) {
		this.connectionType = value;
	}

	/**
	 * Gets the value of the database property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public List<String> getDatabase() {
		return database;
	}

	/**
	 * Sets the value of the database property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatabase(List<String> value) {
		this.database = value;
	}

	public void addDatabaseToConnection(String value) {
		this.database.add(value);
	}

	/**
	 * Gets the value of the hostNameOrIPAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHostNameOrIPAddress() {
		return hostNameOrIPAddress;
	}

	/**
	 * Sets the value of the hostNameOrIPAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHostNameOrIPAddress(String value) {
		this.hostNameOrIPAddress = value;
	}

	/**
	 * Gets the value of the oracleConnectionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleConnectionType() {
		return oracleConnectionType;
	}

	/**
	 * Sets the value of the oracleConnectionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleConnectionType(String value) {
		this.oracleConnectionType = value;
	}

	/**
	 * Gets the value of the oracleSID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleSID() {
		return oracleSID;
	}

	/**
	 * Sets the value of the oracleSID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleSID(String value) {
		this.oracleSID = value;
	}

	/**
	 * Gets the value of the oracleServiceName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleServiceName() {
		return oracleServiceName;
	}

	/**
	 * Sets the value of the oracleServiceName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleServiceName(String value) {
		this.oracleServiceName = value;
	}

	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Gets the value of the portNumber property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPortNumber() {
		return portNumber;
	}

	/**
	 * Sets the value of the portNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPortNumber(Integer value) {
		this.portNumber = value;
	}

	/**
	 * Gets the value of the userName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/**
	 * Gets the value of the oracleInstanceIDMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleInstanceIDMethod() {
		return oracleInstanceIDMethod;
	}

	/**
	 * Sets the value of the oracleInstanceIDMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleInstanceIDMethod(String value) {
		this.oracleInstanceIDMethod = value;
	}

	/**
	 * Gets the value of the oracleTNSName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOracleTNSName() {
		return oracleTNSName;
	}

	/**
	 * Sets the value of the oracleTNSName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOracleTNSName(String value) {
		this.oracleTNSName = value;
	}

	/**
	 * Gets the value of the sqlServerAuthentication property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSqlServerAuthentication() {
		return sqlServerAuthentication;
	}

	/**
	 * Sets the value of the sqlServerAuthentication property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSqlServerAuthentication(String value) {
		this.sqlServerAuthentication = value;
	}

	/**
	 * Gets the value of the schemaFilter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public List<String> getSchemaFilter() {
		return schemaFilter;
	}

	/**
	 * Sets the value of the schemaFilter property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSchemaFilter(List<String> schemaFilter) {
		this.schemaFilter = schemaFilter;
	}

	public void addSchemaFilter(String value) {
		this.schemaFilter.add(value);
	}
	/**
	 * Gets the value of the DatabaseCreatorsBean List.
	 * 
	 */
	public List<DatabaseCreatorsBean> getCreatorDbList() {
		return creatorDbList;
	}

	/**
	 * Sets the value of the DatabaseCreatorsBean List.
	 * 
	 */
	public void setCreatorDbList(List<DatabaseCreatorsBean> creatorDbList) {
		this.creatorDbList = creatorDbList;
	}

	public void addCreatorDb(DatabaseCreatorsBean value) {
		this.creatorDbList.add(value);
	}
	/**
	 * @return the iPAddress
	 */
	public String getIPAddress() {
		return IPAddress;
	}

	/**
	 * @param iPAddress the iPAddress to set
	 */
	public void setIPAddress(String IPAddress) {
		this.IPAddress = IPAddress;
	}
	
	
	
	@Override
	public String toString() {
		
		return connectionName;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getClusterId() {
		return clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}
	
}
