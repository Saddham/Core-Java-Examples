/**
 * 
 */
package ex1;

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
		
		SumPrimes sp = new SumPrimes();
		sp.setNum(10);
		output=sp.calSum();
        System.out.println("Sum of primes up to 10 is "+output);
	}

}
