/**
 * Calulate sum of primes
 */
package ex1;

/**
 * @author 389733
 *
 */
public class SumPrimes {

 int num;
 int sum;
 
 public void setNum(int n){
  num=n;	 	 
 }
 
 public int calSum(){
     	
	 if(num < 0)
		return -1;
	 else if(num > Integer.MAX_VALUE)
		 return -2;
	 else if(num < Integer.MIN_VALUE)
		 return -3;
	 else{
		 int check, sum=2;		 
		 for(int i=3;i<=num;i++){
			 check=0;
			 for(int j=2; j<i; j++)
	         	if(i%j == 0){
	         	  check=1;	
	         	}
			 if(check ==0 )
				 sum+=i;
		 }
		 return sum;
	 }
	 
	 
 }

}
