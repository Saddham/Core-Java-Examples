/**
 * 
 */
package com.cognizant.exceptionhandling;

/**
 * @author 389733
 *
 */
class CalculatorSimulator {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args){
	  // TODO Auto-generated method stub
      int testCase=1;
	  double taxValue=0;
      
	  testCase= (int) (Math.random()*3)+1;
      TaxCalculator taxcal=new TaxCalculator();
      
      try{
			switch(testCase){
		    
			case 1:
				   //test case 1
			       taxValue=taxcal.calculateTax("Ron", false, 34000.00);
		           break;
			case 2:        
			       //test case 2
			       taxValue=taxcal.calculateTax("Tim", true, 1000.00);
			       break;
			case 3:	       
			       //test case 3
			       taxValue=taxcal.calculateTax("Jack", true, 55000.00);
			       break;
			case 4:      
			       //test case 4
			       taxcal.calculateTax(null, true, 30000.00);
			default:
				   System.out.println("Wrong"+testCase);
			};
		    System.out.println("Tax to be paid by the employee: "+taxValue);	
		}
		catch(CountryNotValidException e){
			System.out.println(e.printException());
		}
		catch(EmployeeNameInvalidException e){
			System.out.println(e.printException());
		}
		catch(TaxNotElligibleException e){
			System.out.println(e.printException());
		}
        finally{   
            System.out.println("do this :P");   
        }  
  }

}
