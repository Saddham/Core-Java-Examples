/**
 * 
 */
package com.cognizant.languageFundamentals.activity1;

/**
 * @author 389733
 *
 */
public class TaxCalculator {
	boolean citizenship;
	float basicSalary;
	int nettSalary;
	float tax; 
	
	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(boolean citizenship) {
		this.citizenship = citizenship;
	}
	/**
	 * @return the basicSalary
	 */
	public float getBasicSalary() {
		return basicSalary;
	}
	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public void calculateTax(){
		tax=(30*basicSalary)/100;
		System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax);
		
	}
	public void deductTax(){
		
		nettSalary=(int)(basicSalary-tax);
		System.out.println("The nett salary of the employee is "+nettSalary);
		
	}

	public void validateSalary(){
		
		boolean flag=false;
		if(basicSalary > 100000 && citizenship==true)
			flag=true;
		else
		    flag=false;	
		System.out.println("The salary and citizenship eligibility is "+flag);	
	}
	
	
}
