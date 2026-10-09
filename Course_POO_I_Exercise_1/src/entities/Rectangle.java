package entities;

public class Rectangle {
	// Attributes:
	public double width;
	public double height;
	
	// Methods
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2.0*(width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public void showArea() {
		System.out.printf("AREA = %.2f\n", area());
	}
	
	public void showPerimeter() {
		System.out.printf("PERIMETER = %.2f\n", perimeter());
	}
	
	public void showDiagonal() {
		System.out.printf("DIAGONAL = %.2f\n", diagonal());
	}
	
}
