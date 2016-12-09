package com.dataguise.saas.notifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Logger;
import org.springframework.core.io.Resource;

import com.dataguise.saas.bean.DgMailInfoBean;
import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;

public class DgEmailContentGenerator {
	
	private Logger logger = Logger.getLogger(DgEmailContentGenerator.class);
	private Resource fileResource;

	public DgEmailContentGenerator(Resource resource) {
		fileResource=resource;
	}
	
	public String readFileContent() throws DgException{
		String content = null; 
		try {
			Path path= Paths.get(fileResource.getURI());
			content= new String(Files.readAllBytes(path));
		} catch (IOException e) {
			logger.error(ErrorConstants.ERROR_READING_PROPERTY_FILE.errorMessage()+fileResource.toString());
			DgExceptionUtil.throwException(ErrorConstants.ERROR_READING_PROPERTY_FILE, e.getMessage());
		}
		return content;
	}
	
	public String getDgSecureDemoInstanceEmail(DgMailInfoBean dgMailInfoBean) throws DgException
	{
		String emailContent=readFileContent();
		emailContent=emailContent.replaceAll("\\{\\{url\\}\\}", dgMailInfoBean.getUrl());
		emailContent=emailContent.replaceAll("\\{\\{username\\}\\}", dgMailInfoBean.getUserName());
		emailContent=emailContent.replaceAll("\\{\\{password\\}\\}", dgMailInfoBean.getPassword());
		return emailContent;
		
	}

}
