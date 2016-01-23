/**
 * 
 */
package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 389733
 *
 */
public class FileWriteDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("d:/389733/temp/date_in_mysql.txt");
		String data="This data should be written to file using file output stream,"+" but, I need to convert it in byte form";
		byte buffer[]= data.getBytes();
		try{
			FileOutputStream fos= new FileOutputStream(file,true);
            for(byte b: buffer){
            	fos.write(b);
            }
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
