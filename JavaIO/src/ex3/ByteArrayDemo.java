/**
 * 
 */
package ex3;

import java.io.ByteArrayInputStream;

/**
 * @author 389733
 *
 */
public class ByteArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data= "hello world";
		byte source[]= data.getBytes();
		ByteArrayInputStream bis= new ByteArrayInputStream(source);
		
		int ch=0;
		while((ch=bis.read()) !=-1){
			System.out.print((char)ch);
		}

	}

}
