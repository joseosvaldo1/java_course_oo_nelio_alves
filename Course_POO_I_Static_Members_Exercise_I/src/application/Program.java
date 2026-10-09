package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
	/*
	Exercício de fixação:
	
	Faça um programa para ler a cotação do dólar, e depois um valor em 
	dólares a ser comprado por uma pessoa em reais. Informar quantos 
	reais a pessoa vai pagar pelos dólares, considerando ainda que a 
	pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma 
	classe CurrencyConverter para ser responsável pelos cálculos.

	Exemplo:
	What is the dollar price? 3.10
	How many dollars will be bought? 200.00
	Amount to be paid in reais = 657.20

	*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
		System.out.printf("Amount do be paid in reais = %.2f%n", result);
		
		
		sc.close();

	}

}
