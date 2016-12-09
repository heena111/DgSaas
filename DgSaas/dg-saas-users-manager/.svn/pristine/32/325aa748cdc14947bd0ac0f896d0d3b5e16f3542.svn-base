package com.dataguise.saas.notifier;

import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.dataguise.saas.bean.DgMailInfoBean;
import com.dataguise.saas.bean.DgSaasUserBean;
import com.dataguise.saas.util.ApplicationContextProvider;
import com.dataguise.saas.util.DgSaasUsersManagerConfigProp;
import com.dataguise.webservices.beans.DgException;

public class DgMailManager {
	
	private static final Logger logger = Logger.getLogger(DgMailManager.class);

	public static void sendDgSecureInstanceDetails(final DgSaasUserBean dgSaasUserBean, String url) throws DgException{
		
		DgMailInfoBean dgMailInfoBean=new DgMailInfoBean();
		dgMailInfoBean.setUrl(url);
		dgMailInfoBean.setUserName(dgSaasUserBean.getUsername());
		dgMailInfoBean.setPassword(dgSaasUserBean.getLoginPassword());

		DgSaasUsersManagerConfigProp dgSaasUsersManagerConfigProp= ApplicationContextProvider.getApplicationContext().getBean(DgSaasUsersManagerConfigProp.class);
		final String mailSubject=dgSaasUsersManagerConfigProp.getMailSubject();
		DgEmailContentGenerator emailContentGenerator= ApplicationContextProvider.getApplicationContext().getBean(DgEmailContentGenerator.class);
		final String content=emailContentGenerator.getDgSecureDemoInstanceEmail(dgMailInfoBean);
		final INotifier iNotifier=new EmailNotification();
		Executors.newSingleThreadExecutor().execute(new Runnable() {
		    @Override 
		    public void run() {
		    	try {
					iNotifier.sendNotification(mailSubject, content, dgSaasUserBean.getEmailAddress(), "text/html; charset=utf-8");
				} catch (DgException e) {
					logger.error(e);
				}
		    }
		});
		

	}
}
