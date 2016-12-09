package com.dataguise.saas.notifier;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;



///import com.dataguise.admin.NotificationsHibernateRepository;
import com.dataguise.util.Security;
//import com.dataguise.hibernate.DgNotificationSmtpDetails;
import com.dataguise.saas.util.ApplicationContextProvider;
import com.dataguise.saas.util.DgSaasUsersManagerConfigProp;
//import com.dataguise.util.ControllerUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;

public class EmailNotification implements INotifier
{
	Logger logger = Logger.getLogger(EmailNotification.class);

	public void sendNotification(String subject, String content, String emails, String messageType) throws DgException
	{
		try {
			sendEmail(subject, content, null, emails, messageType);
		} catch(DgException dge)
		{
			throw dge;
		}catch (Exception e) {
			
			e.printStackTrace();
			logger.error(e);
			DgFaultInfo dgFaultInfo = new DgFaultInfo();
			dgFaultInfo.setErrorCode(ErrorConstants.ERROR_SENDING_EMAILS.errorCode());
			dgFaultInfo.setErrorText(ErrorConstants.ERROR_SENDING_EMAILS.errorMessage());
			dgFaultInfo.setErrorParameters(e.getMessage());
			throw new DgException("ERROR_SENDING_EMAILS", dgFaultInfo);
		}        
	}
	
	
	public void sendEmail (String subject, String content, String fileLeafName, String recipientName, String messageType) throws DgException {

		try {

			DgSaasUsersManagerConfigProp dgSaasUsersManagerConfigProp= ApplicationContextProvider.getApplicationContext().getBean(DgSaasUsersManagerConfigProp.class);

				String SMTP_HOST_NAME =dgSaasUsersManagerConfigProp.getSmtpHost();
				Integer SMTP_PORT =dgSaasUsersManagerConfigProp.getSmtpPort();
				String from =dgSaasUsersManagerConfigProp.getSmtpSender();
				String[] recipients = recipientName.split(",");//{ recipientName };
				
				String TLS="false";
				String connType=dgSaasUsersManagerConfigProp.getSmtpConnectionType();

				Properties props = new Properties();   
				props.put("mail.smtp.host", SMTP_HOST_NAME);   
				props.put("mail.smtp.auth", "true");   
				props.put("mail.debug", "false");   
				props.put("mail.smtp.port", SMTP_PORT);   
				props.put("mail.smtp.auth.plain.disable", "true");  
				
				
				if(connType.equalsIgnoreCase("TLS")){
					TLS="true";
					if(System.getProperty("javax.net.ssl.trustStore")!=null)
						System.clearProperty("javax.net.ssl.trustStore");
						if(System.getProperty("javax.net.ssl.trustStorePassword")!=null)
						System.clearProperty("javax.net.ssl.trustStorePassword");
					
					
				}
				
				else if(connType.equalsIgnoreCase("SSL")){
					 props.put("mail.smtp.socketFactory.port", SMTP_PORT); //SSL Port
				        props.put("mail.smtp.socketFactory.class",
				                "javax.net.ssl.SSLSocketFactory");
				        props.put("mail.smtp.ssl.enable",true);
				}
				
				props.put("mail.smtp.starttls.enable",TLS);
				

				Authenticator auth = new SMTPAuthenticator(dgSaasUsersManagerConfigProp.getSmtpUsername(),Security.decrypt(dgSaasUsersManagerConfigProp.getSmtpPassword()));
				Session session = Session.getInstance(props, auth); 


				MimeMessage msg = new MimeMessage(session);

				InternetAddress addressFrom = new InternetAddress(from);   
				msg.setFrom(addressFrom);   

				InternetAddress[] addressTo = new InternetAddress[recipients.length];   
				for (int i = 0; i < recipients.length; i++) {   
					addressTo[i] = new InternetAddress(recipients[i]);   
				}   
				msg.setRecipients(Message.RecipientType.TO, addressTo);   

				// Setting the Subject and Content Type   
				msg.setSubject(subject);   
				

				msg.setContent(content, messageType);
				// Create the message part 
				

				Transport.send(msg); 			
				logger.info("Email sent successfully to "+recipientName);
		}
		catch (Exception e) {
			logger.error("Error sending email to "+recipientName,e);
		}
	}

	private class SMTPAuthenticator extends javax.mail.Authenticator {

		String username = "";
		String password = "";

		public SMTPAuthenticator(String username,String password) {			
			this.username=username;
			this.password=password;
		}

		public PasswordAuthentication getPasswordAuthentication() {
			
			return new PasswordAuthentication(username, password);
		}

	}

	
}