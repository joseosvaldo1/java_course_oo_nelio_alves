package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis). 
		 *Exemplo:
		  Quantos alunos serao digitados? 4
		  Digite nome, primeira e segunda nota do 1o aluno:
		  Joao Silva
		  7.0
	      8.5	
		  Digite nome, primeira e segunda nota do 2o aluno:
	      Maria Teixeira
	      9.2
	      6.5
	      Digite nome, primeira e segunda nota do 3o aluno:
	      Carlos Carvalho
	      5.0
	      6.0
	      Digite nome, primeira e segunda nota do 4o aluno:
	      Teresa Pires
	      5.5
	      6.5
	      Alunos aprovados:
	      Joao Silva
	      Maria Teixeira
	      Teresa Pires

		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		Student[] st = new Student[n];

		for (int i = 1; i <= st.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:%n", i);
			// System.out.print("Name: ");
			String name = sc.nextLine();
			// System.out.print("Nota1: ");
			double score1 = sc.nextDouble();
			// System.out.print("Nota2: ");
			double score2 = sc.nextDouble();

			st[i - 1] = new Student(name, score1, score2);

		}
		
		// Determining approved students:
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < st.length; i++) {
			if (st[i].avarage() >= 6.0) {
				System.out.println(st[i].getName());
			}
		}
		
		
		
		sc.close();
	}
	
}
