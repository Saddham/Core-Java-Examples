/**
 * 
 */
package ex7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 389733
 *
 */
public class CharDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("D:/389733/Stage2/Java/Ex/Main.java");
		FileReader reader= new FileReader(file);
		char [] buffer= new char[(int)file.length()];;
		reader.read(buffer);
		System.out.println(new String(buffer));

	}

}
