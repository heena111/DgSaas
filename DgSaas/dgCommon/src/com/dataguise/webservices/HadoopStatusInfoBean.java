
package com.dataguise.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hadoopStatusInfoBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hadoopStatusInfoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mapProgress" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="reduceProgress" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopStatusInfoBean", propOrder = {
    "mapProgress",
    "reduceProgress",
    "status"
})
public class HadoopStatusInfoBean {

    protected float mapProgress;
    protected float reduceProgress;
    protected String status;

    /**
     * Gets the value of the mapProgress property.
     * 
     */
    public float getMapProgress() {
        return mapProgress;
    }

    /**
     * Sets the value of the mapProgress property.
     * 
     */
    public void setMapProgress(float value) {
        this.mapProgress = value;
    }

    /**
     * Gets the value of the reduceProgress property.
     * 
     */
    public float getReduceProgress() {
        return reduceProgress;
    }

    /**
     * Sets the value of the reduceProgress property.
     * 
     */
    public void setReduceProgress(float value) {
        this.reduceProgress = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
