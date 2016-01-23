/**
 * 
 */
package ex2;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author 389733
 *
 */
public class fileDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("d:/389733/temp");
		final String ext= ".txt";
		
		String [] fileNames= file.list(new FilenameFilter(){
			public boolean accept(File dir, String name){
				return name.endsWith(ext);
			}
		});
		
		for(String fname: fileNames){
			System.out.println(fname);
		}

	}

}
