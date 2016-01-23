/**
 * 
 */
package com.cognizant.exceptionhandling;

/**
 * @author 389733
 *
 */
class TaxCalculator{
	double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException,
	                                                                           EmployeeNameInvalidException, 
	                                                                           TaxNotElligibleException{
		
	if(!isIndian)
		throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
	if(empName==null)
		throw new EmployeeNameInvalidException("The employee name cannot be empty");
	if(empSal>100000 && isIndian)
		return(empSal*8/100);
	else if((empSal<100000 && empSal>50000) && isIndian)
		return(empSal*6/100);
	else if((empSal<50000 && empSal>30000) && isIndian)
		return(empSal*5/100);
	else if((empSal<30000 && empSal>10000) && isIndian)
		return(empSal*6/100);
	else 
	 throw new TaxNotElligibleException("The employee does not need to pay tax");
	
	}

}
