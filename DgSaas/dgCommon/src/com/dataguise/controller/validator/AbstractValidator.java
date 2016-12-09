package com.dataguise.controller.validator;

import com.dataguise.webservices.beans.DgException;


public abstract class AbstractValidator {

	public abstract void validate(Object o) throws DgException;
  
}
