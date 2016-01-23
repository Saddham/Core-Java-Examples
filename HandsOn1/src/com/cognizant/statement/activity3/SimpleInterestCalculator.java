/**
 * 
 */
package com.cognizant.statement.activity3;

/**
 * @author 389733
 *
 */
public class SimpleInterestCalculator {
 double principalAmt;
 int numOfYears;

 public void calculateSimpleInterest(){
	
	 double simpleInterest=0;
	 if(principalAmt > 100000){
	   if(numOfYears > 10)
		 simpleInterest=principalAmt * numOfYears * 0.1;
       else if(numOfYears < 10)
		 simpleInterest=principalAmt * numOfYears * 9.5 / 100;
	 } 
	 else if(principalAmt < 100000){
		 if(numOfYears > 10)
			 simpleInterest=principalAmt * numOfYears * 5 / 100;
	     else if(numOfYears < 10)
			 simpleInterest=principalAmt * numOfYears * 4.5 / 100;		 
	 }
		 
	 System.out.println("The interest amount for a principal of "+principalAmt+" and years "+numOfYears+" is "+simpleInterest);
	 
 }
 
public void setPrincipalAmt(double principalAmt) {
	this.principalAmt = principalAmt;
}

public void setNumOfYears(int numOfYears) {
	this.numOfYears = numOfYears;
}

public static void main(String []args){
	 
	 SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();
	 //Test Case: 1
	 simpleInterestCalculator.setPrincipalAmt(200000);
	 simpleInterestCalculator.setNumOfYears(12);
	 simpleInterestCalculator.calculateSimpleInterest();

	 //Test Case: 2
	 simpleInterestCalculator.setPrincipalAmt(50000);
	 simpleInterestCalculator.setNumOfYears(12);
	 simpleInterestCalculator.calculateSimpleInterest();

	 //Test Case: 3
	 simpleInterestCalculator.setPrincipalAmt(50000);
	 simpleInterestCalculator.setNumOfYears(5);
	 simpleInterestCalculator.calculateSimpleInterest();
}
 
}
