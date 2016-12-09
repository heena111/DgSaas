package com.dataguise.webservices.beans.discover.database;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ResultsParams {
	public Integer taskInstanceId;
	public Integer recordsOffset;
	public Integer recordsCount;
}
