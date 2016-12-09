
package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NMapOutputArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMapOutputArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseInfo" type="{http://webservices.dataguise.com/}DatabaseInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMapOutputArray", namespace = "http://masker.webservices.dataguise.com/", propOrder = {
    "databaseInfo"
})
public class NMapOutputArray {

    @XmlElement(name = "DatabaseInfo", required = true, nillable = true)
    protected List<DatabaseInfo> databaseInfo;

    /**
     * Gets the value of the databaseInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databaseInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabaseInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseInfo }
     * 
     * 
     */
    public List<DatabaseInfo> getDatabaseInfo() {
        if (databaseInfo == null) {
            databaseInfo = new ArrayList<DatabaseInfo>();
        }
        return this.databaseInfo;
    }

}
