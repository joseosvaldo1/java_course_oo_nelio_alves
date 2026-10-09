package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		/*
		# Polimorfismo:
		- Em Programação Orientada a Objetos, polimorfismo é o recurso que permite
		que variáveis de um mesmo tipo mais genérico possa apontar para objetos de 
		tipos específicos diferentes, tendo assim comportamentos diferentes conforme 
		cada tipo específico.
		
		 
		 
		*/
		
		
		Account x = new Account(1020, "Alex", 1000.00);
		Account y = new SavingsAccount(1023, "Maria", 1000.00, 0.01);
		
//		Observação:
		
//		- A  associação do tipo específico com o tipo genérico é feita em tempo  
//		 de execução (upcasting).
//		- O compilador não sabe para qual tipo específico a chamada do método 
//		withdraw() está sendo feita (ele só sabe que são duas variáveis do tipo 
//		Account)
		
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());  // => 945.0
		System.out.println(y.getBalance());  // => 950.0
		
	
	}


}

