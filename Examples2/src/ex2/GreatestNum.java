/**
 * 
 */
package ex2;

/**
 * @author 389733
 *
 */
public class GreatestNum {
	 int num1, num2, num3;
	 int greatest;
	 
	 public void setNums(int n1, int n2, int n3){
	  num1=n1;
	  num2=n2;
	  num3=n3;
	 }
	 
	 public int findGreatest(){
		
		 if(num1<0 || num2<0 || num3<0)
			 return -1;
		 else if(num1 > Integer.MAX_VALUE || num2 > Integer.MAX_VALUE || num3 > Integer.MAX_VALUE)
		        return -2;
		 else if(num1 < Integer.MIN_VALUE || num2 < Integer.MIN_VALUE || num3 < Integer.MIN_VALUE)
			    return -3;
			 else {
		       if ( num1 > num2 && num1 > num3 )		 
	             return num1;
	           else if ( num2 > num1 && num2 > num3 )
	                  return num2;
	                else   
	                  return num3;
	    }
	   }
	 }
