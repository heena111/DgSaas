
package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			A server-to-client (Response) entity.  Used by the agent to acknowledge requests from 
 * 			central controller.  Includes an indication as to the disposition of the associated request: Completed,
 * 			Failed, In-progress, or Suspended.  
 * 			
 * 
 * <p>Java class for AbstractAcknowledgement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAcknowledgement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="taskInstanceID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="state" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="COMPLETED"/>
 *             &lt;enumeration value="FAILED"/>
 *             &lt;enumeration value="IN-PROGRESS"/>
 *             &lt;enumeration value="SUSPENDED"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaskerAcknowledgement", propOrder = {
    "message"
})
public class MaskerAcknowledgement {

    @XmlElement(name = "Message")
    protected String message;
    @XmlAttribute
    protected Integer taskInstanceID;
    @XmlAttribute(required = true)
    protected String state;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the taskInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskInstanceID() {
        return taskInstanceID;
    }

    /**
     * Sets the value of the taskInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskInstanceID(Integer value) {
        this.taskInstanceID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
