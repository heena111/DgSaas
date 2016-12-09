package com.dataguise.saas.dao;

import java.util.List;

import com.dataguise.saas.model.DgSaasUsers;

/**
 * @author Harinder Singh Bedi
 *
 */
public interface DgSaasUserDAO {

	/**
	 * @param dgSaasUsers
	 * @return
	 */
	public Integer addDgSaasUser(DgSaasUsers dgSaasUsers);
	/**
	 * @param dgSaasUsers
	 * @return
	 */
	public DgSaasUsers updateDgSaasUser(DgSaasUsers dgSaasUsers);
	/**
	 * @param id
	 */
	public void deleteDgSaasUser(Integer id);
	/**
	 * @return
	 */
	public List<DgSaasUsers> getAllDgSaasUsers();
	/**
	 * @param id
	 * @return
	 */
	public List<DgSaasUsers> getDgSaasUser(Integer id);
}
