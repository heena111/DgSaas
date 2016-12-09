package com.dataguise.util;

import java.util.List;

import org.apache.log4j.Logger;

import com.dataguise.admin.RBACConstants;
import com.dataguise.webservices.beans.DgDatabaseFindResultsDetails;
import com.dataguise.webservices.beans.DgDiscoverUIResults;
import com.dataguise.webservices.beans.DgHDFSTaskInstanceResults;
import com.dataguise.webservices.beans.DgHadoopFieldLevelResultsDetailWrapper;
import com.dataguise.webservices.beans.DgMaskerResults;
import com.dataguise.webservices.beans.DgSearchFileResults;
import com.dataguise.webservices.beans.hive.DgHiveTaskInstanceDetails;
import com.dataguise.webservices.beans.hive.DgHiveTaskResults;
import com.dataguise.webservices.beans.DgSqoopResults;
import com.dataguise.webservices.beans.dgmonitor.DgMonitorAlertBean;
import com.dataguise.webservices.beans.discover.database.ColumnInfo;
import com.dataguise.webservices.beans.hadoop.DgHadoopFieldLevelResultsDetail;
import com.dataguise.webservices.beans.hadoop.WriteToCSVColumnsMap;

public class WriteToCSV {
	
	static final String DOUBLE_QUOTES = "\"";
	static final String CSV_SEPARATOR = ",";
	static Logger logger = Logger.getLogger(WriteToCSV.class);
	
