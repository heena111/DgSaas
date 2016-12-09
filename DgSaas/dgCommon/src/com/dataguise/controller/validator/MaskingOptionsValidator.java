package com.dataguise.controller.validator;

import java.util.Arrays;

import com.dataguise.util.ControllerConstants;
import com.dataguise.webservices.beans.masker.DgMaskerColumn;

public class MaskingOptionsValidator {
	
	public enum RandomMaskingEnum {
		date("Date"),creditcardnumbers("CCNO"), socialsecuritynumbers("SSNO"), timestamp("Timestamp"), emailaddresses("Email Address"), telephonenumbers("Telephone Numbers"), zip("ZIP"), randomstring("Random String"),
		firstname("First Name"), number("Number"),lastname("Last Name"),fandlname("First and last name") ;

		private final String name;

		private RandomMaskingEnum(String s) {
			name = s;
		}

		public String toString() {
			return name;
		}

	}

	public static String validate(DgMaskerColumn dgMaskerColumn){
		
		String errorMessage = "";
		 switch(dgMaskerColumn.getMaskingOption())
		   {
		   case ControllerConstants.CHARACTER:
			   errorMessage = validateCharacterMasking(dgMaskerColumn);
		    break;
		    
		   case ControllerConstants.INTELLIMASK:
			   errorMessage = validateIntelliMasking(dgMaskerColumn);    
		   break;
		   
		   case ControllerConstants.STATIC:
			   errorMessage = validateStaticMasking(dgMaskerColumn);    
		   break;
		   
		   case ControllerConstants.FPM:
			   errorMessage = validateFPMMasking(dgMaskerColumn);
		   break; 
		   
		   case ControllerConstants.CUSTOM_TRANSFORMATION:
			   errorMessage = validateCustomTransformation(dgMaskerColumn);
		   break;
		   
		   case ControllerConstants.RANDOM:
			   errorMessage = validateRandomMasking(dgMaskerColumn);
		   break;   
		   
		   
		   }
		return errorMessage;
		
	}
	
	
	public static String validateCharacterMasking(DgMaskerColumn dgMaskerColumn) {

		StringBuffer errorMessage = new StringBuffer();
		String param1	= dgMaskerColumn.getParam1();
		String param2	= dgMaskerColumn.getParam2();
		Integer param3	= DgValidationUtilily.getInteger(dgMaskerColumn.getParam3());		
		if(DgValidationUtilily.isNullOrEmpty(param1) || DgValidationUtilily.isNullOrEmpty(param2) || param3 == null)
		{
			 errorMessage = errorMessage.append("\n Param1, Param2, Param3 are required fields. Also, Param3 should be valid number") ;
		 }else{
			    
			    String[] validCharsForParam1 = {"#","%","@",".", "$"};
				String[] validParam2 = {"left","right"};
				
				if(Arrays.asList(validCharsForParam1).indexOf(param1) == -1 ){
					errorMessage = errorMessage.append("\n Param1 must be one of these values: {#, %, @, ., $}");
				}
				if(Arrays.asList(validParam2).indexOf(param2.toLowerCase()) == -1){
					errorMessage = errorMessage.append("\n Param2 must be one of these values: {left, right}");
				}
				if(param3 > dgMaskerColumn.getDataLength()){
					errorMessage = errorMessage.append("\n Param3 cannot be greater than column data length");
				}
				
		 }
		
		 return errorMessage.toString();
	}
	
