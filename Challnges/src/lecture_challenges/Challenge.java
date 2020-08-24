package lecture_challenges;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Challenge {
	static String age;
	static String name;
	static String gender;
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("age?");
		age= input.nextLine();
		
		System.out.println("name?");
		name = input.nextLine();
		
		System.out.println("gender?");
		gender = input.nextLine();
		
		
		
		try{ makefile("File.txt");
			printFileContents("File.txt");
		} catch(IOException IOE){
			System.out.println("exception" + IOE.getMessage());
			IOE.printStackTrace();
		}
	}
	public static void makefile(String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		fw.write(age + " \n");
		fw.write(name + "\n");
		fw.write(gender + "\n");
		fw.close();
	}
	public static void printFileContents(String filename) throws IOException{
		FileReader fr = new FileReader(filename);
		char[] buffer = new char[100];
		fr.read(buffer);
		System.out.println(buffer);
		fr.close(); 
	}
}
