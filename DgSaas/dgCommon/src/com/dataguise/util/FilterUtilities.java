package com.dataguise.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dataguise.webservices.beans.FilterStruct;



public class FilterUtilities {

	public String createFilterQuery(List<HashMap> filtersListDeseralized, String type) {
		
		String filterQuery = "";
		 
		for (HashMap filterMap : filtersListDeseralized) {
			FilterStruct filtersInfoMap = new FilterStruct();
			filtersInfoMap.setField(filterMap.get("field").toString());
			filtersInfoMap.setType(filterMap.get("type").toString());
			filtersInfoMap.setValue(filterMap.get("value").toString());
			if(filterMap.get("comparison") != null){
				filtersInfoMap.setComparison(filterMap.get("comparison").toString());
			}
			if (filtersInfoMap.getField() != null && !filtersInfoMap.getField().equals("")
					&& filtersInfoMap.getValue() != null && !filtersInfoMap.getValue().equals("")) {
				String fieldName = "" ;
				fieldName = getMappedColumnWrapperMethod(filtersInfoMap,type);
				
				
								
				filterQuery = getQueryAsPerField(filtersInfoMap,filterQuery,fieldName,filterMap);
				
			}
		}
		if(!filterQuery.equals("")){
			filterQuery = " and (" + filterQuery + ") ";
		}
		return filterQuery;
	}
	
