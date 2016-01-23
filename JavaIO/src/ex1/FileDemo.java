/**
 * 
 */
package ex1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 389733
 *
 */
public class FileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("d:/389733/test/file1");
		file.createNewFile();
		File file2= new File("d:/389733/test/file1", "abc.lst");
        file.renameTo(file2);	
        
        Calendar calendar= new GregorianCalendar();
        DateFormat format= new SimpleDateFormat("dd-MM-yyyy");
        File [] files= file.listFiles();
        
        for(File tfile : files){
        	calendar.setTimeInMillis(tfile.lastModified());
            String date= format.format(calendar.getTime());
        	               
        	if(tfile.isDirectory()){
                System.out.println(tfile.getName()+" Directory"+" "+tfile.length()+
        				           " "+tfile.lastModified());
        		}
        		else{
        			System.out.println(tfile.getName()+" - "+" "+tfile.length()+" "+date);
        		}
        	}      
	}

}
