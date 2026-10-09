package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/*
	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	- Imprimir todos os elementos do vetor
	- Mostrar na tela a soma e a média dos elementos do vetor
	Exemplo:
	Quantos numeros voce vai digitar? 4
	Digite um numero: 8.0
	igite um numero: 4.0
	Digite um numero: 10.0
	Digite um numero: 14.0
	VALORES = 8.0 10.0 14.0
	SOMA = 36.00
	MEDIA = 9.00
	
 
	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] v = new double[n];
		
		sc.nextLine();
		
		
		// Assigning values to the integer array v:
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite um número: ");
			v[i] = sc.nextDouble();
		}
		
		// Show values: 
		
		System.out.print("VALORES = ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		
		System.out.println();

		// Determining the sum of values:
		double sum = 0.0;
		for (int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		System.out.printf("SOMA =  %.2f%n", sum);
		
		
		// Determining the avarage of values:
		double avarage = sum / v.length;
		
		System.out.printf("MEDIA = %.2f%n", avarage);
		
		
		sc.close();
		
		
		
	}

}
