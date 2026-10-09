package course_poo_II_list_exerciseapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	/*
	Fazer um programa para ler um número inteiro N e depois os dados (id, 
	nome e salario) de N funcionários. Não deve haver repetição de id.
	
	Em seguida, efetuar o aumento de X por cento no salário de um determinado 
	funcionário. Para isso, o programa deve ler um id e o valor X. Se o id 
	informado não existir, mostrar uma mensagem e abortar a operação. Ao final, 
	mostrar a listagem atualizada dos funcionários, conforme exemplos.
	
	Lembre-se de aplicar a técnica de encapsulamento para não permitir que o 
	salário possa ser mudado livremente. Um salário só pode ser aumentado com 
	base em uma operação de aumento por porcentagem dada.
	
	Exemplo_1:
	How many employees will be registered? 3
	Emplyoee #1:
	Id: 333
	Name: Maria Brown
	Salary: 4000.00
	
	Emplyoee #2:
	Id: 536
	Name: Alex Grey
	Salary: 3000.00
	
	Emplyoee #3:
	Id: 772
	Name: Bob Green
	Salary: 5000.00
	
	Enter the employee id that will have salary increase : 536
	Enter the percentage: 10.0
	
	List of employees:
	333, Maria Brown, 4000.00
	536, Alex Grey, 3300.00
	772, Bob Green, 5000.00
	
	Exemplo_2:
	How many employees will be registered? 2
	Emplyoee #1:
	Id: 333
	Name: Maria Brown
	Salary: 4000.00
	Emplyoee #2:
	Id: 536
	Name: Alex Grey
	Salary: 3000.00
	
	Enter the employee id that will have salary increase: 776
	This id does not exist!
	
	List of employees:
	333, Maria Brown, 4000.00
	536, Alex Grey, 3000.00

	*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		// OR List<Employee> list = new ArrayList<Employee>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("I'd already take. Try again: ");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();	
			list.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
	// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : list) {
			System.out.println(employee);
		}
				
		
		
		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}



