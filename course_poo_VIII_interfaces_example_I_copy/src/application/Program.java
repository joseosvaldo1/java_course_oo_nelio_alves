package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter the car rental details: ");
		
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		
		System.out.print("Pick up (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
	
		System.out.print("Enter the hourly price: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Enter the price per day: ");
		double pricePerDay = sc.nextDouble();
		
		BrazilTaxService taxService = new BrazilTaxService();
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay,taxService);
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
		System.out.println("Tax: " + cr.getInvoice().getTax());
		System.out.println("Total: " + cr.getInvoice().getTotalPayment());
		
		
		
		
		sc.close();
	}

}
