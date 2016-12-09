package com.dataguise.saas.service;

import java.util.List;

import com.dataguise.saas.model.DgSaasDataPlatforms;
import com.dataguise.saas.model.DgSaasDataSolutions;

public interface DgSaasProductsService {
	
	public List<DgSaasDataPlatforms> getDgSaasDataPlatforms(int id);
	
	public List<DgSaasDataSolutions> getDgSaasDataSolutions(int id);

}
