package com.dataguise.webservices.beans;





public class DgAclEntryBean implements java.io.Serializable {

	
	public DgAclEntryBean() {
		
	}
	
	private static final long serialVersionUID = -5096541833921523063L;
	private Long id;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	private String tableName;
	private Integer mask;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	/**
 * @param id
 * @param tableName
 * @param sid
 * @param mask
 */
public DgAclEntryBean(Long id, String tableName, Integer mask) {
	super();
	this.id = id;
	this.tableName = tableName;
	this.mask = mask;
}
	
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * @return the mask
	 */
	public Integer getMask() {
		return mask;
	}
	/**
	 * @param mask the mask to set
	 */
	public void setMask(Integer mask) {
		this.mask = mask;
	}

	
}