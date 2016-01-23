/**
 * 
 */
package ex3;

/**
 * @author 389733
 *
 */
public class SumMul {
	int num;
	int size;
	 
	 public void setNums(int n, int sz){
	  num=n;
	  size=sz;
	 }
	 
	 public int calSumMul(){
	   
		 if(size>-1){
			  if(num>-1){
				  int temp=0,sum=0;
				  while(temp<=size){
				   if(temp%num==0)
				    sum=sum+temp;
				   temp++;
				   }
				  return(sum);
			  }
			  else
			  return -1;
			  }
			 else
			   return -2; 
	 }

	}
