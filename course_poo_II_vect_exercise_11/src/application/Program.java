package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		/*
		 A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos números 0 a 9.
		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o número de estudantes que vão
		alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		N estudantes. Para cada registro de aluguel, informar o nome e email do
		estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		um relatório de todas ocupações do pensionato, por ordem de quarto,
		conforme exemplo.
		
		How many rooms will be rented? 3
		Rent #1:
		Name: Maria Green
		Email: maria@gmail.com
		Room: 5
		Rent #2:
		Name: Marco Antonio
		Email: marco@gmail.com
		Room: 1
		Rent #3:
		Name: Alex Brown
		Email: alex@gmail.com
		Room: 8
		Busy rooms:
		1: Marco Antonio, marco@gmail.com
		5: Maria Green, maria@gmail.com
		8: Alex Brown, alex@gmail.com
		
		
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		
		
		Person[] p = new Person[10];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent # " + (i +1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			if (roomNumber < 0 || roomNumber > 9) {
				System.out.println("Por favor, escolha o numero do quarto de 0 a 9: ");
				roomNumber = sc.nextInt();
			}
			
			if (p[roomNumber] != null) {
				System.out.println("Este quarto ja esta ocupado. Por favor, tente outro: ");
				roomNumber = sc.nextInt();
			}
			
			
			p[roomNumber] = new Person(name, email, roomNumber);	
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(p[i] != null) {
			System.out.println(p[i].getRoomNumber() + ": " + p[i].getName() + ", " + p[i].getEmail());
			}
		}
		
		sc.close();

	}

}
