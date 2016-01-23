package com.cognizant.statement.activity2;

public class Shapes {
	
	int numberOfSides;
	int sideLength;
	
	
	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	public void calculateShapeArea()
	{
		switch(numberOfSides){
		case 1:			
			Circle c = new Circle();
			c.setRadius(sideLength);
			System.out.println("The Area of the Circle is "+c.calculateArea());
		    break;
		case 3:		
			Triangle t = new Triangle();
			t.setSides(sideLength);
			System.out.println("The Area of the Triangle is "+t.calculateArea());
		    break;
		case 4:
			Square s = new Square();
			s.setSides(sideLength);
			System.out.println("The Area of the Square is "+s.calculateArea());
		    break;
		default:
			System.out.println("No Shapes Present");
	  };
	}
	
	public static void main(String[] args) {
		
		Shapes sh = new Shapes();
		//TestCase 1
		sh.setNumberOfSides(3);
		sh.setSideLength(12);
		sh.calculateShapeArea();
		
		//TestCase 2
		sh.setNumberOfSides(4);
		sh.setSideLength(15);
		sh.calculateShapeArea();

		//TestCase 3
		sh.setNumberOfSides(5);
		sh.setSideLength(15);
		sh.calculateShapeArea();

		
	}
	
	
}
