package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/*
	Faça um programa que leia um número inteiro positivo N (máximo = 10) e 
	depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar 
	na tela todos os números negativos lidos.
	Exemplo:
	Quantos numeros voce vai digitar? 6
	Digite um numero: 8
	Digite um numero: -2
	Digite um numero: 9
	Digite um numero: 10
	Digite um numero: -3
	Digite um numero: -7
	NUMEROS NEGATIVOS:
	-2
	-3
	-7

	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] v = new int[n];
		
		sc.nextLine();
		
		
		// Assigning values to the integer array v:
		for (int i = 0; i < v.length; i++) {
			System.out.print("Digite um número: ");
			v[i] = sc.nextInt();
		}
		
		// Printing the negative values of the integer array v:
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0) {
				System.out.println(v[i]);
			}
		}

		sc.close();

	}

}
