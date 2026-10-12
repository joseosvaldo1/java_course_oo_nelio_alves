package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {
	public static void main(String[] args) {
	/*
	 Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de 
	 um arquivo em formato .csv.
	 Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior 
	 a um dado valor fornecido pelo usuário.Mostrar também a soma dos salários dos funcionários 
	 cujo nome começa com a letra 'M'.	
	*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// path: /home/jose/eclipse-workspace/course_poo_IX_functional_prog_exercise_II/in.txt
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter a value to filter by salary: ");
		Double valueReference = sc.nextDouble();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> emails = list.stream()
									  .filter(e -> e.getSalary() > valueReference)	
									  .map(e -> e.getEmail())
									  .sorted(comp)
									  .collect(Collectors.toList());
			emails.forEach(System.out::println);
			
			Double sum = list.stream()
							 .filter(e -> e.getName().charAt(0) == 'M')
							 .map(e -> e.getSalary())
							 .reduce(0.0, (x,y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
		
	}
}
