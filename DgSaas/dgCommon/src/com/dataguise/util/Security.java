package com.dataguise.util;
/**
 * @author jaspaul
 *
 */

import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgFaultInfo;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
public class Security {
	
	/**
	 * Function to encrypt sensitive info when dbEncryption flag is turned on
	 * @param text
	 * @param ranInit
	 * @param dbEncryptOn
	 * @return
	 */
	public static String encryptMetadataInfo(String text, Boolean dbEncryptOn, int ranInit) {
		if(dbEncryptOn &&	text!=null && !text.equals("")){
			return encrypt(text, ranInit);
		}
		else{
			return text;
		}
	}
	
	/**
	 * Function to decrypt sensitive info when dbEncryption flag is turned on
	 * @param text
	 * @param ranInit
	 * @param dbEncryptOn
	 * @return
	 */
	public static String decryptMetadataInfo(String text, Boolean dbEncryptOn, int ranInit) {
		if(dbEncryptOn && text!=null && !text.equals("")){
			return decrypt(text, ranInit);
		}
		else{
			return text;
		}
	}
	
	/**
	 * Function to encrypt passwords when encryptDbPasswords flag is turned on
	 * @param text
	 * @param ranInit
	 * @param encryptDbPasswordsOn
	 * @return
	 */
	public static String encryptPassword(String text, Boolean encryptDbPasswordsOn, int ranInit) {
		if(encryptDbPasswordsOn &&	text!=null && !text.equals("")){
			return encrypt(text, ranInit);
		}
		else{
			return text;
		}
	}
	
	/**
	 * Function to decrypt passwords when encryptDbPasswords flag is turned on
	 * @param text
	 * @param ranInit
	 * @param encryptDbPasswordsOn
	 * @return
	 */
	public static String decryptPassword(String text, Boolean encryptDbPasswordsOn, int ranInit) {
		if(encryptDbPasswordsOn && text!=null && !text.equals("")){
			return decrypt(text, ranInit);
		}
		else{
			return text;
		}
	}
	
	/**
	 * General Function to encrypt data without any specific condition
	 * @param text
	 * @param ranInit
	 * @return
	 */
	public static String encryptData(String text, int ranInit) {
		if(text!=null && !text.equals("")){
			return encrypt(text, ranInit);
		}
		else{
			return text;
		}
	}

	/**
	 * General Function to decrypt data without any specific condition
	 * @param text
	 * @param ranInit
	 * @return
	 */
	public static String decryptData(String text, int ranInit) {
		if(text!=null && !text.equals("")){
			return decrypt(text, ranInit);
		}
		else{
			return text;
		}
	}
	
	/**
	 * Old encryption method with hard coded key. Its has been deprecated now. So, new methods should be used for encryption instead of this now.
	 * @param text
	 * @return
	 */
//	@Deprecated
	public static String decrypt(String text) {

		byte[] key = { 0x1, 0x2, 0x1, 0x3, 0x2, 0x1, 0x1, 0x3, 0x1, 0x1, 0x5,
				0x1, 0x3, 0x1, 0x4, 0x2 };
		byte[] iv = { 0x3, 0x1, 0x5, 0x2, 0x4, 0x1, 0x1, 0x1, 0x3, 0x1, 0x1,
				0x2, 0x5, 0x1, 0x2, 0x1 };
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv);
			cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] results = cipher.doFinal(decoder.decodeBuffer(text));
			return new String(results, "UTF-8");
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return "dg_Error_987.654.321";
	}
	
	/**
	 * Old encryption method with hard coded key. Its has been deprecated now. So, new methods should be used for encryption instead of this now.
	 * @param text
	 * @return
	 */
