package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler um número inteiro N e depois um vetor de N números 
	reais. Em seguida, mostrar na tela a média aritmética de todos elementos com 
	três casas decimais. Depois mostrar todos os elementos do vetor que estejam 
	abaixo da média, com uma casa decimal cada.
	Exemplo:
	Quantos elementos vai ter o vetor? 4
	Digite um numero: 10.0
	Digite um numero: 15.5
	Digite um numero: 13.2
	Digite um numero: 9.8
	MEDIA DO VETOR = 12.125
	ELEMENTOS ABAIXO DA MEDIA:
	10.0	
	9.8

	 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		double sum = 0.0;
		
		
		double[] v = new double[n];
		
		// Assigning values to the integer array v:
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite um número: ");
			v[i] = sc.nextDouble();
		}
		
		// Determining the sum of the elements of the vector v:
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		
		// Determining the avarage of the elements of the vector v:
		double avarage = sum / v.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", avarage);
		
		
		// Determining the elements of the vector v below the mean:
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] < avarage) {
				System.out.println(v[i]);
			}
		}
		
		
		sc.close();

	}

}
