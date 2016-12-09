package com.dataguise.saas.dao;

import java.util.List;

import com.dataguise.saas.model.DgSaasDataPlatforms;


public interface DgSaasDataPlatformsDAO {
	
	public List<DgSaasDataPlatforms> getAllDataPlatform();
	
	public List<DgSaasDataPlatforms> getDataPlatform(int id);

}
