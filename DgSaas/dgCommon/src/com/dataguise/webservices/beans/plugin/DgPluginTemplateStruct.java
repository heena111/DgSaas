package com.dataguise.webservices.beans.plugin;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

public class DgPluginTemplateStruct  implements java.io.Serializable{

	protected List<DgPluginDiscoveryMaskingConfig> dgDiscoveryMaskingConfig;
	@Valid
	protected List<DgPluginTaskTemplatePatterns> expressionList;
	@Valid
	protected DgPluginFileTask pluginFileTask;
	protected String plugin;
	
	public DgPluginFileTask getPluginFileTask() {
		return pluginFileTask;
	}

	public void setPluginFileTask(DgPluginFileTask pluginFileTask) {
		this.pluginFileTask = pluginFileTask;
	}

	
	
	public List<DgPluginDiscoveryMaskingConfig> getDgDiscoveryMaskingConfig() {
		if (dgDiscoveryMaskingConfig == null) {
			dgDiscoveryMaskingConfig = new ArrayList<DgPluginDiscoveryMaskingConfig>();
		}
		return this.dgDiscoveryMaskingConfig;
	}

	public List<DgPluginTaskTemplatePatterns> getExpressionList() {
		if (expressionList == null) {
			expressionList = new ArrayList<DgPluginTaskTemplatePatterns>();
		}
		return this.expressionList;
	}

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String value) {
		this.plugin = value;
	}

	

	public void setExpressionList(
			List<DgPluginTaskTemplatePatterns> expressionList) {
		this.expressionList = expressionList;
		
	}

	public void setDgDiscoveryMaskingConfig(
			List<DgPluginDiscoveryMaskingConfig> dgDiscoveryMaskingConfigList) {
		this.dgDiscoveryMaskingConfig = dgDiscoveryMaskingConfigList;
	}

}
