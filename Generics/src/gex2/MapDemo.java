/**
 * 
 */
package gex2;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author 389733
 *
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> emps= new HashMap<Integer,String>();
		emps.put(1,"Saddam");
		emps.put(2,"Sonam");
		emps.put(3,"Sameer");
		emps.put(4,"Sid");
		emps.put(5,"Saddam");
		emps.put(null, null);
		System.out.println(emps);
		
		String name=emps.get(4);
		System.out.println(name);
		
		Set<Integer> keys= emps.keySet();
		for(Integer key : keys){
			String value=emps.get(key);
			System.out.println(value);
	    }
		
		Set<Entry<Integer, String>> keyvalues=emps.entrySet();
		Iterator<Entry<Integer, String>> iterator=keyvalues.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> obj=iterator.next();
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
		
		
		Map<Integer, String> ex= new Hashtable<Integer, String>();
	//	ex.put(1, null);
		
		Map<Integer, String> ex1= new TreeMap<Integer, String>();
		ex1.put(1, null);
		ex1.put(2, null);
		System.out.println(ex1);
 	}

}
