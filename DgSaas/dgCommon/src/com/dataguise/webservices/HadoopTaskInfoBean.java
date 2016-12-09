
package com.dataguise.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hadoopTaskInfoBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hadoopTaskInfoBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jobStartInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jtIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopTaskInfoBean", propOrder = {
    "jobId",
    "jobStartInfo",
    "jtIdentifier",
    "taskInstanceId"
})
public class HadoopTaskInfoBean {

    protected Integer jobId;
    protected String jobStartInfo;
    protected String jtIdentifier;
    protected Integer taskInstanceId;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobId(Integer value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the jobStartInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStartInfo() {
        return jobStartInfo;
    }

    /**
     * Sets the value of the jobStartInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStartInfo(String value) {
        this.jobStartInfo = value;
    }

    /**
     * Gets the value of the jtIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtIdentifier() {
        return jtIdentifier;
    }

    /**
     * Sets the value of the jtIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtIdentifier(String value) {
        this.jtIdentifier = value;
    }

    /**
     * Gets the value of the taskInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskInstanceId() {
        return taskInstanceId;
    }

    /**
     * Sets the value of the taskInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskInstanceId(Integer value) {
        this.taskInstanceId = value;
    }

}
