package com.dataguise.webservices.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgUserAuthorities complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgUserAuthorities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionsAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productsAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *          &lt;element name="productsBlackOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *          &lt;element name="superUserCheckFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *          &lt;element name="policySlave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *          
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgUserAuthorities", propOrder = { "actionsAllowed",
		"productsAllowed", "sessionID", "userName" ,"expiremessage","VersionNo","productsBlackOut","superUserCheckFlag","policySlave","useCouchbase","isDBAuth","clusterInfo","lastLoginTime"})
public class DgUserAuthorities {

	protected String actionsAllowed;
	protected String productsAllowed;
	protected String sessionID;
	protected String userName;
	protected String expiremessage;
	protected String VersionNo;
	protected String productsBlackOut;
	protected boolean superUserCheckFlag ;
	protected boolean  policySlave;
	protected boolean useCouchbase;
	protected Boolean isDBAuth;
	protected List<DgClusterInfo> clusterInfo;
	protected String lastLoginTime;		//using String instead of Timestamp so that we can handle scenario when last login time not available 
	protected DgS3ClusterInfo dgS3ClusterInfo;
	


	/**
	 * Gets the value of the actionsAllowed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getActionsAllowed() {
		return actionsAllowed;
	}

	/**
	 * Sets the value of the actionsAllowed property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActionsAllowed(String value) {
		this.actionsAllowed = value;
	}

	/**
	 * Gets the value of the productsAllowed property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductsAllowed() {
		return productsAllowed;
	}

	/**
	 * Sets the value of the productsAllowed property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProductsAllowed(String value) {
		this.productsAllowed = value;
	}

	/**
	 * Gets the value of the sessionID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSessionID() {
		return sessionID;
	}

	/**
	 * Sets the value of the sessionID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSessionID(String value) {
		this.sessionID = value;
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

	public String getExpiremessage() {
		return expiremessage;
	}

	public void setExpiremessage(String expiremessage) {
		this.expiremessage = expiremessage;
	}

	public String getVersionNo() {
		return VersionNo;
	}

	public void setVersionNo(String versionNo) {
		VersionNo = versionNo;
	}

	public String getProductsBlackOut() {
		return productsBlackOut;
	}

	public void setProductsBlackOut(String productsBlackOut) {
		this.productsBlackOut = productsBlackOut;
	}

	public boolean isSuperUserCheckFlag() {
		return superUserCheckFlag;
	}

	public void setSuperUserCheckFlag(boolean superUserCheckFlag) {
		this.superUserCheckFlag = superUserCheckFlag;
	}

	public boolean isPolicySlave() {
		return policySlave;
	}

	public void setPolicySlave(boolean policySlave) {
		this.policySlave = policySlave;
	}

	public boolean isUseCouchbase() {
		return useCouchbase;
	}

	public void setUseCouchbase(boolean useCouchbase) {
		this.useCouchbase = useCouchbase;
	}

	public Boolean getIsDBAuth() {
		return isDBAuth;
	}

	public void setIsDBAuth(Boolean isDBAuth) {
		this.isDBAuth = isDBAuth;
	}

	public List<DgClusterInfo> getClusterInfo() {
		return clusterInfo;
	}

	public void setClusterInfo(List<DgClusterInfo> clusterInfo) {
		this.clusterInfo = clusterInfo;
	}


	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public DgS3ClusterInfo getDgS3ClusterInfo() {
		return dgS3ClusterInfo;
	}

	public void setDgS3ClusterInfo(DgS3ClusterInfo dgS3ClusterInfo) {
		this.dgS3ClusterInfo = dgS3ClusterInfo;
	}
	
}
