package com.dataguise.webservices.beans;

public class CustomTestWrapper {

	private Integer dgConnectionId;
	private DgCustomFunctionsBean dgCustomFunctionBean;

	public Integer getDgConnectionId() {
		return dgConnectionId;
	}

	public void setDgConnectionId(Integer dgConnectionId) {
		this.dgConnectionId = dgConnectionId;
	}

	public DgCustomFunctionsBean getDgCustomFunctionBean() {
		return dgCustomFunctionBean;
	}

	public void setDgCustomFunctionBean(
			DgCustomFunctionsBean dgCustomFunctionBean) {
		this.dgCustomFunctionBean = dgCustomFunctionBean;
	}

	public CustomTestWrapper(Integer dgConnectionId,
			DgCustomFunctionsBean dgCustomFunctionBean) {
		super();
		this.dgConnectionId = dgConnectionId;
		this.dgCustomFunctionBean = dgCustomFunctionBean;
	}

	public CustomTestWrapper() {
		super();
	}

}
