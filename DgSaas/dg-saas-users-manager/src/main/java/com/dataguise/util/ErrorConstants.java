package com.dataguise.util;

public enum ErrorConstants {
	
	ERROR_SAVING_ACL_FILE("3039","Error saving ACL file on HDFS","Error saving ACL file on HDFS"),
	ERROR_SENDING_EMAILS("4444","Error in sending emails","Error in in sending emails"),
	ERROR_SESSION_INTERCEPT("5610","Invalid Request or session intercepted.","Invalid Request or session intercepted."),
	ERROR_READING_PROPERTY_FILE("7037", "Error reading property file", "Error reading property file"),
	ERROR_ENCODING_STRING("7039","Error encoding string","Error encoding string"),
	RESTRICTED_DOMAIN_IN_EMAIL("7040","Email contains restricted domain","Email contains restricted domain"),
	EMAIL_BLACKLISTED("7041","Email address blacklisted","Email address blacklisted"),
	ERROR_CREATING_USER ("8001", "Error in creating/updating user", "error message from Controller");
	
	private final String errorCode;
	private final String errorMessage;
	private final String errorParams;

	ErrorConstants(String errorCode, String errorMessage, String errorParams){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorParams = errorParams;
	}

	public String errorCode() {
		return this.errorCode;
	}

	public String errorMessage() {
		return this.errorMessage;
	}

	public String errorParams() {
		return this.errorParams;
	}

}
