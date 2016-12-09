package com.dataguise.saas.client;

import java.security.PublicKey;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.dataguise.saas.bean.DgSaasUserBean;
import com.dataguise.saas.bean.DgSecureUser;
import com.dataguise.saas.bean.DgServiceResponse;
import com.dataguise.saas.util.DgSaasConstants;
import com.dataguise.saas.util.DgSaasUsersManagerUtil;
import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.util.RSAEncryption;
import com.dataguise.util.Security;
import com.dataguise.webservices.beans.DgBrandingStruct;
import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;
import com.dataguise.webservices.beans.DgUserAuthorities;
import com.google.gson.Gson;

import flexjson.JSONDeserializer;

/**
 * @author Harinder Singh Bedi
 *
 */
public class DgSecureClient {

	private static final Logger logger = Logger.getLogger(DgSecureClient.class);
	private String dgSecureURL;
	private String dgSecureAdminUser;
	private String dgSecureAdminPassword;

	/**
	 * @param dgSecureURL
	 * @param dgSecureAdminUser
	 * @param dgSecureAdminPassword
	 */
	public DgSecureClient(String dgSecureURL,
			String dgSecureAdminUser, String dgSecureAdminPassword) {
		this.dgSecureURL = dgSecureURL;
		this.dgSecureAdminUser = dgSecureAdminUser;
		this.dgSecureAdminPassword = dgSecureAdminPassword;
	}

	public String getDgSecureURL() {
		return dgSecureURL;
	}

	public String getDgSecureAdminUser() {
		return dgSecureAdminUser;
	}

	public String getDgSecureAdminPassword() {
		return dgSecureAdminPassword;
	}

	/**
	 * Login into DgSecure and create session 
	 * 
	 * @return
	 * @throws DgException
	 */
	public DgUserAuthorities loginDgSecure() throws DgException{

		DgUserAuthorities dgUserAuth=null;
		String controllerServiceURL=getDgSecureURL()+DgSaasConstants.DGSECURE_CONTROLLER;
		String userName=getDgSecureAdminUser();
		String password=getDgSecureAdminPassword();
		PublicKey publicKey=getDgSecurePublicKey();
		password=DgSaasUsersManagerUtil.encode(password);
		password=RSAEncryption.encryptString(password, publicKey);

		// WS call to login into DgSecure
		StringBuilder wsURL=new StringBuilder();
		wsURL.append(controllerServiceURL).append("/services/Login/?userName=").append(DgSaasUsersManagerUtil.encode(userName))
		.append("&password=").append(password).append("&dgs=1");

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> resultString = template.getForEntity(
				wsURL.toString(), String.class);

		if (resultString.getStatusCode().toString().equals(
				DgSaasConstants.PARTIAL_CONTENT)) {
			DgFaultInfo dgServerFaultInfo = new JSONDeserializer<DgFaultInfo>()
					.deserialize(resultString.getBody(), DgFaultInfo.class);
			throw new DgException("Login failed", dgServerFaultInfo);
		} else {
			dgUserAuth = new JSONDeserializer<DgUserAuthorities>()
					.deserialize(resultString.getBody(),
							DgUserAuthorities.class);
		}

		return dgUserAuth;
	}

	/**
	 * Gets branding info from DgSecue which contains Public key mod along with branding info
	 *  
	 * @return
	 * @throws DgException
	 */
	private DgBrandingStruct getDgSecureBranding() throws DgException{

		DgBrandingStruct dgBrandingStruct =null;
		String urlString = getDgSecureURL()+DgSaasConstants.DGSECURE_CONTROLLER + "/services/GetBranding?dgs=0";
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> responseEntity = template.getForEntity(
				urlString, String.class);

		if (responseEntity.getStatusCode().toString().equals(DgSaasConstants.PARTIAL_CONTENT)) {
			DgFaultInfo dgServerFaultInfo = new JSONDeserializer<DgFaultInfo>()
					.deserialize(responseEntity.getBody(), DgFaultInfo.class);
			throw new DgException("Error getting branding info", dgServerFaultInfo);
		} else {
			dgBrandingStruct = new JSONDeserializer<DgBrandingStruct>()
					.deserialize(responseEntity.getBody(),
							DgBrandingStruct.class);
		}
		return dgBrandingStruct;
	}

