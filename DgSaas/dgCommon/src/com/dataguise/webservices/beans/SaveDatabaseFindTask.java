
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveDatabaseFindTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveDatabaseFindTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgDatabaseFindTask" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveDatabaseFindTask", propOrder = {
    "arg0"
})
public class SaveDatabaseFindTask {

    protected DgDatabaseFindTask arg0;
 
    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link DgDatabaseFindTask }
     *     
     */
    public DgDatabaseFindTask getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DgDatabaseFindTask }
     *     
     */
    public void setArg0(DgDatabaseFindTask value) {
        this.arg0 = value;
    }

   
}
