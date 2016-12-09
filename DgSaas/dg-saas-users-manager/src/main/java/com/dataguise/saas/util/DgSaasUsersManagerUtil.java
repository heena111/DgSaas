package com.dataguise.saas.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;

/**
 * @author Harinder Singh Bedi
 *
 */
public class DgSaasUsersManagerUtil {

	private static final Logger logger = Logger.getLogger(DgSaasUsersManagerUtil.class);	

	/**
	 * @param input
	 * @return
	 * @throws DgException
	 */
	public static String encode(String input) throws DgException
	{
		try {
			return URLEncoder.encode(input,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			logger.error(e);
			DgExceptionUtil.throwException(ErrorConstants.ERROR_ENCODING_STRING, e.getMessage());
		}
		return input;
	}

}