	public String createFilterQueryNativeSQL(List<HashMap> filtersListDeseralized, String type) {
		
		String filterQuery = "";
		 
		for (HashMap filterMap : filtersListDeseralized) {
			FilterStruct filtersInfoMap = new FilterStruct();
			filtersInfoMap.setField(filterMap.get("field").toString());
			filtersInfoMap.setType(filterMap.get("type").toString());
			filtersInfoMap.setValue(filterMap.get("value").toString());
			if(filterMap.get("comparison") != null){
				filtersInfoMap.setComparison(filterMap.get("comparison").toString());
			}
			if (filtersInfoMap.getField() != null && !filtersInfoMap.getField().equals("")
					&& filtersInfoMap.getValue() != null && !filtersInfoMap.getValue().equals("")) {
				String fieldName = "" ;
				fieldName = getMappedColumnWrapperMethodNativeSQL(filtersInfoMap,type);
				
				
								
				filterQuery = getQueryAsPerFieldNativeSQL(filtersInfoMap,filterQuery,fieldName,filterMap);
				
			}
		}
		if(!filterQuery.equals("")){
			filterQuery = " and (" + filterQuery + ") ";
		}
		return filterQuery;
	}
	
private String getQueryAsPerField(FilterStruct filtersInfoMap, String filterQuery,String fieldName, HashMap filterMap){
		
		if (filtersInfoMap.getType().equalsIgnoreCase("list")) {
			String filterListValue = ((String) filtersInfoMap
					.getValue());
			if (filterListValue.startsWith("[")
					&& filterListValue.endsWith("]")) {
				filterListValue = filterListValue.substring(1,
						filterListValue.length() - 1);
			}
			String[] arrayColumnFilterMultipleValues = filterListValue
					.split(",");
			String listFieldQuery = createListFieldQuery(fieldName,
					arrayColumnFilterMultipleValues);

			if (filterQuery.equals("")) {
				filterQuery = " (" + listFieldQuery + ") ";
			} else {
				filterQuery = filterQuery + " and " + " ("
						+ listFieldQuery + ") ";
			}
		} else if (filtersInfoMap.getType().equalsIgnoreCase("numeric") || filtersInfoMap.getType().equalsIgnoreCase("date")) {

			filtersInfoMap.setComparison(filterMap.get("comparison")
					.toString());
			try{
				filterQuery = createNumericDateFieldQuery(fieldName,
						filtersInfoMap, filterQuery,filtersInfoMap.getType());
			}
			catch(Exception e){
				
			}
			

		} else if(filtersInfoMap.getType().equalsIgnoreCase("boolean")){
			
			
			if (filterQuery.equals("")) {
				filterQuery = fieldName + " = " + filtersInfoMap.getValue();
			} else {
				filterQuery = filterQuery + " and " + fieldName + " = "+ filtersInfoMap.getValue();
			}
			
		}else
		{
			String upperCaseValue = ((String) filtersInfoMap.getValue()).toUpperCase();
			if (filterQuery.equals("")) {
				filterQuery = " upper("+ fieldName +") like '%" +upperCaseValue +"%'";
			} else {
				filterQuery = filterQuery + " and upper(" + fieldName + ") like '%" +upperCaseValue +"%'"; 
			}
		}
		
		return filterQuery;
		
		
	}

private String getQueryAsPerFieldNativeSQL(FilterStruct filtersInfoMap, String filterQuery,String fieldName, HashMap filterMap){
	
	if (filtersInfoMap.getType().equalsIgnoreCase("list")) {
		String filterListValue = ((String) filtersInfoMap
				.getValue());
		if (filterListValue.startsWith("[")
				&& filterListValue.endsWith("]")) {
			filterListValue = filterListValue.substring(1,
					filterListValue.length() - 1);
		}
		String[] arrayColumnFilterMultipleValues = filterListValue
				.split(",");
		String listFieldQuery = createListFieldQuery(fieldName,
				arrayColumnFilterMultipleValues);

		if (filterQuery.equals("")) {
			filterQuery = " (" + listFieldQuery + ") ";
		} else {
			filterQuery = filterQuery + " and " + " ("
					+ listFieldQuery + ") ";
		}
	} else if (filtersInfoMap.getType().equalsIgnoreCase("numeric") || filtersInfoMap.getType().equalsIgnoreCase("date")) {

		filtersInfoMap.setComparison(filterMap.get("comparison")
				.toString());
		try{
			filterQuery = createNumericDateFieldQuery(fieldName,
					filtersInfoMap, filterQuery,filtersInfoMap.getType());
		}
		catch(Exception e){
			
		}
		

	} else if(filtersInfoMap.getType().equalsIgnoreCase("boolean")){
		
		
		if (filterQuery.equals("")) {
			filterQuery = fieldName + " =:" + (Boolean.valueOf(filtersInfoMap.getValue()) == true ? 1 : 0);
		} else {
			filterQuery = filterQuery + " and " + fieldName + " =:"+ (Boolean.valueOf(filtersInfoMap.getValue()) == true ? 1 : 0);
		}
		
	}else
	{
		String upperCaseValue = ((String) filtersInfoMap.getValue()).toUpperCase();
		if (filterQuery.equals("")) {
			filterQuery = " upper("+ fieldName +") like '%" +upperCaseValue +"%'";
		} else {
			filterQuery = filterQuery + " and upper(" + fieldName + ") like '%" +upperCaseValue +"%'"; 
		}
	}
	
	return filterQuery;
	
	
}
	
private String createListFieldQuery(String fieldName,String[] arrayColumnFilterMultipleValues) {
	String listFieldQuery = "";
	if (arrayColumnFilterMultipleValues.length >= 1) {
		listFieldQuery = fieldName + " = '" + arrayColumnFilterMultipleValues[0].trim() + "' ";
	}
	
	for (int index = 1; index < arrayColumnFilterMultipleValues.length; ++index) {
		String value = arrayColumnFilterMultipleValues[index];
		listFieldQuery = listFieldQuery + " or " + fieldName + " = '" + value.trim() + "' ";
	}
	return listFieldQuery;
}

private String createNumericDateFieldQuery(String fieldName,
		FilterStruct filtersInfoMap, String filterQuery, String type) throws ParseException {
	String comparisonOperator = "=";
	String formattedDate = "";
	
	if (filtersInfoMap.getComparison().equalsIgnoreCase("lt")) {
		comparisonOperator = "<";
	} else if (filtersInfoMap.getComparison().equalsIgnoreCase("gt")) {
		comparisonOperator = ">";
	}
	
	if(type.equalsIgnoreCase("numeric")){
		formattedDate = filtersInfoMap.getValue();
	}else{
		SimpleDateFormat dateTimeValue = new SimpleDateFormat("MM/dd/yyyy");
		Timestamp startTimeStamp = new Timestamp(dateTimeValue.parse(filtersInfoMap.getValue()).getTime());
		Timestamp endTimeStamp = new Timestamp(dateTimeValue.parse(filtersInfoMap.getValue()).getTime());
		formattedDate = "'" + startTimeStamp + "'";
		
		endTimeStamp.setHours(23);
		endTimeStamp.setMinutes(59);
		endTimeStamp.setSeconds(59);
		
		if(filtersInfoMap.getComparison().equalsIgnoreCase("eq")){
			formattedDate = " between " + "'" + startTimeStamp + "'" + " and " + "'" + endTimeStamp + "'";
			comparisonOperator = "";
		}
	}
	
	
	if (filterQuery.equals("")) {
		filterQuery = " (" + fieldName + " " + comparisonOperator + " "
				+ formattedDate + ") ";
	} else {
		filterQuery = filterQuery + " and " + " (" + fieldName + " "
				+ comparisonOperator + " " + formattedDate + ") ";
	}

	return filterQuery;
}

public static List setFilterStruct(List<HashMap> filtersList){
	List<FilterStruct> filtersStructList = new ArrayList<FilterStruct>();
	if(filtersList != null){
		for (HashMap filterMap : filtersList) {
			
				FilterStruct filterStruct = new FilterStruct();
				filterStruct.setField(filterMap.get("field").toString());
				filterStruct.setType(filterMap.get("type").toString());
				filterStruct.setValue(filterMap.get("value").toString());
				if(filterMap.get("comparison") != null){
					filterStruct.setComparison(filterMap.get("comparison").toString());
				}
				filtersStructList.add(filterStruct);
		
			
		}
	}
	return filtersStructList;
}


public static String getMappedColumnWrapperMethod(FilterStruct filtersInfoMap,String type) {
	String fieldName = "";
	if(type.equalsIgnoreCase("LoadDiscoveryNonSensitiveColumn")){
		fieldName = getNonSensitiiveColsMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("DiscoverUnsafeList")){
		fieldName = loadSensitiveDataDiscoveryUnsafeResultsMapColumnName((String) filtersInfoMap.getField());
	}else if (type.equalsIgnoreCase("MaskerDetailedResults")){
		fieldName = getMaskerResultsMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("masker") || type.equalsIgnoreCase("discover") || type.equalsIgnoreCase("nmap") || type.equalsIgnoreCase("hadoop")){
		fieldName = getTaskInstancesMappedColumn((String) filtersInfoMap.getField(), type);
	}else if (type.equalsIgnoreCase("DiscoverDetailedResults")){
		fieldName = getDiscoverResultsMappedColumn((String) filtersInfoMap.getField());
	}else if (type.equalsIgnoreCase("MaskerTasksList")){
		fieldName = getMaskerTasksLists((String) filtersInfoMap.getField());
	}else if (type.equalsIgnoreCase("FindItTasksList")){
		fieldName = getFindItTasksListMappedColumn((String) filtersInfoMap.getField());
	}else if (type.equalsIgnoreCase("HadoopTasksList")){
		fieldName = getHadoopTasksListMappedColumn((String) filtersInfoMap.getField());
	}else if (type.equalsIgnoreCase("DiscoverTasksList")){
		fieldName = getDiscoverTasksListMappedColumn((String) filtersInfoMap.getField());
	}else if (type.equalsIgnoreCase("FilesResultsInstances")){
		  fieldName = getFileResultsInstancesMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("FilesTasksList")){
		  fieldName = getFilesTasksListMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("FindItDetailedResults")){
		  fieldName = getFindItDetialResultsMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("FilesDetailedResults")){
		  fieldName = getFilesDetialResultsMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("FilesDetailedGroupResults")){
		  fieldName = getFilesDetialGroupResultsMappedColumn((String) filtersInfoMap.getField());	
	}else if(type.equalsIgnoreCase("HDFSDetailedResults")){
		 fieldName = getHDFSDetailedResultsMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("HDFSDateRangeDetailedResults")){
		fieldName = getHDFSDateRangeDetailedResultsMappedColumn((String) filtersInfoMap.getField());
	}else if(type.equalsIgnoreCase("DiffDiscoverResults")){
		fieldName = getDiffDiscoverResultsMappedColumn((String) filtersInfoMap.getField());
	}
	else if(type.equalsIgnoreCase("LoadSqoopTasks")){
		fieldName = getScoopResultsMappedColumn((String) filtersInfoMap.getField());
	}
	else if(type.equalsIgnoreCase("LoadHiveTasks")){
		fieldName = getHadoopTasksListMappedColumn((String) filtersInfoMap.getField());
	}
	else if(type.equalsIgnoreCase("S3DetailedResults")){
		 fieldName = getS3DetailedResultsMappedColumn((String) filtersInfoMap.getField());
	}
	else if(type.equalsIgnoreCase("S3DateRangeDetailedResults")){
		fieldName = getS3DateRangeDetailedResultsMappedColumn((String) filtersInfoMap.getField());
	}
	else if(type.equalsIgnoreCase("HDFSFieldResults")){
		fieldName = getHDFSFieldResultsMappedColumn((String) filtersInfoMap.getField());
	}
	
	return fieldName;
	
}

public static String getMappedColumnWrapperMethodNativeSQL(FilterStruct filtersInfoMap,String type) {
	String fieldName = "";
	if (type.equalsIgnoreCase("DiscoverDetailedResults")){
		fieldName = getDiscoverResultsMappedColumnNativeSQL((String) filtersInfoMap.getField());
	} else if (type.equalsIgnoreCase("HDFSDetailedResults")){
		fieldName = getHDFSDetailedResultsMappedColumnNativeSQL((String) filtersInfoMap.getField(),"");
	}	
	else if (type.equalsIgnoreCase("S3DetailedResults")){
		fieldName = getHDFSDetailedResultsMappedColumnNativeSQL((String) filtersInfoMap.getField(),"S3");
	}
	else if (type.equalsIgnoreCase("HDFSFieldResults")){
		fieldName = getHDFSFieldResultsMappedColumn((String) filtersInfoMap.getField());
	}
		
	
	return fieldName;
	
}


private static String getMaskerResultsMappedColumn(String columnName) {
	String mappedColumnName = "";
	if (columnName == null || columnName.equals(""))
		mappedColumnName = "rc.connectionName";
	else if (columnName.equalsIgnoreCase("connectionName"))
		mappedColumnName = "rc.connectionName";
	else if (columnName.equalsIgnoreCase("tableName"))
		mappedColumnName = "r.tableName";
	else if (columnName.equalsIgnoreCase("cupsOption"))
		mappedColumnName = "rc.cupsOptions";
	else if (columnName.equalsIgnoreCase("dbName"))
		mappedColumnName = "c.schemaName";
	else if (columnName.equalsIgnoreCase("maskingType"))
		mappedColumnName = "rc.maskingType";
	else if (columnName.equalsIgnoreCase("rowsInError"))
		mappedColumnName = "r.rowsInError";
	else if (columnName.equalsIgnoreCase("rowsProcessed"))
		mappedColumnName = "r.rowsProcessed";
	else if (columnName.equalsIgnoreCase("columnName"))
		mappedColumnName = "rc.columnName";

	return mappedColumnName;
}






private static String getTaskInstancesMappedColumn(String columnName,
		String taskType) {
	String mappedColumnName = "";
	
	if(columnName.equalsIgnoreCase("taskName")){
		if(taskType.equalsIgnoreCase("masker")){
			mappedColumnName = "i.dgMaskingSets.name";
		}else if(taskType.equalsIgnoreCase("discover")){
			mappedColumnName = "i.dgDiscoverSets.name";
		}else if(taskType.equalsIgnoreCase("nmap")){
			mappedColumnName = "i.dgDiscoverNmapSets.name";
		}else if(taskType.equalsIgnoreCase("hadoop")){
			mappedColumnName = "i.dgDiscoHadoopFileSets.taskName";
		}
	}
	

	if (columnName.equalsIgnoreCase("taskInstanceID"))
		mappedColumnName = "i.taskInstanceId";
	else if (columnName.equalsIgnoreCase("status"))
		mappedColumnName = "i.status";
	else if (columnName.equalsIgnoreCase("startTime"))
		mappedColumnName = "i.timeStart";
	else if (columnName.equalsIgnoreCase("endTime"))
		mappedColumnName = "i.timeEnd";

	return mappedColumnName;
}

public static String loadSensitiveDataDiscoveryUnsafeResultsMapColumnName(
		String sortColumn) {
	if (sortColumn == null || sortColumn.equals(""))
		sortColumn = "a.label";
	else if (sortColumn.equalsIgnoreCase("databaseName"))
		sortColumn = "c.schemaName";
	else if (sortColumn.equalsIgnoreCase("tableName"))
		sortColumn = "c.objectName";
	else if (sortColumn.equalsIgnoreCase("hostName"))
		sortColumn = "b.hostName";
	else if (sortColumn.equalsIgnoreCase("columnName"))
		sortColumn = "c.columnName";
	else if (sortColumn.equalsIgnoreCase("expressionName"))
		sortColumn = "a.label";
	else if (sortColumn.equalsIgnoreCase("hitCount"))
		sortColumn = "c.hitCount";
	else if (sortColumn.equalsIgnoreCase("probability"))
		sortColumn = "c.percentageProbability";
	else
		sortColumn = "a.label";
	return sortColumn;
}
public static String getNonSensitiiveColsMappedColumn(String sortColumn){
	//icdb.dbName, s.name, nsc.columnName, nsc.tableName, nsc.dataType , nsc.skipped, s.id
	
	if (sortColumn == null || sortColumn.equals(""))
		sortColumn = "icdb.dbName";
	else if (sortColumn.equalsIgnoreCase("columnName"))
		sortColumn = "nsc.columnName";
	else if (sortColumn.equalsIgnoreCase("connectionName"))
		sortColumn = "s.name";
	else if (sortColumn.equalsIgnoreCase("skipped"))
		sortColumn = "nsc.skipped";
	else if (sortColumn.equalsIgnoreCase("databaseName"))
		sortColumn = "nsc.dbName";
	else if (sortColumn.equalsIgnoreCase("tableName"))
		sortColumn = "nsc.tableName";
	else if (sortColumn.equalsIgnoreCase("dataType"))
		sortColumn = "nsc.dataType";
	else if (sortColumn.equalsIgnoreCase("connectionId"))
		sortColumn = "s.id";
	else
		sortColumn = "icdb.dbName";
	
	return sortColumn;
	

}
public static String getDiscoverResultsMappedColumn(String sortColumn){
	
	if (sortColumn == null || sortColumn.equals(""))
		sortColumn = "c.expressionGroup";
	else if (sortColumn.equalsIgnoreCase("expressionGroup"))
		sortColumn = "c.expressionGroup";
	else if (sortColumn.equalsIgnoreCase("expressionName"))
		sortColumn = "a.label";
	else if (sortColumn.equalsIgnoreCase("columnName"))
		sortColumn = "c.columnName";
	else if (sortColumn.equalsIgnoreCase("hostName"))
		sortColumn = "b.hostName";
	else if (sortColumn.equalsIgnoreCase("databaseName"))
		sortColumn = "c.schemaName";
	else if (sortColumn.equalsIgnoreCase("tableName"))
		sortColumn = "c.objectName";
	else if (sortColumn.equalsIgnoreCase("dataType"))
		sortColumn = "c.dataType";
	else if (sortColumn.equalsIgnoreCase("DBUser"))
		sortColumn = "b.userId";
	else if (sortColumn.equalsIgnoreCase("probability"))
		sortColumn = "c.percentageProbability";
	else if (sortColumn.equalsIgnoreCase("hitCount"))
		sortColumn = "c.hitCount";
	else if (sortColumn.equalsIgnoreCase("nullCount"))
		sortColumn = "c.nullCount";
	else if (sortColumn.equalsIgnoreCase("mismatchCount"))
		sortColumn = "c.mismatchCount";
	else if (sortColumn.equalsIgnoreCase("quickSearch"))
		sortColumn = "c.FQuickSearch";
	else if (sortColumn.equalsIgnoreCase("masked"))
		sortColumn ="c.FMasked";
	else if (sortColumn.equalsIgnoreCase("safe"))
		sortColumn ="c.safe";
	else if (sortColumn.equalsIgnoreCase("objectType"))
		sortColumn ="c.objectType";
	else if (sortColumn.equalsIgnoreCase("databaseType"))
		sortColumn ="b.dgDbVendors.vendor";
	else if (sortColumn.equalsIgnoreCase("expressionGroupConfidence"))
		sortColumn = "c.expressionGroupConfidence";
	else if (sortColumn.equalsIgnoreCase("constraintType"))
		sortColumn = "c.constraintType";
	else if (sortColumn.equalsIgnoreCase("referringTo"))
		sortColumn = "c.referringTo";
	else
		sortColumn = "c.expressionGroup";
	
	return sortColumn;
	
}

public static String getDiscoverResultsMappedColumnNativeSQL(String sortColumn){
	
	if (sortColumn == null || sortColumn.equals(""))
		sortColumn = "c.expression_group";
	else if (sortColumn.equalsIgnoreCase("expressionGroup"))
		sortColumn = "c.expression_group";
	else if (sortColumn.equalsIgnoreCase("expressionName"))
		sortColumn = "a.label";
	else if (sortColumn.equalsIgnoreCase("columnName"))
		sortColumn = "c.column_name";
	else if (sortColumn.equalsIgnoreCase("hostName"))
		sortColumn = "b.host_name";
	else if (sortColumn.equalsIgnoreCase("databaseName"))
		sortColumn = "c.schema_name";
	else if (sortColumn.equalsIgnoreCase("tableName"))
		sortColumn = "c.object_name";
	else if (sortColumn.equalsIgnoreCase("dataType"))
		sortColumn = "c.data_type";
	else if (sortColumn.equalsIgnoreCase("DBUser"))
		sortColumn = "b.user_id";
	else if (sortColumn.equalsIgnoreCase("probability"))
		sortColumn = "c.percentage_probability";
	else if (sortColumn.equalsIgnoreCase("hitCount"))
		sortColumn = "c.hit_count";
	else if (sortColumn.equalsIgnoreCase("nullCount"))
		sortColumn = "c.null_count";
	else if (sortColumn.equalsIgnoreCase("mismatchCount"))
		sortColumn = "c.mismatch_count";
	else if (sortColumn.equalsIgnoreCase("quickSearch"))
		sortColumn = "c.f_quick_search";
	else if (sortColumn.equalsIgnoreCase("masked"))
		sortColumn ="c.f_masked";
	else if (sortColumn.equalsIgnoreCase("safe"))
		sortColumn ="c.safe";
	else if (sortColumn.equalsIgnoreCase("objectType"))
		sortColumn ="c.object_type";
	else if (sortColumn.equalsIgnoreCase("databaseType"))
		sortColumn ="f.vendor";
	else if (sortColumn.equalsIgnoreCase("expressionGroupConfidence"))
		sortColumn = "c.expression_group_confidence";
	else if (sortColumn.equalsIgnoreCase("constraintType"))
		sortColumn = "c.constraint_type";
	else if (sortColumn.equalsIgnoreCase("referringTo"))
		sortColumn = "c.referring_to";
	else
		sortColumn = "c.expression_group";
	
	return sortColumn;
	
}

public static String getMaskerTasksLists(String sortColumn){
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="dms.maskingSetId";
	else if(sortColumn.equalsIgnoreCase("taskID"))
		sortColumn="dms.maskingSetId";
	else if(sortColumn.equalsIgnoreCase("taskName"))
		sortColumn="dms.name";
	else if(sortColumn.equalsIgnoreCase("taskType"))
		sortColumn="dms.taskType";
	else if(sortColumn.equalsIgnoreCase("taskDescription"))
		sortColumn="dms.description";		
	else if(sortColumn.equalsIgnoreCase("lastUpdatedTime"))
		sortColumn="dms.createts";	
	else
		sortColumn="dms.maskingSetId";
	return sortColumn;
	
}

public static String getFindItTasksListMappedColumn(String sortColumn){
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="s.id";
	else if(sortColumn.equalsIgnoreCase("taskID"))
		sortColumn="s.id";
	else if(sortColumn.equalsIgnoreCase("taskName"))
		sortColumn="s.name";
	else if(sortColumn.equalsIgnoreCase("taskDescription"))
		sortColumn="s.description";			
	else
		sortColumn="s.id";
	
	return sortColumn;
}
	
public static String getHadoopTasksListMappedColumn (String sortColumn){
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="id";
	else if(sortColumn.equalsIgnoreCase("taskID"))
		sortColumn="id";
	else if(sortColumn.equalsIgnoreCase("taskName"))
		sortColumn="taskName";
	else if(sortColumn.equalsIgnoreCase("taskDescription"))
		sortColumn="description";
	else if(sortColumn.equalsIgnoreCase("createdOn"))
		sortColumn="createts";	
	else if(sortColumn.equalsIgnoreCase("taskType"))
		sortColumn="taskType";	
	
	else
		sortColumn="id";
	
	return sortColumn;
}


public static String getDiscoverTasksListMappedColumn (String sortColumn){
		
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="d.discoverSetId";
	else if(sortColumn.equalsIgnoreCase("taskID"))
		sortColumn="d.discoverSetId";
	else if(sortColumn.equalsIgnoreCase("taskName"))
		sortColumn="d.name";
	else if(sortColumn.equalsIgnoreCase("lastUpdatedTime"))
		sortColumn="d.updatets";				
	else
		sortColumn="d.discoverSetId";
	
	return sortColumn;
	
}

public static String getFileResultsInstancesMappedColumn(String sortColumn){
	 if(sortColumn==null || sortColumn.equals(""))
	  sortColumn="d.dgTaskInstances.id";
	 else if(sortColumn.equalsIgnoreCase("taskInstanceID"))
	  sortColumn="d.dgTaskInstances.id";
	 else if(sortColumn.equalsIgnoreCase("taskName"))
	  sortColumn="d.taskName";
	 else if(sortColumn.equalsIgnoreCase("status"))
	  sortColumn="d.dgTaskInstances.status";
	 else if(sortColumn.equalsIgnoreCase("startTime"))
	  sortColumn="d.dgTaskInstances.timeStart";    
	 else if(sortColumn.equalsIgnoreCase("endTime"))
	  sortColumn="d.dgTaskInstances.timeEnd"; 
	 else
	  sortColumn="d.dgTaskInstances.id";

	 return sortColumn;

	}

public static String getFilesTasksListMappedColumn(String sortColumn){
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="id";
	else if(sortColumn.equalsIgnoreCase("taskID"))
		sortColumn="id";
	else if(sortColumn.equalsIgnoreCase("taskName"))
		sortColumn="taskName";
	else if(sortColumn.equalsIgnoreCase("taskDescription"))
		sortColumn="description";
	else if(sortColumn.equalsIgnoreCase("createdOn"))
		sortColumn="createts";				
	else if(sortColumn.equalsIgnoreCase("lastExecutedOn"))
		sortColumn="updatets";
	else if(sortColumn.equalsIgnoreCase("createdBy"))
		sortColumn="createdBy";
	else
		sortColumn="id";
	return sortColumn;
}

public static String getFindItDetialResultsMappedColumn(String column){
	if(column==null || column.equals(""))
		column="r.databaseType";
	else if(column.equalsIgnoreCase("databaseType"))
		column="r.databaseType";
	else if(column.equalsIgnoreCase("ipAddress"))
		column="r.ipAddress";
	else if(column.equalsIgnoreCase("hostName"))
		column="r.hostName";
	else if(column.equalsIgnoreCase("portNumber")){
		column="r.portNumber";
	}else{
		column="r.databaseType";
	}
	return column;
}

public static String getFilesDetialGroupResultsMappedColumn(String sortColumn){
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="s.fileName";
	else if(sortColumn.equalsIgnoreCase("scanTimestamp"))
		sortColumn="s.timeScan";
	else if(sortColumn.equalsIgnoreCase("ipHostname"))
		sortColumn="s.ipHostName";
	else if(sortColumn.equalsIgnoreCase("location"))
		sortColumn = "s.dirPath";
	else if(sortColumn.equalsIgnoreCase("filename"))
		sortColumn="s.fileName";				
	else if(sortColumn.equalsIgnoreCase("sensitiveType"))
		sortColumn="r.label";	
	else if(sortColumn.equalsIgnoreCase("noOfHits"))
		//sortColumn="s.hitCount";
		sortColumn = "having sum(s.hitCount)";
	else if(sortColumn.equalsIgnoreCase("sensitiveGroup"))
		sortColumn="r.dgRegexGroups.regexGroup";
	else
		sortColumn="s.fileName";
	
	return sortColumn;	
}

public static String getFilesDetialResultsMappedColumn(String sortColumn){
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn="s.fileName";
	else if(sortColumn.equalsIgnoreCase("scanTimestamp"))
		sortColumn="s.timeScan";
	else if(sortColumn.equalsIgnoreCase("ipHostname"))
		sortColumn="s.ipHostName";
	else if(sortColumn.equalsIgnoreCase("location"))
		sortColumn = "s.dirPath";
	else if(sortColumn.equalsIgnoreCase("filename"))
		sortColumn="s.fileName";				
	else if(sortColumn.equalsIgnoreCase("sensitiveType"))
		sortColumn="r.label";	
	else if(sortColumn.equalsIgnoreCase("noOfHits"))
		sortColumn="s.hitCount";
	else
		sortColumn="s.fileName";
	
	return sortColumn;	
}

public static String getHDFSDetailedResultsMappedColumn(String column){
	
	if(column==null || column.equals(""))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskInstanceId"))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskName"))
		column=" t.taskName";
    else if(column.equalsIgnoreCase("regexGroup"))
    	column="p.dgRegexGroups.regexGroup";
	else if(column.equalsIgnoreCase("filePath"))
		column="s.dgHadoopFileInfoSummary.dgHadoopDirSummary.dirPath";
	else if(column.equalsIgnoreCase("regexCount"))
		//column="having sum(s.regexcount)";
		column="s.regexcount";
	else if(column.equalsIgnoreCase("encryption"))
		column="r.encryptionDone";					
	else if(column.equalsIgnoreCase("incremental"))
		column="r.incrementalDone";						
	else if(column.equalsIgnoreCase("masking"))
		column="r.maskingDone";															
	else if(column.equalsIgnoreCase("startTime"))
		column="r.startTime";	
	else if(column.equalsIgnoreCase("contentRead"))
		column = "s.dgHadoopFileInfoSummary.contentRead";
	
	
	return column;
}

