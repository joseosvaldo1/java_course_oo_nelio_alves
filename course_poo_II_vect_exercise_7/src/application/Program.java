package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler um conjunto de nomes de pessoas e suas 
	respectivas idades. Os nomes devem ser armazenados em um vetor, e 
	as idades em um outro vetor. Depois, mostrar na tela o nome da 
	pessoa mais velha.
	Exemplo:
	Quantas pessoas voce vai digitar? 5
	Dados da 1a pessoa:
	Nome: Joao
	Idade: 16
	Dados da 2a pessoa:
	Nome: Maria
	Idade: 21
	Dados da 3a pessoa:
	Nome: Teresa
	Idade: 15
	Dados da 4a pessoa:
	Nome: Carlos
	Idade: 23
	Dados da 5a pessoa:
	Nome: Paulo
	Idade: 17
	PESSOA MAIS VELHA: Carlos
	 
	 
	*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Person[] people = new Person [n];
		
		for(int i = 1; i <= n; i++ ) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:%n", i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			people[i - 1] = new Person(name, age);	
		}
		
		int maxAge = people[0].getAge();
		String eldestPerson = people[0].getName();
		
		for (int i = 0; i < n; i++) {
			if (people[i].getAge() > maxAge) {
				maxAge = people[i].getAge();
				eldestPerson = people[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + eldestPerson);
		
		
		
		sc.close();

	}

}
