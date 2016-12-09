package com.dataguise.webservices.beans.masker;

import java.util.List;


import com.dataguise.webservices.beans.masker.DgMaskerLinkedColumn;
import com.dataguise.webservices.beans.masker.DgMaskerTemplateDB;


public class DgMaskerTemplateDBListStruct {

	
	private List<DgMaskerLinkedColumn> linkedColumns;
 
	private List<DgMaskerTemplateDB> dbList;
    
    public List<DgMaskerLinkedColumn> getLinkedColumns() {
        return this.linkedColumns;
    }
    public void setLinkedColumns(List<DgMaskerLinkedColumn> linkedColumns) {
        this.linkedColumns=linkedColumns;
    }
    public List<DgMaskerTemplateDB> getDbList() {
        return this.dbList;
    }
    public void setDbList(List<DgMaskerTemplateDB> dbList) {
        this.dbList=dbList;
    }
}