	public static StringBuffer writeHDFSResults(
			List<DgHDFSTaskInstanceResults> dgHDFSUIResultsList,
			boolean groupResults, boolean includeHeader, String type) {
	
		StringBuffer oneLine = new StringBuffer();
		String taskType = dgHDFSUIResultsList.get(0).getTaskType();
		try {

			if(includeHeader){
				oneLine.append("Task Instance ID");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Task Name");
				oneLine.append(CSV_SEPARATOR);
				if (groupResults)
					oneLine.append("Sensitive Data Group");
				else
					oneLine.append("Sensitive Type");
				oneLine.append(CSV_SEPARATOR);
				if (type == "S3")
					oneLine.append("Object Path");
				else
					oneLine.append("File Path");
				oneLine.append(CSV_SEPARATOR);
				
				if(taskType.equalsIgnoreCase(RBACConstants.DG_TASK_TYPE)) {
					if (type == "S3")
							oneLine.append("Object Type");
					else
						oneLine.append("File Type");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Detection Type");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Content Read");
				oneLine.append(CSV_SEPARATOR);
				}
				
				oneLine.append("Hit Count");
				oneLine.append(CSV_SEPARATOR);
				if (type != "S3"){
					oneLine.append("Masked");
					oneLine.append(CSV_SEPARATOR);
					oneLine.append("Encrypted");
					oneLine.append(CSV_SEPARATOR);
				}
				oneLine.append("Incremental Scan");
				oneLine.append("\n");
			}

			for (DgHDFSTaskInstanceResults dgHDFSUIResult : dgHDFSUIResultsList) {
				oneLine.append(dgHDFSUIResult.getTaskInstanceId());
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getTaskName());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				if (groupResults)
					oneLine.append(dgHDFSUIResult.getRegexGroup());
				else
					oneLine.append(dgHDFSUIResult.getRegexName());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getFilePath());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				
				if(taskType.equalsIgnoreCase(RBACConstants.DG_TASK_TYPE)) {
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getFileType());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getDiscoverType());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getContentRead());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				}

				oneLine.append(dgHDFSUIResult.getRegexCount());
				oneLine.append(CSV_SEPARATOR);
				if (type != "S3"){
					oneLine.append(dgHDFSUIResult.getMasking());
					oneLine.append(CSV_SEPARATOR);
					oneLine.append(dgHDFSUIResult.getEncryption());
					oneLine.append(CSV_SEPARATOR);
				}
				oneLine.append(dgHDFSUIResult.getIncremental());

				oneLine.append("\n");

			}

		}

		catch (Exception e) {
		}
		return oneLine;
	}
	
	// This method is used to generate CSV file for HDFS Structured Summary Result
	public static StringBuffer writeHDFSStructResults(
			DgHadoopFieldLevelResultsDetailWrapper dgHDFSStructResults,
			boolean includeHeader) {
		StringBuffer oneLine = new StringBuffer();
		try {
			if(includeHeader){
				oneLine.append("Task Instance ID");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Task Name");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("File Name");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Field");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Match Count");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Total Count");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Sensitive Type");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("Sample Mode");
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("\n");
			}

			for (DgHadoopFieldLevelResultsDetail dgHDFSUIResult : dgHDFSStructResults.getDgHadoopFieldLevelResultsDetailList()) {
				oneLine.append(dgHDFSStructResults.getTaskInstId());
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSStructResults.getTaskName());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getFileName());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getField());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getMatchCount());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getTotalCount());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(dgHDFSUIResult.getSensitiveType());
				oneLine.append(DOUBLE_QUOTES);
				oneLine.append(CSV_SEPARATOR);
				oneLine.append(dgHDFSUIResult.getSampleMode());
				oneLine.append(CSV_SEPARATOR);
				oneLine.append("\n");
			}
		} catch (Exception e) {
		}
		return oneLine;
	}
	
	
	
	public static StringBuffer writeFilteredData(
			List<DgHDFSTaskInstanceResults> dgHDFSUIResultsList,
			List<String> colList) {
		final String CSV_SEPARATOR = ",";
		final String DOUBLE_QUOTES = "\"";
		StringBuffer oneLine = new StringBuffer();
		
        try
        {
        	String [] colValues = colList.toArray(new String[colList.size()]);
        	for(int i=0; i<colValues.length;i++)
        	{
        		oneLine.append(WriteToCSVColumnsMap.columnsMap.get(colValues[i]));
        		oneLine.append(CSV_SEPARATOR);
        	}
         	
    		oneLine.deleteCharAt(oneLine.length()-1);
        	oneLine.append("\n");
        	
        	for (DgHDFSTaskInstanceResults DgHDFSUIResult : dgHDFSUIResultsList)
            {
        		for(int i=0;i<colList.size();i++)
        		{
        			String colValue=colList.get(i);
        			if(colValue.equalsIgnoreCase("taskInstanceId")){
        			    oneLine.append(DgHDFSUIResult.getTaskInstanceId());
        				oneLine.append(CSV_SEPARATOR);
                   	   }
        			else if(colValue.equalsIgnoreCase("taskName")){
        				oneLine.append(DOUBLE_QUOTES);
        				oneLine.append(DgHDFSUIResult.getTaskName());
        				oneLine.append(DOUBLE_QUOTES);
                        oneLine.append(CSV_SEPARATOR);
                        }
        			else if(colValue.equalsIgnoreCase("filePath")){
        				oneLine.append(DOUBLE_QUOTES);
        				oneLine.append(DgHDFSUIResult.getFilePath());
        				oneLine.append(DOUBLE_QUOTES);
                        oneLine.append(CSV_SEPARATOR);
        			   }
        			else if(colValue.equalsIgnoreCase("regexGroup")){
        				oneLine.append(DOUBLE_QUOTES);
        				oneLine.append(DgHDFSUIResult.getRegexGroup());
        				oneLine.append(DOUBLE_QUOTES);
                        oneLine.append(CSV_SEPARATOR);
                       }
        			else if(colValue.equalsIgnoreCase("regexCount")){
        				oneLine.append(DgHDFSUIResult.getRegexCount());
        				oneLine.append(CSV_SEPARATOR);
        			   }
        			else if(colValue.equalsIgnoreCase("masking")){
        				oneLine.append(DgHDFSUIResult.getMasking());
        			    oneLine.append(CSV_SEPARATOR);
            		   }
        			else if(colValue.equalsIgnoreCase("encryption")){
        				oneLine.append(DgHDFSUIResult.getEncryption());
        				oneLine.append(CSV_SEPARATOR);
        			   }
        			else if(colValue.equalsIgnoreCase("incremental")){
	    				oneLine.append(DgHDFSUIResult.getIncremental());
        				oneLine.append(CSV_SEPARATOR);
           			   }
        		}
        		oneLine.deleteCharAt(oneLine.length()-1);
        		oneLine.append("\n");
        		}
        	}
		
        catch (Exception e){}
        return oneLine;
    }
	public static StringBuffer writeSqoopData(List<DgSqoopResults> DgSqoopResultsList,Boolean groupResults)
    {
		final String CSV_SEPARATOR = ",";
		final String DOUBLE_QUOTES = "\"";
		StringBuffer oneLine = new StringBuffer();
		
        try
        {
			oneLine.append("Database");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Table");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Column");
            oneLine.append(CSV_SEPARATOR);
            if(groupResults)
            	oneLine.append("Sensitive Group");
            else
            	oneLine.append("Sensitive type");
		    oneLine.append(CSV_SEPARATOR);
			oneLine.append("Hit Count");
			
           oneLine.append("\n");
            
          if(DgSqoopResultsList != null && DgSqoopResultsList.size()>0){
            for (DgSqoopResults DgSqoopResult : DgSqoopResultsList)
            {
                oneLine.append(DgSqoopResult.getSchemaName() );
            	 oneLine.append(CSV_SEPARATOR);
            	 oneLine.append(DOUBLE_QUOTES);
            	 oneLine.append(DgSqoopResult.getTableName());
            	 oneLine.append(DOUBLE_QUOTES);
                 oneLine.append(CSV_SEPARATOR);
                 oneLine.append(DOUBLE_QUOTES);
                 oneLine.append(DgSqoopResult.getColumnName());
                 oneLine.append(DOUBLE_QUOTES);
                 oneLine.append(CSV_SEPARATOR);
                 oneLine.append(DOUBLE_QUOTES);
                 if(groupResults)
                	 oneLine.append(DgSqoopResult.getRegexGroup());
                 else
                	 oneLine.append(DgSqoopResult.getRegexName());
                oneLine.append(DOUBLE_QUOTES);
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(DgSqoopResult.getRegexCount());
                oneLine.append("\n");
                
            }
            }
        }
        
        catch (Exception e){}
        return oneLine;
    }
	public static StringBuffer writeDiscoverSkippedColumnData(List<ColumnInfo> DgDiscoverSkippedColumnResultsList)
    {
		final String CSV_SEPARATOR = ",";
		final String DOUBLE_QUOTES = "\"";
		StringBuffer oneLine = new StringBuffer();

		try {
			oneLine.append("Connection Name");
			oneLine.append(CSV_SEPARATOR);
			oneLine.append("Database");
			oneLine.append(CSV_SEPARATOR);
			oneLine.append("Table");
			oneLine.append(CSV_SEPARATOR);
			oneLine.append("Column");
			oneLine.append(CSV_SEPARATOR);
			oneLine.append("Data Type");

			oneLine.append("\n");

			if (DgDiscoverSkippedColumnResultsList != null&& DgDiscoverSkippedColumnResultsList.size() > 0) {
				for (ColumnInfo DgDiscoverSkippedColumnResult : DgDiscoverSkippedColumnResultsList) {
					oneLine.append(DgDiscoverSkippedColumnResult.getConnectionName());
					oneLine.append(CSV_SEPARATOR);
					oneLine.append(DOUBLE_QUOTES);
					oneLine.append(DgDiscoverSkippedColumnResult.getDatabaseName());
					oneLine.append(DOUBLE_QUOTES);
					oneLine.append(CSV_SEPARATOR);
					oneLine.append(DOUBLE_QUOTES);
					oneLine.append(DgDiscoverSkippedColumnResult.getTableName());
					oneLine.append(DOUBLE_QUOTES);
					oneLine.append(CSV_SEPARATOR);
					oneLine.append(DOUBLE_QUOTES);
					oneLine.append(DgDiscoverSkippedColumnResult.getColumnName());
					oneLine.append(DOUBLE_QUOTES);
					oneLine.append(CSV_SEPARATOR);
					oneLine.append(DgDiscoverSkippedColumnResult.getDataType());
					oneLine.append("\n");

				}
			}
		}
		catch (Exception e) {
		}
		return oneLine;
    }
	
	public static StringBuffer writeforHive(DgHiveTaskInstanceDetails dgHiveTaskInstanceDetails)
    {
		final String CSV_SEPARATOR = ",";
		final String DOUBLE_QUOTES = "\"";
		StringBuffer oneLine = new StringBuffer();
		
        try
        {
        	
        	oneLine.append("Task Instance ID");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Task Name");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Database");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Table");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Column");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Sensitive Type");
		    oneLine.append(CSV_SEPARATOR);
		    
		    if(dgHiveTaskInstanceDetails.getTaskType().contains("Discovery")){
		    	oneLine.append("Total Count");
		    	oneLine.append(CSV_SEPARATOR);
		    	oneLine.append("Hit Count");
		    	oneLine.append(CSV_SEPARATOR);
		    	oneLine.append("Null Count");
		    	
		    }else
		    	oneLine.append("Column Type");
					
           oneLine.append("\n");
           
           List<DgHiveTaskResults> hiveresultsList = dgHiveTaskInstanceDetails.getDgHiveTaskResultList();
           for (DgHiveTaskResults dgHiveTaskResults : hiveresultsList)
            {
                 oneLine.append(dgHiveTaskInstanceDetails.getTaskInstanceId() );
                 oneLine.append(CSV_SEPARATOR);
            	 oneLine.append(DOUBLE_QUOTES);
            	 oneLine.append(dgHiveTaskInstanceDetails.getTaskName());
            	 oneLine.append(DOUBLE_QUOTES);
                 oneLine.append(CSV_SEPARATOR);
                 oneLine.append(DOUBLE_QUOTES);
                 oneLine.append(dgHiveTaskResults.getDatabaseName());
                 oneLine.append(DOUBLE_QUOTES);
                 oneLine.append(CSV_SEPARATOR);
                 oneLine.append(DOUBLE_QUOTES);
                oneLine.append(dgHiveTaskResults.getTableName());
                oneLine.append(DOUBLE_QUOTES);
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(dgHiveTaskResults.getColumnName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(dgHiveTaskResults.getSensitiveType());
                oneLine.append(CSV_SEPARATOR);
                
                if(dgHiveTaskInstanceDetails.getTaskType().contains("Discovery")){
    		    	oneLine.append(dgHiveTaskResults.getTotalCount());
    		    	oneLine.append(CSV_SEPARATOR);
    		    	oneLine.append(dgHiveTaskResults.getHitCount());
    		    	oneLine.append(CSV_SEPARATOR);
    		    	oneLine.append(dgHiveTaskResults.getNullCount());
    		    	
    		    }else
    		    	oneLine.append(dgHiveTaskResults.getColumnType());
           
               
                oneLine.append("\n");
                
            }
            
        }
        
        catch (Exception e){}
        return oneLine;
    }
	
	public static StringBuffer writeDiscoverResults(List<DgDiscoverUIResults> DgDiscoverUIResultsList,Boolean groupResults)
    {
		StringBuffer oneLine = new StringBuffer();
		
        try
        {
        	if(groupResults){
        		oneLine.append("Sensitive Data Group");
        		oneLine.append(CSV_SEPARATOR);
        	}
        	else{
        		oneLine.append("Task Instance Id");
        		oneLine.append(CSV_SEPARATOR);
        		oneLine.append("Sensitive Data Type");
        		oneLine.append(CSV_SEPARATOR);
        		oneLine.append("Hostname");
                oneLine.append(CSV_SEPARATOR);
        	}
			oneLine.append("Database");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Table");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Column");
            oneLine.append(CSV_SEPARATOR);
            if(groupResults){
            	oneLine.append("Expression Group Confidence");
        		oneLine.append(CSV_SEPARATOR);
            }
            else{
            oneLine.append("Data Type");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Database User");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Confidence");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Total Count");
			oneLine.append(CSV_SEPARATOR);
			oneLine.append("Hit Count");
		    oneLine.append(CSV_SEPARATOR);
        	oneLine.append("Null Count");
			oneLine.append(CSV_SEPARATOR);
			oneLine.append("Quick Search");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Masked");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Safe");
            oneLine.append(CSV_SEPARATOR);
			oneLine.append("Table/View");
            oneLine.append(CSV_SEPARATOR);

			oneLine.append("Database Type");
            oneLine.append(CSV_SEPARATOR);
            }
            
            oneLine.append("Referential Type");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Referring To");
            oneLine.append(CSV_SEPARATOR);
       
            oneLine.append("\n");
            
           for (DgDiscoverUIResults objDgDiscoverUIResults : DgDiscoverUIResultsList)
            {
                if(groupResults){
            		oneLine.append(DOUBLE_QUOTES);
            		oneLine.append(objDgDiscoverUIResults.getExpressionGroup());
            		oneLine.append(DOUBLE_QUOTES);	
            	}
            	else{
            		oneLine.append(objDgDiscoverUIResults.getTaskInstanceID());
                	oneLine.append(CSV_SEPARATOR);
                	oneLine.append(DOUBLE_QUOTES);
            		oneLine.append(objDgDiscoverUIResults.getExpressionName());
            		oneLine.append(DOUBLE_QUOTES);
            		oneLine.append(CSV_SEPARATOR);
                 	oneLine.append(handleCSVSepratorChars(objDgDiscoverUIResults.getHostName()));
            		}
            	
            		oneLine.append(CSV_SEPARATOR);
            		oneLine.append(handleCSVSepratorChars(objDgDiscoverUIResults.getDatabaseName()));
                
            		oneLine.append(CSV_SEPARATOR);
            		oneLine.append(handleCSVSepratorChars(objDgDiscoverUIResults.getTableName()));

            		oneLine.append(CSV_SEPARATOR);
            		oneLine.append(handleCSVSepratorChars(objDgDiscoverUIResults.getColumnName()));
                if(groupResults){
                	oneLine.append(CSV_SEPARATOR);
                    oneLine.append(objDgDiscoverUIResults.getExpressionGroupConfidence());
                }
                else{
                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.getDataType());
             
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(handleCSVSepratorChars(objDgDiscoverUIResults.getDbuser()));
                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.getProbability());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.getMismatchCount());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.getHitCount());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.getNullCount());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.isQuickSearch()== true ? "Y" : "N");
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.isMasked()== true ? "Y" : "N");
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.isSafe()== true ? "Y" : "N");
                
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDgDiscoverUIResults.getObjectType());
                oneLine.append(CSV_SEPARATOR);
   
                oneLine.append(objDgDiscoverUIResults.getDatabaseType());
                }
                
                oneLine.append(CSV_SEPARATOR);
                
                oneLine.append((objDgDiscoverUIResults.getConstraintType() == null) ? "" : objDgDiscoverUIResults.getConstraintType());
                oneLine.append(CSV_SEPARATOR);
                
                oneLine.append((objDgDiscoverUIResults.getReferringTo()==null)?"":objDgDiscoverUIResults.getReferringTo());
                oneLine.append(CSV_SEPARATOR);    
                oneLine.append("\n");
            }
            
        }
        
        catch (Exception e){
        	logger.error("Error while writing CSV file. "+e);
        }
        return oneLine;
    }
	
	/**
	 * Currently handles ,(comma), and "(double quotes) within a CSV value cell(so that it doesn't get separated in another cell)
	 * @param valueString
	 * @return
	 */
	public static String handleCSVSepratorChars(String valueString){
		if(valueString == null )
			return "";
		 //If valueString name has " then replace " with ""
        if(valueString.contains(DOUBLE_QUOTES))
        {
        	valueString=valueString.replaceAll(DOUBLE_QUOTES, DOUBLE_QUOTES+DOUBLE_QUOTES);
        }
        //If valueString name has ,(comma) then set the value within ""(double quotes)
        else if(valueString.contains(CSV_SEPARATOR))
        	valueString=DOUBLE_QUOTES+valueString+DOUBLE_QUOTES;
        	
         return valueString;
	}
	

    public static StringBuffer writeFindItResults(List<DgDatabaseFindResultsDetails> DgDatabaseFindResultsDetails)
    {
		final String CSV_SEPARATOR = ",";
		StringBuffer oneLine = new StringBuffer();
		
        try
        {
        	
        	oneLine.append("Database Type");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("IP Address");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Host Name");
            oneLine.append(CSV_SEPARATOR);
            oneLine.append("Port Number");
            oneLine.append("\n");
            
            for (DgDatabaseFindResultsDetails objDatabaseFindResults : DgDatabaseFindResultsDetails)
            {
              
                oneLine.append(objDatabaseFindResults.getDatabaseType());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDatabaseFindResults.getIpAddress());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDatabaseFindResults.getHostName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(objDatabaseFindResults.getPortNumber());
                oneLine.append("\n");
            }
        }
        
        catch (Exception e){}
        return oneLine;
    }
    

