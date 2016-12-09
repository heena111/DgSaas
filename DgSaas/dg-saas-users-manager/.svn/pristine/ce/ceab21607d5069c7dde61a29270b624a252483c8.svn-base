package com.dataguise.saas.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dataguise.saas.dao.util.DgHibernateUtil;
import com.dataguise.saas.model.DgSaasDataSolutions;

@Repository
@Transactional
public class DgSaasDataSolutionsDAOImpl implements DgSaasDataSolutionsDAO {

	@Autowired
	private DgHibernateUtil<DgSaasDataSolutions> hibernateUtil;

	@Override
	public List<DgSaasDataSolutions> getDataSolution(int id) {
		if(id==0){
			return getAllDataSolution();
		}else{
			return Arrays.asList(hibernateUtil.fetchById(id, DgSaasDataSolutions.class));
		}
	}

	@Override
	public List<DgSaasDataSolutions> getAllDataSolution() {
		return hibernateUtil.fetchAll(DgSaasDataSolutions.class);
	}

}
