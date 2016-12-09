package com.dataguise.saas.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataguise.saas.model.DgSaasDataPlatforms;
import com.dataguise.saas.model.DgSaasDataSolutions;
import com.dataguise.saas.service.DgSaasProductsService;
import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;

/**
 * @author Harinder Singh Bedi
 *
 */
@Component
@RestController
@ResponseBody
@RequestMapping("/products")
public class DgSaasProductsController{

	@Autowired
	private DgSaasProductsService dgSaasProductsService;
	private static final Logger logger = Logger.getLogger(DgSaasProductsController.class);
	
	@ExceptionHandler(DgException.class)
	@ResponseBody
	public ResponseEntity<DgFaultInfo> handleException(DgException e)
			throws DgException {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.TEXT_PLAIN);
		return new ResponseEntity<DgFaultInfo>(e.getFaultInfo(),
				responseHeaders, HttpStatus.PARTIAL_CONTENT);
	}

	
	@RequestMapping(value = "/getDataPlatforms", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<DgSaasDataPlatforms>> getDataPlatforms(@RequestParam("platformId") Integer platformId) {
		logger.debug("GetDataPlatforms "+platformId);
		return new ResponseEntity<List<DgSaasDataPlatforms>>(dgSaasProductsService.getDgSaasDataPlatforms(platformId),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getDataSolutions", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<DgSaasDataSolutions>> getDataSolutions(@RequestParam("solutionId") Integer solutionId) {
		logger.debug("GetDataSolutions "+solutionId);
		return new ResponseEntity<List<DgSaasDataSolutions>>(dgSaasProductsService.getDgSaasDataSolutions(solutionId),HttpStatus.OK);
	}

}