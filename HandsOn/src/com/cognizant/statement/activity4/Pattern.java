/**
 * 
 */
package com.cognizant.statement.activity4;

/**
 * @author 389733
 *
 */
class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1; i<12 ; i++){
    	if(i<7)
    	  for(int j=1; j<=i; j++)
    		  System.out.print(j);
    	else
    	  for(int j=1; j<=(12-i) ; j++)
    		  System.out.print(j);
    	System.out.println();
      }
	}
}
