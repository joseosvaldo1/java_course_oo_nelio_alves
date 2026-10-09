package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/*
	 Fazer um programa para ler um vetor de N números inteiros. Em seguida, 
	 mostrar  na tela a média aritmética somente dos números pares lidos, 
	 com uma casa decimal. Se nenhum número par for digitado, mostrar a 
	 mensagem "NENHUM NUMERO PAR"

	Exemplo 1:
	Quantos elementos vai ter o vetor? 6
	Digite um numero: 8
	Digite um numero: 2
	Digite um numero: 11
	Digite um numero: 14
	Digite um numero: 13
	Digite um numero: 20
	MEDIA DOS PARES = 11.0
	Exemplo 2:
	Quantos elementos vai ter o vetor? 3
	Digite um numero: 7
	Digite um numero: 9
	Digite um numero: 11
	NENHUM NUMERO PAR
	 
	 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] v = new int[n];
		int evenSum = 0;
		int evenQuantity = 0;
		float evenAvarage;
		
		// Assigning values to the integer array v:
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite um número: ");
			v[i] = sc.nextInt();
		}
		
		
		// Determining the sum of the even elements of the vector v:
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				evenSum += v[i];
				evenQuantity++;
			}
		}
		
		// Determining the average of the even elements of the vector v:
		if (evenQuantity == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			evenAvarage = evenSum / evenQuantity;
			System.out.printf("MEDIA DOS PARES = %.1f%n", evenAvarage);
		}
		
		sc.close();
		

	}

}
