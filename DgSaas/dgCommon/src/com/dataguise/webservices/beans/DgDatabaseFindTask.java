
package com.dataguise.webservices.beans;

import java.util.Comparator;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;


/**
 * <p>Java class for dgDatabaseFindTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dgDatabaseFindTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://masker.webservices.dataguise.com/}dgBaseBean">
 *       &lt;sequence>
 *         &lt;element name="db2PortRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipAddressRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mySQLPortRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraclePortRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sqlServerNativeSearch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sqlServerPortRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sybasePortRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgDatabaseFindTask", propOrder = {
    "db2PortRange",
    "ipAddressRange",
    "mySQLPortRange",
    "oraclePortRange",
    "sqlServerNativeSearch",
    "sqlServerPortRange",
    "sybasePortRange",
    "postgresPortRange",
    "taskDescription",
    "taskName",
    "databaseFindTaskID",
    "greenplumPortRange",
    "scanType",
    "module"
})
public class DgDatabaseFindTask extends DgBaseBean  {

	@Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
	protected String db2PortRange;
    protected String ipAddressRange;
    @Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
    protected String mySQLPortRange;
    @Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
    protected String oraclePortRange;
    protected Integer sqlServerNativeSearch;
    @Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
    protected String sqlServerPortRange;
    @Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
    protected String sybasePortRange;
    @Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
    protected String postgresPortRange;
    @NotEmpty(message = "Task Description:"+BeanValidator.EMPTY_FIELD)
    @Size(max=256 , message = "Task Description:"+BeanValidator.MAX_SIZE_256)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String taskDescription;
    @NotEmpty(message = "Task Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=128 , message = "Task Name:"+BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String taskName;
    protected Integer databaseFindTaskID;
    @Pattern(regexp=BeanValidator.FIND_IT_PORT_RANGE_REGEX , message="Invalid port number value")
    private String greenplumPortRange;
    private String scanType;
    protected String module;
    
    /**
	 * @return the scanType
	 */
	public String getScanType() {
		return scanType;
	}

	/**
	 * @param scanType the scanType to set
	 */
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

	/**
     * Gets the value of the db2PortRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDb2PortRange() {
        return db2PortRange;
    }

    /**
     * Sets the value of the db2PortRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDb2PortRange(String value) {
        this.db2PortRange = value;
    }

    /**
     * Gets the value of the ipAddressRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressRange() {
        return ipAddressRange;
    }

    /**
     * Sets the value of the ipAddressRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressRange(String value) {
        this.ipAddressRange = value;
    }

    /**
     * Gets the value of the mySQLPortRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMySQLPortRange() {
        return mySQLPortRange;
    }

    /**
     * Sets the value of the mySQLPortRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMySQLPortRange(String value) {
        this.mySQLPortRange = value;
    }

    /**
     * Gets the value of the oraclePortRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOraclePortRange() {
        return oraclePortRange;
    }

    /**
     * Sets the value of the oraclePortRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOraclePortRange(String value) {
        this.oraclePortRange = value;
    }

    /**
     * Gets the value of the sqlServerNativeSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSqlServerNativeSearch() {
        return sqlServerNativeSearch;
    }

    /**
     * Sets the value of the sqlServerNativeSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSqlServerNativeSearch(Integer value) {
        this.sqlServerNativeSearch = value;
    }

    /**
     * Gets the value of the sqlServerPortRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlServerPortRange() {
        return sqlServerPortRange;
    }

    /**
     * Sets the value of the sqlServerPortRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlServerPortRange(String value) {
        this.sqlServerPortRange = value;
    }

    /**
     * Gets the value of the sybasePortRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSybasePortRange() {
        return sybasePortRange;
    }

    /**
     * Sets the value of the sybasePortRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSybasePortRange(String value) {
        this.sybasePortRange = value;
    }

    /**
     * Gets the value of the taskDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Sets the value of the taskDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDescription(String value) {
        this.taskDescription = value;
    }

    /**
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }
    
    /**
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getDatabaseFindTaskID() {
        return databaseFindTaskID;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseFindTaskID(Integer databaseFindTaskID) {
        this.databaseFindTaskID = databaseFindTaskID;
    }

	public String getPostgresPortRange() {
		return postgresPortRange;
	}

	public void setPostgresPortRange(String postgresPortRange) {
		this.postgresPortRange = postgresPortRange;
	}
	public String getGreenplumPortRange() {
		return greenplumPortRange;
	}

	public void setGreenplumPortRange(String greenplumPortRange) {
		this.greenplumPortRange = greenplumPortRange;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
	
	


}