	public static String validateIntelliMasking(DgMaskerColumn dgMaskerColumn) {
		StringBuffer	errorMessage	= new StringBuffer();
		String	 		param2			= dgMaskerColumn.getParam2();
		Integer	 		param3			= DgValidationUtilily.getInteger(dgMaskerColumn.getParam3());
		Integer	 		param4			= DgValidationUtilily.getInteger(dgMaskerColumn.getParam4());
		 if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(param2) || param3 == null)
		 {
		  errorMessage = errorMessage.append("\n Param1, Param2 and Param3 are required fields") ;
		 }else{
			 String[] validParam2 = {"left","right"};
			 if(Arrays.asList(validParam2).indexOf(param2.toLowerCase()) == -1){
				    if(param2.equalsIgnoreCase("specify")){
				    	if(param4 == null){
				    		errorMessage = errorMessage.append("\n With Param2 as Specify, Param4 is required field");
				    	}
				    	if(param3 == null || param4 == null){
				    		errorMessage = errorMessage.append("\n Param3 and Param4 should be  valid numbers");
						}else if(param4 > dgMaskerColumn.getDataLength()){
							errorMessage = errorMessage.append("\n Param4{characters to mask} cannot exceed column data length");
						}
				    	
				    	
				    }else{
					   errorMessage = errorMessage.append("\n Param2 must be one of these values: {Left, Right, Specify}");
				    }
				}else{
					if(param3 > dgMaskerColumn.getDataLength()){
						errorMessage = errorMessage.append("\n Param3{characters to mask} cannot exceed column data length");
					}
				}
		 }
		 
