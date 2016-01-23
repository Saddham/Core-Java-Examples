/**
 * 
 */
package ex8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 389733
 *
 */
public class WriteDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("jdbc.properties");
        FileWriter fileWriter= new FileWriter(file);
        fileWriter.write("driver=oracle.jdbc.OracleDriver");
        fileWriter.write("\n");
        fileWriter.write("url=jdbc:oracle:thin:@localhost:1521:ora");
        fileWriter.flush();
        fileWriter.close();
        }

}
