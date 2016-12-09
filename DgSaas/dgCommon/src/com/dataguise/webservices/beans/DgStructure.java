package com.dataguise.webservices.beans;

import java.util.Comparator;

public class DgStructure extends CRUDEStructure{

private Integer structureId;

private String structName;


/**
 * @return the structureId
 */
public Integer getStructureId() {
	return structureId;
}

/**
 * @param structureId the structureId to set
 */
public void setStructureId(Integer structureId) {
	this.structureId = structureId;
}


/**
 * @return the structName
 */
public String getStructName() {
	return structName;
}

/**
 * @param structName the structName to set
 */
public void setStructName(String structName) {
	this.structName = structName;
}


public static Comparator<DgStructure> SORT_BY_NAME = new Comparator<DgStructure>() {

	@Override
	public int compare(DgStructure o1, DgStructure o2) {
		return o1.structName.compareToIgnoreCase(o2.structName);
	}
	   
};


}
