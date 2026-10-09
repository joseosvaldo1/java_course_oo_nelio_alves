package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING: Casting from subclass to superclass
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		System.out.println("acc1: " + acc);
		System.out.println("acc1: " + acc1);
		System.out.println("acc2: " + acc2);
		System.out.println("acc3: " + acc3);
		
		
		// DOWNCASTING: Casting from superclass to subclass
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		System.out.println();
		System.out.println("acc4: " + acc4);
		
		System.out.println();
		
//		BusinessAccount acc5 = (BusinessAccount) acc3; // => Forbidden operation
//		System.out.println("acc5: " + acc5);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("acc5: " + acc5);
			System.out.println("LOAN!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("UPDATE!");
			System.out.println("acc5: " + acc5);
		}
		
	}

}

