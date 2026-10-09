package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	/*
	 * Fazer um programa para ler um número inteiro N e a altura 
	 * de N pessoas. Armazene as N alturas em um vetor. Em seguida, 
	 * mostrar a altura média dessas pessoas.
	 * 
	 * Example
	Input:			Output:
	3				AVERAGE HEIGHT = 1.69
	1.72
	1.56
	1.80
	 * 
	 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		double[] vect = new double[N];
		
		for(int i=0; i < N; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i < N; i++) {
			sum += vect[i];
		}
		
		double avarage = sum / N;
		
		System.out.printf("AVARAGE HEIGHT= %.2f%n", avarage);
		
		sc.close();

	}

}
