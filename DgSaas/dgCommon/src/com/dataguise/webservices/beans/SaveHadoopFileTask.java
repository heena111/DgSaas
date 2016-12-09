package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for saveHadoopFileTask complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="saveHadoopFileTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservices.dataguise.com/}dgHadoopFileTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveHadoopFileTask", propOrder = { "arg0" })
public class SaveHadoopFileTask {

	protected DgHadoopFileTask arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return possible object is {@link DgHadoopFileTask }
	 * 
	 */
	public DgHadoopFileTask getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *            allowed object is {@link DgHadoopFileTask }
	 * 
	 */
	public void setArg0(DgHadoopFileTask value) {
		this.arg0 = value;
	}

}
