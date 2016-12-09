package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.dataguise.webservices.beans.hadoop.DgHadoopFieldLevelResultsDetail;

/**
 * <p>
 * Java class for dgHadoopFieldLevelResultsDetailWrapper complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgHadoopFieldLevelResultsDetailWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dgHadoopFieldLevelResultsDetail" type="{http://webservices.dataguise.com/}dgUITaskInstance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *          &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *           &lt;element name="taskInstId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *           &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgHadoopFieldLevelResultsDetailWrapper", propOrder = {
		"dgHadoopFieldLevelResultsDetail", "totalRecords" })
public class DgHadoopFieldLevelResultsDetailWrapper {

	

	@XmlElement(nillable = true)
	protected List<DgHadoopFieldLevelResultsDetail> dgHadoopFieldLevelResultsDetail;
	protected Integer totalRecords;
	protected String taskName;
	protected Integer taskInstId;
	protected String startTime;
	
	/**
	 * Gets the value of the dgHadoopFieldLevelResultsDetail property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dgHadoopFieldLevelResultsDetail property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDgHadoopFieldLevelResultsDetailList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgHadoopFieldLevelResultsDetail }
	 * 
	 * 
	 */
	public List<DgHadoopFieldLevelResultsDetail> getDgHadoopFieldLevelResultsDetailList() {
		if (dgHadoopFieldLevelResultsDetail == null) {
			dgHadoopFieldLevelResultsDetail = new ArrayList<DgHadoopFieldLevelResultsDetail>();
		}
		return this.dgHadoopFieldLevelResultsDetail;
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
	
	
	public void setDgHadoopFieldLevelResultsDetailList(List<DgHadoopFieldLevelResultsDetail> dgHadoopFieldLevelResultsDetail) {
		this.dgHadoopFieldLevelResultsDetail = dgHadoopFieldLevelResultsDetail;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Integer getTaskInstId() {
		return taskInstId;
	}

	public void setTaskInstId(Integer taskInstId) {
		this.taskInstId = taskInstId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	
}