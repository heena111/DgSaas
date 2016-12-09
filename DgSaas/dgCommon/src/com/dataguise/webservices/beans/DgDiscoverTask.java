
package com.dataguise.webservices.beans;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.validator.constraints.NotEmpty;

import com.dataguise.util.BeanValidator;
import com.dataguise.webservices.beans.discover.database.SchemaFilterDetails;


/**
 * <p>Java class for dgDiscoverTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dgDiscoverTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleDataStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sampleSizeSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showSampleData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showViews" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="taskDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dgDiscoverTask", propOrder = {
    "connectionList",
    "expressionList",
    "sampleDataStart",
    "sampleSize",
    "sampleSizeSpecification",
    "searchType",
    "showSampleData",
    "showViews",
    "taskDescription",
    "taskID",
    "taskName",
    "taskType",
    "useExisting",
    "connectionGroupList",
    "policyIds",
    "additionalSampleSize",
    "dgTaskInstancePolicyDetails",
    "schemaFilterDetails",
    "module"
})
public class DgDiscoverTask extends DgBaseBean implements Serializable{

    protected String connectionList;
    protected String expressionList;
    protected String sampleDataStart;
    protected Integer sampleSize;
    protected String sampleSizeSpecification;
    protected String searchType;
    protected boolean showSampleData;
    protected boolean showViews;
    @NotEmpty(message = "Task Description:"+BeanValidator.EMPTY_FIELD)
    @Size(max=256 , message = "Task Description:"+BeanValidator.MAX_SIZE_256)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String taskDescription;
    protected Integer taskID;
    @NotEmpty(message = "Task Name:"+BeanValidator.EMPTY_FIELD)
    @Size(max=128 , message = "Task Name:"+BeanValidator.MAX_SIZE_128)
    @Pattern(regexp=BeanValidator.GENERIC_TEXT_REGEX , message=BeanValidator.INVALID_CHARACTER_SET)
    protected String taskName;
    protected String taskType;
    protected boolean useExisting;
    protected String connectionGroupList;
    protected String policyIds;
    protected Double additionalSampleSize;
    protected List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails;
    @Valid
    protected SchemaFilterDetails schemaFilterDetails;
    protected String module;
    
	public SchemaFilterDetails getSchemaFilterDetails() {
		return schemaFilterDetails;
	}

	public void setSchemaFilterDetails(SchemaFilterDetails schemaFilterDetails) {
		this.schemaFilterDetails = schemaFilterDetails;
	}

	/**
     * Gets the value of the connectionList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionList() {
        return connectionList;
    }

    /**
     * Sets the value of the connectionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionList(String value) {
        this.connectionList = value;
    }

    /**
     * Gets the value of the expressionList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionList() {
        return expressionList;
    }

    /**
     * Sets the value of the expressionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionList(String value) {
        this.expressionList = value;
    }

    /**
     * Gets the value of the sampleDataStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleDataStart() {
        return sampleDataStart;
    }

    /**
     * Sets the value of the sampleDataStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleDataStart(String value) {
        this.sampleDataStart = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSampleSize(Integer value) {
        this.sampleSize = value;
    } 

    /**
     * Gets the value of the sampleSizeSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleSizeSpecification() {
        return sampleSizeSpecification;
    }

    /**
     * Sets the value of the sampleSizeSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleSizeSpecification(String value) {
        this.sampleSizeSpecification = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the showSampleData property.
     * 
     */
    public boolean isShowSampleData() {
        return showSampleData;
    }

    /**
     * Sets the value of the showSampleData property.
     * 
     */
    public void setShowSampleData(boolean value) {
        this.showSampleData = value;
    }

    /**
     * Gets the value of the showViews property.
     * 
     */
    public boolean isShowViews() {
        return showViews;
    }

    /**
     * Sets the value of the showViews property.
     * 
     */
    public void setShowViews(boolean value) {
        this.showViews = value;
    }

    /**
     * Gets the value of the taskDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * Sets the value of the taskDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDescription(String value) {
        this.taskDescription = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskID(Integer value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }
    
    public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public boolean isUseExisting() {
		return useExisting;
	}

	public void setUseExisting(boolean useExisting) {
		this.useExisting = useExisting;
	}
	
	 public void setAdditionalSampleSize(Double additionalSampleSize) {
		this.additionalSampleSize = additionalSampleSize==null?0f:additionalSampleSize;
	}

	public Double getAdditionalSampleSize() {
	      return additionalSampleSize;
	 }
    
    /**
     * Gets the value of the connectionGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionGroupList() {
        return connectionGroupList;
    }

    /**
     * Sets the value of the connectionGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionGroupList(String value) {
        this.connectionGroupList = value;
    }

	public String getPolicyIds() {
		return policyIds;
	}

	public void setPolicyIds(String policyIds) {
		this.policyIds = policyIds;
	}
	
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<DgTaskInstancePolicyDetails> getDgTaskInstancePolicyDetails() {
		return dgTaskInstancePolicyDetails;
	}

	public void setDgTaskInstancePolicyDetails(
			List<DgTaskInstancePolicyDetails> dgTaskInstancePolicyDetails) {
		this.dgTaskInstancePolicyDetails = dgTaskInstancePolicyDetails;
	}

	  public static Comparator<DgDiscoverTask> SORT_BY_TASKID = new Comparator<DgDiscoverTask>() {
	        public int compare(DgDiscoverTask one, DgDiscoverTask other) {
	            return one.taskID.compareTo(other.taskID);
	        }
	  };
	  public static Comparator<DgDiscoverTask> SORT_BY_TASKID_DESC = new Comparator<DgDiscoverTask>() {
		    public int compare(DgDiscoverTask one, DgDiscoverTask other) {
		        return other.taskID.compareTo(one.taskID);
		        } 
	  };

	  public static Comparator<DgDiscoverTask> SORT_BY_TASKNAME = new Comparator<DgDiscoverTask>() {
	        public int compare(DgDiscoverTask one, DgDiscoverTask other) {
	            return one.taskName.compareTo(other.taskName);
	        }
	  };
	  public static Comparator<DgDiscoverTask> SORT_BY_TASKNAME_DESC = new Comparator<DgDiscoverTask>() {
		    public int compare(DgDiscoverTask one, DgDiscoverTask other) {
		        return other.taskName.compareTo(one.taskName);
		        } 
	  };
	  public static Comparator<DgDiscoverTask> SORT_BY_TASKDESCRIPT = new Comparator<DgDiscoverTask>() {
	        public int compare(DgDiscoverTask one, DgDiscoverTask other) {
	            return one.taskDescription.compareTo(other.taskDescription);
	        }
	  };
	  public static Comparator<DgDiscoverTask> SORT_BY_TASKDESCRIPT_DESC = new Comparator<DgDiscoverTask>() {
		    public int compare(DgDiscoverTask one, DgDiscoverTask other) {
		        return other.taskDescription.compareTo(one.taskDescription);
		        } 
	  };  
	  public static Comparator<DgDiscoverTask> SORT_BY_LASTUPDATED = new Comparator<DgDiscoverTask>() {
	        public int compare(DgDiscoverTask one, DgDiscoverTask other) {
	            return one.lastUpdatedTime.compareTo(other.lastUpdatedTime);
	        }
	  };
	  public static Comparator<DgDiscoverTask> SORT_BY_LASTUPDATED_DESC = new Comparator<DgDiscoverTask>() {
		    public int compare(DgDiscoverTask one, DgDiscoverTask other) {
		        return other.lastUpdatedTime.compareTo(one.lastUpdatedTime);
		        } 
	  };
	  
}
