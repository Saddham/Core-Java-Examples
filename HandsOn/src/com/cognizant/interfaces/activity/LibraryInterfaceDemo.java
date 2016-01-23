/**
 * 
 */
package com.cognizant.interfaces.activity;

/**
 * @author 389733
 *
 */
class LibraryInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   KidUser kidUser= new KidUser();
       
       //test case 1.1
       kidUser.setAge(10);
       kidUser.registerAccount();
       kidUser.setBookType("Kids");
	   kidUser.requestBook();
	   
	   //test case 1.2
       kidUser.setAge(18);
       kidUser.registerAccount();
       kidUser.setBookType("Fiction");
       kidUser.requestBook();
       
       AdultUser adultUser= new AdultUser();       
       
       //test case 2.1
       adultUser.setAge(5);
       adultUser.registerAccount();
       adultUser.setBookType("Kids");
       adultUser.requestBook();
	
	   //test case 2.2
       adultUser.setAge(23);
       adultUser.registerAccount();
       adultUser.setBookType("Fiction");
	   adultUser.requestBook();
	}

}
