package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgHadoopFileTaskWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHadoopFileTaskWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dgHadoopFileTaskList" type="{http://webservices.dataguise.com/}dgHadoopFileTask" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "dgHadoopFileTaskWrapper", propOrder = {
		"dgHadoopFileTaskList", "totalRecords" })
public class DgHadoopFileTaskWrapper {

	@XmlElement(nillable = true)
	protected List<DgHadoopFileTask> dgHadoopFileTaskList;
	protected Integer totalRecords;

	/**
	 * Gets the value of the dgHadoopFileTaskList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dgHadoopFileTaskList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDgHadoopFileTaskList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgHadoopFileTask }
	 * 
	 * 
	 */
	public List<DgHadoopFileTask> getDgHadoopFileTaskList() {
		if (dgHadoopFileTaskList == null) {
			dgHadoopFileTaskList = new ArrayList<DgHadoopFileTask>();
		}
		return this.dgHadoopFileTaskList;
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

}