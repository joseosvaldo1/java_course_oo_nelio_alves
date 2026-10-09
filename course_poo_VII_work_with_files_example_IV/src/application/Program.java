package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "//home//jose//eclipse-workspace//course_poo_VII_work_with_files_example_IV//out.txt";
	
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();  // => Quebra de linha
			}
			System.out.println("Succesfully");
		}
		catch (IOException e){
			// System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
