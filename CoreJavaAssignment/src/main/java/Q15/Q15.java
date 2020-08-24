package Q15;
//implement interface
public class Q15 implements BaseCalc{

	//override each method
	public double add(double x, double y) {
		double z; //create instance variable for each method
		z = x + y;//arithmetic
		System.out.println(z);
		return z;//return answer
	}


	public void sub(double x, double y) {
		double z;
		z = x - y;
		System.out.println(z);
	}

	public void mult(double x, double y) {
		double z;
		z = x * y;
		System.out.println(z);
	}


	public void div(double x, double y) {
		double z;
		z = x / y;
		System.out.println(z);

	}

}
