package com.dataguise.webservices.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dgColumnInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dgColumnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraintType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isNullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maskingOptions" type="{http://webservices.dataguise.com/}maskingOptions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/> *         
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgColumnInfo", propOrder = { "constraintType", "id",
		"isIdentity", "isNullable", "length", "maskingOptions", "name",
		"precision", "scale", "type","sensitivity" })
public class DgColumnInfo {

	protected String constraintType;
	protected int id;
	protected boolean isIdentity;
	protected boolean isNullable;
	protected int length;
	@XmlElement(nillable = true)
	protected List<MaskingOptions> maskingOptions;
	protected String name;
	protected int precision;
	protected int scale;
	protected String type;
	protected int sensitivity;

	/**
	 * @return the sensitivity
	 */
	public int getSensitivity() {
		return sensitivity;
	}

	/**
	 * @param sensitivity the sensitivity to set
	 */
	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
	}

	/**
	 * Gets the value of the constraintType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConstraintType() {
		return constraintType;
	}

	/**
	 * Sets the value of the constraintType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConstraintType(String value) {
		this.constraintType = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

	/**
	 * Gets the value of the isIdentity property.
	 * 
	 */
	public boolean isIsIdentity() {
		return isIdentity;
	}

	/**
	 * Sets the value of the isIdentity property.
	 * 
	 */
	public void setIsIdentity(boolean value) {
		this.isIdentity = value;
	}

	/**
	 * Gets the value of the isNullable property.
	 * 
	 */
	public boolean isIsNullable() {
		return isNullable;
	}

	/**
	 * Sets the value of the isNullable property.
	 * 
	 */
	public void setIsNullable(boolean value) {
		this.isNullable = value;
	}

	/**
	 * Gets the value of the length property.
	 * 
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the value of the length property.
	 * 
	 */
	public void setLength(int value) {
		this.length = value;
	}
	/**
	 * @param maskingOptions the maskingOptions to set
	 */
	public void setMaskingOptions(List<MaskingOptions> maskingOptions) {
		this.maskingOptions = maskingOptions;
	}


	public List<MaskingOptions> getMaskingOptions() {
		if (maskingOptions == null) {
			maskingOptions = new ArrayList<MaskingOptions>();
		}
		return this.maskingOptions;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the precision property.
	 * 
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * Sets the value of the precision property.
	 * 
	 */
	public void setPrecision(int value) {
		this.precision = value;
	}

	/**
	 * Gets the value of the scale property.
	 * 
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * Sets the value of the scale property.
	 * 
	 */
	public void setScale(int value) {
		this.scale = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}
	
	public static Comparator<DgColumnInfo> SORT_BY_COLUMN_NAME =new Comparator<DgColumnInfo>() {
		@Override
		public int compare(DgColumnInfo o1, DgColumnInfo o2) {
			return o1.name.compareToIgnoreCase(o2.name);
		}
	

	};
}
