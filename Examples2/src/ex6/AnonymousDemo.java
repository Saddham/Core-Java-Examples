/**
 * 
 */
package ex6;

/**
 * @author 389733
 *
 */

interface IColor{
	void defineColor();
}

public class AnonymousDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IColor mycolor=new IColor(){
			
			@Override
			public void defineColor() {
				//TODO Auto-generated method stub
				System.out.println("My color is silver");
			}			
		}; // definition of anonymous inner class ends
		
		mycolor.defineColor();
	}

}
