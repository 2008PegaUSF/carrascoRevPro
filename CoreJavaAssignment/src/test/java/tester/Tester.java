package tester;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import Q15.Q15;
import Q7.Employee;

import org.junit.jupiter.api.Assertions;

import questions.Q1;
import questions.Q10;
import questions.Q11;
import questions.Q12;
import questions.Q13;
import questions.Q14;
import questions.Q16;
import questions.Q17;
import questions.Q18sub;
import questions.Q19;
import questions.Q2;
import questions.Q20;
import questions.Q3;
import questions.Q4;
import questions.Q5;
import questions.Q6;
import questions.Q8;
import questions.Q9;


public class Tester {
	
	Q1 a = new Q1();
	@Test
	public void testQ1() {
		int list[] = {1,0,5,6,3,2,3,7,9,8,4} ;
		int expected[] = {0,1,2,3,3,4,5,6,7,8,9} ;
		a.bubbleSort(list);
		a.printArray(list);
		Assertions.assertTrue(Arrays.equals(expected, list));
		
	}
	@Test
	public void testQ2() {
		int e = 75025;
		int f = Q2.printFibonacci(24);
		Assertions.assertTrue(f == e);
	}
	@Test
	public void testQ3() {
		char[] s = {'s','t','a','r'};
		String x = new String(s);
		Q3 g = new Q3();
		char[] i = g.reversingString("rats");
		String y = new String(i);
		Assertions.assertTrue(x.contentEquals(y));
		
		//assertEquals(Q3.reversingString("star",3),s);
	}
	@Test
	public void testQ4() {
		int q = 120;
		int w = Q4.factorial(5);
		Assertions.assertTrue(q == w);
	}
	@Test
	public void testQ5() {
		String r = Q5.substring("Successful", 7);
		String o = "Success";
		Assertions.assertTrue(o.equals(r));
	}
	
	@Test
	public void testQ6() {
		Q6 q = new Q6();
		Assertions.assertTrue(q.even(4) == true);
	}
	@Test
	public void testQ7() {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Diana", "Bio",23));
		ArrayList<Employee> f = new ArrayList<Employee>();
		f.add(new Employee("Ric","Phil", 22));
		Assertions.assertFalse(f.equals(e));
	}
	@Test
	public void testQ8() {
		Q8 q8 = new Q8();
		ArrayList<String> c = q8.strRev();
		ArrayList<String> t = new ArrayList<String>(Arrays.asList("madam",
											"civic", "radar", "kayak","refer","did"));
		System.out.println(c);
		System.out.println(t);
		Assertions.assertTrue(t.equals(c));
	}
	@Test
	public void testQ9() {
		Q9 q9 = new Q9();
		ArrayList<Integer> c = q9.arraySorted();
		ArrayList<Integer> i = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
		
		System.out.println(c);
		System.out.println(i);
		Assertions.assertTrue(c.equals(i));
	}
	
	@Test
	public void testQ10() {
		Q10 q = new Q10();
		int a = q.min(1, 10);
		int s = 1;
		Assertions.assertEquals(a,s);	
	}
	
	@Test
	public void testQ11() {
		float varT = 10.2f;
		Q11 q11 = new Q11();
		float varC = q11.getF();
		Assertions.assertEquals(varT,varC);
	}
	@Test
	public void testQ12() {
		Q12 p12 = new Q12();
		ArrayList<Integer> k = p12.q12();
		ArrayList<Integer> o = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100));
		Assertions.assertTrue(k.equals(o));
	}
	@Test
	public void testQ13() {
		int q = Q13.tri01();
		int w = 0;
		Assertions.assertTrue(w == q);
	}
	@Test
	public void testQ14() {
		double s = Q14.swi(1);
		double h = 8;
		Assertions.assertEquals(s,h);
	}
	@Test 
	public void testQ15() {
		Q15 r = new Q15();
		double a = r.add(2, 2);
		double w = 4;
		Assertions.assertEquals(a,w);
		
	}
	@Test
	public void testQ16() {
		int u = Q16.strCharCount("hi");
		int y = 2;
		Assertions.assertEquals(u,y);
	}
	@Test 
	public void testQ17() {
		double a = 2;
		Q17 p17 = new Q17();
		double b = p17.total();
		Assertions.assertEquals(a, b); //use integer 1 only for testing
		
	}
	@Test 
	public void testQ18() {
		Q18sub i = new Q18sub();
		boolean f = i.capCheck("Hi");
		Assertions.assertTrue(f);;
	}
	@Test
	public void testQ19() {
		Assertions.assertTrue(Q19.isPrime(2));
	}
	//@Test
	/**public void testQ20() {
		try {
			System.out.println(Q20.scan("Data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}**/
	
}
