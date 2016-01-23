/**
 * 
 */
package ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 389733
 *
 */
class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output;
		
		SumPrimes sp = new SumPrimes();
		sp.setNum(10);
		output=sp.calSum();
        System.out.println("Sum of primes up to 10 is "+output);
        
        Integer i= 10;
        long li= 10L;
       
        if(i==li)
        	System.out.println("yes");
        String ex= "sid@gmail.com";
        
        if(ex.matches("\\w{1,8}@\\w{1,8}\\.\\w{1,8}")){
        	System.out.println("PATTERN YES");
        }
        
        ex="Mix Mania ";
        if(ex.matches("^[a-zA-Z0-9]ix.*")){
        	System.out.println("PATTERN YES YES");
        }        
        Pattern pattern= Pattern.compile("^[a-zA-Z0-9]ix");        
        Matcher matcher= pattern.matcher("Mix Mania  ");
        int count=0;
        while (matcher.find()) {       	
        	count++;
        	System.out.println(matcher.start()+" "+matcher.group());
  
		}
        System.out.println(count);
        String s2= "tas";
        String s1= "eat";
        
        boolean flag=true;
        for (int j = 0; j < s2.length(); j++) {
        	Pattern pattern1= Pattern.compile(""+s2.charAt(j));        
            Matcher matcher1= pattern1.matcher(s1);
            if(!matcher1.find())
            	flag=false;            
		}
        
        if(flag)
        	System.out.println("Hurray... Got it!!!");
        
        String fullname= "saddam_pathan";        
        String [] names= fullname.split("_");
        for (String string : names) {
			System.out.println(string);
		}
        
        StringBuffer sb= new StringBuffer("saddam");
        StringBuffer sb1= sb;
        
        sb1.append("sd");
        System.out.println(sb.toString()+" "+sb1.toString());
        
	}

}
