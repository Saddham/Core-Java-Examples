/**
 * 
 */
package ex3;

import ex2.GreatestNum;

/**
 * @author 389733
 *
 */
class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int output;
		SumMul sm = new SumMul();		
		sm.setNums(3,15);
		output=sm.calSumMul();
        System.out.println("sum of multiples of 3 up to 15 is "+output);
	}

}
