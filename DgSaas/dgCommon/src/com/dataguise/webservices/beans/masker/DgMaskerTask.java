
package com.dataguise.webservices.beans.masker;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.dataguise.webservices.beans.DgBaseBean;
import com.dataguise.webservices.beans.DgConnection;


/**
 * <p>Java class for DgMaskerTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DgMaskerTask">
  *   &lt;complexContent>
 *     &lt;extension base="{http://masker.webservices.dataguise.com/}dgBaseBean">
 *       &lt;sequence>
 *         &lt;element name="maskerParameters" type="{http://webservices.dataguise.com/}DgMaskerParameters" minOccurs="0"/>
 *         &lt;element name="connection" type="{http://masker.webservices.dataguise.com/}dgConnection" minOccurs="0"/>
 *         &lt;element name="linkedColumns" type="{http://webservices.dataguise.com/}DgMaskerLinkedColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://webservices.dataguise.com/}DgMaskerColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DgMaskerTask", namespace = "http://webservices.dataguise.com/", propOrder = {
    "maskerParameters",
    "connection",
    "linkedColumns",
    "columns"
})
public class DgMaskerTask extends DgBaseBean  {

    protected DgMaskerParameters maskerParameters;
    protected DgConnection connection;
    @XmlElement(nillable = true)
    protected List<DgMaskerLinkedColumn> linkedColumns;
    @XmlElement(nillable = true)
    protected List<DgMaskerColumn> columns;

    /**
     * Gets the value of the maskerParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DgMaskerParameters }
     *     
     */
    public DgMaskerParameters getMaskerParameters() {
    	 if (maskerParameters == null) {
    		 maskerParameters = new DgMaskerParameters();
         }
        return maskerParameters;
    }

    /**
     * Sets the value of the maskerParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DgMaskerParameters }
     *     
     */
    public void setMaskerParameters(DgMaskerParameters value) {
        this.maskerParameters = value;
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
    
    
  /*
    public static Comparator<DgMaskerTask> SORT_BY_CREATED_BY=new Comparator<DgMaskerTask>() {

		@Override
		public int compare(DgMaskerTask o1, DgMaskerTask o2) {
			// TODO Auto-generated method stub
			return o1.createdBy.compareToIgnoreCase(o2.createdBy);
		}
	};
	
	public static Comparator<DgMaskerTask> SORT_BY_CREATED_BY_DESC=new Comparator<DgMaskerTask>() {

		@Override
		public int compare(DgMaskerTask o1, DgMaskerTask o2) {
			// TODO Auto-generated method stub
			return o2.createdBy.compareToIgnoreCase(o1.createdBy);
		}
	};
	
	
	 public static Comparator<DgMaskerTask> SORT_BY_CREATED_ON=new Comparator<DgMaskerTask>() {

			@Override
			public int compare(DgMaskerTask o1, DgMaskerTask o2) {
				// TODO Auto-generated method stub
				return o1.createdOn.compareToIgnoreCase(o2.createdOn);
			}
		};
		
		public static Comparator<DgMaskerTask> SORT_BY_CREATED_ON_DESC=new Comparator<DgMaskerTask>() {

			@Override
			public int compare(DgMaskerTask o1, DgMaskerTask o2) {
				// TODO Auto-generated method stub
				return o2.createdOn.compareToIgnoreCase(o1.createdOn);
			}
		};
	
	
	public static Comparator<DgMaskerTask> SORT_BY_RUN_ON=new Comparator<DgMaskerTask>() {

		@Override
		public int compare(DgMaskerTask o1, DgMaskerTask o2) {
			Timestamp fromTS1=null;
			Timestamp fromTS2 =null;
			try {
				SimpleDateFormat monthDayformatter = new SimpleDateFormat(
				"MMM-dd-yyyy HH:mm");			
				Date fromDate1 = monthDayformatter.parse(o1.lastExecutedOn);

				fromTS1 = new Timestamp(fromDate1.getTime());

				Date fromDate2 = monthDayformatter.parse(o2.lastExecutedOn);

				fromTS2 = new Timestamp(fromDate2.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return fromTS1.compareTo(fromTS2);
		}
	};
	
	public static Comparator<DgMaskerTask> SORT_BY_RUN_ON_DESC=new Comparator<DgMaskerTask>() {

		@Override
		public int compare(DgMaskerTask o1, DgMaskerTask o2) {
			Timestamp fromTS1=null;
			Timestamp fromTS2 =null;
			try {
				SimpleDateFormat monthDayformatter = new SimpleDateFormat(
				"MMM-dd-yyyy HH:mm");			
				Date fromDate1 = monthDayformatter.parse(o1.lastExecutedOn);

				fromTS1 = new Timestamp(fromDate1.getTime());

				Date fromDate2 = monthDayformatter.parse(o2.lastExecutedOn);

				fromTS2 = new Timestamp(fromDate2.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return fromTS2.compareTo(fromTS1);
		}
	};
*/
    
    
    

}
