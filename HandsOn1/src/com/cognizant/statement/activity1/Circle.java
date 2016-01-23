package com.cognizant.statement.activity1;

public class Circle {
	int radius;
	public float calculateArea()
	{
		return (float) (3.14 *radius * radius);	
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
