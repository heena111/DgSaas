/**
 * 
 */
package com.dataguise.util;

/**
 * @author parshant.bandral
 *
 */
public class CommonUtil {
	
	public static boolean isSessionIdDecoded(String inputStr){
		boolean alreadyDecoded = false;
		if(inputStr.endsWith("==")){
			alreadyDecoded = true;
		}
		return alreadyDecoded;
	}

}

