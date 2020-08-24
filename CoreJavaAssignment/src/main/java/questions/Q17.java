package questions;
//import scanner
import java.util.Scanner;

//a= Principal Amount( 1 + rate per year(Number of years)
public class Q17 {
	public double total() {
	Scanner s = new Scanner(System.in); //scanner object is created
	System.out.println("Enter Principal Amount");//ask for specific amounts
	double p = Double.parseDouble(s.nextLine()); //
	System.out.println("Enter rate per year in decimal");
	double r = Double.parseDouble(s.nextLine());
	System.out.println("Enter number of years");
	double y = Double.parseDouble(s.nextLine());
	
	double a = p*(1+r*y);
	s.close();
	System.out.println("You owe: " + Double.toString(a));
	return a;
	
	}
}
