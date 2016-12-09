package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.dataguise.webservices.beans.masker.DgMaskerColumn;
import com.dataguise.webservices.beans.masker.DgMaskerLinkedColumn;
import com.dataguise.webservices.beans.masker.DgMaskerParameters;

/**
 * <p>
 * Java class for saveMaskerTask complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="saveMaskerTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgMaskerParameters" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://webservices.dataguise.com/}dgMaskerLinkedColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://webservices.dataguise.com/}dgMaskerColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveMaskerTask", propOrder = { "arg0", "arg1", "arg2" })
public class SaveMaskerTask {

	protected DgMaskerParameters arg0;
	protected List<DgMaskerLinkedColumn> arg1;
	protected List<DgMaskerColumn> arg2;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgMaskerParameters }
	 * 
	 */
	public DgMaskerParameters getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgMaskerParameters }
	 * 
	 */
	public void setArg0(DgMaskerParameters value) {
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
	 * {@link DgMaskerLinkedColumn }
	 * 
	 * 
	 */
	public List<DgMaskerLinkedColumn> getArg1() {
		if (arg1 == null) {
			arg1 = new ArrayList<DgMaskerLinkedColumn>();
		}
		return this.arg1;
	}

	/**
	 * Gets the value of the arg2 property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the arg2 property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getArg2().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DgMaskerColumn }
	 * 
	 * 
	 */
	public List<DgMaskerColumn> getArg2() {
		if (arg2 == null) {
			arg2 = new ArrayList<DgMaskerColumn>();
		}
		return this.arg2;
	}

}
