package com.dataguise.webservices.structures;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class ArrayOfDgExpressionWithMasking {
	public ArrayOfDgExpressionWithMasking() {
		
		// TODO Auto-generated constructor stub
	}

	private List<DgExpressionWithMasking> dgExpressionWithMaskingList;
	/**
	 * @param dgExpressionWithMaskingList the dgExpressionWithMaskingList to set
	 */
	public void setDgExpressionWithMaskingList(
			List<DgExpressionWithMasking> dgExpressionWithMaskingList) {
		this.dgExpressionWithMaskingList = dgExpressionWithMaskingList;
	}

	/**
	 * @return the dgExpressionWithMaskingList
	 */
	public List<DgExpressionWithMasking> getDgExpressionWithMaskingList() {
		if(dgExpressionWithMaskingList==null)
		{
			dgExpressionWithMaskingList = new ArrayList<DgExpressionWithMasking>();
		}
		
		return dgExpressionWithMaskingList;
	}
	
}
