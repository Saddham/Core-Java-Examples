/**
 * 
 */
package cex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author 389733
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2.3);
        list.add("hello");
        System.out.println(list);
        
        Set set= new HashSet();
        set.add(1);
        set.add(2.3);
        set.add("hello");
        
        System.out.println("Hey... "+list.containsAll(set));
        
        System.out.println(list.toString());
        
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        
        for(Integer ele: list1){
        	if(ele==2)
        		list.remove(ele);
        	System.out.println(ele);
        }
        
        ListIterator<Integer> iterator= list1.listIterator();
        while(iterator.hasNext()){
        	Integer ele1 = iterator.next();
        	if(ele1==2)
        	  iterator.remove();        	
        }
        
        for(Integer ele: list1){
        	System.out.println(ele);
        }
	
	    
	}

}
