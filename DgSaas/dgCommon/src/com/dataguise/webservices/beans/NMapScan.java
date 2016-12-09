
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NMapScan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMapScan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPRanges" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMapScan", namespace = "http://masker.webservices.dataguise.com/", propOrder = {
    "ipRanges",
    "portNumber"
})
public class NMapScan {

    @XmlElement(name = "IPRanges", required = true)
    protected String ipRanges;
    @XmlElement(name = "PortNumber")
    protected String portNumber;

    /**
     * Gets the value of the ipRanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPRanges() {
        return ipRanges;
    }

    /**
     * Sets the value of the ipRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPRanges(String value) {
        this.ipRanges = value;
    }

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortNumber(String value) {
        this.portNumber = value;
    }

}
