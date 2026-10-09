package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {
	// Attributes:
	private Double radius;
	
	
	// Constructor:
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}


	// Getters and Setters:
	public Double getRadius() {
		return radius;
	}



	public void setRadius(Double radius) {
		this.radius = radius;
	}


	// Area method:
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

}
