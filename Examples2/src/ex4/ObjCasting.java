package ex4;

public class ObjCasting {
	public static void main(String[] args) {
		Integer i = 23;
		
		Object obj = i;
		
		System.out.println(obj);
		System.out.println(i.toString());
		
		Integer i2 = (Integer) obj;
		System.out.println(i2);
	}
}
