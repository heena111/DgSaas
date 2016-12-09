package com.dataguise.controller.validator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dataguise.util.DgExceptionUtil;
import com.dataguise.util.ErrorConstants;
import com.dataguise.webservices.beans.DgException;
import com.dataguise.webservices.beans.DgExpressionListBean;
import com.dataguise.webservices.beans.masker.DgMaskerColumn;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DgExpressionValidator extends AbstractValidator{

	@Override
	public void validate(Object obj) throws DgException{
		Gson gson = new Gson(); 
		List<DgExpressionListBean> expressionList  = gson.fromJson((String) obj,  new TypeToken<List<DgExpressionListBean>>(){}.getType());
		
		Map<String, String> errorMap = new HashMap<String, String>();
		if(expressionList!=null) {
			for(DgExpressionListBean dgExpressionListBean : expressionList){

				DgMaskerColumn maskingOption = dgExpressionListBean.getMaskingOption();

				if(dgExpressionListBean.getMaskingPolicy().equalsIgnoreCase("custom transformation")){
					String[] validCustomIds = {"1","2","3"};
					if(Arrays.asList(validCustomIds).indexOf(dgExpressionListBean.getExpressionID().toString()) == -1){
						errorMap.put(dgExpressionListBean.getMaskingPolicy(),"\n Invalid expression selected");
						break; 
					}
				}

				String validationError = MaskingOptionsValidator.validate(maskingOption);

				if(!validationError.equals("")){

					if(dgExpressionListBean.getMaskingPolicy().equalsIgnoreCase("random")){
						errorMap.put(dgExpressionListBean.getMaskingPolicy()+"-"+maskingOption.getParam1(),validationError);
					}else{
						errorMap.put(dgExpressionListBean.getMaskingPolicy(),validationError);
					}
				}
			}
		}
		
		if(errorMap.size() != 0){
			  String errorJson = gson.toJson(errorMap);
			  DgExceptionUtil.throwException(ErrorConstants.VALIDATE_SAVE_MASKER_TASK_ERROR, errorJson);
		  }

	}
	
}
