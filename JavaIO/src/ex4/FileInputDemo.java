package ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
	public static void main(String[] args) {
		File file=new File("d:/389733/temp/date_in_mysql.txt");
		byte buffer[]=new byte[(int)file.length()];
		try {
			FileInputStream fis=new FileInputStream(file);			
			fis.read(buffer);
			System.out.println(new String(buffer));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