public static StringBuffer writeMaskerResults(List<DgMaskerResults> maskerResultsList)
{
	final String CSV_SEPARATOR = ",";
	StringBuffer oneLine = new StringBuffer();
	
    try
    {
    	oneLine.append("Connection Name");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("Database");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("Table");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("Column");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("CUPS Options");
        oneLine.append(CSV_SEPARATOR);
        oneLine.append("Masking Action");
        oneLine.append(CSV_SEPARATOR);
    	oneLine.append("# of Rows");
        oneLine.append(CSV_SEPARATOR);
        oneLine.append("Errors");
        oneLine.append(CSV_SEPARATOR);
        oneLine.append("\n");
        
        for (DgMaskerResults objDgDiscoverUIResults : maskerResultsList)
        {
 
            oneLine.append(objDgDiscoverUIResults.getConnectionName());
        	 oneLine.append(CSV_SEPARATOR);
        	 oneLine.append(objDgDiscoverUIResults.getDbName());
             oneLine.append(CSV_SEPARATOR);
        	 oneLine.append(objDgDiscoverUIResults.getTableName());
             oneLine.append(CSV_SEPARATOR);
             oneLine.append(objDgDiscoverUIResults.getColumnName());
             oneLine.append(CSV_SEPARATOR);
            oneLine.append(objDgDiscoverUIResults.getCupsOptions());
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(objDgDiscoverUIResults.getMaskingType());
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(objDgDiscoverUIResults.getRowsProcessed());
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(objDgDiscoverUIResults.getRowsInError());
          
            oneLine.append("\n");
            
        }
        
    }
    
    catch (Exception e){}
    return oneLine;
}


