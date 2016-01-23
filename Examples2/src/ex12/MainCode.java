/**
 * 
 */
package ex12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author training
 *
 */
public class MainCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserMainCode.ValidateAge("23-05-1993");
		System.out.println(UserMainCode.output1);
		
		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("st");
		list1.add("p");
		
		Iterator<String> itr= list1.listIterator();
        
		while (itr.hasNext()) {
			String string = (String) itr.next();		
			if(string.equals("st")){
			itr.remove();
			}
		}
		
		System.out.println(list1);
        
		String str= "saddam";
		
		System.out.println(str.matches("^s.*"));
		
	}

}
