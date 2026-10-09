package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		// System.out.println(product.name + ", " + product.price + ", " + "product.quantity");
		
		// Com o método toString() da classe Object:
		// System.out.println(product);  // => entities.Product@799f7e29
		
		// Com o método toString() da classe Product usando somente o atributo name:
		// System.out.println(product);  // => TV
		
		// Com o método toString() da classe Product usando todos os atributos:
		// System.out.println(product);   // => TV, $ 900.00, 10 units, Total: $ 9000.00
		
		// Com o método toString() da classe Product usando todos os atributos:
		System.out.println("Product data: " + product);   // => Product data: TV, $ 900.00, 10 units, Total: $ 9000.00

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		
		System.out.println("Updated data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		
		System.out.println("Updated data: " + product);
		
		sc.close();
		
	}

}
