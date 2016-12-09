package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgUITaskInstanceWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgUITaskInstanceWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dgUITaskInstanceList" type="{http://webservices.dataguise.com/}dgUITaskInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgUITaskInstanceWrapper", propOrder = {
		"dgUITaskInstanceList", "totalRecords" })
public class DgUITaskInstanceWrapper {

	

	@XmlElement(nillable = true)
	protected List<DgUITaskInstance> dgUITaskInstanceList;
	protected Integer totalRecords;

	/**
	 * Gets the value of the dgUITaskInstanceList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dgUITaskInstanceList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDgUITaskInstanceList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgUITaskInstance }
	 * 
	 * 
	 */
	public List<DgUITaskInstance> getDgUITaskInstanceList() {
		if (dgUITaskInstanceList == null) {
			dgUITaskInstanceList = new ArrayList<DgUITaskInstance>();
		}
		return this.dgUITaskInstanceList;
	}

	/**
	 * Gets the value of the totalRecords property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getTotalRecords() {
		return totalRecords;
	}

	/**
	 * Sets the value of the totalRecords property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setTotalRecords(Integer value) {
		this.totalRecords = value;
	}
	
	
	public void setDgUITaskInstanceList(List<DgUITaskInstance> dgUITaskInstanceList) {
		this.dgUITaskInstanceList = dgUITaskInstanceList;
	}
}