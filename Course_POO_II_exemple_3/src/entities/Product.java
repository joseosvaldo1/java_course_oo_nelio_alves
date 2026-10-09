package entities;

public class Product {
	// Attributes:
	private String name;
	private double price;
	private int quantity;

	// Constructors:
	// Constructor 1: without attributes - default constructor
	public Product() {
	}

	// Constructor 2: with two attributes - name and price:
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// this quantity = 0; // => optional
	}

	// Constructor 3: with all three attributes
	public Product(String name, double price, int quantity) {
		// super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Methods:
	
	// Getters and Setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	// Other methods:
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	
	// toString() method:
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
