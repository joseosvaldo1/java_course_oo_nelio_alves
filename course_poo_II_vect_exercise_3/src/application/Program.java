package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/*
	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, 
	mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também 
	a posição do maior elemento, considerando a primeira posição como 0 (zero).
	Exemplo:
	Quantos numeros voce vai digitar? 6
	Digite um numero: 8.0
	Digite um numero: 4.0
	Digite um numero: 10.0
	Digite um numero: 14.0
	Digite um numero: 13.0
	Digite um numero: 7.0
	MAIOR VALOR = 14.0
	POSICAO DO MAIOR VALOR = 3	 
	
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
		
		double maximum = v[0];
		int maximumPosition = 0; 
		
		// Determining the highest value of:
		for (int i = 0; i < v.length; i++) {
			if (v[i] > maximum) {
				maximum = v[i];
				maximumPosition = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maximum);
		System.out.println("POSICAO DO MAIOR VALOR: " + maximumPosition);
		
		
		
		sc.close();

	}

}
