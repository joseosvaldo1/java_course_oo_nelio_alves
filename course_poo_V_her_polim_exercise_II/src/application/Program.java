package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo 
		 * usuário). Ao final, mostrar a etiqueta de preço de cada produto na 
		 * mesma ordem em que foram digitados.
		 * 
		 * Todo produto possui nome e preço. Produtos importados possuem uma taxa 
		 * de alfândega, e produtos usados possuem data de fabricação. Estes dados 
		 * específicos devem ser acrescentados na etiqueta de preço conforme 
		 * exemplo (próxima página). Para produtos importados, a taxa e alfândega 
		 * deve ser acrescentada ao preço final do produto.
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List <Product> products = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			sc.nextLine();
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (option == 'c') { 
				
				products.add(new Product(name, price));

			} else if (option == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date_str = sc.next();
				LocalDate date = LocalDate.parse(date_str, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				products.add(new UsedProduct(name, price, date));
				
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
