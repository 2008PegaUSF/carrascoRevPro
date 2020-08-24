package questions;

public class Q4 {
	public static int factorial(int x) {
		int f = 1;
		if (x == 0) {
			System.out.println(1);
		}else {
		for( int i = 1; i <= x; i++) {
			f = f*i;
		}System.out.println(f);
		}
		return f;
	}
}
