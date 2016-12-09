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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataguise.saas.bean.DgSaasUserBean;
import com.dataguise.saas.service.DgUserService;
import com.dataguise.saas.util.DgSaasConstants;
import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;
import com.google.gson.Gson;

/**
 * @author Harinder Singh Bedi
 *
 */
@Component
@RestController
@ResponseBody
@RequestMapping("/user")
public class DgSaasUserController{

	@Autowired
	private DgUserService dgUserService;
	private static final Logger logger = Logger.getLogger(DgSaasUserController.class);
	
	@ExceptionHandler(DgException.class)
	@ResponseBody
	public ResponseEntity<DgFaultInfo> handleException(DgException e)
			throws DgException {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.TEXT_PLAIN);
		return new ResponseEntity<DgFaultInfo>(e.getFaultInfo(),
				responseHeaders, HttpStatus.PARTIAL_CONTENT);
	}

	/**
	 * @param dgSaasUserBean
	 * @return
	 * @throws DgException 
	 */
	@RequestMapping(value="/addUser", method=RequestMethod.POST, headers=DgSaasConstants.CONTENT_TYPE_APPLICATION_JSON)
	public ResponseEntity<Integer> addUser(@RequestBody DgSaasUserBean dgSaasUserBean) throws DgException {
		logger.debug("Adding user"+new Gson().toJson(dgSaasUserBean));
		return new ResponseEntity<Integer>(dgUserService.addDgSaasUser(dgSaasUserBean),HttpStatus.OK);
	}


	/**
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<DgSaasUserBean>> getUser(@RequestParam("userId") Integer userId) {
		logger.debug("Get user"+userId);
		return new ResponseEntity<List<DgSaasUserBean>>(dgUserService.getDgSaasUser(userId),HttpStatus.OK);
	}
	
	/**
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<List<DgSaasUserBean>> deleteUser(@RequestParam("userId") Integer userId) {
		logger.debug("Delete user"+userId);
		dgUserService.deleteDgSaasUser(userId);
		return new ResponseEntity<List<DgSaasUserBean>>(HttpStatus.NO_CONTENT);
	}

}