package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract details:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate dueDate =  LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		Contract obj = new Contract(number, dueDate, totalValue);
		
		System.out.print("Enter the number of installments: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n);

		System.out.println();
		System.out.println("Installments:");
		for(Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}
}
