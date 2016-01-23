/**
 * 
 */
package cts.cal;
import java.util.Scanner;
/**
 * @author 389733
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);
      int x1;
      int x2;
      String op;
      System.out.print("Enter 1st number: ");
      x1= scanner.nextInt();
      System.out.print("Enter 2nd number: ");
      x2= scanner.nextInt();   
      System.out.print("Enter operator: ");
      op= scanner.next();
      
      Calculator calculator = new Calculator();
      calculator.setOperand(x1, x2);
      calculator.dispOperand(op);
	}

}
