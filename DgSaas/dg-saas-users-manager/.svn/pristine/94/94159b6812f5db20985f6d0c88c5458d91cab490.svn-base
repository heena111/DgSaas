DROP DATABASE IF EXISTS dg;
CREATE DATABASE dg;

-- PLEASE DO NOT DELETE OR COMMENT THE LINE BELOW
--\connect dg;

DROP SCHEMA IF EXISTS dgsaas CASCADE;

CREATE SCHEMA dgsaas;

set search_path=dgsaas;

-- Table for Hibernate Sequence generator
DROP TABLE IF EXISTS dg_sequence_gen;
CREATE TABLE dg_sequence_gen (
   seq_col_name                      VARCHAR(256)  NOT NULL
 , seq_col_value                     INTEGER       NOT NULL
 , PRIMARY KEY (seq_col_name)
);

DROP TABLE IF EXISTS dg_saas_data_platforms;
CREATE TABLE dg_saas_data_platforms (
   id                                INTEGER       NOT NULL 
 , data_platform                     VARCHAR(100)  NOT NULL 
 , PRIMARY KEY (id)
 ); 
 
DROP TABLE IF EXISTS dg_saas_data_solutions;
CREATE TABLE dg_saas_data_solutions (
   id                                INTEGER       NOT NULL 
 , data_solution                     VARCHAR(100)  NOT NULL 
 , PRIMARY KEY (id)
 ); 
 
DROP TABLE IF EXISTS dg_saas_users;
CREATE TABLE dg_saas_users (
   id                                INTEGER       NOT NULL 
 , name_prefix						 VARCHAR(10) 
 , first_name                        VARCHAR(100)
 , middle_name                       VARCHAR(100)
 , last_name                         VARCHAR(100)
 , company_name                      VARCHAR(100)
 , company_address                   VARCHAR(500)
 , email_address                     VARCHAR(256)
 , position_title                    VARCHAR(100)
 , phone_number						 VARCHAR(20)
 , user_name						 VARCHAR(100)
 , login_password					 VARCHAR(100)
 , active                            boolean       NOT NULL
 , createts                          TIMESTAMP     NOT NULL DEFAULT CURRENT_TIMESTAMP
 , updatets                          TIMESTAMP     NULL DEFAULT NULL
 , PRIMARY KEY (id)
 );
 
 DROP TABLE IF EXISTS dg_saas_user_company_details;
CREATE TABLE dg_saas_user_company_details (
   id                                INTEGER       NOT NULL 
 , company_name                      VARCHAR(100)
 , company_address                   VARCHAR(500)
 , position_title                    VARCHAR(100)
 , phone_number						 VARCHAR(20)
 , PRIMARY KEY (id)
 );
 
DROP TABLE IF EXISTS dg_saas_user_platform_sol;
CREATE TABLE dg_saas_user_platform_sol (
   id                                INTEGER       NOT NULL 
 , user_id                     		 INTEGER  	   NOT NULL 
 , platform_id                     	 INTEGER  	   NOT NULL 
 , solution_id                     	 INTEGER  	   NOT NULL 
 , PRIMARY KEY (id)
 , FOREIGN KEY (user_id) REFERENCES dg_saas_users (id)
 , FOREIGN KEY (platform_id) REFERENCES dg_saas_data_platforms (id) 
 , FOREIGN KEY (solution_id) REFERENCES dg_saas_data_solutions (id) 
 ); 

DROP TABLE IF EXISTS dg_saas_restricted_domains;
CREATE TABLE dg_saas_restricted_domains (
   id                                INTEGER       NOT NULL 
 , domain_name						 VARCHAR(254)  NOT NULL 
 , needs_approval					 BOOLEAN	   DEFAULT FALSE
 , createts                          TIMESTAMP     NOT NULL DEFAULT CURRENT_TIMESTAMP
 , updatets                          TIMESTAMP     NULL DEFAULT NULL
 , PRIMARY KEY (id)
 );
CREATE UNIQUE INDEX ux_dg_saas_domain_name ON dg_saas_restricted_domains(domain_name);

 
DROP TABLE IF EXISTS dg_saas_restricted_emails;
CREATE TABLE dg_saas_restricted_emails (
   id                                INTEGER       NOT NULL 
 , email_address                     VARCHAR(256)  NOT NULL 
 , restriction_type					 character(1)			
 , createts                          TIMESTAMP     NOT NULL DEFAULT CURRENT_TIMESTAMP
 , updatets                          TIMESTAMP     NULL DEFAULT NULL
 , PRIMARY KEY (id)
 );
 
CREATE UNIQUE INDEX ux_dg_saas_email_address ON dg_saas_restricted_emails(email_address);
