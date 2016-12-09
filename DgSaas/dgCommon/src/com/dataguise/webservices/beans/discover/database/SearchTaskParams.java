package com.dataguise.webservices.beans.discover.database;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.dataguise.webservices.beans.DgConnection;
import com.dataguise.webservices.beans.DgDiscoverExpression;
import com.dataguise.webservices.beans.DgDiscoverTaskParameters;

@XmlRootElement
public class SearchTaskParams {
	public DgDiscoverTaskParameters taskParameters;
	public List<DgConnection> taskDatabases;
	public List<DgDiscoverExpression> taskExpressions;
}
