package cex3;
import java.util.*;

/**
 * 
 */

/**
 * @author 389733
 *
 */
public class CollectionEx1 {

	static List<String> getCountries(String... countries){
		
		List<String> lstrings= new ArrayList<String>();
		
		for(String country : countries)
			lstrings.add(country);
		
		return lstrings;
		
	}
	
	static List<Integer> getNumbers(int ...numbers){
		List<Integer> numberList= new ArrayList<Integer>();
		
		for(int number : numbers)
			numberList.add(number);
		
		return numberList;	
				
	}
							
	static List<Integer> addNumbers(List<Integer> numbers, int ...moreNums){
		
		for(int num : moreNums)
			numbers.add(num);
		
		return numbers;
		
	}    
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(CollectionEx1.getCountries("India", "England", "America", "Germany", "Italy"));
        System.out.println(CollectionEx1.addNumbers(CollectionEx1.getNumbers(10,20,80,40), 50,60,70));	
	}

}
