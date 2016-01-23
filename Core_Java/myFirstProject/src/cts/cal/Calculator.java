/**
 * Calculator example
 */
package cts.cal;

/**
 * @author 389733
 *
 */
public class Calculator {
	int op1;
	int op2;
	
	public void setOperand(int opr1, int opr2){
		this.op1=opr1;
		this.op2=opr2;	
	}
	
	public void dispOperand(String operator){
		System.out.println("Operand1 = "+op1);
		System.out.println("Operand2 = "+op2);		
		
		int ans= 0;
		if("+".equals(operator)){
			ans=op1+op2;
		}else if("-".equals(operator)){
			ans=op1-op2;
		}else if("/".equals(operator)){
			ans=op1/op2;			
		}else if("*".equals(operator)){
			ans=op1+op2;
		}
		
		System.out.println("Ans: "+ans);
	}
}
