/**
 * 
 */
package ex10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author training
 *
 */
public class Experiment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] array1= {1, 3, 4, 5};	
	
	ArrayList<Integer> list1= new ArrayList<Integer>();
    
	for(int i: array1){
		list1.add(i);
	}
	
    int [] array2= new int[list1.size()];
    Iterator<Integer> itr= list1.listIterator();

    int i=0;
    while (itr.hasNext()) {
		Integer integer = (Integer) itr.next();
		array2[i++]=integer;
	}
    
    for (int j : array2) {
		System.out.print(" "+j);
	}
 }    
}    
    
        