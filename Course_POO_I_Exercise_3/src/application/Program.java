package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		/*
		 * Exercício_3: Fazer um programa para ler o nome de um aluno e as três notas
		 * que ele obteve nos três primeiros trimestres do ano (primeiro trimestre vale
		 * 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar a nota final do
		 * aluno no ano. Dizer também se o aluno está apriovado (PASS) ou não (FAILED)
		 * e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para
		 * ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
		 * resolver esse problema.
		 * 
		 * Exemplos: Entrada Alex Green FINAL GRADE = 90.00 27.00 PASS 31.00 32.00
		 * 
		 * Alex Green FINAL GRADE 52.00 17.00 FAILED 20.00 MISSING 8.00 POINTS 15.00
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
