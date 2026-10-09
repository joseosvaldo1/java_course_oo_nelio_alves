package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		
		System.out.println("End of program");
	}
	
	public static void method1() {
		System.out.println("***METHOD 1 START***");
		
		method2();
		
		System.out.println("***METHOD 1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD 2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter space-separated names for the array vect: ");
			String[] vect = sc.nextLine().split(" ");
		
			System.out.print("Enter an integer number for the position: ");
			int position = sc.nextInt();
			sc.nextLine();
		
			System.out.println();
			System.out.print("vect[" + position + "]: " + vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");
			e.printStackTrace();
			System.out.print("Type anything: ");
			sc.next();
		} 
		catch (InputMismatchException e){
			System.out.println("You didn´t choose valid integer for the position!");
			// e.printStackTrace();
		}

		
		sc.close();
		System.out.println();
		System.out.println("***METHOD 2 END***");
	}
	
	
}
