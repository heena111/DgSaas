package com.dataguise.saas.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataguise.saas.bean.DgSaasUserBean;
import com.dataguise.saas.client.DgSecureClient;
import com.dataguise.saas.controller.DgSaasUserController;
import com.dataguise.saas.dao.DgSaasUserDAO;
import com.dataguise.saas.model.DgSaasUsers;
import com.dataguise.saas.notifier.DgMailManager;
import com.dataguise.saas.util.ApplicationContextProvider;
import com.dataguise.saas.util.DgSaasConstants;
import com.dataguise.saas.util.DgSaasUsersManagerConfigProp;
import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;
import com.google.gson.Gson;

/**
 * @author Harinder Singh Bedi
 *
 */
@Service
public class DgUserServiceImpl implements DgUserService{

	/**
	 * 
	 */
	private static final Logger logger = Logger.getLogger(DgSaasUserController.class);
	@Autowired
	private DgSaasUserDAO dgSaasUserDAO;
	@Autowired
	private DgSaasUsersManagerConfigProp dgSaasUsersManagerConfigProp;

	/* (non-Javadoc)
	 * @see com.dataguise.saas.service.DgUserService#addDgSaasUser(com.dataguise.saas.bean.DgSaasUserBean)
	 */
	@Override
	public Integer addDgSaasUser(DgSaasUserBean dgSaasUserBean) throws DgException {
		logger.info("Adding user "+new Gson().toJson(dgSaasUserBean));
		DgContentManager dgContentManager=ApplicationContextProvider.getApplicationContext().getBean(DgContentManager.class);
		String domain=DgContentManager.getDomainFromEmail(dgSaasUserBean.getEmailAddress());
		if(!dgContentManager.isAllowedDomain(domain))
		{
			logger.error(ErrorConstants.RESTRICTED_DOMAIN_IN_EMAIL.errorMessage()+" "+dgSaasUserBean.getEmailAddress());
			DgExceptionUtil.throwException(ErrorConstants.RESTRICTED_DOMAIN_IN_EMAIL, dgSaasUserBean.getEmailAddress());
		}
		if(!dgContentManager.isBlacklistedEmail(dgSaasUserBean.getEmailAddress()))
		{
			logger.error(ErrorConstants.EMAIL_BLACKLISTED.errorMessage()+" "+dgSaasUserBean.getEmailAddress());
			DgExceptionUtil.throwException(ErrorConstants.EMAIL_BLACKLISTED, dgSaasUserBean.getEmailAddress());
		}

		DgSaasUsers dgSaasUsers= new DgSaasUsers();
		BeanUtils.copyProperties(dgSaasUserBean, dgSaasUsers);
		Timestamp currentTimestamp= new Timestamp(System.currentTimeMillis());
		dgSaasUsers.setCreatets(currentTimestamp);
		dgSaasUsers.setUpdatets(currentTimestamp);
		dgSaasUsers.setActive(true);// setting active for newly created user
		Integer userId= dgSaasUserDAO.addDgSaasUser(dgSaasUsers);
		
		if(dgSaasUserBean.isAddUserInDgSecure()){
			DgSecureClient dgSecureClient = new DgSecureClient(dgSaasUsersManagerConfigProp.getDgSecureUrl()
					, dgSaasUsersManagerConfigProp.getDgSecureAdminUser(), dgSaasUsersManagerConfigProp.getDgSecureAdminPassword());
			//create user in DgSecure
			dgSecureClient.createDgSecureUser(dgSaasUserBean);
		}
		
		DgMailManager.sendDgSecureInstanceDetails(dgSaasUserBean, 
				dgSaasUsersManagerConfigProp.getDgSecureUrl()+DgSaasConstants.DGSECURE_LOGIN_URL);
		
		logger.info("Username "+dgSaasUserBean.getUsername()+" added successfully ");
		return userId;

	}

	/* (non-Javadoc)
	 * @see com.dataguise.saas.service.DgUserService#getDgSaasUser(long)
	 */
	@Override
	public List<DgSaasUserBean> getDgSaasUser(Integer id) {
		List<DgSaasUserBean> dgSaasUserBeans=new ArrayList<DgSaasUserBean>();
		List<DgSaasUsers> dgSaasUsersList=dgSaasUserDAO.getDgSaasUser(id);
		for(DgSaasUsers dgSaasUsers:dgSaasUsersList){
			DgSaasUserBean dgSaasUserBean=new DgSaasUserBean();
			dgSaasUserBean.setId(dgSaasUsers.getId());
			dgSaasUserBean.setNameTitle(dgSaasUsers.getNameTitle());
			dgSaasUserBean.setFirstName(dgSaasUsers.getFirstName());
			dgSaasUserBean.setMiddleName(dgSaasUsers.getMiddleName());
			dgSaasUserBean.setLastName(dgSaasUsers.getLastName());
			dgSaasUserBean.setCompanyName(dgSaasUsers.getCompanyName());
			dgSaasUserBean.setCompanyAddress(dgSaasUsers.getCompanyAddress());
			dgSaasUserBean.setEmailAddress(dgSaasUsers.getEmailAddress());
			dgSaasUserBean.setPositionTitle(dgSaasUsers.getPositionTitle());
			dgSaasUserBean.setPhoneNumber(dgSaasUsers.getPhoneNumber());
			dgSaasUserBean.setUsername(dgSaasUsers.getUsername());
			dgSaasUserBean.setLoginPassword(dgSaasUsers.getLoginPassword());
			dgSaasUserBean.setCreatets(dgSaasUsers.getCreatets());
			dgSaasUserBean.setUpdatets(dgSaasUsers.getUpdatets());
			dgSaasUserBeans.add(dgSaasUserBean);
		}

		return dgSaasUserBeans;
	}

	/* (non-Javadoc)
	 * @see com.dataguise.saas.service.DgUserService#deleteDgSaasUser(long)
	 */
	@Override
	public void deleteDgSaasUser(Integer id) {
		dgSaasUserDAO.deleteDgSaasUser(id);
	}


}