	/**
	 * Get PublicKey from DgSecure branding info
	 * 
	 * @return
	 * @throws DgException
	 */
	private PublicKey getDgSecurePublicKey() throws DgException{
		DgBrandingStruct dgBrandingStruct = getDgSecureBranding();
		return RSAEncryption.getPublicKeyfromMod(dgBrandingStruct.getModValue());
	}

	/**
	 * @param dgSaasUserBean
	 * @return
	 * @throws DgException
	 */
	public void createDgSecureUser(DgSaasUserBean dgSaasUserBean) throws DgException {

		DgUserAuthorities dgUserAuth=loginDgSecure();
		String sessionId=dgUserAuth.getSessionID();
		DgSecureUser dgSecureUser=new DgSecureUser(); 
		dgSecureUser.setUserName(dgSaasUserBean.getUsername());
		dgSecureUser.setCommand("createUser");// command to create user in DgSecure
		dgSecureUser.setFirstName(dgSaasUserBean.getFirstName());
		dgSecureUser.setLastName(dgSaasUserBean.getLastName());
		dgSecureUser.setEmailAddress(dgSaasUserBean.getEmailAddress());
		dgSecureUser.setOtherInfo(dgSaasUserBean.getCompanyName());
		dgSecureUser.setActive(true);
		dgSecureUser.setRoleId(2);// Role id 2 for default user role
		dgSecureUser.setDnString("");// not required for DB authentication
		String json = new Gson().toJson(dgSecureUser, DgSecureUser.class);

		long _dc=new Random().nextInt();// Random number used for generating checksum value
		long dg6373=checksumGenerator(_dc,json,sessionId);// Checksum value that gets validated on DgSecure during WS call

		StringBuilder wsURL=new StringBuilder();
		wsURL.append(getDgSecureURL()).append(DgSaasConstants.DGSECURE_CONTROLLER)
		.append(DgSaasConstants.DGSECURE_CREATE_USER_WS)
		.append("?json={json}").append("&sessionId=").append(sessionId)
		.append("&_dc=").append(_dc).append("&dg6373=").append(dg6373);

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> responseEntity = template.getForEntity(wsURL.toString(),
				String.class,json);

		if (responseEntity.getStatusCode()!= HttpStatus.OK) {
			logger.error(ErrorConstants.ERROR_CREATING_USER.errorMessage()+" "+json);
			DgFaultInfo dgServerFaultInfo = new JSONDeserializer<DgFaultInfo>()
					.deserialize(responseEntity.getBody(), DgFaultInfo.class);
			throw new DgException(ErrorConstants.ERROR_CREATING_USER.errorMessage(), dgServerFaultInfo);
		} 
		else{
			String response=responseEntity.getBody();
			logger.debug("Create user response "+response);
			DgServiceResponse dgServiceResponse=new Gson().fromJson(response, DgServiceResponse.class);
			if(dgServiceResponse.getSuccess())
				logger.info(dgSaasUserBean.getUsername() +" created successfully in DgSecure");
			else{
				logger.error(ErrorConstants.ERROR_CREATING_USER.errorMessage()+" "+response);
				DgExceptionUtil.throwException(ErrorConstants.ERROR_CREATING_USER, response);
			}
		}

	}
	/**
	 * Generates the checksum value from the parameters passed
	 * 
	 * @param randomNumber
	 * @param input
	 * @return
	 */
	private static long checksumGenerator(long randomNumber,String... input){
		long checksum = Security.getCheckSum(String.valueOf(randomNumber));
		for(String val:input){
			checksum+=Security.getCheckSum(val);
		}
		return Security.getCheckSum(checksum, randomNumber);
	}
}
