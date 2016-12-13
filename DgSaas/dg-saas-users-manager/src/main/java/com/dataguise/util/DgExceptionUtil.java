package com.dataguise.util;

import org.apache.log4j.Logger;

import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;

public class DgExceptionUtil {
	static Logger logger = Logger.getLogger(DgExceptionUtil.class);
	public static DgException createException(ErrorConstants error,
			String message, String parameters) {
		DgFaultInfo dgFaultInfo = new DgFaultInfo();
		dgFaultInfo.setErrorCode(error.errorCode());
		dgFaultInfo.setErrorText(message == null ? error.errorMessage() : message);
		
		dgFaultInfo.setErrorParameters(parameters == null ? error.errorParams() : parameters);
		return new DgException(message, dgFaultInfo);
	}


	public static DgException createException(Exception ex, ErrorConstants error,
			String message, String parameters) {
		logger.error(ex.getMessage(), ex.getCause());
		
		DgFaultInfo dgFaultInfo = new DgFaultInfo();
		dgFaultInfo.setErrorCode(error.errorCode());
		dgFaultInfo.setErrorText(message == null ? error.errorMessage() : message);
		
		dgFaultInfo.setErrorParameters(parameters == null ? error.errorParams() : parameters);
		return new DgException(message, dgFaultInfo);
	}

	public static void throwException(ErrorConstants error, String errMessage)
			throws DgException {

		throw createException(error, error.errorMessage(), errMessage);
		
	}

	/**
	 * Throw a DgException from a java exception and log the error message.
	 * 
	 * @param logger
	 * @param e
	 * @param dgErrorCode
	 * @param dgErrorMessage
	 * @return
	 * @throws DgException
	 */
	public static DgException throwDgException(Logger logger, Exception e, String dgErrorCode,
								String dgErrorMessage) throws DgException {
		if (logger != null)
			logger.error(dgErrorMessage, e);
		DgFaultInfo dgFaultInfo = new DgFaultInfo();
		dgFaultInfo.setErrorCode(dgErrorCode);
		dgFaultInfo.setErrorText(dgErrorMessage);
		if (e != null) {
			dgFaultInfo.setErrorParameters(e.getMessage());
			throw new DgException(dgFaultInfo.getErrorText(), dgFaultInfo, e);
		}
		else {
			dgFaultInfo.setErrorParameters(dgErrorMessage);
			throw new DgException(dgFaultInfo.getErrorText(), dgFaultInfo);
		}
	}
	/**
	 * 
	 * @param message
	 * @return 
	 * @throws DgException 
	 */

	public static void UserMessage(String message) throws DgException{
		DgFaultInfo dgFaultInfo = new DgFaultInfo();
		dgFaultInfo.setErrorCode(ErrorConstants.ERROR_SAVING_ACL_FILE.errorCode());
		dgFaultInfo.setErrorText(message.toString());
		throw new DgException(message.toString(), dgFaultInfo);
		
	}
}
