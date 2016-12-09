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
 * Java class for dgSearchFileNetworkMapping complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgSearchFileNetworkMapping">
 *   &lt;complexContent>
 *     &lt;extension base="{http://masker.webservices.dataguise.com/}dgBaseBean">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="networkPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgSearchFileNetworkMapping", propOrder = { "networkMapId","connectionName",
		"networkPath", "userName", "password", "ipAddress"})
public class DgSearchFileNetworkMapping extends DgBaseBean {

	protected Integer networkMapId;
	
	@NotEmpty(message="Connection Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=128, message="Connection Name:"+BeanValidator.MAX_SIZE_128)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Connection Name:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String connectionName;
	
    @NotEmpty(message="Network Path:"+BeanValidator.EMPTY_FIELD)
 	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Network Path:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String networkPath;

    @NotEmpty(message="UserName:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "UserName:"+BeanValidator.INVALID_CHARACTER_SET)
	protected String userName;
	
	@Pattern(regexp = BeanValidator.GENERIC_TEXT_REGEX , message = "Password:"+BeanValidator.INVALID_CHARACTER_SET)
    protected String password;
	
	@NotEmpty(message="IP Address:"+BeanValidator.EMPTY_FIELD)
	@Pattern(regexp = BeanValidator.IP_ADDRESS_REGEX , message = "IP Address:"+BeanValidator.INVALID_IP_ADDRESS)
	protected String ipAddress;




	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNetworkMapId() {
		return networkMapId;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNetworkMapId(Integer value) {
		this.networkMapId = value;
	}

	/**
	 * Gets the value of the networkPath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNetworkPath() {
		return networkPath;
	}

	/**
	 * Sets the value of the networkPath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNetworkPath(String value) {
		this.networkPath = value;
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
	 * @return the connectionName
	 */
	public String getConnectionName() {
		return connectionName;
	}

	/**
	 * @param connectionName the connectionName to set
	 */
	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

}
