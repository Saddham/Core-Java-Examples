/**
 * 
 */
package com.cognizant.inheritance.activity;

/**
 * @author 389733
 *
 */
class inheritanceActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //test case 1
	  Manager manager= new Manager(126534L, "Peter", "Chennai India", 237844L, 65000);
      manager.calculateSalary();
      manager.calculateTransportAllowance();
	 //test case 2
	  Trainee trainee= new Trainee(12946L, "Deepika", "Mumbai India",442085L, 45000);
      trainee.calculateSalary(); 
	  trainee.calculateTransportAllowance();
	}

}
