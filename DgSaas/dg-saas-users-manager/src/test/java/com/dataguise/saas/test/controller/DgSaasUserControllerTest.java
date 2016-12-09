package com.dataguise.saas.test.controller;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import com.dataguise.saas.bean.DgSaasUserBean;


/**
 * @author Harinder Singh Bedi
 *
 */
@RunWith(value=SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:mvc-dispatcher-servlet-test.xml")
public class DgSaasUserControllerTest {

	private static final Logger logger = Logger.getLogger(DgSaasUserControllerTest.class);
	private static String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		DgSaasUserControllerTest.url = url;
	}

	/*@Before
	public void setup() {
	}*/

	@Test
	public void addUserTest() {
		String addUserURL=getUrl()+"/user/addUser";
		DgSaasUserBean dgSaasUserBean=new DgSaasUserBean();
		dgSaasUserBean.setFirstName("TestFName");
		dgSaasUserBean.setLastName("TestLName");
		dgSaasUserBean.setUsername("testUser");
		dgSaasUserBean.setLoginPassword("aa");
		dgSaasUserBean.setEmailAddress("testEmail");
		dgSaasUserBean.setCompanyName("Comapny");
		dgSaasUserBean.setAddUserInDgSecure(false);// setting false as DgSecure won't be available

		RestTemplate template = new RestTemplate();
		ResponseEntity<Integer> resultString = template.postForEntity(
				addUserURL, dgSaasUserBean, Integer.class);
		logger.info("Add user response "+resultString);

		Integer userId=resultString.getBody();		
		String getUserURL=getUrl()+"/user/getUser?userId="+userId;
		ResponseEntity<DgSaasUserBean[]> dgSaasUserBeanArray=template.getForEntity(getUserURL, DgSaasUserBean[].class);
		DgSaasUserBean dgSaasUserBeanResponse=dgSaasUserBeanArray.getBody()[0];
		Assert.assertEquals(dgSaasUserBean.getUsername(), dgSaasUserBeanResponse.getUsername());
		Assert.assertEquals(dgSaasUserBean.getFirstName(), dgSaasUserBeanResponse.getFirstName());
		Assert.assertEquals(dgSaasUserBean.getLastName(), dgSaasUserBeanResponse.getLastName());
		Assert.assertEquals(dgSaasUserBean.getEmailAddress(), dgSaasUserBeanResponse.getEmailAddress());
		Assert.assertEquals(userId, dgSaasUserBeanResponse.getId());

	}

}
