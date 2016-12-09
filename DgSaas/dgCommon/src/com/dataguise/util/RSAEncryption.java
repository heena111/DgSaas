package com.dataguise.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;

public class RSAEncryption {

	/**
	 * String to hold name of the encryption algorithm.
	 */
	public static final String ALGORITHM = "RSA";

	/**
	 * Generate key which contains a pair of private and public key using 2048
	 * bytes. Store the set of keys in Prvate.key and Public.key files.
	 * 
	 * @throws NoSuchAlgorithmException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static KeyPair generateKeys() {
		KeyPairGenerator kpg;
		KeyPair kp = null;
		try {
			try {
				kpg = KeyPairGenerator.getInstance(ALGORITHM);
				kpg.initialize(2048);
				kp = kpg.genKeyPair();
			}catch (NoSuchAlgorithmException e) {
//				e.printStackTrace();
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return kp;
	}
	

	/**
	 * Encrypt the plain text using public key.
	 * 
	 * @param text
	 *            : original plain text
	 * @param key
	 *            :The public key
	 * @return Encrypted text
	 * @throws java.lang.Exception
	 */
	public static String encryptString(String text, PublicKey publicKey) {
		byte[] cipherText = null;
		String encryptedText = null;
		try {
			// get an RSA cipher object
			final Cipher cipher = Cipher.getInstance(ALGORITHM);
			// encrypt the plain text using the public key
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			cipherText = cipher.doFinal(text.getBytes("UTF-8"));
			encryptedText = byteArrayToHexString(cipherText);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return encryptedText;
	}

	public static String decryptString(String encrypted, PrivateKey key) {
		byte[] cipherText = null;
		String decryptedText = null;
		byte[] textBytes = new byte[256];
		try {
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, key);			
			textBytes = hexStringToByteArray(encrypted);
			cipherText = cipher.doFinal(textBytes);
			decryptedText = new String(cipherText, "UTF-8");
		} catch (Exception e) {
//			e.printStackTrace();
		}
		return decryptedText;
	}
	
	public static String getPublicKeyMod(PublicKey publicKey){
		RSAPublicKeySpec pub = new RSAPublicKeySpec(BigInteger.ZERO,
				BigInteger.ZERO);
		KeyFactory fact;
		String modVal = null;
		try {
			fact = KeyFactory.getInstance(ALGORITHM);
			pub = fact.getKeySpec(publicKey, RSAPublicKeySpec.class);
			modVal =  pub.getModulus().toString(16);
		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
//			e.printStackTrace();
		}
		return modVal;
	}
	
	private final static char[] HEX = new char[]{
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

    /**
     * Convert bytes to a base16 string.
     */
    private static String byteArrayToHexString(byte[] byteArray) {
        StringBuffer hexBuffer = new StringBuffer(byteArray.length * 2);
        for (int i = 0; i < byteArray.length; i++)
            for (int j = 1; j >= 0; j--)
                hexBuffer.append(HEX[(byteArray[i] >> (j * 4)) & 0xF]);
        return hexBuffer.toString();
    }

	/**
	 * Convert a base16 string into a byte array
	 */
	private static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}

	public static void main(String[] args) {

	}

}
