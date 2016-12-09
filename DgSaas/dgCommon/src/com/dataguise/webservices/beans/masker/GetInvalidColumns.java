package com.dataguise.webservices.beans.masker;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.dataguise.webservices.beans.DgColumnDetails;
import com.dataguise.webservices.beans.DgConnection;

/**
 * <p>
 * Java class for getInvalidColumns complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="getInvalidColumns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://MaskerAgent.webservices.dataguise.com/}dgColumnDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://masker.webservices.dataguise.com/}dgConnection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInvalidColumns", propOrder = { "arg0", "arg1" })
public class GetInvalidColumns {

	protected List<DgColumnDetails> arg0;
	protected DgConnection arg1;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the arg0 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getArg0().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgColumnDetails }
	 * 
	 * 
	 */
	public List<DgColumnDetails> getArg0() {
		if (arg0 == null) {
			arg0 = new ArrayList<DgColumnDetails>();
		}
		return this.arg0;
	}

	/**
	 * Gets the value of the arg1 property.
	 * 
	 * @return possible object is {@link DgConnection }
	 * 
	 */
	public DgConnection getArg1() {
		return arg1;
	}

	/**
	 * Sets the value of the arg1 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgConnection }
	 * 
	 */
	public void setArg1(DgConnection value) {
		this.arg1 = value;
	}

}
