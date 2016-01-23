package com.cognizant.statement.activity2;

public class Square {
	int sides;
	public float calculateArea()
	{
		return (float) (sides  * sides);	
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
}
