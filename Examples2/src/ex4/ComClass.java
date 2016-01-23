package ex4;
class BaseClass{
	public BaseClass(){
		System.out.println("In base class constructor...");
	}
}
public class ComClass extends BaseClass{
	{
		System.out.println("This block is created when each time instance is created");
	}	// instance block
	static{
		System.out.println("Static block : Executed only once when class is loaded");
	}
	static void staticFunc()
	{
		System.out.println("Static function");
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
		System.out.println("Entering into main block with Samantha");
		ComClass c=null;
		c.staticFunc();
		System.out.println(ComClass.class);
		ComClass c1 = new ComClass();
	}
}
