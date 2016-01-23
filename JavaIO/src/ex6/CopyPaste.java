/**
 * 
 */
package ex6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @author 389733
 *
 */
public class CopyPaste {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int choice=1;		
		System.out.println("Enter what operation you want to perform:1.Move\n2.Copy");
		choice= scanner.nextInt();
		System.out.println("Enter source file path:");
		String source= scanner.next();
		System.out.println("Destination path:");
		String dest= scanner.next();
		File file=new File(source);
	    byte buffer[]=new byte[(int)file.length()];		
	    FileInputStream fis=new FileInputStream(file);			
	    fis.read(buffer);
	    fis.close();
		switch(choice){
		case 1:
		    file.delete();
		    File file1= new File(dest);
		    FileOutputStream fos= new FileOutputStream(file1);
		    fos.write(buffer);
		    fos.close();
		    System.out.println("File successfully moved...");
		    break;
		case 2: 
			File file2= new File(dest);
		    FileOutputStream fos1= new FileOutputStream(file2);
		    fos1.write(buffer);
		    fos1.close();
		    System.out.println("File successfully copied...");
		    break;
        default:
        	System.out.println("Sorry, you entered a wrong choice. Try again...");
		};
	}

}
