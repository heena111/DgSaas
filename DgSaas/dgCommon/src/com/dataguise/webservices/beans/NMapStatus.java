
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NMapStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMapStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NMapOperationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMapStatus", namespace = "http://masker.webservices.dataguise.com/", propOrder = {
    "nMapOperationStatus"
})
public class NMapStatus {

    @XmlElement(name = "NMapOperationStatus", required = true)
    protected String nMapOperationStatus;

    /**
     * Gets the value of the nMapOperationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMapOperationStatus() {
        return nMapOperationStatus;
    }

    /**
     * Sets the value of the nMapOperationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMapOperationStatus(String value) {
        this.nMapOperationStatus = value;
    }

}
