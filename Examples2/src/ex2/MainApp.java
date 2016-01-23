/**
 * 
 */
package ex2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

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
		
		GreatestNum gn = new GreatestNum();		
		gn.setNums(10,56,65);
		output=gn.findGreatest();
        System.out.println("Greatest of given numbers is "+output);
        
        ArrayList<String> list1= new ArrayList<String>();
        ArrayList<String> list2= new ArrayList<String>();
        ArrayList<String> list3= new ArrayList<String>();
        
        list1.add("sia");
        list1.add("mango");
        list1.add("sdfsdf");

        list2.add("mango");
        list2.add("sitafal");
        list2.add("afsdf");
        
        list2.removeAll(list1);
        System.out.println(list2);
        Iterator<String> itr=  list1.iterator();
        while (itr.hasNext()) {
			String string = (String) itr.next();
			if(!(string.endsWith("e") || string.endsWith("a"))){
				list3.add(string);
				System.out.println("heyyy");
			}
		}

        Iterator<String> itr1=  list2.iterator();
        while (itr1.hasNext()) {
			String string1 = (String) itr1.next();
			if(!(string1.startsWith("m") || string1.startsWith("s"))){
				list3.add(string1);
				System.out.println("heyyy");
			}
		}
        
        System.out.println(list3);
        String [] output1= new String[list3.size()];
        list3.toArray(output1);           
        for(String str : output1){
        	System.out.println(str);
        }
        
        String input1= "12:10:10";
        String input2= "13:10:10";
        
        String [] sin1= input1.split(":");
        String [] sin2= input2.split(":");
        
        Calendar cal1= Calendar.getInstance();
        Calendar cal2= Calendar.getInstance();
        
        cal1.add(Calendar.HOUR_OF_DAY, Integer.parseInt(sin1[0]));
        cal1.add(Calendar.HOUR_OF_DAY, Integer.parseInt(sin2[0]));
        cal1.add(Calendar.MINUTE, Integer.parseInt(sin1[1]));
        cal1.add(Calendar.MINUTE, Integer.parseInt(sin2[1]));
        cal1.add(Calendar.SECOND, Integer.parseInt(sin1[2]));
        cal1.add(Calendar.SECOND, Integer.parseInt(sin2[2]));
        
        long seconds= (cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000;
        
        long days= seconds/(60*60*24);
        
        seconds= seconds%(60*60*24);
        
        long hours= seconds/(60*60);
        
        seconds= seconds%(60*60);
        
        long minutes= seconds/60;
        
        seconds= seconds%60;
     
        String str= days+":"+hours+":"+minutes+":"+seconds;
        System.out.println(str);
	}

}