public static String getHDFSDetailedResultsMappedColumnNativeSQL(String column,String type){
	if(column==null || column.equals(""))
		column="hr.task_instance_id";
	else if(column.equalsIgnoreCase("taskInstanceId"))
		column="hr.task_instance_id";
	else if(column.equalsIgnoreCase("taskName"))
		column="hfs.task_name";
    else if(column.equalsIgnoreCase("regexGroup"))
    	column="rg.regex_group";
	else if(column.equalsIgnoreCase("filePath"))
		column= type.equalsIgnoreCase("S3")?"hds.bucket_path":"hds.dir_path";
	else if(column.equalsIgnoreCase("regexCount"))
		column="hrd.regexcount";
	else if(column.equalsIgnoreCase("encryption"))
		column="hr.encryption_done";					
	else if(column.equalsIgnoreCase("incremental"))
		column="hr.incremental_done";						
	else if(column.equalsIgnoreCase("masking"))
		column="hr.masking_done";															
	else if(column.equalsIgnoreCase("startTime"))
		column="hr.start_time";
	else if(column.equalsIgnoreCase("fileType"))
		column = "hfis.file_type";
	
	else if(column.equalsIgnoreCase("discoverType"))
		column = "hfis.discover_type";
	else if(column.equalsIgnoreCase("contentRead"))
		column = "hfis.content_read";	
	
	return column;
}

