package com.dataguise.util;

public class RegexUtility  {
	
	public static String checkForMultipleSlashes(String path){
		path = path.replaceAll("[/]{2,}", "/");
		path = path.replace("./","");
		return path;	
	}
	
}
