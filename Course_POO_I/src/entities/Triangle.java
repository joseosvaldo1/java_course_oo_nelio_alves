package entities;

public class Triangle {
	
	// Fields / Attributes:
	public double a;
	public double b;
	public double c;
	
	// Methods:
	public double area() {
		double p = (a +  b + c ) / 2.0;
		return Math.sqrt(p*(p - a)*(p - b)*(p - c));
	}
	
}
