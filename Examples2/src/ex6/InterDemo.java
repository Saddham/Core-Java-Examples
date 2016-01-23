/**
 * 
 */
package ex6;

/**
 * @author 389733
 *
 */

interface IShape{
	double PI=3.14; //public final 
	void area(); // public abstract
}

class Circle implements IShape{
    int radius;
    public Circle(int rad){
    	radius=rad;
    	
    }
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Circle Area = "+(2*PI*radius*radius));
	}
		
}

class Triangle implements IShape{
	int base;
	int height;
	public Triangle(int b, int h){
		base=b;
		height=h;		
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Area = "+(base*height)/2);
		
	}
	
}
public class InterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		IShape circle=new Circle(2);
		circle.area();
		IShape triangle=new Triangle(2, 4);
		triangle.area();
 	}

}
