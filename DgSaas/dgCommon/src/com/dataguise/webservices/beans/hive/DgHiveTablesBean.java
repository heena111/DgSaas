package com.dataguise.webservices.beans.hive;

import java.util.List;



public class DgHiveTablesBean {
	
	
	String name;
	String owner;
	Long createTime;
	String tableType;
	DgHiveTableColumnInfo  storageInfo;
	List<DgHiveFieldSchema> partitionKeys;
		

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public DgHiveTableColumnInfo getStorageInfo() {
		return storageInfo;
	}
	public void setStorageInfo(DgHiveTableColumnInfo storageInfo) {
		this.storageInfo = storageInfo;
	}
	
	public List<DgHiveFieldSchema> getPartitionKeys() {
		return partitionKeys;
	}
	public void setPartitionKeys(List<DgHiveFieldSchema> partitionKeys) {
		this.partitionKeys = partitionKeys;
	}

	
	
}
