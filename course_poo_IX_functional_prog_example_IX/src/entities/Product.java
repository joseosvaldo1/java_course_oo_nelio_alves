package entities;

public class Product {
	// Attributes:
		private String name;
		private Double price;
		
		// Constructors:
		public Product() {
			
		}

		public Product(String name, Double price) {
			this.name = name;
			this.price = price;
		}


		// Getters and Setters:
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		
		// Function methods:
		public static String staticUpperCaseName(Product p) {
			return p.getName().toUpperCase();
		}
		
		public String nonStaticUpperCaseName() {
			return this.name.toUpperCase();
		}
		
		
		// toString() method
		@Override
		public String toString() {
			return this.name + ", " + String.format("%.2f", this.price);
		}
}
