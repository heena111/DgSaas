package com.dataguise.webservices.beans.hive;

import java.util.List;
import java.util.Map;



public class DgHiveTableColumnInfo {
	
	
	String location;
	String inputFormat;
	String outputFormat;
	Boolean compressed;
	Integer numBuckets;
	DgHiveSerdeInfo serdeInfo;
	List<String> bucketCols;
//	List<Object> sortCols;
	List<DgHiveFieldSchema> cols;
	Map<String,String> parameters;
	DgHiveSkewedInfo skewedInfo;
	Boolean storedAsSubDirectories;
	Integer colsSize;
	Integer bucketColsSize;
	List<String> bucketColsIterator;
	Integer sortColsSize;
//	List<String> sortColsIterator;
	Integer parametersSize;
	
	
	
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInputFormat() {
		return inputFormat;
	}
	public void setInputFormat(String inputFormat) {
		this.inputFormat = inputFormat;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public Boolean getCompressed() {
		return compressed;
	}
	public void setCompressed(Boolean compressed) {
		this.compressed = compressed;
	}
	public Integer getNumBuckets() {
		return numBuckets;
	}
	public void setNumBuckets(Integer numBuckets) {
		this.numBuckets = numBuckets;
	}
	public DgHiveSerdeInfo getSerdeInfo() {
		return serdeInfo;
	}
	public void setSerdeInfo(DgHiveSerdeInfo serdeInfo) {
		this.serdeInfo = serdeInfo;
	}
	public List<String> getBucketCols() {
		return bucketCols;
	}
	public void setBucketCols(List<String> bucketCols) {
		this.bucketCols = bucketCols;
	}
//	public List<Object> getSortCols() {
//		return sortCols;
//	}
//	public void setSortCols(List<Object> sortCols) {
//		this.sortCols = sortCols;
//	}
	public List<DgHiveFieldSchema> getCols() {
		return cols;
	}
	public void setCols(List<DgHiveFieldSchema> cols) {
		this.cols = cols;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	public DgHiveSkewedInfo getSkewedInfo() {
		return skewedInfo;
	}
	public void setSkewedInfo(DgHiveSkewedInfo skewedInfo) {
		this.skewedInfo = skewedInfo;
	}
	public Boolean getStoredAsSubDirectories() {
		return storedAsSubDirectories;
	}
	public void setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
		this.storedAsSubDirectories = storedAsSubDirectories;
	}
	public Integer getColsSize() {
		return colsSize;
	}
	public void setColsSize(Integer colsSize) {
		this.colsSize = colsSize;
	}
	public Integer getBucketColsSize() {
		return bucketColsSize;
	}
	public void setBucketColsSize(Integer bucketColsSize) {
		this.bucketColsSize = bucketColsSize;
	}
	public List<String> getBucketColsIterator() {
		return bucketColsIterator;
	}
	public void setBucketColsIterator(List<String> bucketColsIterator) {
		this.bucketColsIterator = bucketColsIterator;
	}
	public Integer getSortColsSize() {
		return sortColsSize;
	}
	public void setSortColsSize(Integer sortColsSize) {
		this.sortColsSize = sortColsSize;
	}
//	public List<String> getSortColsIterator() {
//		return sortColsIterator;
//	}
//	public void setSortColsIterator(List<String> sortColsIterator) {
//		this.sortColsIterator = sortColsIterator;
//	}
	public Integer getParametersSize() {
		return parametersSize;
	}
	public void setParametersSize(Integer parametersSize) {
		this.parametersSize = parametersSize;
	}
	
	
	
	
	
	
	

	
	
}
