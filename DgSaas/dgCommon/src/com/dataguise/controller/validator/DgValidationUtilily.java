package com.dataguise.controller.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class DgValidationUtilily {
	
	private final static Logger logger = Logger.getLogger(DgValidationUtilily.class.getName());
	
	public static boolean isNullOrEmpty(String param)
	{
		return (param==null || (param.isEmpty()))?true:false;
	}
	
	public static boolean isNotInteger(String value) {
		Integer i=getInteger(value);
		return i==null?true:false;
	}
	
	public static Integer getInteger(String value) {
		Integer i=null;
		try{
			i = Integer.valueOf(value);
		}
		catch (NumberFormatException e) {
			logger.debug("Not a number");
		}
		return i;
	}
	
	public static boolean isNotLong(String value) {                 //In Random Number masking we can have Param3 value greater than the value Integer datatype holds.
		Long i=getLong(value);
		return i==null?true:false;
	}
	
	public static Long getLong(String value) {
		Long i=null;
		try{
			i = Long.valueOf(value);
		}
		catch (NumberFormatException e) {
			logger.debug("Not a number");
		}
		return i;
	}
	
	public static boolean validateJavaDate(String strDate, String dateFormat) {
		
		SimpleDateFormat sdfrmt = new SimpleDateFormat(dateFormat);
		sdfrmt.setLenient(false);
		Date javaDate = null;
		try {
			javaDate = sdfrmt.parse(strDate);
			logger.debug("Date after validation: " + javaDate);
		}	
		catch (ParseException e) {
			logger.debug("The date you provided is an invalid date format.");
			return false;
		}
		return true;
	}
	

	public static boolean compareDates(String strDate1, String strDate2, String dateFormat) {
		
		try{
			 
    		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        	Date date1 = sdf.parse(strDate1);
        	Date date2 = sdf.parse(strDate2);
        	Calendar cal1 = Calendar.getInstance();
        	Calendar cal2 = Calendar.getInstance();
        	cal1.setTime(date1);
        	cal2.setTime(date2);
 
        	if(cal1.after(cal2)){
        		return true;
        	}
          
    	}catch(ParseException ex){
    		logger.debug("The date you provided is an invalid date format.");
    		return false;
    	}
    	return false;
	}
	
}
