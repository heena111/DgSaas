package com.dataguise.webservices.beans.discover.database;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * Java class for DatabaseMetadata complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DatabaseMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
public class DatabaseMetadata implements Serializable{
	
	private static final long serialVersionUID = 7125721788687534860L;
	private String creatorName;
	private String dbName;

	//below fields are used in Teradata connection manager tree.
	private ArrayList<DatabaseMetadata> result; //children 
	private int tableCount;
	private int childDBCount;
	private boolean leaf;
	private String dbKind;
	private Integer id; 
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public ArrayList<DatabaseMetadata> getResult() {
		return result;
	}

	public void setResult(ArrayList<DatabaseMetadata> result) {
		this.result = result;
	}
	
	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public int getTableCount() {
		return tableCount;
	}

	public void setTableCount(int tableCount) {
		this.tableCount = tableCount;
	}

	public int getChildDBCount() {
		return childDBCount;
	}

	public void setChildDBCount(int childDBCount) {
		this.childDBCount = childDBCount;
	}
	
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setDbKind(String dbKind) {
		this.dbKind = dbKind;
	}

	public String getDbKind() {
		return dbKind;
	}

}
