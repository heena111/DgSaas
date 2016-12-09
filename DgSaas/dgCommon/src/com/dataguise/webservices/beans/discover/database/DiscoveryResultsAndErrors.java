package com.dataguise.webservices.beans.discover.database;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DiscoveryResultsAndErrors {
	public ArrayList<DiscoveryResults> results;
	public ArrayList<ErrorInfo> errors;
	public ArrayList<ColumnInfo> skippedColumns;
	public ArrayList<TableStatistics> tableStatistics;
	public Integer flag;
}
