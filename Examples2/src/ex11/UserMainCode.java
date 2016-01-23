/**
 * 
 */
package ex11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author training
 *
 */
public class UserMainCode {

	static boolean output1;
	
	public static void compareDates(String sellingDate, String purchaseDate){
		Date date1= null;
		Date date2= null;		
		DateFormat format= new SimpleDateFormat("MM-dd-yyyy");
		
		try {
			 date1= format.parse(sellingDate);		
		     date2= format.parse(purchaseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   Calendar cal1= Calendar.getInstance();
	   Calendar cal2= Calendar.getInstance();
	   
	   cal1.setTime(date1);
	   cal2.setTime(date2);
	   
	   if((cal1.getTimeInMillis()-cal2.getTimeInMillis()) > 0){
		   output1=true;
	   }
	   else{
		   output1=false;
	   }
	}
}
