package questions;
//Import for case 3 
import java.util.Arrays;


public class Q14 {
	public static double swi(int x) {
	double t = 0;	
	switch (x) {// if x == to the values of the case then case will run
		case 1:
			int num = 64;
			t = Math.sqrt(num);
			System.out.println("The square root of 64 is: " );// Sqrt of number
			
		 
		case 2:
			System.out.println(java.time.LocalDate.now()); //get current date

		
		case 3:
			String j = "I am learning java"; //Instantiate string
			String[] arr = j.split(" "); //split using regex
			
			System.out.println(Arrays.toString(arr)); //use toString to print
	}
	return t;
}
}