		 return errorMessage.toString();
	}
	
	
	public static String validateStaticMasking(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();

		   if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()))
			{
			   if(!dgMaskerColumn.getParam2().equals("NULL")){
				   errorMessage = errorMessage.append("\n Either specify a static value for param1 or set param2 as NULL") ;
			   }
			   
			}else{
				if(!DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam2())){
					errorMessage = errorMessage.append("\n If param1 is specified, param2 should be empty") ;
				}
			}
		 return errorMessage.toString();
	}
	
	public static String validateFPMMasking(DgMaskerColumn dgMaskerColumn) {
	
		String errorMessage = validateDefaultValuesForParams(dgMaskerColumn);
		return errorMessage;
	}
	
	
	public static String validateCustomTransformation(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		errorMessage = errorMessage.append(validateDefaultValuesForParams(dgMaskerColumn));

		 return errorMessage.toString();
	}
	
	
	public static String validateDefaultValuesForParams(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		if(!dgMaskerColumn.getParam1().isEmpty() || !dgMaskerColumn.getParam2().isEmpty() || !dgMaskerColumn.getParam3().isEmpty()
				|| !dgMaskerColumn.getParam4().isEmpty() || !dgMaskerColumn.getParam5().isEmpty() || !dgMaskerColumn.getParam6().isEmpty()
				|| DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam7()) || !dgMaskerColumn.getParam7().equalsIgnoreCase("false") || !dgMaskerColumn.getParam8().isEmpty() || !dgMaskerColumn.getParam9().isEmpty())
		{
    		errorMessage = errorMessage.append("\n Invalid values set for all masking Params");
		}
		
		 return errorMessage.toString();
	}
	
	public static String validateRandomMasking(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		   
		 if(Arrays.asList(ValidationConstants.validRandomMaskingOptions1).indexOf(dgMaskerColumn.getParam1()) > -1 ) 
		   {
				   errorMessage = errorMessage.append(validateForRandomMaskingOptions1(dgMaskerColumn));
				   
		   }else if(Arrays.asList(ValidationConstants.validRandomMaskingOptions2).indexOf(dgMaskerColumn.getParam1()) > -1 ){

		   RandomMaskingEnum maskingOpt = RandomMaskingEnum.valueOf(dgMaskerColumn.getParam1().replaceAll("\\s+","").toLowerCase());
		   switch (maskingOpt) {
			   
		    case creditcardnumbers:
			   errorMessage = errorMessage.append(validateCreditCardNumbers(dgMaskerColumn));
			break;
				
			case timestamp:    
				errorMessage = errorMessage.append(validateTimeStamp(dgMaskerColumn));
			break;
				
			case date:
				errorMessage = errorMessage.append(validateDate(dgMaskerColumn));
			break;
				
			case socialsecuritynumbers:
				errorMessage = errorMessage.append(validateSocialSecurityNumber(dgMaskerColumn));
			break;
			
			case emailaddresses: 
				errorMessage = errorMessage.append(validateEmailAddress(dgMaskerColumn));
			break;
				
			case telephonenumbers:
				errorMessage = errorMessage.append(validateTelephoneNumbers(dgMaskerColumn));
			break;
			
			case randomstring:
				errorMessage = errorMessage.append(validateRandomString(dgMaskerColumn));
			break;
			
			case firstname:
				errorMessage = errorMessage.append(validateFirstName(dgMaskerColumn));
			break;
				
			case number:
				errorMessage = errorMessage.append(validateNumber(dgMaskerColumn));
			break;
				

			default:
			break;
			}
		   
		   }else{
				errorMessage = errorMessage.append("\n Invalid Masking Option");
			}
		   
		
		
		 return errorMessage.toString();
	}
	
	public static String validateForRandomMaskingOptions1(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		 if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam2()))
			{
			   errorMessage = errorMessage.append("\n Param1 and Param2 are the required  fields");
			}
		   else{
			   if(!Arrays.asList(ValidationConstants.validCaseOptions).contains(dgMaskerColumn.getParam2()))
			   {
				   errorMessage = errorMessage.append("\n Param2 doesn't have valid case Option:{'u','t','l'}");
			   }
		   }
		 
		 return errorMessage.toString();
	}
	
	
	public static String validateCreditCardNumbers(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		String[] validCCNOOptions = {"AE", "DI", "VI", "MA", "UD"};
		if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam3()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam7()))
			{
				errorMessage = errorMessage.append("\n Param1, Param3 and Param7 are the required  fields");
			}
		   if(!dgMaskerColumn.getParam1().equals("Credit Card Numbers")){
			   errorMessage = errorMessage.append("\n Param1 value should always be 'Credit Card Numbers'");
		   }
	     if(dgMaskerColumn.getParam2().equals("PM")){
	       String param3 = dgMaskerColumn.getParam3();
	       String[] arrParam3;
	       String delimiter = "\\|";
	       arrParam3 = param3.split(delimiter);
	       Integer maxCardVal=0;
	       for(int i =0; i < arrParam3.length ; i++){
	         if(!Arrays.asList(validCCNOOptions).contains(arrParam3[i])){       //Matching whole regex here separated by Pipe(AE|VI|UD) is valid. while (AE|VI|UD|LK) is invalid
		       errorMessage = errorMessage.append("\n Only if Param2 is PM, Param3 should have any of the following values:{'AE', 'DI', 'VI', 'MA', 'UD'}");
		       break;
	        }
	         else{
	    	 if(arrParam3[i].equals("AE")){     //American Express and Master card 	
	    		 maxCardVal = 15;
	    	 }
	    	 else if(arrParam3[i].equals("DI") || arrParam3[i].equals("MA")){     //Discover
	    		 maxCardVal = 16;
	    	 }
	    	 else if(arrParam3[i].equals("VI")){       //Visa  
	    		 maxCardVal = 13;
	    	 }
	    	 else if(arrParam3[i].equals("UD")){
	    		 maxCardVal = DgValidationUtilily.getInteger(dgMaskerColumn.getParam5());      //User-Defined
	    	 }
	    	 if(maxCardVal==null || maxCardVal>dgMaskerColumn.getDataLength())
	    	 {
	    		 errorMessage = errorMessage.append("\n Data Length should be greater than Param3 values:{AE=15,MA=DI=16,VI=13}");
	    		 break;
	    	 }
	    	 
	     }
	   
	 }
    }
	   else if(dgMaskerColumn.getParam2().equals("")){ 
		   if(!dgMaskerColumn.getParam3().equals("FPE")){
			   if(!dgMaskerColumn.getParam3().equals("RA") ){
		             errorMessage = errorMessage.append("\n Only if Param2 is empty string Param3 should be either of the followings: {'FPE' or 'RA'}");
			   }
		   }
	   }
	   else{
		   errorMessage = errorMessage.append("\n Param2 is not Valid. It should either empty(' ') or 'PM'");
	   }
		
		 return errorMessage.toString();
	}
	
	
	public static String validateSocialSecurityNumber(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
			String[] separatedByOptions = {"","spc","-"};     //It means separated by digits only, space or hyphen
			String[] validSSNOOptions = {"VN", "RN" };
			if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam2()))
			{
				errorMessage = errorMessage.append("\n Param1, Param2 are the required  field for random SSNO masking");
			}
			else{
				if(!dgMaskerColumn.getParam1().equals("Social Security Numbers") || Arrays.asList(validSSNOOptions).indexOf(dgMaskerColumn.getParam2()) == -1){
					errorMessage = errorMessage.append("\n Param1 value should be 'Social Security Numbers', Param2 should be either: {'VN' or 'RN'}");
				}
				else if(Arrays.asList(separatedByOptions).indexOf(dgMaskerColumn.getParam3()) == -1)
				{
			      errorMessage = errorMessage.append("\n Param3 should be : {'', 'spc', '-'}");
				
			    }
			}
			
			if(dgMaskerColumn.getParam3().equals("") && dgMaskerColumn.getDataLength() < ControllerConstants.VALID_SSNO_DIGITS_LENGTH)
	    	 {
	    		 errorMessage = errorMessage.append("\n Data Length should be greater than or equal to 9");
	    	 }else if ((dgMaskerColumn.getParam3().equals("spc") || dgMaskerColumn.getParam3().equals("-")) && dgMaskerColumn.getDataLength() < ControllerConstants.VALID_STRING_SSNO_OTHERS_LENGTH){
	    		 errorMessage = errorMessage.append("\n Data Length should be greater than or equal to 11");
	    	 }
		
		 return errorMessage.toString();
	}
	
	
	public static String validateEmailAddress(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()))
		{
			errorMessage = errorMessage.append("\n Param1 is a required  field for random email masking");
		}
		else{
			if(!dgMaskerColumn.getParam1().equals("Email Addresses"))    
			{
				errorMessage = errorMessage.append("\n Param1 should be 'Email Addresses'");
			}
		}
		
		 return errorMessage.toString();
	}
	
	public static String validateRandomString(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		String[] validRandomStringOptions = {"A", "X","U","L","P"};
		
		if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam4()))
		{
			errorMessage = errorMessage.append("\n Param1, Param4 are the required  field for Random String masking");
		}
		else{
			if(!dgMaskerColumn.getParam1().equals("Random string") || Arrays.asList(validRandomStringOptions).indexOf(dgMaskerColumn.getParam4()) == -1)     
			{
				errorMessage = errorMessage.append("\n Param1 should always be 'Random string' and Param4 should be either of these:{'A','X','U','L','P'}");
			}
		}
		
		 return errorMessage.toString();
	}
	
	public static String validateFirstName(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam2()))
		{
			errorMessage = errorMessage.append("\n Param1, Param2 are the required  field for Random First name masking");
		}
		else{
			if(!dgMaskerColumn.getParam1().equals("First Name") || (Arrays.asList(ValidationConstants.validCaseOptions).indexOf(dgMaskerColumn.getParam2()) == -1 )){
				errorMessage = errorMessage.append("\n Either Param1 value is not {First Name} or Param2 should be following: {'u','t','l'}");
			}
			if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam3()))
			{
				if(!DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam4()))errorMessage = errorMessage.append("\n When Param3 is empty ideally Param4 shouldn't contain any value");
			}
		}
		
		
		 return errorMessage.toString();
	}
	
	public static String validateNumber(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		String param1	= dgMaskerColumn.getParam1();
		Integer param2	= DgValidationUtilily.getInteger(dgMaskerColumn.getParam2());
		Long param3 	= DgValidationUtilily.getLong(dgMaskerColumn.getParam3());
		Integer param4	= DgValidationUtilily.getInteger(dgMaskerColumn.getParam4());
		String param5	= dgMaskerColumn.getParam5();
		
		if(param2 == null || param3 == null || param4 == null || DgValidationUtilily.isNullOrEmpty(param1) || DgValidationUtilily.isNullOrEmpty(param5) ){
			errorMessage = errorMessage.append("\n Param2, Param3 and Param4 should be a valid number and Param1 should be {'Number'} and Param5 should be valid string");
		}
		else {
			if(!param1.equals("Number")){
				errorMessage = errorMessage.append("\n Param1 should be {'Number'}");
			}
			else if(param2 > param3){
				errorMessage = errorMessage.append("\n Param2 should be less than Param3");
			}
			else if(!param5.equals("Y") && !param5.equals("N")){
				errorMessage = errorMessage.append("\n Param5 should be either 'Y' or 'N'"); 
				}
			}
		return errorMessage.toString();
	}
	
	public static String validateTelephoneNumbers(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
			String[] validTelephoneNumberOptions = {"","std","spc","-","stdwos"};
			if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()))
			{
				errorMessage = errorMessage.append("\n Param1 is a required  field for random telephone number masking");
			}
			else{					
				if(Arrays.asList(validTelephoneNumberOptions).indexOf(dgMaskerColumn.getParam2()) == -1){
					errorMessage = errorMessage.append("\n Param1 should be 'Telephone Numbers' and Param2 should be following:{'','std','spc','-','stdwos'}");
				}
			}
			
			if(dgMaskerColumn.getDataLength() < ControllerConstants.VALID_TELEPHONE_DIGITS_LENGTH){
		    		 errorMessage = errorMessage.append("\n Minimum column length to generate Telephone Numbers is 10.");
		    		 if((dgMaskerColumn.getParam2().equals("spc") || dgMaskerColumn.getParam2().equals("-")) && dgMaskerColumn.getDataLength() < ControllerConstants.VALID_TELEPHONE_SPACE_DASH_LENGTH){
		    			 errorMessage = errorMessage.append("\n As per Param2, Data Length should be greater than or equal to 12.");
		    		 }else if((dgMaskerColumn.getParam2().equals("stdwos") || dgMaskerColumn.getParam2().equals("std")) && dgMaskerColumn.getDataLength() < ControllerConstants.VALID_TELEPHONE_STANDARD_LENGTH){
		    			 errorMessage = errorMessage.append("\n As per Param2, Data Length should be greater than or equal to 14.");
		    		 }		    	
			}
			
		 return errorMessage.toString();
	}
	
	
	public static String validateDate(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		String[] validStringDateFormats = {"yyyy-MM-dd","yyyy/MM/dd","dd-MMM-yyyy"};
		if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam2()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam3()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam4()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam9()))
		{
			errorMessage = errorMessage.append("\n Param1, param2,param3,param4 and Param9 are the required  fields");
		}
		else{
			
		if(!dgMaskerColumn.getParam1().equals("Date") || !dgMaskerColumn.getParam2().equals("Rnd"))
		{
			errorMessage = errorMessage.append("\n Either Param1 value is not 'Date' or Param2 value is not 'Rnd' ");
		}
		if(!Arrays.asList(validStringDateFormats).contains(dgMaskerColumn.getParam9()))
		{
			errorMessage = errorMessage.append("\n  Param9 must have following date formats: {'yyyy-MM-dd', or 'yyyy/MM/dd' or 'dd-MMM-yyyy'} ");
		}
		if(!((DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam3(),ControllerConstants.DATE_FORMAT1) && DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam4(),ControllerConstants.DATE_FORMAT1)) 
		   || (DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam3(),ControllerConstants.DATE_FORMAT2) && DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam4(),ControllerConstants.DATE_FORMAT2)) 
		   || (DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam3(),ControllerConstants.DATE_FORMAT3) && DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam4(),ControllerConstants.DATE_FORMAT3))))
		{
			errorMessage = errorMessage.append("\n Either of Param3 and Param4 doesn't contain valid dates: {'yyyy-MM-dd', or 'yyyy/MM/dd' or 'dd-MMM-yyyy'} for String datatype");
		}
		if(!((DgValidationUtilily.compareDates(dgMaskerColumn.getParam4(), dgMaskerColumn.getParam3(), ControllerConstants.DATE_FORMAT1)) || (DgValidationUtilily.compareDates(dgMaskerColumn.getParam4(), dgMaskerColumn.getParam3(), ControllerConstants.DATE_FORMAT2))
			|| (DgValidationUtilily.compareDates(dgMaskerColumn.getParam4(), dgMaskerColumn.getParam3(), ControllerConstants.DATE_FORMAT3))))
		{
			errorMessage = errorMessage.append("\n Date value for Param4 should be greater than Param3");
		}
		if(dgMaskerColumn.getDataLength()<ControllerConstants.VALID_STRING_DATE_LENGTH){
			errorMessage = errorMessage.append("\n Insufficient datalength value to generate date for String datatype: it must be >=10");
		}
		
	  }
			
		 return errorMessage.toString();
	}
	
	
	public static String validateTimeStamp(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		String[] validStringTimeStampFormats = {"yyyy-MM-dd HH:mm:ss","dd-MMM-yyyy HH:mm:ss","yyyy/MM/dd HH:mm:ss"};
		
		
		if(DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam1()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam2()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam3()) || DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam4()))
		{
			errorMessage = errorMessage.append("\n Param1, param2,param3 and Param4 are the required  fields");
		}else{
			
		
			if(!dgMaskerColumn.getParam1().equals("Timestamp") || !dgMaskerColumn.getParam2().equals("Rnd"))
			{
				errorMessage = errorMessage.append("\n Either Param1 value is not 'Timestamp' or Param2 value is not 'Rnd' ");
			}
			
			if(!Arrays.asList(validStringTimeStampFormats).contains(dgMaskerColumn.getParam9()))
			{
				errorMessage = errorMessage.append("\n Param9 must have following timestamp formats: {'yyyy-MM-dd HH:mm:ss', or 'dd-MMM-yyyy HH:mm:ss' or 'yyyy/MM/dd HH:mm:ss'}");
						
			}
			if(!((DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam3(),ControllerConstants.TIMESTAMP_FORMAT1) && DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam4(),ControllerConstants.TIMESTAMP_FORMAT1)) 
			   || (DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam3(),ControllerConstants.TIMESTAMP_FORMAT2) && DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam4(),ControllerConstants.TIMESTAMP_FORMAT2)) 
			   || (DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam3(),ControllerConstants.TIMESTAMP_FORMAT3) && DgValidationUtilily.validateJavaDate(dgMaskerColumn.getParam4(),ControllerConstants.TIMESTAMP_FORMAT3))))
			{
				errorMessage = errorMessage.append("\n Either of Param3 and Param4 doesn't contain valid dates: {'yyyy-MM-dd HH:mm:ss', or 'dd-MMM-yyyy HH:mm:ss' or 'yyyy/MM/dd HH:mm:ss'} for String datatype");
			}
			if(!((DgValidationUtilily.compareDates(dgMaskerColumn.getParam4(), dgMaskerColumn.getParam3(), ControllerConstants.TIMESTAMP_FORMAT1)) || (DgValidationUtilily.compareDates(dgMaskerColumn.getParam4(), dgMaskerColumn.getParam3(), ControllerConstants.TIMESTAMP_FORMAT2))
				|| (DgValidationUtilily.compareDates(dgMaskerColumn.getParam4(), dgMaskerColumn.getParam3(), ControllerConstants.TIMESTAMP_FORMAT3)))) 
				
			{
				errorMessage = errorMessage.append("\n Timestamp value for Param4 should be greater than Param3");
			}
			if(dgMaskerColumn.getDataLength()<ControllerConstants.VALID_STRING_TIMESTAMP_LENGTH){
				errorMessage = errorMessage.append("\n Insufficient datalength value to generate timestamp for String datatype: it must be >=19");
			}
	
		}
		
		 return errorMessage.toString();
	}
	
	// This is a separate method for NPI because for FPM masking default params can be changed later 
	public static String validateDefaultValuesForNPI(DgMaskerColumn dgMaskerColumn) {
		StringBuffer errorMessage = new StringBuffer();
		
		if(!dgMaskerColumn.getParam1().isEmpty() || !dgMaskerColumn.getParam2().isEmpty() || !dgMaskerColumn.getParam3().isEmpty()
				|| !dgMaskerColumn.getParam4().isEmpty() || !dgMaskerColumn.getParam5().isEmpty() || !dgMaskerColumn.getParam6().isEmpty()
				|| DgValidationUtilily.isNullOrEmpty(dgMaskerColumn.getParam7()) || !dgMaskerColumn.getParam7().equalsIgnoreCase("false") || !dgMaskerColumn.getParam8().isEmpty() || !dgMaskerColumn.getParam9().isEmpty())
		{
    		errorMessage = errorMessage.append("\n Invalid values set for all masking Params");
		}
		
		 return errorMessage.toString();
	}
	
	
	
}
