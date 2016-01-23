/**
 * 
 */
package ex2;

import ex1.SumPrimes;

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
		
		GreatestNum gn = new GreatestNum();		
		gn.setNums(10,56,65);
		output=gn.findGreatest();
        System.out.println("Greatest of given numbers is "+output);
	}

}
