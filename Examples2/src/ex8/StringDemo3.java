/**
 * 
 */
package ex8;

/**
 * @author 389733
 *
 */
public class StringDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=3443;
        
        String snum= Integer.toString(x);
        StringBuffer sb=new StringBuffer(snum);
        sb.reverse();
        int y=Integer.parseInt(sb.toString());
        if(x==y)
        	System.out.println("Pallindrome number");
        else
        	System.out.println("Not a pallindrome number");
	}

}
