package Q15;

public class Test {
	public static void main(String[] args) {
		double a = 5; //hard code operands
		double b = 6;
		
		Q15 c = new Q15(); //instantiate an object of the Q15 class
		
		c.add(a, b); //call each method using c object
		c.div(a, b);
		c.sub(a,b);
		c.mult(a, b);
	}
}
