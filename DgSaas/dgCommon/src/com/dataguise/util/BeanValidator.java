package com.dataguise.util;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;



/**
 * Validator class to validate the beans i.e. whether the 
 * values injected to their variables are in accordance to the constraints defined over them 
 *
 */
 
 
public class BeanValidator{

	public static final String GENERIC_TEXT_REGEX = "[^<>\"\']*";
	public static final String HADOOP_NAME_REGEX = "[A-Za-z0-9][\\w\\-]*";
	public static final String STRUCTURE_NAME_REGEX = "[_a-zA-Z][\\w]*";
	public static final String FILE_NAME_REGEX = "[A-Za-z0-9][\\w\\-]*";
	public static final String IP_ADDRESS_REGEX = "\\b(((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)))\\b";
	public static final String IP_ADDRESS_REGEX_DBMS_CONNECTION= "^$|\\b(((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)))\\b";
	public static final String EMAIL_ADDRESS_REGEX = "\\b(^([1-9]{0,1}[a-zA-Z_\\-\\.]+[a-zA-Z0-9_\\-\\.]{0,20}+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$)\\b";
	public static final String DOMAIN_NAME_REGEX = "[_a-zA-Z][\\w]*";
	public static final String FIND_IT_PORT_RANGE_REGEX="[0-9,-]*";
	public static final String DBMS_CONNECTION_NAME="[\\w]*";
	public static final String IP_RANGE_REGEX ="\\d{1,3}\\.\\d{1,3}\\.(\\d{1,3}|\\*)\\.(\\d{1,3}|\\*)";
	
	public static final String INVALID_CHARACTER_SET = " Special characters (\' \" > <) are not allowed";
	public static final String INVALID_STRUCTURE_NAME = " Structure Name: Blank spaces or special characters except _ not allowed and should not start with number";
	public static final String INVALID_DOMAIN_NAME = "Domain Name: should start with AlphaNumeric charactes ,special characters(-,_ and space) can be used but not in beginning";
	public static final String INVALID_TASK_NAME = " Task Name : should start with AlphaNumeric charactes ,special characters(-,_ and space) can be used but not in beginning";
	public static final String INVALID_IP_ADDRESS = " IP Address is not Valid";
	public static final String INVALID_EMAIL_ADDRESS = " Email Address is not Valid";
	public static final String INVALID_IP_RANGE =" IP Range is not Valid";
	public static final String EMPTY_FIELD = " Can not be empty"; 
	public static final String INVALID_CONNECTION_NAME= "Connection name is not valid";
	public static final String MAX_SIZE= " Maximum length allowed";
	public static final String MAX_SIZE_64= " Maximum length allowed is 64";
	public static final String MAX_SIZE_128 = " Maximun length allowed is 128";
	public static final String MAX_SIZE_256 = " Maximum length allowed is 256";
	public static final String MAX_SIZE_500 = " Maximum length allowed is 500";
	public static final String MAX_SIZE_1024 = " Maximum length allowed is 1024";
	public static final String INVALID_COMMIT_SIZE = " The Maximum value for this field is 10000000";
	public static final String INVALID_MAX_WORKERS = " The Maximum value for this field is 1000";

	
	private static Validator beanValidator= Validation
			.buildDefaultValidatorFactory().getValidator();
	
	
/**
 * Method to validate the bean
 * @param arg0
 * @param arg1
 * @throws DgException
 */
	public static <T> void validate(T arg0, Class<?>... arg1)
			throws DgException {
		Set<ConstraintViolation<T>> constraintViolations = beanValidator
				.validate(arg0, arg1);
		 
		 StringBuilder exceptionMessage = new StringBuilder();
	     DgFaultInfo dgFaultInfo = new DgFaultInfo();
		 if(constraintViolations==null || constraintViolations.size()==0)
	        	return;
	        
	        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
				
				exceptionMessage.append(constraintViolation.getMessage()+"</br>");
								
			}
	        dgFaultInfo.setErrorCode(ErrorConstants.ERROR_INVALID_FIELD_VALUE.errorCode());
	        dgFaultInfo.setErrorText(exceptionMessage.toString());
			dgFaultInfo.setErrorParameters(exceptionMessage.toString());
			throw new DgException(exceptionMessage.toString(), dgFaultInfo);
	}

	/**
	 * Method to validate a single property in the bean
	 * @param arg0 Bean
	 * @param arg1 property name
	 * @param arg2
	 * @throws DgException
	 */
	public static <T> void validateProperty(T arg0,String arg1,Class<?>... arg2) throws DgException{
		
		Set<ConstraintViolation<T>> constraintViolations = beanValidator
				.validateProperty(arg0, arg1);
        StringBuilder exceptionMessage = new StringBuilder();
        DgFaultInfo dgFaultInfo = new DgFaultInfo();
        if(constraintViolations==null || constraintViolations.size()==0)
        	return;
        
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
			
			exceptionMessage.append(constraintViolation.getMessage()+"</br>");
						
		}
        dgFaultInfo.setErrorCode(ErrorConstants.ERROR_INVALID_FIELD_VALUE.errorCode());
        dgFaultInfo.setErrorText(exceptionMessage.toString());
		dgFaultInfo.setErrorParameters(exceptionMessage.toString());
		throw new DgException(exceptionMessage.toString(), dgFaultInfo);
		
	}

	
	
	
	/**
	 * Method to validate a single String
	 * @param arg0 Variable
	 * @param arg1 Variable Name for Exception
	 * @param arg2 Regex to comply with
	 * @throws DgException
	 */
	public static void validateIndividual(String arg0,String arg1,String arg2) throws DgException{
		
		Pattern pattern = Pattern.compile(arg2);
		Matcher matcher = pattern.matcher(arg0.toString());
		
		if(matcher.matches())
			return;
		
        DgFaultInfo dgFaultInfo = new DgFaultInfo();
        dgFaultInfo.setErrorCode(ErrorConstants.ERROR_INVALID_FIELD_VALUE.errorCode());
        dgFaultInfo.setErrorText(arg1+":"+INVALID_CHARACTER_SET);
		dgFaultInfo.setErrorParameters(arg1+":"+INVALID_CHARACTER_SET);
		throw new DgException(arg1+":"+INVALID_CHARACTER_SET,dgFaultInfo);
		
	}
	
	
	
	
	
	
}


