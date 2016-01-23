package ex4;

public class ComClass {
	{
		System.out.println("this block is craeted when each time instance is created");
	}	// instance block
	static{
		System.out.println("Static block : Executed only once when class is loaded");
	}
	static void staticFunc()
	{
		System.out.println("Static block");
	}
	public ComClass()
	{
		System.out.println("0 arg constructor");
	}
	
	class InnerClass
	{
		//one composite type nested in another composite type
	}
	
	static class Nested
	{
		//same as inner, this makes structure sharable
	}
	
	interface House
	{
		// inner interface
	}
	
	static interface StaticHouse
	{
		// inner interface
	}
	
	public static void main(String[] args) {
		System.out.println("Entring into main block with Samantha");
		ComClass c=null;
		c.staticFunc();
		System.out.println(ComClass.class);
		ComClass c1 = new ComClass();
	}
}
