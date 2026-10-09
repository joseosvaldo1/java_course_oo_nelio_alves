package entities;


public class Product {

		// Attributes:
		public String name;
		public double price;
		
		
		
		// Constructor:
		public Product(String name, double price) {
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

		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}

		
		// toString()
		@Override
		public String toString() {
			return "Product [name=" 
					+ name 
					+ ", price=" 
					+ price 
					+ ", getName()=" 
					+ getName() 
					+ ", getPrice()="
					+ getPrice() 
					+ ", getClass()=" 
					+ getClass() 
					+ ", hashCode()=" 
					+ hashCode() 
					+ ", toString()="
					+ super.toString() + "]";
		}



	}


