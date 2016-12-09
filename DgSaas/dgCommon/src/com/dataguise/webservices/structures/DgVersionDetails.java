package com.dataguise.webservices.structures;

import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.util.ManifestInfo;
import com.dataguise.webservices.beans.DgException;

public class DgVersionDetails {

	String type;
	String componentDetails;
	String versionDetails;
	String revision;
	String patchDetails;


	public DgVersionDetails() {}
	
	private void fetchManifestInfo(ManifestInfo manifestInfo)throws Exception{
		versionDetails = manifestInfo.getManifestEntryAttribute("DgSecure", "Package-Version");
		revision = manifestInfo.getManifestEntryAttribute("DgSecure", "Revision");
		patchDetails = manifestInfo.getManifestEntryAttribute("DgSecure", "Patch-Version");
	}
	public DgVersionDetails(String agentType, String agentDetails, String manifestPath) throws DgException {
		type = agentType;
		componentDetails = agentDetails;
		
		try {
			ManifestInfo manifestInfo = new ManifestInfo(manifestPath);
			fetchManifestInfo(manifestInfo);
		} catch (Exception e) {
			e.printStackTrace();
			DgExceptionUtil.throwException(ErrorConstants.ERROR_GETTING_ATTRIBUTE_VALUE, "Attribute not found in Manifest. " + e.getMessage());
		}
	}
	public DgVersionDetails(String agentType, String agentDetails, Class<?> clazz) throws DgException {
		type = agentType;
		componentDetails = agentDetails;
		
		try {
			ManifestInfo manifestInfo = new ManifestInfo(clazz);
			fetchManifestInfo(manifestInfo);
		} catch (Exception e) {
			e.printStackTrace();
			DgExceptionUtil.throwException(ErrorConstants.ERROR_GETTING_ATTRIBUTE_VALUE, "Attribute not found in Manifest. " + e.getMessage());
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComponentDetails() {
		return componentDetails;
	}

	public void setComponentDetails(String componentDetails) {
		this.componentDetails = componentDetails;
	}

	public String getVersionDetails() {
		return versionDetails;
	}

	public void setVersionDetails(String versionDetails) {
		this.versionDetails = versionDetails;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getPatchDetails() {
		return patchDetails;
	}
	public void setPatchDetails(String patchDetails) {
		this.patchDetails = patchDetails;
	}


}
