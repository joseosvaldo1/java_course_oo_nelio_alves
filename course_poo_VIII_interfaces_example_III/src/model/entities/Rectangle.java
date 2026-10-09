package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
	// Attributes:
	private Double width;
	private Double height;
	
	
	// Constructor:
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	
	// Getters and Setters:
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}


	// Area method:
	@Override
	public double area() {
		return this.width * this.height;
	}

}
