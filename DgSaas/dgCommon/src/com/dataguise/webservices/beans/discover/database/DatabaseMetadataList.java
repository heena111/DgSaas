package com.dataguise.webservices.beans.discover.database;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DatabaseMetadataList {
	public ArrayList<DatabaseMetadata> databaseMetadata;
}
