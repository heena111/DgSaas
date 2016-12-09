package com.dataguise.saas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dataguise.saas.dao.DgSaasDataPlatformsDAO;
import com.dataguise.saas.dao.DgSaasDataSolutionsDAO;
import com.dataguise.saas.model.DgSaasDataPlatforms;
import com.dataguise.saas.model.DgSaasDataSolutions;

public class DgSaasProductsServiceImpl implements DgSaasProductsService {
	
	@Autowired
	private DgSaasDataPlatformsDAO dgSaasDataPlatformsDAO;
	@Autowired
	private DgSaasDataSolutionsDAO dgSaasDataSolutionsDAO;

	@Override
	public List<DgSaasDataPlatforms> getDgSaasDataPlatforms(int id) {
		return dgSaasDataPlatformsDAO.getDataPlatform(id);
	}

	@Override
	public List<DgSaasDataSolutions> getDgSaasDataSolutions(int id) {
		return dgSaasDataSolutionsDAO.getDataSolution(id);
	}

}
