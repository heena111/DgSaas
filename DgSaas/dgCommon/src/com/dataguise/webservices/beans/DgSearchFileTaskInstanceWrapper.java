
	package com.dataguise.webservices.beans;

	import java.util.ArrayList;
	import java.util.List;
	import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlType;

	/**
	 * <p>
	 * Java class for dgFindItTaskWrapper complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within
	 * this class.
	 * 
	 * <pre>
	 * &lt;complexType name="dgFindItTaskWrapper">
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="dgFindItTaskList" type="{http://webservices.dataguise.com/}dgDatabaseFindTask" maxOccurs="unbounded" minOccurs="0"/>
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
	@XmlType(name = "DgSearchFileTaskInstanceWrapper", propOrder = { "dgSearchFileTaskList",
			"totalRecords" })
	public class DgSearchFileTaskInstanceWrapper {

		@XmlElement(nillable = true)
		protected List<DgSearchFileTaskInstance> dgSearchFileTaskList;
		protected Integer totalRecords;

		/**
		 * Gets the value of the dgFindItTaskList property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list will
		 * be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the dgFindItTaskList property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getDgFindItTaskList().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link DgDatabaseFindTask }
		 * 
		 * 
		 */
		public List<DgSearchFileTaskInstance> getDgSearchFileTaskList() {
			if (dgSearchFileTaskList == null) {
				dgSearchFileTaskList = new ArrayList<DgSearchFileTaskInstance>();
			}
			return this.dgSearchFileTaskList;
		}
		public void  setDgSearchFileTaskList(List<DgSearchFileTaskInstance> dgSearchFileTaskList) {
			
		
			this.dgSearchFileTaskList =dgSearchFileTaskList;
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


