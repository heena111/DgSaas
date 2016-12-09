
package com.dataguise.webservices.beans;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "DgException", targetNamespace = "http://webservices.dataguise.com/")
public class DgException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */

	private DgFaultInfo faultInfo;
    
    public DgException()
    {
    	
    }
    
    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DgException(String message, DgFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DgException(String message, DgFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.dataguise.webservices.beans.DgFaultInfo
     */
    public DgFaultInfo getFaultInfo() {
        return faultInfo;
    }

}