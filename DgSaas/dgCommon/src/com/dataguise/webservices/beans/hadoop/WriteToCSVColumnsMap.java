package com.dataguise.webservices.beans.hadoop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WriteToCSVColumnsMap {
	
	public static final Map<String,String> columnsMap=createMap();
	
	 private static Map<String, String> createMap() {
	        Map<String, String> tempMap  = new HashMap<String, String>();
	        tempMap.put("taskInstanceId", "Task Instance Id");
	        tempMap.put("taskName","Task Name");
	        tempMap.put("regexGroup","Sensitive Data Group");
	        tempMap.put("filePath","File Path");
	        tempMap.put("regexCount","Sensitive Items Count");
	        tempMap.put("masking","Masked");
	        tempMap.put("encryption","Encrypted");
	        tempMap.put("incremental","Incremental Scan");
	        return Collections.unmodifiableMap(tempMap);
	    }

}
