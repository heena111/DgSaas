package com.dataguise.ha.beans;




/**
 * @author Harinder Singh Bedi
 *
 */
public class TaskMetadata {

	/**
	 * 
	 */
	private Integer taskInstanceId;
	private String taskState;
	private String controllerMetadataJSON;
	private String agentMetadataJSON;

	/**
	 * @return the taskInstanceId
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}
	/**
	 * @param taskInstanceId the taskInstanceId to set
	 */
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	/**
	 * @return the taskState
	 */
	public String getTaskState() {
		return taskState;
	}
	/**
	 * @param taskState the taskState to set
	 */
	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}
	/**
	 * @return the controllerMetadataJSON
	 */
	public String getControllerMetadataJSON() {
		return controllerMetadataJSON;
	}
	/**
	 * @param controllerMetadataJSON
	 */
	public void setControllerMetadataJSON(String controllerMetadataJSON) {
		this.controllerMetadataJSON = controllerMetadataJSON;
	}
	/**
	 * @return the agentMetadataJSON
	 */
	public String getAgentMetadataJSON() {
		return agentMetadataJSON;
	}
	/**
	 * @param agentMetadataJSON the agentMetadataJSON to set
	 */
	public void setAgentMetadataJSON(String agentMetadataJSON) {
		this.agentMetadataJSON = agentMetadataJSON;
	}
	/* (non-Javadoc)
	  * @see java.lang.Object#toString()
	  */
	 @Override
	 public String toString() {
	  return "TaskMetadata [agentMetadataJSON=" + agentMetadataJSON
	    + ", controllerMetadataJSON=" + controllerMetadataJSON
	    + ", taskInstanceId=" + taskInstanceId + ", taskState="
	    + taskState + "]";
	 
}
}
