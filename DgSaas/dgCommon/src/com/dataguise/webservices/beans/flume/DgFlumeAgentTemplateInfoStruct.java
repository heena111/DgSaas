/**
 * 
 */
package com.dataguise.webservices.beans.flume;

/**
 * @author dataguise
 *
 */
public class DgFlumeAgentTemplateInfoStruct implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2181712300073401176L;
	private String agentId;
	private String templateId;
	private String structureId;
		
	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	/**
	 * @return the templateId
	 */
	public String getTemplateId() {
		return templateId;
	}
	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	/**
	 * @return the structureId
	 */
	public String getStructureId() {
		return structureId;
	}
	/**
	 * @param structureId the structureId to set
	 */
	public void setStructureId(String structureId) {
		this.structureId = structureId;
	}

	
	

}
