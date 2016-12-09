package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for saveDiscoverSafeList complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="saveDiscoverSafeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://webservices.dataguise.com/}dgDiscoverSafe" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveDiscoverSafeList", propOrder = { "arg0", "arg1", "arg2" })
public class SaveDiscoverSafeList {

	protected Integer arg0;
	protected List<DgDiscoverSafe> arg1;
	protected Integer arg2;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setArg0(Integer value) {
		this.arg0 = value;
	}

	/**
	 * Gets the value of the arg1 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the arg1 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getArg1().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgDiscoverSafe }
	 * 
	 * 
	 */
	public List<DgDiscoverSafe> getArg1() {
		if (arg1 == null) {
			arg1 = new ArrayList<DgDiscoverSafe>();
		}
		return this.arg1;
	}

	/**
	 * Gets the value of the arg2 property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getArg2() {
		return arg2;
	}

	/**
	 * Sets the value of the arg2 property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setArg2(Integer value) {
		this.arg2 = value;
	}

}
