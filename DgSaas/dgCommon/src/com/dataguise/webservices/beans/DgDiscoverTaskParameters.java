package com.dataguise.webservices.beans;

import java.util.List;

public class DgDiscoverTaskParameters {

	protected Integer searchTaskInstanceID;
	protected String searchType;
	protected String sampleDataStart;
	protected String sampleSizeSpecification;
	protected Integer sampleSize;
	protected Double additionalSampleSize;
	protected Integer showSampleData;
	protected String showViews;
	protected String taskType;
	protected Boolean useExisting;
	protected List<DgDiscoverSafe> listOfSafeColumns;
	
	public Integer getSearchTaskInstanceID() {
		return searchTaskInstanceID;
	}
	
	public void setSearchTaskInstanceID(Integer searchTaskInstanceID) {
		this.searchTaskInstanceID = searchTaskInstanceID;
	}
	
	public String getSearchType() {
		return searchType;
	}
	
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	
	public String getSampleDataStart() {
		return sampleDataStart;
	}
	
	public void setSampleDataStart(String sampleDataStart) {
		this.sampleDataStart = sampleDataStart;
	}
	
	public String getSampleSizeSpecification() {
		return sampleSizeSpecification;
	}
	
	public void setSampleSizeSpecification(String sampleSizeSpecification) {
		this.sampleSizeSpecification = sampleSizeSpecification;
	}
	
	public Integer getSampleSize() {
		return sampleSize;
	}
	
	public void setSampleSize(Integer sampleSize) {
		this.sampleSize = sampleSize;
	}
	
	public Integer getShowSampleData() {
		return showSampleData;
	}
	
	public void setShowSampleData(Integer showSampleData) {
		this.showSampleData = showSampleData;
	}
	
	public String getShowViews() {
		return showViews;
	}
	
	public void setShowViews(String showViews) {
		this.showViews = showViews;
	}
	
	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public Boolean getUseExisting() {
		return useExisting;
	}

	public void setUseExisting(Boolean useExisting) {
		this.useExisting = useExisting;
	}
	
	public List<DgDiscoverSafe> getListOfSafeColumns() {
		return listOfSafeColumns;
	}

	public void setListOfSafeColumns(List<DgDiscoverSafe> listOfSafeColumns) {
		this.listOfSafeColumns = listOfSafeColumns;
	}
	
	public void setAdditionalSampleSize(Double additionalSampleSize) {
		this.additionalSampleSize = additionalSampleSize==null?0f:additionalSampleSize;
	}

	public Double getAdditionalSampleSize() {
	      return additionalSampleSize;
	 }
	
	
}
