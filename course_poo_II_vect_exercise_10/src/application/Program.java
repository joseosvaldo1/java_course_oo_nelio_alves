package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		/*
		 * fazer um programa para ler nome, udade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar 
		 * tambem a porcentagem de pessoas com menos de 16 anos, bem como os nomes 
		 * dessas pessoas caso existam.
		 * 
		 * Exemplo: 
		 * Quantas pessoas serão digitadas? 5
		 * 
		 * Dados da 1a pessoa: 
		 * Nome: Joao 
		 * Idade: 15 
		 * Altura: 1.82 
		 * Dados da 2a pessoa:
		 * Nome: Maria 
		 * Idade: 16 
		 * Altura: 1.60 
		 * Dados da 3a pessoa: 
		 * Nome: Teresa 
		 * Idade: 14
		 * Altura: 1.58 
		 * Dados da 4a pessoa: 
		 * Nome: Carlos 
		 * Idade: 21 
		 * Altura: 1.65 
		 * Dados da 5a pessoa:
		 * Nome: Paulo 
		 * Idade: 17 
		 * Altura: 1.78
		 * 
		 * Altura média: 1.69 
		 * Pessoas com menos de 16 anos: 40.0% 
		 * Joao 
		 * Teresa

		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Person[] p = new Person[n];

		for (int i = 0; i < p.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + " ª pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();

			p[i] = new Person(name, age, height);
		}

		System.out.println();

		double sumHeights = 0.0;

		for (int i = 0; i < p.length; i++) {
			sumHeights += p[i].getHeight();
		}

		double avarageHeight = (double) sumHeights / p.length;

		System.out.printf("Altura média: %.2f%n", avarageHeight);

		int quantityBellow16 = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i].getAge() < 16) {
				quantityBellow16 += 1;
			}
		}

		double percent = ((double) quantityBellow16 / p.length) * 100;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		for (int i = 0; i < p.length; i++) {
			if (p[i].getAge() < 16) {
				System.out.println(p[i].getName());
			}

			sc.close();

		}

	}
}
