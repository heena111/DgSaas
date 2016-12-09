
package com.dataguise.webservices.beans.hive;

import java.util.ArrayList;
import java.util.List;



public class HiveTableResponseList{

List<DgHiveTablesBean> responseList = new ArrayList<DgHiveTablesBean>();

public List<DgHiveTablesBean> getResponseList() {
	return responseList;
}

public void setResponseList(List<DgHiveTablesBean> responseList) {
	this.responseList = responseList;
}



}
