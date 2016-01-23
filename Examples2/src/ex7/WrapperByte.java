/**
 * 
 */
package ex7;

import java.util.Arrays;

/**
 * @author 389733
 *
 */
public class WrapperByte {
	
	public static void main(String []args){Byte b = 23; // new Byte(23);
	Byte b1 = 23;
	
	Byte b2 = new Byte("23");
	System.out.println(b==b2);

	System.out.println(b==b1);
	System.out.println(b.equals(b2));
	
	System.out.println(b.intValue() == b2.intValue());
	
	
	Short i1 = 127;
	Short i2 = 127;
	Short i3 = new Short("127");
	
	System.out.println(i1==i2);	//true	
	System.out.println(i1==i3);	//false
	
	System.out.println(i1.compareTo(i2));	//0
	i1=128;
	i2=120;
	
	System.out.println(i1.compareTo(i2));	//8
	
	
	i1=128;
	i2=128;
	System.out.println(i1==i2);	//false
	
	
	System.out.println(i1.compareTo(i2));	//0
	
	Byte bt1 = 25;
	Byte bt2 = 26;
	Byte bt3 = new Byte("25");
	System.out.println(bt1.hashCode());
	System.out.println(bt2.hashCode());
	System.out.println(bt3.hashCode());	
	System.out.println(Byte.parseByte("10", 10));
	
	int x=23;
	String strnum=Integer.toBinaryString(x);
	int num = Integer.parseInt(strnum);
	System.out.println(strnum);
 
	char ch='9';
	int num1=ch-48;
	System.out.println(num1);
	
	int []a;
	
	a=new int[4];
	int arr[]={23,34,45,11,32,12};
	
	a[0]=23;
	a[1]=34;
	a[3]=55;
	
	for(int ele : a){
		System.out.println(ele+" ");		
	}
	
	Arrays.sort(arr);
	System.out.println("Second highest: "+arr[arr.length-2]);
	
	int arr2[]=new int[arr.length];
	arr2=Arrays.copyOf(arr, arr2.length);
	
	for(int num2: arr2){
		System.out.print(num2+" ");
	}
	System.out.println();
	arr2=Arrays.copyOfRange(arr, 2, 4);
		
	for(int num3: arr2){
		System.out.print(num3+" ");
	}
	
	int [][]arr3= new int[9][20];
 }
}
