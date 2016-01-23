package cex3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 */

/**
 * @author 389733
 *
 */
public class CollectionEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numbers=new HashSet<Integer>();
		
		numbers.add(17);
		numbers.add(1);
		numbers.add(7);
		numbers.add(6);
		numbers.add(10);
		numbers.add(5);
		
		System.out.println(numbers);
	    
		numbers.remove(17);
		System.out.println(numbers);
		
		System.out.println(numbers.contains(10));
		
		Iterator<Integer> iterator=numbers.iterator();
		while(iterator.hasNext()){
			Integer integer=iterator.next();
			if(integer==5)
				iterator.remove();
			System.out.print(integer);
		}
	
	
	}

}
