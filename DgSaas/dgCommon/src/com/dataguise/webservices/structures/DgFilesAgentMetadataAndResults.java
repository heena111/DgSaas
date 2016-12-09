package com.dataguise.webservices.structures;

import java.util.ArrayList;
import java.util.List;

import com.dataguise.webservices.beans.DgFilesInstanceMetadataAndResults;

/**
 * A wrapper containing list of metadata and results of all the instances running at this agent.
 * @author dataguise
 *
 */
public class DgFilesAgentMetadataAndResults {

	public static Integer agentId = 10001;
	private Integer groupAgentMapId;
	private String agentType = "DFA";
	private List<DgFilesInstanceMetadataAndResults> pushableMetaDatalist;
	
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public List<DgFilesInstanceMetadataAndResults> getPushableMetaDatalist() {
		if(pushableMetaDatalist == null)
			pushableMetaDatalist = new ArrayList<DgFilesInstanceMetadataAndResults>();
		return pushableMetaDatalist;
	}
	public void setPushableMetaDatalist(List<DgFilesInstanceMetadataAndResults> pushableMetaDatalist) {
		this.pushableMetaDatalist = pushableMetaDatalist;
	}
	
	public String getAgentType() {
		return agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public Integer getGroupAgentMapId() {
		return groupAgentMapId;
	}
	public void setGroupAgentMapId(Integer groupAgentMapId) {
		this.groupAgentMapId = groupAgentMapId;
	}
	
	
	
	
}