public static String getHDFSDateRangeDetailedResultsMappedColumn(String column){
	if(column==null || column.equals(""))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskInstanceId"))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskName"))
		column="t.taskName";
	else if(column.equalsIgnoreCase("filePath"))
		column = "concat(concat(s.dgHadoopFileInfoSummary.dgHadoopDirSummary.dirPath,'/'), s.dgHadoopFileInfoSummary.fileName)";
	else if(column.equalsIgnoreCase("regexGroup"))
		column="p.dgRegexGroups.regexGroup";
	else if(column.equalsIgnoreCase("regexCount"))
		//column="having sum(s.regexcount)";
		column="s.regexcount";
	else if(column.equalsIgnoreCase("masking"))
		column="r.maskingdone";
	else if(column.equalsIgnoreCase("incremental"))
		column="r.incrementaldone";
	else if(column.equalsIgnoreCase("discoverType"))
		column = "s.dgHadoopFileInfoSummary.discoverType";
	else if(column.equalsIgnoreCase("fileType"))
		column = "s.dgHadoopFileInfoSummary.fileType";
	else if(column.equalsIgnoreCase("contentRead"))
		column = "s.dgHadoopFileInfoSummary.contentRead";
	else
		column="r.dgTaskInstances.taskInstanceId";
	
	return column;
}

