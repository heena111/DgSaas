package com.dataguise.ha.beans;

import java.util.LinkedList;
import java.util.List;


/**
 * @author Rahul
 *
 */
public class AgentMetadata {
	
	private int agentId;
	private List<TaskMetadata> taskMetadataList=new LinkedList<TaskMetadata>();
	
	/**
	 * @return the agentId
	 */
	public int getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	/**
	 * @return the hadoopTaskMetadataList
	 */
	public List<TaskMetadata> getTaskMetadataList() {
		return taskMetadataList;
	}
	/**
	 * @param hadoopTaskMetadataList the hadoopTaskMetadataList to set
	 */
	public void setTaskMetadataList(
			List<TaskMetadata> taskMetadataList) {
		this.taskMetadataList = taskMetadataList;
	}		
	
	/* (non-Javadoc)
	  * @see java.lang.Object#toString()
	  */
	 @Override
	 public String toString() {
	  return "AgentMetadata [agentId=" + agentId + ", taskMetadataList=" + taskMetadataList.toString() + "]";
	 }
}
