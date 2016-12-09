
package com.dataguise.webservices.beans.masker;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.dataguise.webservices.beans.DgBaseBean;
import com.dataguise.webservices.beans.DgConnection;
import com.dataguise.webservices.beans.DgMaskTemplateParameters;

public class DgMaskTemplate extends DgBaseBean  {

    protected DgMaskTemplateParameters dgMaskTemplateParameters;
    protected DgConnection connection;
    @XmlElement(nillable = true)
    protected List<DgMaskerLinkedColumn> linkedColumns;
    @XmlElement(nillable = true)
    protected List<DgMaskerColumn> columns;

   
    
    
    

    public DgMaskTemplateParameters getDgMaskTemplateParameters() {
		return dgMaskTemplateParameters;
	}

	public void setDgMaskTemplateParameters(
			DgMaskTemplateParameters dgMaskTemplateParameters) {
		this.dgMaskTemplateParameters = dgMaskTemplateParameters;
	}

	/**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link DgConnection }
     *     
     */
    public DgConnection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DgConnection }
     *     
     */
    public void setConnection(DgConnection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the linkedColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DgMaskerLinkedColumn }
     * 
     * 
     */
    public List<DgMaskerLinkedColumn> getLinkedColumns() {
        if (linkedColumns == null) {
            linkedColumns = new ArrayList<DgMaskerLinkedColumn>();
        }
        return this.linkedColumns;
    }
    public void setLinkedColumns(List<DgMaskerLinkedColumn> linkedColumns) {
        this.linkedColumns=linkedColumns;
    }

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DgMaskerColumn }
     * 
     * 
     */
    public List<DgMaskerColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<DgMaskerColumn>();
        }
        return this.columns;
    }
    public void setColumns(List<DgMaskerColumn> columns) {
        this.columns=columns;
    }

}
