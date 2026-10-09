package application;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;

public class Program {

	public static void main(String[] args) {
		/*
		Problema exemplo - Membros Estáticos - 3ª Solução:
		
		Fazer um programa para ler um valor numérico qualquer, e daí mostrar
		quanto seria o valor de uma circunferência e do volume de uma esfera
		para um raio daquele valor. Informar também o valor de PI com duas
		casas decimais.
		Exemplo:
		Enter radius: 3.0
		Circumference: 18.85
		Volume: 113.10
		PI value: 3.14
		 
		 
		 
		*/
			
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
						
			System.out.print("Enter a radius value: ");
			double radius = sc.nextDouble();
			
			double c = Calculator.circumference(radius);
			
			double v = Calculator.volume(radius);
			
			
			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PI value: %.2f", Calculator.PI);

		
			sc.close();


	}

}

