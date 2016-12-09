package com.dataguise.saas.dao;

import java.util.List;

import com.dataguise.saas.model.DgSaasDataSolutions;


public interface DgSaasDataSolutionsDAO {
	
	public List<DgSaasDataSolutions> getAllDataSolution();
	
	public List<DgSaasDataSolutions> getDataSolution(int id);

}
