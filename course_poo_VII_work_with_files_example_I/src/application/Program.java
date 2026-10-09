package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String path = "//home//jose//eclipse-workspace//course_poo_VII_work_with_files_example_I//in.txt";
	
		File file = new File(path);
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
			sc.close();
			}
		}
	}
}