public static String replaceAndwithWhere (String sqlQuery, String filterQuery){
	
	if(sqlQuery.indexOf("where") ==  -1 && !filterQuery.equals("")){
		filterQuery = filterQuery.replace("and", "where");
	}
	sqlQuery = sqlQuery + filterQuery;
	return sqlQuery;
}
public static String getDiffDiscoverResultsMappedColumn(String columnName) {
	String mappedColumnName = "";
	if (columnName == null || columnName.equals(""))
		mappedColumnName = "d.label";
	else if (columnName.equalsIgnoreCase("columnName"))
		mappedColumnName = "b.column_name";
	else if (columnName.equalsIgnoreCase("dataType"))
		mappedColumnName = "b.data_type";
	else if (columnName.equalsIgnoreCase("expressionName"))
		mappedColumnName = "d.label";
	else if (columnName.equalsIgnoreCase("tableName"))
		mappedColumnName = "b.object_name";
	else if (columnName.equalsIgnoreCase("databaseName"))
		mappedColumnName = "b.schema_name";
	else if (columnName.equalsIgnoreCase("expressionGroup"))
		mappedColumnName = "dgregexgro3_.regex_group";
	else if (columnName.equalsIgnoreCase("taskInstanceID"))
		mappedColumnName = "b.task_instance_id";
	return mappedColumnName;
}	
public static String getScoopResultsMappedColumn(String columnName){
	
	String mappedColumnName = "";
	if (columnName == null || columnName.equals(""))
		mappedColumnName = "s.id";
	else if (columnName.equalsIgnoreCase("taskID"))
		mappedColumnName = "s.id";
	else if (columnName.equalsIgnoreCase("taskName"))
		mappedColumnName = "s.name";
	else 
		mappedColumnName = "s.id";
		
	return mappedColumnName;
}

