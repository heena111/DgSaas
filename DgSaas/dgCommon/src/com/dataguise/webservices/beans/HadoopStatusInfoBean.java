package com.dataguise.webservices.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hadoopStatusInfoBean", propOrder = {
    "mapProgress",
    "reduceProgress",
    "status"
})
public class HadoopStatusInfoBean {

	public float mapProgress;
	public float reduceProgress;
	public String status;
	
	public float getMapProgress() {
		return mapProgress;
	}
	
	public void setMapProgress(float mapProgressInput) {
		this.mapProgress = mapProgressInput;
	}
	
	public float getReduceProgress() {
		return reduceProgress;
	}
	
	public void setReduceProgress(float reduceProgressInput) {
		this.reduceProgress = reduceProgressInput;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String statusInput) {
		this.status = statusInput;
	}
	
	
}
