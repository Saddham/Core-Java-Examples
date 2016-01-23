/**
 * 
 */
package cex4;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author training
 *
 */
public class SoredSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(54);
        set.add(23);
        set.add(78);
        set.add(56);
        set.add(54);
        set.add(45);
        set.add(36);        
        System.out.println(set);
        
		SortedSet<Integer> sset=set.headSet(36,true);
		
		sset.add(22);
		sset.remove(23);
		sset.remove(11);
		sset.remove(35);		
		System.out.println(sset);

		NavigableSet<Integer> nset=set.headSet(34, true);
		nset.add(22);
		nset.remove(23);
		nset.remove(11);
		nset.remove(12);
		System.out.println(nset);
		
		NavigableSet<Integer> navSet=set.descendingSet();
		System.out.println(navSet);
	}

}
