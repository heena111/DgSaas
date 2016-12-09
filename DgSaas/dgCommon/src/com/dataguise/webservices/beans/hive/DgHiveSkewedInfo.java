package com.dataguise.webservices.beans.hive;
import java.util.List;
import java.util.Map;




public class DgHiveSkewedInfo {
	
	List<String> skewedColNames;
	List<String[]> skewedColValues;
	Map<List<String>,String> skewedColValueLocationMaps;
	Integer skewedColNamesSize;
	List<String> skewedColNamesIterator;
	Integer skewedColValuesSize;
	List<String[]> skewedColValuesIterator;
	Integer skewedColValueLocationMapsSize;
	
	
	
	public List<String> getSkewedColNames() {
		return skewedColNames;
	}
	public void setSkewedColNames(List<String> skewedColNames) {
		this.skewedColNames = skewedColNames;
	}
	
	public List<String[]> getSkewedColValues() {
		return skewedColValues;
	}
	public void setSkewedColValues(List<String[]> skewedColValues) {
		this.skewedColValues = skewedColValues;
	}
	public Integer getSkewedColNamesSize() {
		return skewedColNamesSize;
	}
	public void setSkewedColNamesSize(Integer skewedColNamesSize) {
		this.skewedColNamesSize = skewedColNamesSize;
	}
	public List<String> getSkewedColNamesIterator() {
		return skewedColNamesIterator;
	}
	public void setSkewedColNamesIterator(List<String> skewedColNamesIterator) {
		this.skewedColNamesIterator = skewedColNamesIterator;
	}
	public Integer getSkewedColValuesSize() {
		return skewedColValuesSize;
	}
	public void setSkewedColValuesSize(Integer skewedColValuesSize) {
		this.skewedColValuesSize = skewedColValuesSize;
	}
	public List<String[]> getSkewedColValuesIterator() {
		return skewedColValuesIterator;
	}
	public void setSkewedColValuesIterator(List<String[]> skewedColValuesIterator) {
		this.skewedColValuesIterator = skewedColValuesIterator;
	}
	public Integer getSkewedColValueLocationMapsSize() {
		return skewedColValueLocationMapsSize;
	}
	public void setSkewedColValueLocationMapsSize(
			Integer skewedColValueLocationMapsSize) {
		this.skewedColValueLocationMapsSize = skewedColValueLocationMapsSize;
	}
	public Map<List<String>, String> getSkewedColValueLocationMaps() {
		return skewedColValueLocationMaps;
	}
	public void setSkewedColValueLocationMaps(
			Map<List<String>, String> skewedColValueLocationMaps) {
		this.skewedColValueLocationMaps = skewedColValueLocationMaps;
	}
	
	
	
	
	
	
	
	
	
}
