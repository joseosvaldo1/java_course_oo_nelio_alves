package entities;

public class Circle implements Shape {
	// Attributes:
	private double radius;
	
	// Constructor:
	public Circle(double radius) {
		super();
		this.radius = radius;	
	}
	
	// Getters and Setters:
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Area method:
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	

}
