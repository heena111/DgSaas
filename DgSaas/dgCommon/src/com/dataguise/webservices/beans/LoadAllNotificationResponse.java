

package com.dataguise.webservices.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for loadNotificationResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="loadAllNotificationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservices.dataguise.com/}DgAllNotificationBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadAllNotificationResponse", namespace = "http://webservices.dataguise.com/")
public class LoadAllNotificationResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.dataguise.webservices.beans.DgAllNotificationBean> _return;

    /**
     * 
     * @return
     *     returns List<DgNotificationBean>
     */
    public List<com.dataguise.webservices.beans.DgAllNotificationBean> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.dataguise.webservices.beans.DgAllNotificationBean> _return) {
        this._return = _return;
    }

}
