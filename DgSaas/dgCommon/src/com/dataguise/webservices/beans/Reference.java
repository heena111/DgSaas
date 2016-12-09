
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkSchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkTablename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkSchemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkTablename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
 //   "dbName",
   // "fkSchemaName",
    "fkTablename",
    "fkColumnName",
    "pkSchemaName",
    "pkTablename",
    "pkColumnName"
   })
public class Reference {
	 
  //  protected String dbName;
 //   protected String fkSchemaName;
    protected String destTableName;
    protected String destKeyName;
    protected String sourceTableName;
    protected String keyName;
    protected String keyType;
   
    /**
     * Gets the value of the destTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getdestTableName() {
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
    public void setdestTableName(String value) {
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
    public String getdestKeyName() {
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
    public void setdestKeyName(String value) {
        this.destKeyName = value;
    }

   
    /**
     * Gets the value of the sourceTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getsourceTableName() {
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
    public void setsourceTableName(String value) {
        this.sourceTableName = value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getkeyName() {
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
    public void setkeyName(String value) {
        this.keyName= value;
    }

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getkeyType() {
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
    public void setkeyType(String value) {
        this.keyType= value;
    }

    
}
