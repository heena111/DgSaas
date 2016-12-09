package com.dataguise.saas.bean;

import java.util.List;

import com.dataguise.saas.model.DgSaasUsers;

/**
 * @author Harinder Singh Bedi
 *
 */
public class DgSaasUserBean extends DgSaasUsers {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6836078928783160260L;
	
	private List<Integer> dataPlatforms;
	private List<Integer> dataSolutions;
	private boolean addUserInDgSecure=true;
	
	public List<Integer> getDataPlatforms() {
		return dataPlatforms;
	}

	public void setDataPlatforms(List<Integer> dataPlatforms) {
		this.dataPlatforms = dataPlatforms;
	}

	public List<Integer> getDataSolutions() {
		return dataSolutions;
	}

	public void setDataSolutions(List<Integer> dataSolutions) {
		this.dataSolutions = dataSolutions;
	}

	public boolean isAddUserInDgSecure() {
		return addUserInDgSecure;
	}

	public void setAddUserInDgSecure(boolean addUserInDgSecure) {
		this.addUserInDgSecure = addUserInDgSecure;
	}
	
}
