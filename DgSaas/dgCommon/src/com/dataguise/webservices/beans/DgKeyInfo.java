
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DgKeyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgKeyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destTableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destKeyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgKeyInfo", namespace = "http://webservices.dataguise.com/", propOrder = {
    "sourceTableName",
    "keyName",
    "keyType",
    "destTableName",
    "destKeyName"
})
public class DgKeyInfo {

    protected String sourceTableName;
    protected String keyName;
    protected String keyType;
    protected String destTableName;
    protected String destKeyName;

    /**
     * Gets the value of the sourceTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * Sets the value of the sourceTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTableName(String value) {
        this.sourceTableName = value;
    }

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the destTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTableName() {
        return destTableName;
    }

    /**
     * Sets the value of the destTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTableName(String value) {
        this.destTableName = value;
    }

    /**
     * Gets the value of the destKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestKeyName() {
        return destKeyName;
    }

    /**
     * Sets the value of the destKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestKeyName(String value) {
        this.destKeyName = value;
    }

}
