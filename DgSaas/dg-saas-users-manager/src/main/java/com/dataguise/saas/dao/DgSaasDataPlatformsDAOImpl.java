package com.dataguise.saas.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dataguise.saas.dao.util.DgHibernateUtil;
import com.dataguise.saas.model.DgSaasDataPlatforms;


@Repository
@Transactional
public class DgSaasDataPlatformsDAOImpl implements DgSaasDataPlatformsDAO {

	@Autowired
	private DgHibernateUtil<DgSaasDataPlatforms> hibernateUtil;

	@Override
	public List<DgSaasDataPlatforms> getDataPlatform(int id) {
		if(id==0){
			return getAllDataPlatform();
		}else{
			return Arrays.asList(hibernateUtil.fetchById(id, DgSaasDataPlatforms.class));
		}
	}

	@Override
	public List<DgSaasDataPlatforms> getAllDataPlatform() {
		return hibernateUtil.fetchAll(DgSaasDataPlatforms.class);
	}

}
