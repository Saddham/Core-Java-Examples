/**
 * 
 */
package com.cognizant.exceptionhandling;

/**
 * @author 389733
 *
 */
class EmployeeNameInvalidException extends Exception{
String exception;
public EmployeeNameInvalidException(){
	exception="";
}

public EmployeeNameInvalidException(String exception){
	this.exception=exception;
}
public String printException(){
	return(exception);
}
}
