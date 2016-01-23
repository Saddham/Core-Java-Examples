/**
 * 
 */
package ex9;

/**
 * @author 389733
 * 
 */
public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("xyz");
		} catch (ClassNotFoundException cne) {
			// System.out.println("good luck");
			cne.printStackTrace();
		}

		String name = null;
		System.out.println(name.length());
		
		
		int num1=0;
		int num2=34;
		int ans=0;
		try{
			ans=num2/num1;
			System.out.println(name.length());
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		catch(RuntimeException e){
			e.printStackTrace();
		}
		
	}

}
