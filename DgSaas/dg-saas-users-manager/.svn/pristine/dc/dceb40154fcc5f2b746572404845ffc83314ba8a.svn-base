package com.dataguise.saas.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @author Harinder Singh Bedi
 *
 */
@Component
@PropertySources({
    @PropertySource("classpath:config.properties"),
    @PropertySource("classpath:mail.properties")
})
public class DgSaasUsersManagerConfigProp {

	@Value("${dg.secure.url}")
	private String dgSecureUrl;
	@Value("${dg.secure.admin.user}")
	private String dgSecureAdminUser;
	@Value("${dg.secure.admin.password}")
	private String dgSecureAdminPassword;
	
	// SMTP configuration parameters
	@Value("${smtp.host}")
	private String smtpHost;
	@Value("${smtp.port}")
	private Integer smtpPort;
	@Value("${smtp.conn.type}")
	private String smtpConnectionType;
	@Value("${smtp.username}")
	private String smtpUsername;
	@Value("${smtp.password}")
	private String smtpPassword;
	@Value("${smtp.sender}")
	private String smtpSender;
	
	@Value("${mail.subject}")
	private String mailSubject;

	public String getDgSecureUrl() {
		return dgSecureUrl;
	}

	public String getDgSecureAdminUser() {
		return dgSecureAdminUser;
	}

	public String getDgSecureAdminPassword() {
		return dgSecureAdminPassword;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public Integer getSmtpPort() {
		return smtpPort;
	}

	public String getSmtpConnectionType() {
		return smtpConnectionType;
	}

	public String getSmtpUsername() {
		return smtpUsername;
	}

	public String getSmtpPassword() {
		return smtpPassword;
	}

	public String getSmtpSender() {
		return smtpSender;
	}

	public String getMailSubject() {
		return mailSubject;
	}


}
