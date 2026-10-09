package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String path = "/home/jose/eclipse-workspace/"
				+ "course_poo_VI_treat_exception_example_III/in.txt";
	
		File file = new File(path);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e){
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed!");
		}
		
		
	}
}
