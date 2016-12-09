package com.dataguise.webservices.structures;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DgExpressionWithMasking extends DgExpression {

	
	private MaskingOption maskingOption;



	public DgExpressionWithMasking() {
		
		// TODO Auto-generated constructor stub
	}
	public DgExpressionWithMasking(MaskingOption maskingOptionParam) {
		setMaskingOption(maskingOptionParam);
	}
	/**
	 * @param maskingOption the maskingOption to set
	 */
	public void setMaskingOption(MaskingOption maskingOption) {
		this.maskingOption = maskingOption;
	}
	/**
	 * @return the maskingOption
	 */
	public MaskingOption getMaskingOption() {
		return maskingOption;
	}

}
