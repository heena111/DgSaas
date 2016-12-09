
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for startDatabaseFindResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startDatabaseFindResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://masker.webservices.dataguise.com/}NMapTaskIdAckElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startDatabaseFindResponse", propOrder = {
    "_return"
})
public class StartDatabaseFindResponse {

    @XmlElement(name = "return")
    protected NMapTaskIdAckElement _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link NMapTaskIdAckElement }
     *     
     */
    public NMapTaskIdAckElement getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMapTaskIdAckElement }
     *     
     */
    public void setReturn(NMapTaskIdAckElement value) {
        this._return = value;
    }

}
