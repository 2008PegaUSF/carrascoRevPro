package questions;

public class Q6 {
	boolean s = true;
	public boolean even(int num){
		int x = num/2;
		int ans = x*2;
		if (num == ans) {
			System.out.println("The number is Even");
			boolean s = true;
			
		}else {
			System.out.println("The number is not even");
			boolean s = false;
		}
		return s;
	}
}
