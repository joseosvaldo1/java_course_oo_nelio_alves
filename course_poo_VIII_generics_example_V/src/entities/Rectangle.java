package entities;

public class Rectangle implements Shape {
	// Attributes:
	private double width;
	private double height;
	
	
	// Constructor:
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// Getters and Setters:
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	// Area method:
	@Override
	public double area() {
		return this.width * this.height;
	}

	


	

}
