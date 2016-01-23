/**
 * 
 */
package com.cognizant.accessandconstructor.shapes;

/**
 * @author 389733
 *
 */
public class Circle {
    private float radius;
    float pi=3.5f;
    
   public Circle(){
    	radius=1.5f;    	
    }
    
     Circle(float radius){
    	this(radius, 3.5f);   	   	
    }
    
    private Circle(float radius, float pi){
    	this.radius=radius;
    	this.pi=pi;   	
    }
    
	float calculateCircleArea(float r){
		return(pi*r*r);
		
	}
	
	float calculateCircumference(float r){
		return(2*pi*r);
	}
	
	public static void main(String []args){
		Circle circle=new Circle();
		System.out.println("Area of the circle is "+circle.calculateCircleArea(10));
		System.out.println("Circumference of the circle is "+circle.calculateCircumference(10));
		
	}

}