public static StringBuffer writeFilesResults(List<DgSearchFileResults> dgSearchFileResultsList,Boolean groupResults)
{
	final String CSV_SEPARATOR = ",";
	StringBuffer oneLine = new StringBuffer();
	
    try
    {
    	oneLine.append("Scan Timestamp");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("IP/Hostname");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("Location");
        oneLine.append(CSV_SEPARATOR);
		oneLine.append("File Name");
        oneLine.append(CSV_SEPARATOR);
        if(groupResults)
        	oneLine.append("Sensitive Group");
        else
        	oneLine.append("Sensitive Type");
        oneLine.append(CSV_SEPARATOR);
        oneLine.append("Hits");
        oneLine.append(CSV_SEPARATOR);
        oneLine.append("\n");
        

        for (DgSearchFileResults objDgDiscoverUIResults : dgSearchFileResultsList)
        {
            
            oneLine.append(objDgDiscoverUIResults.getScanTimestamp());
        	 oneLine.append(CSV_SEPARATOR);
        	 oneLine.append(objDgDiscoverUIResults.getIpHostname());
             oneLine.append(CSV_SEPARATOR);
        	 oneLine.append(objDgDiscoverUIResults.getLocation());
             oneLine.append(CSV_SEPARATOR);
             oneLine.append(objDgDiscoverUIResults.getFilename());
             oneLine.append(CSV_SEPARATOR);
             if(groupResults)
            	 oneLine.append(objDgDiscoverUIResults.getSensitiveGroup());
             else
            	 oneLine.append(objDgDiscoverUIResults.getSensitiveType());
            oneLine.append(CSV_SEPARATOR);
            oneLine.append(objDgDiscoverUIResults.getNoOfHits());
          
            oneLine.append("\n");
            
        }
        
    }
    catch (Exception e){}
    return oneLine;
}

	// Write Monitor Alerts into CSV
	public static StringBuffer writeMonitorAlerts(List<DgMonitorAlertBean> dgMonitorAlertBean)
	{
		StringBuffer oneLine = new StringBuffer();
		
	    try
	    {
    		oneLine.append("Alert Rule Name");
    		oneLine.append(CSV_SEPARATOR);
    		oneLine.append("Source System");
    		oneLine.append(CSV_SEPARATOR);
    		oneLine.append("Hadoop User");
            oneLine.append(CSV_SEPARATOR);
	        oneLine.append("Client Host");
	        oneLine.append(CSV_SEPARATOR);
			oneLine.append("Alert Time");
	        oneLine.append(CSV_SEPARATOR);
			oneLine.append("Description");
	        oneLine.append(CSV_SEPARATOR);
	        oneLine.append("\n");
	        
	       for (DgMonitorAlertBean objDgMonitorAlertBean : dgMonitorAlertBean)
	        {
	            
        		oneLine.append(objDgMonitorAlertBean.getAlertPolicyName());
            	oneLine.append(CSV_SEPARATOR);
            	oneLine.append(DOUBLE_QUOTES);
        		oneLine.append(objDgMonitorAlertBean.getSource());
        		oneLine.append(DOUBLE_QUOTES);
        		oneLine.append(CSV_SEPARATOR);
             	oneLine.append(objDgMonitorAlertBean.getUser());
        		oneLine.append(CSV_SEPARATOR);
        		oneLine.append(objDgMonitorAlertBean.getHost());
        		oneLine.append(CSV_SEPARATOR);
        		oneLine.append(objDgMonitorAlertBean.getAlertTime());
        		oneLine.append(CSV_SEPARATOR);
        		oneLine.append(objDgMonitorAlertBean.getAlertMessage());
	         
	            oneLine.append("\n");
		    }
	    }
	    
	    catch (Exception e){
	    	logger.error("Error while writing CSV file. "+e);
	    }
	    return oneLine;
	}




}
