package entities;

public class Product {
		// Attributes:
		public String name;
		public double price;
		public int quantity;
		
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
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		

		// Methods:
		public double totalValueInStock() {
			return price * quantity;
		}

		public void addProducts(int quantity) {
			this.quantity += quantity;
		}

		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}

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
