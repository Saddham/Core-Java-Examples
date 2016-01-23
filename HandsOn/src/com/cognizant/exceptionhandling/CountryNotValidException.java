/**
 * 
 */
package com.cognizant.exceptionhandling;

/**
 * @author 389733
 *
 */
class CountryNotValidException extends Exception{
String exception;

public CountryNotValidException() {
	// TODO Auto-generated constructor stub
  exception="";
}

public CountryNotValidException(String exception){
	this.exception=exception;
}
public String printException(){
	return(exception);
}
}
