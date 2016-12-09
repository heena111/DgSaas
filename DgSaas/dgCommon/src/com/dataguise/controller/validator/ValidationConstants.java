package com.dataguise.controller.validator;

public class ValidationConstants {

	public static String[] validStringDatatype = {"CHAR", "VARCHAR", "VARCHAR2","NVARCHAR2", "CHARACTER", "LONG VARCHAR","TEXT","TINYTEXT", "LONGTEXT","SMALLTEXT", "MEDIUMTEXT","NVARCHAR", "NTEXT", "CHARACTER VARYING","NCHAR","GRAPHIC","VARGRAPHIC","BIT"};
	public static String[] validNumericDatatype = {"NUMBER", "FLOAT","FLOAT4", "DECIMAL", "INT", "INTEGER", "LONG", "SMALLINT", "BIGINT", "DOUBLE", "REAL", "SMALLMONEY", "NUMERIC", "IDENTITY", "TINYINT", "DOUBLE PRECISION", "SERIAL", "SMALLSERIAL", "BIGSERIAL", "MONEY","MEDIUMINT"};
	public static String[] validDateDatatype = {"DATE","DATETIME","DATETIME2","TIMESTAMP","TIMESSTAMP WITHOUT TIME ZONE","TIMESTAMP WITH TIME ZONE"};
	
	
	public static String[] validRandomMaskingOptions1 = {"Address Street","Address Full","Address Line 1", "Address Line 2", "City", "First and Last Name", "Last Name", "State Name", "State Code","Country","Country Name", "Country ID", "Country Code", "Country Code3"};
	public static String[] validRandomMaskingOptions2 = {"Date", "Timestamp", "Email Addresses", "Email Addresses", "First Name", "Random string", "Social Security Numbers", "Telephone Numbers", "Number", "ZIP", "Credit Card Numbers"};
	public static String[] validCaseOptions = {"u","t","l"};
}
