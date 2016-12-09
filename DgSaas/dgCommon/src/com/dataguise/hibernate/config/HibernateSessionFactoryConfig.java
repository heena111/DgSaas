package com.dataguise.hibernate.config;

import java.util.Properties;

import com.dataguise.util.Security;


/**
 * Configures and provides Hibernate connection details, based on the dbType
 * 
 * @author Arun
 */
public class HibernateSessionFactoryConfig {
	private String hibernateConnectionDriver = null;
	private String hibernateConnectionURL = null;
	private String hibernateDialect = null;
	private static String dbType;
	private Properties hibernateConProp=null;
	
	private HibernateSessionFactoryConfig(){};
	
	public HibernateSessionFactoryConfig(Properties properties){
		hibernateConProp=initDBConnectionProps(properties);
	}
	
	public Properties getHibernateConProp() {
		return hibernateConProp;
	}

	private Properties initDBConnectionProps(Properties properties) {
		Properties conProp = null;
		try {

			// Set Hibernate Properties from DgConnection.properties
			conProp=setHibernateConnectionProps(properties);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conProp;
	}


	private  Properties setHibernateConnectionProps(Properties properties) {
		Properties conProp = new Properties();
		String dbms = properties.getProperty("dbms").toLowerCase();
		dbType = dbms;
		String userName = properties.getProperty("UserName");
		String password = properties.getProperty("password");
		String database = properties.getProperty("database");
		String serverName = properties.getProperty("ServerName");
		String portNumber = properties.getProperty("PortNumber");
		String instanceName = properties.getProperty("instanceName");
		String sslFlag = properties.getProperty("sslEnable");
		String schemaName = properties.getProperty("schemaName");
		String authType = properties.getProperty("authType");
		String sid = properties.getProperty("sid");
		String serviceName = properties.getProperty("serviceName");
		String tnsName = properties.getProperty("tnsName");
		
		String minConnectionSize=properties.getProperty("hibernate.c3p0.min_size");
		String maxConnectionSize=properties.getProperty("hibernate.c3p0.max_size");
		String idleConnectionTimeout=properties.getProperty("hibernate.c3p0.timeout");
		String maxStatements=properties.getProperty("hibernate.c3p0.max_statements");
		String idleTestPeriod=properties.getProperty("hibernate.c3p0.idle_test_period");
		
		if (dbms.equalsIgnoreCase("MySql")) {
			hibernateConnectionDriver = "com.mysql.jdbc.Driver";
			hibernateDialect = "org.hibernate.dialect.MySQLDialect";
			if (sslFlag != null && sslFlag.equalsIgnoreCase("true")) {
				hibernateConnectionURL = "jdbc:"
						+ dbms
						+ "://"
						+ serverName
						+ ":"
						+ portNumber
						+ "/"
						+ database
						+ "?verifyServerCertificate=false&useSSL=true&requireSSL=true";
			} else {
				hibernateConnectionURL = "jdbc:" + dbms + "://" + serverName
						+ ":" + portNumber + "/" + database;
			}
		} else if (dbms.equalsIgnoreCase("PostgreSql")) {

			hibernateConnectionDriver = "org.postgresql.Driver";
			hibernateDialect = "org.hibernate.dialect.PostgreSQLDialect";
			if (sslFlag != null && sslFlag.equalsIgnoreCase("true")) {
				hibernateConnectionURL = "jdbc:" + dbms + "://" + serverName
						+ ":" + portNumber + "/" + database + "?ssl";
			} else {
				hibernateConnectionURL = "jdbc:" + dbms + "://" + serverName
						+ ":" + portNumber + "/" + database;
			}
			if (database != null && !database.equalsIgnoreCase(""))
				conProp.setProperty("hibernate.default_catalog", database);
			conProp.setProperty("hibernate.default_schema", schemaName);
			
			String trustStore = properties.getProperty("postgresTrustedStoreLocation");
	   	 	String trustStorePassword = properties.getProperty("postgresTrustedStorePassword");
	   	 	   	 	
	   	 		if (trustStore != null && trustStore.length() > 1) {
	   	 			System.setProperty("javax.net.ssl.trustStore", trustStore);
	   	 		}	   	 	
	   	 		if (trustStorePassword != null && trustStorePassword.length() > 1) {
	   	 			System.setProperty("javax.net.ssl.trustStorePassword", trustStorePassword);
	   	 		}	
			
		} else if (dbms.equalsIgnoreCase("Oracle")) {
			hibernateConnectionDriver = "oracle.jdbc.OracleDriver";
			hibernateDialect = "org.hibernate.dialect.OracleDialect";

			if ("TNS".equalsIgnoreCase(authType)) {
				hibernateConnectionURL = "jdbc:" + dbms.toLowerCase()
						+ ":thin:@" + tnsName;
			} else {

				if (serviceName != null && !serviceName.equals("")) {
					hibernateConnectionURL = "jdbc:" + dbms.toLowerCase()
							+ ":thin:@" + serverName + ":" + portNumber + "/"
							+ serviceName;
				} else {
					hibernateConnectionURL = "jdbc:" + dbms.toLowerCase()
							+ ":thin:@" + serverName + ":" + portNumber + ":"
							+ sid;
				}
			}
			if (sslFlag != null && sslFlag.equalsIgnoreCase("true")) {

				hibernateConnectionURL += "?verifyServerCertificate=false&useSSL=true&requireSSL=true";
			}

		}
		else if (dbms.equalsIgnoreCase("sqlserver")) {
			hibernateConnectionDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			hibernateDialect = "org.hibernate.dialect.SQLServerDialect";
			if (instanceName != null && !instanceName.equalsIgnoreCase("")) {
				if (sslFlag != null && sslFlag.equalsIgnoreCase("true"))
					hibernateConnectionURL = "jdbc:" + dbms + "://"
							+ serverName + ";instanceName=" + instanceName
							+ ";encrypt=true;DatabaseName={"
							+ database + "}";
				else if ("Windows".equalsIgnoreCase(authType))
					hibernateConnectionURL = "jdbc:" + dbms + "://"
							+ serverName + ";instanceName=" + instanceName
							+ ";integratedSecurity=true;DatabaseName={"
							+ database + "}";
				else
					hibernateConnectionURL = "jdbc:" + dbms + "://"
							+ serverName + ";instanceName=" + instanceName
							+ ";DatabaseName={"
							+ database + "}";
			} else {
				if (sslFlag != null && sslFlag.equalsIgnoreCase("true"))
					hibernateConnectionURL = "jdbc:" + dbms + "://"
							+ serverName + ":" + portNumber + ";DatabaseName={"
							+ database + "};encrypt=true;";
				else if ("Windows".equalsIgnoreCase(authType))
					hibernateConnectionURL = "jdbc:" + dbms + "://"
							+ serverName + ":" + portNumber + ";DatabaseName={"
							+ database + "};integratedSecurity=true;";
				else
					hibernateConnectionURL = "jdbc:" + dbms + "://"
							+ serverName + ":" + portNumber + ";DatabaseName={"
							+ database + "}";
			}
			conProp.setProperty("hibernate.default_catalog", database);
			conProp.setProperty("hibernate.default_schema", schemaName);
		}

		if (!"Windows".equalsIgnoreCase(authType)) {
			conProp.setProperty("hibernate.connection.password", password);
			conProp.setProperty("hibernate.connection.username", userName);
		}
		conProp.setProperty("hibernate.connection.driver_class",
				hibernateConnectionDriver);
		conProp.setProperty("hibernate.connection.url", hibernateConnectionURL);
		conProp.setProperty("hibernate.dialect", hibernateDialect);
		conProp.setProperty("hibernate.connection.autocommit", Boolean.TRUE.toString());
		
		
		// Connection Pool Settings with C3P0 as Connection Provider
		conProp.setProperty("hibernate.connection.SetBigStringTryClob", "true");
		conProp.setProperty("hibernate.connection.provider_class",
				"org.hibernate.connection.C3P0ConnectionProvider");
		
   	 	

		// Minimum number of JDBC connections in the pool.
		conProp.setProperty("hibernate.c3p0.min_size", minConnectionSize);

		// Maximum number of JDBC connections in the pool.
		conProp.setProperty("hibernate.c3p0.max_size", maxConnectionSize);

		// When an idle connection is removed from the pool (in seconds).
		conProp.setProperty("hibernate.c3p0.timeout", idleConnectionTimeout);

		// Number of prepared statements will be cached.
		conProp.setProperty("hibernate.c3p0.max_statements", maxStatements);

		// idle time in seconds before a connection is automatically validated.
		conProp.setProperty("hibernate.c3p0.idle_test_period", idleTestPeriod);
		
		return conProp;
	}
	
	public static String getDBType() {
		return dbType;
	}

}
