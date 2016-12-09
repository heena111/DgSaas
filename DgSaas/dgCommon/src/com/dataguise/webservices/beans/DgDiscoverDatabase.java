
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dgDiscoverDatabase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dgDiscoverDatabase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="connectionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="connectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgDiscoverDatabase", propOrder = {
    "connectionDescription",
    "connectionID",
    "connectionName",
    "databaseID",
    "databaseName"
})
public class DgDiscoverDatabase {

    protected String connectionDescription;
    protected Integer connectionID;
    protected String connectionName;
    protected Integer databaseID;
    protected String databaseName;

    /**
     * Gets the value of the connectionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionDescription() {
        return connectionDescription;
    }

    /**
     * Sets the value of the connectionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionDescription(String value) {
        this.connectionDescription = value;
    }

    /**
     * Gets the value of the connectionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionID() {
        return connectionID;
    }

    /**
     * Sets the value of the connectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionID(Integer value) {
        this.connectionID = value;
    }

    /**
     * Gets the value of the connectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionName(String value) {
        this.connectionName = value;
    }

    /**
     * Gets the value of the databaseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatabaseID() {
        return databaseID;
    }

    /**
     * Sets the value of the databaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatabaseID(Integer value) {
        this.databaseID = value;
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

}
