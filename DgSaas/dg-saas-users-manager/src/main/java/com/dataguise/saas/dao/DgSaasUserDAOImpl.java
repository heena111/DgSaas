package com.dataguise.saas.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dataguise.saas.dao.util.DgHibernateUtil;
import com.dataguise.saas.model.DgSaasUsers;

/**
 * @author Harinder Singh Bedi
 *
 */
@Repository
@Transactional
public class DgSaasUserDAOImpl implements DgSaasUserDAO {


	/**
	 * 
	 */
	@Autowired
	private DgHibernateUtil<DgSaasUsers> hibernateUtil;

	/* (non-Javadoc)
	 * @see com.dataguise.saas.dao.DgSaasUserDAO#addDgSaasUser(com.dataguise.saas.model.DgSaasUsers)
	 */
	@Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Integer addDgSaasUser(DgSaasUsers dgSaasUsers) {
		return (Integer) hibernateUtil.create(dgSaasUsers);
	}

	/* (non-Javadoc)
	 * @see com.dataguise.saas.dao.DgSaasUserDAO#updateDgSaasUser(com.dataguise.saas.model.DgSaasUsers)
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public DgSaasUsers updateDgSaasUser(DgSaasUsers dgSaasUsers) {
		return hibernateUtil.update(dgSaasUsers);
	}

	/* (non-Javadoc)
	 * @see com.dataguise.saas.dao.DgSaasUserDAO#deleteDgSaasUser(long)
	 */
	@Override
	public void deleteDgSaasUser(Integer id) {
		hibernateUtil.delete(id, DgSaasUsers.class);

	}

	/* (non-Javadoc)
	 * @see com.dataguise.saas.dao.DgSaasUserDAO#getAllDgSaasUsers()
	 */
	@Override
	public List<DgSaasUsers> getAllDgSaasUsers() {
		return hibernateUtil.fetchAll(DgSaasUsers.class);
	}

	/* (non-Javadoc)
	 * @see com.dataguise.saas.dao.DgSaasUserDAO#getDgSaasUser(long)
	 */
	@Override
	public List<DgSaasUsers> getDgSaasUser(Integer id) {
		if(id==0)
			return getAllDgSaasUsers();
		else
		return Arrays.asList(hibernateUtil.fetchById(id, DgSaasUsers.class));
	}


}
