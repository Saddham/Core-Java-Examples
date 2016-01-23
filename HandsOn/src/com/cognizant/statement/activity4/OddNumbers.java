/**
 * 
 */
package com.cognizant.statement.activity4;

/**
 * @author 389733
 *
 */
class OddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1 ; i<=200 ; i++)
        	if(i%2 != 0)
        		if(i != 199)
        		 System.out.print(i+",");
        		else
        		 System.out.print(i);	
	}

}
