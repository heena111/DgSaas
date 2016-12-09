package com.dataguise.saas.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dataguise.saas.dao.util.DgHibernateUtil;

@Service
public class DgContentManager {
	
	private static Logger logger = Logger.getLogger(DgContentManager.class);
	
	@Autowired
	private DgHibernateUtil hibernateUtil;
	
	@Transactional
	public boolean isAllowedDomain(String content){
		
		String query="select id from DgSaasRestrictedDomains where domainName=:domainName"; 
		Map<String,Object> parameters=new HashMap<>();
		parameters.put("domainName", content);
		Long id=hibernateUtil.fetchIdIfConditionFulfilled(query,parameters);
		if(id==0)
			return true;
		
		return false;
	}
	
	@Transactional
	public boolean isBlacklistedEmail(String emailAddress){
		
		String query="select id from DgSaasRestrictedEmails where emailAddress=:emailAddress"; 
		Map<String,Object> parameters=new HashMap<>();
		parameters.put("emailAddress", emailAddress);
		Long id=hibernateUtil.fetchIdIfConditionFulfilled(query,parameters);
		if(id==0)
			return true;
		
		return false;
	}
	
	public static String getDomainFromEmail(String emailAddress)
	{
		String domain=emailAddress.substring(emailAddress.indexOf("@")+1);
		if(domain.contains(".")){
			domain=domain.substring(0, domain.indexOf("."));
		}else{
			logger.warn("Error getting domain from Email "+emailAddress);;
		}
		return domain;
	}

}
