package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		List <Person> payers = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Tax payer #"+ i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();

			if (ch == 'i') {

				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				Person payer = new NaturalPerson(name, annualIncome, healthExpenditures);
				payers.add(payer);	
			} else {
	
				System.out.print("Number of Employes: ");
				int numberOfEmployees = sc.nextInt();
				
				Person payer = new LegalPerson(name, annualIncome, numberOfEmployees);
				payers.add(payer);
	
			}
			System.out.println();

		}
		
		
		
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (Person payer: payers) {
			System.out.println(
					payer.getName()
					+ ": $ " 
					+ String.format("%.2f", payer.incomeTax()));
			}
			

		sc.close();

	}

}