//	@Deprecated
	public static String encrypt(String text) {
		try{
			byte[] key = { 0x1, 0x2, 0x1, 0x3, 0x2, 0x1, 0x1, 0x3, 0x1, 0x1, 0x5,
					0x1, 0x3, 0x1, 0x4, 0x2 };
			byte[] iv = { 0x3, 0x1, 0x5, 0x2, 0x4, 0x1, 0x1, 0x1, 0x3, 0x1, 0x1,
					0x2, 0x5, 0x1, 0x2, 0x1 };
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); 
			SecretKeySpec keySpec = new SecretKeySpec(key, "AES"); 
			IvParameterSpec ivSpec = new IvParameterSpec(iv); 
			cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec); 
			byte[] results = cipher.doFinal(text.getBytes("UTF-8")); 
			BASE64Encoder encoder = new BASE64Encoder(); 
			return encoder.encode(results);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "dg_Error_987.654.321";
	}
	
	
	/**
	 * private method to be used for data encryption
	 * @param text
	 * @param ranInit
	 * @return
	 */
	private static String encrypt(String text, int ranInit) {
		byte[] key = intToByteArray(ranInit);
		byte[] iv = { 0x3, 0x1, 0x5, 0x2, 0x4, 0x1, 0x1, 0x1, 0x3, 0x1, 0x1,
				0x2, 0x5, 0x1, 0x2, 0x1 };
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv);

			cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

			byte[] results = cipher.doFinal(text.getBytes("UTF-8"));
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(results);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "dg_Error_987.654.321";
	}
	
	/**
	 * private method to be used for decryption of data
	 * @param text
	 * @param ranInit
	 * @return
	 */
	private static String decrypt(String text, int ranInit) {
		byte[] key = intToByteArray(ranInit);
		byte[] iv = { 0x3, 0x1, 0x5, 0x2, 0x4, 0x1, 0x1, 0x1, 0x3, 0x1, 0x1,
				0x2, 0x5, 0x1, 0x2, 0x1 };
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv);
			cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] results = cipher.doFinal(decoder.decodeBuffer(text));
			return new String(results, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "dg_Error_987.654.321";
	}
	
	private static final byte[] intToByteArray(int value) {
//		return new byte[] {
//				(byte)(value >>> 24),(byte)(value >>> 16),(byte)(value >>> 8),(byte)value, 
//				(byte)(value >>> 16),(byte)(value >>> 24),(byte)(value >>> 8),(byte)value,
//				(byte)(value >>> 8),(byte)(value >>> 16),(byte)(value >>> 24),(byte)value,
//				(byte)(value >>> 8),(byte)(value >>> 24),(byte)(value >>> 16),(byte)value};
		
		return new byte[] { 0x1, 0x2, 0x1, 0x3, 0x2, 0x1, 0x1, 0x3, 0x1, 0x1,
				0x5, 0x1, 0x3, 0x1, 0x4, 0x2 };
	}
	
	/* Methods related to server side checks for MITM attack checks start from here */
	
	 public static boolean validateRequest(String json,String maskString,String clusterId,String  strGivenCheckSum) throws DgException {
			long chkSum = 0, givenChkSum=0;
			givenChkSum=Long.parseLong(strGivenCheckSum);
			if(json!=null)
				chkSum = getCheckSum(json);
//			if(maskString==null || "".equals(maskString)|| "null".equals(maskString))
//				maskString="1";
//			chkSum += 2 * getCheckSum(maskString);
			chkSum += getCheckSum(maskString);
			if(clusterId!=null)
				chkSum +=  getCheckSum(clusterId);
			chkSum = Security.getCheckSum(chkSum, Long.parseLong(maskString));
			if (chkSum != givenChkSum && !(givenChkSum < 0 && (int) chkSum == givenChkSum)) {
				DgFaultInfo dgFaultInfo = new DgFaultInfo();
				dgFaultInfo.setErrorCode(ErrorConstants.ERROR_SESSION_INTERCEPT.errorCode());
				dgFaultInfo.setErrorText(ErrorConstants.ERROR_SESSION_INTERCEPT.errorMessage());
				dgFaultInfo.setErrorParameters("Session Intercept Error.");

				throw new DgException("Session Intercepted", dgFaultInfo);
			}
			return true;
		}
	 
	 	public static long getCheckSum(String text) {
			long chkSum = 0;
			Checksum expectedChecksum = new CRC32();
			try {
				expectedChecksum.update(text.getBytes(ControllerConstants.DEFAULT_CHARSET_ENCODING), 0, text.getBytes(ControllerConstants.DEFAULT_CHARSET_ENCODING).length);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chkSum = expectedChecksum.getValue();
			return chkSum;
		}
		public static long getCheckSum(String text,long sid) {
			long chkSum = 0;
			Checksum expectedChecksum = new CRC32();
			try {
				expectedChecksum.update(text.getBytes(ControllerConstants.DEFAULT_CHARSET_ENCODING), 0, text.getBytes(ControllerConstants.DEFAULT_CHARSET_ENCODING).length);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chkSum = expectedChecksum.getValue();
//			System.out.println("First ::"+chkSum);
			chkSum = getMasked(chkSum);
//			System.out.println("Second ::"+chkSum);
			chkSum = chkSum^sid;
//			System.out.println("Third ::"+chkSum); 
			chkSum = getMasked(chkSum);
//			System.out.println(((int)chkSum)+"Final Value::"+chkSum);
			return (chkSum);
		}
	 	public static long getCheckSum(long sum, long sid) {
//			System.out.println(sid+"First11 ::"+sum);
			//long chkSum = sid==0?sum+2*getCheckSum("1"):sum;
	 		long chkSum = sum;
		//	System.out.println("First ::"+chkSum);
			chkSum = getMasked(chkSum);
			//System.out.println("Second ::"+chkSum);
			//chkSum = chkSum^(sid==0?1:sid);
			chkSum = chkSum^sid;
			//System.out.println("Third ::"+chkSum);
			chkSum = getMasked(chkSum);
			//System.out.println(((int)chkSum)+"Final Value::"+chkSum);
			return (chkSum);
		}
		// to be used for encryption
	 	public static long getCheckSumD(String text) {
			long chkSum = 0;
			Checksum expectedChecksum = new CRC32();
			try {
				expectedChecksum.update(text.getBytes(ControllerConstants.DEFAULT_CHARSET_ENCODING), 0, text.getBytes(ControllerConstants.DEFAULT_CHARSET_ENCODING).length);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chkSum = expectedChecksum.getValue();
			return getMasked(chkSum);
		}

		public static long getMasked(long val) {
			long maskedVal = 0;
			long leftMask = (val << 8) & 0xff00ff00L;
			long rightMask = (val >> 8) & 0x00ff00ffL;
			maskedVal = leftMask | rightMask;
			return maskedVal;
		}
		
}
