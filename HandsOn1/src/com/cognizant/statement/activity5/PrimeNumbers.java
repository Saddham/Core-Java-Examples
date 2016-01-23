/**
 * 
 */
package com.cognizant.statement.activity5;

/**
 * @author 389733
 *
 */
class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(2);
		for(int i=3, check=0;i<=150;i++){
			 check=0;
			 for(int j=2; j<i; j++)
	         	if(i%j == 0){
	         	  check=1;	
	         	}
			 if(check == 0 )
				System.out.print(","+i);
		 }	
	}

}
