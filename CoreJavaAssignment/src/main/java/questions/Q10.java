package questions;

public class Q10 {
	//write method that passes in two integers
	public int min(int x, int y){
		//utilize ternary operator to write condition (x>y)
		int z = (x>y) ? y : x; // If condition is true then z is given the value y. If not then x is assigned to z
		System.out.println(z + "\n"); //Prints the floating points
		return z;
	}
}
