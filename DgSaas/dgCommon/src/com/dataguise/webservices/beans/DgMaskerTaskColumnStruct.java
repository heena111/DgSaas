package com.dataguise.webservices.beans;


import java.util.ArrayList;
import java.util.List;

import com.dataguise.webservices.beans.masker.DgMaskerColumn;



public class DgMaskerTaskColumnStruct {

 protected List<DgMaskerColumn> dgMaskerTaskColumnList;
 protected Integer totalRecords;
 
 
 public List<DgMaskerColumn> getDgMaskerTaskColumnList() {
  if(dgMaskerTaskColumnList==null)
  {
   dgMaskerTaskColumnList=new ArrayList<DgMaskerColumn>();
  }
  return dgMaskerTaskColumnList;
 }
 
 public void setDgMaskerTaskColumnList(List<DgMaskerColumn> dgMaskerTaskColumnList) {
  this.dgMaskerTaskColumnList = dgMaskerTaskColumnList;
 }
 
 
 public Integer getTotalRecords() {
  return totalRecords;
 }
 public void setTotalRecords(Integer totalRecords) {
  this.totalRecords = totalRecords;
 }
 

}
