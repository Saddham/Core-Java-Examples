/**
 * 
 */
package ex12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author training
 *
 */
public class UserMainCode {
  static boolean output1;
  static void ValidateAge(String sdate){
	DateFormat format= new SimpleDateFormat("dd-MM-yyyy");
	Date date= null;
	try {
		date= format.parse(sdate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Calendar cal1= new GregorianCalendar();
	Calendar cal2= new GregorianCalendar();
	
	cal1.setTime(date);
	
	long diff= cal2.getTimeInMillis()-cal1.getTimeInMillis();
	long years= diff/((long)1000*60*60*24*365);
	
	System.out.println(years);
	
	if(years > 21)
		output1=true;
	else
		output1=false;
   }
}
