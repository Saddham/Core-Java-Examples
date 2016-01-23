/**
 * 
 */
package ex8;

/**
 * @author 389733
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str1="hello";
       String str2="hello";
       String str3=new String("hello");
       str2=str3;
       System.out.println(str1==str2);
       System.out.println(str1==str3);
	}

}
