package questions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q20 {
	public static String[] scan(String path) throws FileNotFoundException {
		File data = new File(path);
		String[] newA = null;
		Scanner s = new Scanner(data);
		 while(s.hasNext()) {
			 String a = s.nextLine();
			 newA =  a.split(":");
			 
			 System.out.println("Name: " + newA[0] +" "+ newA[1] + "\n" 
					 					+ "Age: " + newA[2] + " Years" + "\n" 
					 					+ "State: " + newA[3] + " State" +"\n");
			 
		 }	s.close();
		return newA;
	
	}
}
