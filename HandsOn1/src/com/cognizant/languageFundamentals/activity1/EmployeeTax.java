/**
 * 
 */
package com.cognizant.languageFundamentals.activity1;

/**
 * @author 389733
 *
 */
class EmployeeTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator t=new TaxCalculator();
		t.setBasicSalary(125000);
		t.setCitizenship(true);
		t.calculateTax();
		t.deductTax();
		t.validateSalary();	
	}

}
