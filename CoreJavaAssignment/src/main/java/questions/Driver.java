package questions;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		//Test Q1 BubbleSort
		int list[] = {1,0,5,6,3,2,3,7,9,8,4} ;
		Q1 bs = new Q1();
		bs.bubbleSort(list);
		bs.printArray(list);
		System.out.println("\n");
		
		//Print Q2 Fibonacci Numbers
		System.out.print(+ 0);
		System.out.print(" " + 1);
		Q2.printFibonacci(25 - 1);
		System.out.println("\n");
		
		//Test Q3 reverse a string
		String s = "star";
		Q3 r = new Q3();
		System.out.println(r.reversingString(s));
		System.out.println("\n");
		
		//Test Q4 Factorial
		Q4.factorial(5);
		System.out.println("\n");
		
		//Test Q5 Substring
		Q5.substring( "Successful", 7);
		System.out.println("\n");
		
		//Test Q6 Even check method
		Q6 q = new Q6();
		q.even(39);
		System.out.println("\n");
		
		//Q8Palin program
		Q8 q8i = new Q8();
		ArrayList<String> j = q8i.strRev();
		System.out.println(j);
		System.out.println("\n");  
		
		//Q9array prime 1- 100
		Q9 q9 = new Q9();
		q9.arraySorted();
		
		
		
		//Test Q10
		Q10 q10 = new Q10();
		q10.min(16, 14);
		
		//Test Q11
		Q11 q11 = new Q11();
		q11.getF();
		
		//Test Q12	
		Q12 p = new Q12();
		p.q12();
		System.out.println("\n");
		
		//test Q13
		Q13.tri01();
		
		//Test q14
		Q14.swi(1);
		System.out.println("\n");
		//Q16
		Q16.strCharCount("I will succeed ");
		
		//Q17
		Q17 p17 = new Q17();
		p17.total();
		System.out.println("\n");
		
		//Q18 
		Q18sub z = new Q18sub(); 
		z.capCheck("thiS");
		z.lower2Upper("welcome");
		z.str2IntplusTen("10");
		System.out.println("\n");
		// Q19
		Q19 p19 = new Q19();
		p19.listMov();
		//Q20
		try {
			Q20.scan("Data.text");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
