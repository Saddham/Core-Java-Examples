/**
 * 
 */
package com.cognizant.exceptionhandling;

/**
 * @author 389733
 *
 */
class TaxNotElligibleException extends Exception{
String exception;
public TaxNotElligibleException(){
	exception="";	
}

public TaxNotElligibleException(String exceptin){
	this.exception=exceptin;
	
}
public String printException(){
	return(exception);
}
}
