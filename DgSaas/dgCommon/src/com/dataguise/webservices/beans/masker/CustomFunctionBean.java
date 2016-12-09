package com.dataguise.webservices.beans.masker;

import com.dataguise.webservices.beans.DgConnection;
import com.dataguise.webservices.beans.DgCustomFunctionsBean;

public class CustomFunctionBean {

	public DgConnection getConnection() {
		return connection;
	}
	public void setConnection(DgConnection connection) {
		this.connection = connection;
	}
	public DgCustomFunctionsBean getDgcustomFunctions() {
		return dgcustomFunctions;
	}
	public void setDgcustomFunctions(DgCustomFunctionsBean dgcustomFunctions) {
		this.dgcustomFunctions = dgcustomFunctions;
	}
	private DgConnection connection;
	private DgCustomFunctionsBean dgcustomFunctions;
	
	
}