public static String getS3DateRangeDetailedResultsMappedColumn(String column){
	if(column==null || column.equals(""))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskInstanceId"))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskName"))
		column="t.taskName";
	else if(column.equalsIgnoreCase("filePath"))
		column = "concat(concat(s.dgS3FileInfoSummary.dgS3BucketSummary.fullPath,'/'), s.dgS3FileInfoSummary.fileName)";
	else if(column.equalsIgnoreCase("regexGroup"))
		column="p.dgRegexGroups.regexGroup";
	else if(column.equalsIgnoreCase("regexCount"))
		//column="having sum(s.regexcount)";
		column="s.regexcount";
	else if(column.equalsIgnoreCase("masking"))
		column="r.maskingdone";
	else if(column.equalsIgnoreCase("incremental"))
		column="r.incrementaldone";
	else if(column.equalsIgnoreCase("discoverType"))
		column = "s.dgS3FileInfoSummary.discoverType";
	else if(column.equalsIgnoreCase("fileType"))
		column = "s.dgS3FileInfoSummary.fileType";
	else if(column.equalsIgnoreCase("contentRead"))
		column = "s.dgS3FileInfoSummary.contentRead";
	else
		column="r.dgTaskInstances.taskInstanceId";
	
	return column;
}


public static String getS3DetailedResultsMappedColumn(String column){
	
	if(column==null || column.equals(""))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskInstanceId"))
		column="r.dgTaskInstances.taskInstanceId";
	else if(column.equalsIgnoreCase("taskName"))
		column=" t.taskName";
    else if(column.equalsIgnoreCase("regexGroup"))
    	column="p.dgRegexGroups.regexGroup";
	else if(column.equalsIgnoreCase("filePath"))
		column="s.dgS3FileInfoSummary.dgS3BucketSummary.fullPath";
	else if(column.equalsIgnoreCase("regexCount"))
		//column="having sum(s.regexcount)";
		column="s.regexcount";
	else if(column.equalsIgnoreCase("encryption"))
		column="r.encryptionDone";					
	else if(column.equalsIgnoreCase("incremental"))
		column="r.incrementalDone";						
	else if(column.equalsIgnoreCase("masking"))
		column="r.maskingDone";															
	else if(column.equalsIgnoreCase("startTime"))
		column="r.startTime";	
	else if(column.equalsIgnoreCase("contentRead"))
		column = "s.dgS3FileInfoSummary.contentRead";
	
	
	return column;
}

