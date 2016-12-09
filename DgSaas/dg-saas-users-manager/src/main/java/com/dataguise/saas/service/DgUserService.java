package com.dataguise.saas.service;

import java.util.List;

import com.dataguise.saas.bean.DgSaasUserBean;
import com.dataguise.webservices.beans.DgException;

/**
 * @author Harinder Singh Bedi
 *
 */
public interface DgUserService {

	/**
	 * @param dgSaasUserBean
	 * @return
	 * @throws DgException 
	 */
	public Integer addDgSaasUser(DgSaasUserBean dgSaasUserBean) throws DgException;
	/**
	 * @param id
	 */
	public void deleteDgSaasUser(Integer id);
	/**
	 * @param id
	 * @return
	 */
	public List<DgSaasUserBean> getDgSaasUser(Integer id);
}
