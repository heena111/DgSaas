package com.dataguise.webservices.structures;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DgExpression {

	
	public DgExpression() {
		
		// TODO Auto-generated constructor stub
	}

	protected String columnDataRegex;
	
	protected String columnNameRegex;
	
	protected String expressionDescription;
	
	protected String expressionGroup;
	protected Integer expressionID;

	protected String expressionName;
	
	protected Short isNumeric;
	protected Integer peckingOrder;
	protected Integer groupPeckingOrder;
	protected String referenceDataPath;
	protected String exclusionDataPath;
	private String columnNameWhiteListPath;
	private String columnNameBlackListPath;
	
	public Short getIsNumeric() {
		return isNumeric;
	}

	public void setIsNumeric(Short isNumeric) {
		this.isNumeric = isNumeric;
	}

	public String getColumnDataRegex() {
		return columnDataRegex;
	}

	public void setColumnDataRegex(String columnDataRegex) {
		this.columnDataRegex = columnDataRegex;
	}

	public String getColumnNameRegex() {
		return columnNameRegex;
	}

	public void setColumnNameRegex(String columnNameRegex) {
		this.columnNameRegex = columnNameRegex;
	}

	public String getExpressionDescription() {
		return expressionDescription;
	}

	public void setExpressionDescription(String expressionDescription) {
		this.expressionDescription = expressionDescription;
	}

	public String getExpressionGroup() {
		return expressionGroup;
	}

	public void setExpressionGroup(String expressionGroup) {
		this.expressionGroup = expressionGroup;
	}

	public Integer getExpressionID() {
		return expressionID;
	}

	public void setExpressionID(Integer expressionID) {
		this.expressionID = expressionID;
	}

	public String getExpressionName() {
		return expressionName;
	}

	public void setExpressionName(String expressionName) {
		this.expressionName = expressionName;
	}

	public String getExpressionType() {
		return expressionType;
	}

	public void setExpressionType(String expressionType) {
		this.expressionType = expressionType;
	}

	protected String expressionType;
	
	/**
	 * @return the peckingOrder
	 */
	public Integer getPeckingOrder() {
		return peckingOrder;
	}

	/**
	 * @param peckingOrder the peckingOrder to set
	 */
	public void setPeckingOrder(Integer peckingOrder) {
		this.peckingOrder = peckingOrder;
	}

	/**
	 * @return the groupPeckingOrder
	 */
	public Integer getGroupPeckingOrder() {
		return groupPeckingOrder;
	}

	/**
	 * @param groupPeckingOrder the groupPeckingOrder to set
	 */
	public void setGroupPeckingOrder(Integer groupPeckingOrder) {
		this.groupPeckingOrder = groupPeckingOrder;
	}
	
	public String getReferenceDataPath() {
		return referenceDataPath;
	}

	public void setReferenceDataPath(String referenceDataPath) {
		this.referenceDataPath = referenceDataPath;
	}

	public String getExclusionDataPath() {
		return exclusionDataPath;
	}

	public void setExclusionDataPath(String exclusionDataPath) {
		this.exclusionDataPath = exclusionDataPath;
	}
	
	
	public String getColumnNameWhiteListPath() {
		return columnNameWhiteListPath;
	}

	public void setColumnNameWhiteListPath(String columnWhitelistDataPath) {
		this.columnNameWhiteListPath = columnWhitelistDataPath;
	}

	public String getColumnNameBlackListPath() {
		return columnNameBlackListPath;
	}

	public void setColumnNameBlackListPath(String columnBlacklistDataPath) {
		this.columnNameBlackListPath = columnBlacklistDataPath;
	}


	
	public static Comparator<DgExpression> PeckingOrderComparator = new Comparator<DgExpression>(){
		@Override
		public int compare(DgExpression pattern1, DgExpression pattern2){
			return (pattern2.getGroupPeckingOrder() == pattern1.getGroupPeckingOrder()
					? pattern2.getPeckingOrder().compareTo(pattern1.getPeckingOrder())
							: pattern2.getGroupPeckingOrder().compareTo(pattern1.getGroupPeckingOrder()));
		}
	};
	
	



}
