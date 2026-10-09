package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	// Attributes / fields:
	private Double radius;
	
	
	// Constructors:
	public Circle() {
		super();
	}

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

	@Override
	public double area() {

		return Math.PI * Math.pow(radius, 2);
	}

}
