package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		 * Exercício_2: Fazer um programa para ler os dados de um funcionário (nome,
		 * salário bruto e imposto). Em seguida, mostrar os dados do funcionário com
		 * base em uma porcentagem dada (somente o salário bruto é afetado pela
		 * porcentagem) e mostrar novamente os dados do funcionário.
		 * 
		 * # Saída: Name: Joao Silva Gross Salary: 6000.00 Tax: 1000.00
		 * 
		 * 
		 * Employee: Joao, $ 5000.00 Which percentage to increase salary? 10.00 Updated
		 * data: Joao Silva, $ 5600.00
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		
		System.out.println("Updated data: " + emp);
		sc.close();

	}

}