public static String getHDFSFieldResultsMappedColumn(String column){
	if(column==null || column.equals(""))
		column="flr.dgHadoopFileInfoSummary.fileName";
	else if(column.equalsIgnoreCase("fileName"))
		column="flr.dgHadoopFileInfoSummary.fileName";
	else if(column.equalsIgnoreCase("Field"))
		column="flr.field";
	else if(column.equalsIgnoreCase("matchCount"))
		column = "flr.matchCount";
	else if(column.equalsIgnoreCase("totalCount"))
		column="flr.totalCount";
	else if(column.equalsIgnoreCase("sensitiveType"))
		column="flr.sensitiveType";
	else if(column.equalsIgnoreCase("sampleMode"))
		column="flr.sampleMode";
	else
		column="flr.dgHadoopFileInfoSummary.fileName";
	
	return column;
}

public static String getDiscoverStatisticsMappedColumn(String sortColumn) {
	if(sortColumn==null || sortColumn.equals(""))
		sortColumn=" r.hostName ";
	else if(sortColumn.equalsIgnoreCase("databaseName")){
		sortColumn=" r.databaseName ";
	}else if(sortColumn.equalsIgnoreCase("hostName")){
		sortColumn=" r.hostName ";
	}else if(sortColumn.equalsIgnoreCase("tableName")){
		sortColumn=" r.tableName ";
	}else if(sortColumn.equalsIgnoreCase("rowsScanned")){
		sortColumn=" r.rowsScanned ";
	}else if(sortColumn.equalsIgnoreCase("totalRows")){
		sortColumn=" r.totalRows ";
	}else if(sortColumn.equalsIgnoreCase("extrapolateddata")){
		sortColumn=" r.extrapolatedData ";
	}if(sortColumn.equalsIgnoreCase("sampleData")){
		sortColumn=" r.sampledData ";
	}
	return sortColumn;
}

}
