

package com.dataguise.webservices.beans;

import java.util.List;



public class DgProduct {
	
	private Integer id;
	private String prodName;
	private List<DgProduct> result;
	private boolean leaf = false;
	private Boolean u = Boolean.FALSE;
	
	public DgProduct(){
		
	}
	
	
	public DgProduct(String prodName){
		this.prodName = prodName;
	}
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @return the u
	 */
	public Boolean getUse() {
		return u;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/**
	 * @param u the u to set
	 */
	public void setUse(Boolean u) {
		this.u = u;
	}


	public List<DgProduct> getResult() {
		return result;
	}


	public void setResult(List<DgProduct> result) {
		this.result = result;
	}


	public boolean isLeaf() {
		return leaf;
	}


	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	
	
	
	
	
	
	
}
