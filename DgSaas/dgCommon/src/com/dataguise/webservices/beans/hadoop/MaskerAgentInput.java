package com.dataguise.webservices.beans.hadoop;

import java.util.HashMap;
import java.util.List;

public class MaskerAgentInput {
	List<SensitiveFileInfo> filesToMask;
	HashMap<String, String> hadoopConf;
	private HashMap<String, String> agentConf;
	
	
	public List<SensitiveFileInfo> getFilesToMask() {
		return filesToMask;
	}

	public void setFilesToMask(List<SensitiveFileInfo> filesToMask) {
		this.filesToMask = filesToMask;
	}


	public HashMap<String, String> getHadoopConf() {
		return hadoopConf;
	}

	public void setHadoopConf(HashMap<String, String> conf) {
		this.hadoopConf = conf;
	}

	public void setAgentConf(HashMap<String, String> agentConf) {
		this.agentConf = agentConf;
	}

	public HashMap<String, String> getAgentConf() {
		return agentConf;
	}
}
