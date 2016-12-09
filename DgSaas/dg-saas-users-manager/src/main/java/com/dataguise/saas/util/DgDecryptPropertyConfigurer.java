package com.dataguise.saas.util;

import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @author Harinder Singh Bedi
 *
 */
public class DgDecryptPropertyConfigurer extends PropertyPlaceholderConfigurer {

	private static Logger logger = Logger.getLogger(DgDecryptPropertyConfigurer.class); 

	@Override
	protected void convertProperties(Properties props) {

		Enumeration propertyNames = props.propertyNames();
		while (propertyNames.hasMoreElements()) {
			String propertyName = (String) propertyNames.nextElement();
			System.out.println(propertyName);
			String propertyValue = props.getProperty(propertyName);

			if("database.password".equals(propertyName))
			{
				propertyValue="decrypt here";
			}
			props.setProperty(propertyName, propertyValue);

		}
	}
}