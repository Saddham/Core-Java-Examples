/**
 * 
 */
package ex13;

import java.util.ArrayList;

public class Q66 {

	public static void main(String[] args) {

		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		ArrayList<Integer> list3= new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8) ;
		
        Integer [] alist= new Integer[list1.size()];
        Integer [] blist= new Integer[list2.size()];
        
        alist=  list1.toArray(alist);
        blist= list2.toArray(blist);
        
        for(int i=0;i<alist.length;i++){
        	if(i%2 == 0){
        		list3.add(blist[i]);
        	}
        	else{
        		list3.add(alist[i]);
        	}
        }
        System.out.println(list3);
	}

}
