package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
	/*
	 Problema "dados_pessoas"


	Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
	Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a 
	média de altura das mulheres, e o número de homens.
	Exemplo:
	Quantas pessoas serao digitadas? 5
	Altura da 1a pessoa: 1.70
	Genero da 1a pessoa: F
	Altura da 2a pessoa: 1.83
	Genero da 2a pessoa: M
	Altura da 3a pessoa: 1.54
	Genero da 3a pessoa: M
	Altura da 4a pessoa: 1.61
	Genero da 4a pessoa: F
	Altura da 5a pessoa: 1.75
	Genero da 5a pessoa: F
	Menor altura = 1.54
	Maior altura = 1.83
	Media das alturas das mulheres = 1.69
	Numero de homens = 2
	  
	 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Person[] people = new Person[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura " + (i + 1) + "ª pessoa: ");
			double height= sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "ª pessoa: ");
			char gender = sc.next().charAt(0);
			
			people[i] = new Person(height, gender);
		}
		
		System.out.println();
		
		double maxHeight = people[0].getHeight();
		for(int i = 0; i < n; i++) {
			if (people[i].getHeight() > maxHeight){
				maxHeight = people[i].getHeight();
			}
		}
		
		double minHeight = people[0].getHeight();
		for(int i = 0; i < n; i++) {
			if (people[i].getHeight() < minHeight){
				minHeight = people[i].getHeight();
			}
		}
		
		int quantityWoman = 0;
		double sumWomamHeights = 0.0;
		for(int i = 0; i < n; i++) {
			if (people[i].getGender() == 'F' || people[i].getGender() == 'f'){
				quantityWoman += 1;
				sumWomamHeights+= people[i].getHeight();
			}
		}
		
		double avarageWomanHeights = (double) sumWomamHeights / quantityWoman;
		int quantityMan = n - quantityWoman;
		
		
		System.out.printf("Menor altura = %.2f%n", minHeight);
		System.out.printf("Maior altura = %.2f%n", maxHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", avarageWomanHeights);
		System.out.println("Número de homens = " + quantityMan);
		
		sc.close();
		

	}

}
