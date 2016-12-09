/**
 * 
 */
package com.dataguise.discovery;

/**
 * @author dataguise
 *
 */
public interface IValidator {
	boolean isValid(String valueToCheck, Object metaData, Integer colDatatype);
	boolean needColumnNameValidation();
	String getName();
	String getDescription();
}
