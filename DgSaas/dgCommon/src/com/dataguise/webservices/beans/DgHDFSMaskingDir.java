package com.dataguise.webservices.beans;

import java.util.Comparator;

public class DgHDFSMaskingDir extends CRUDEStructure{

	private Integer id;
	
	private String directory;
	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the directory
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * @param directory the directory to set
	 */
	public void setDirectory(String directory) {
		this.directory = directory;
	}


	
	
	   public static Comparator<DgHDFSMaskingDir> SORT_BY_DIRECTORY = new Comparator<DgHDFSMaskingDir>() {

		@Override
		public int compare(DgHDFSMaskingDir o1, DgHDFSMaskingDir o2) {
			return o1.directory.compareToIgnoreCase(o2.directory);
		}
		   
	};
	 
}
