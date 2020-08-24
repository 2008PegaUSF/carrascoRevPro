package questions;

import java.util.ArrayList;

public class Q9 {
	public ArrayList<Integer> arraySorted() { //static method so no instantiation required
		ArrayList<Integer> nums = new ArrayList<Integer>();//array of 1-100
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			nums.add(i);//for loop to add 1 -100
		}
		for (int c = 0; c<99; c++) { // for loop to iterate over array
			int a = nums.get(c); //get each int from arr
			boolean primeCheck = true; //set boolean val to true
			if (a==1) {				// conditions for prime number
				primeCheck = false;
			} else if (a == 2) {
				primeCheck = true;
			} else {
				for (int b = 2; b<a; b++) { //for loop to ensure that int is not divisble by any number except itself
					if(a%b == 0) {
						primeCheck = false;
					}
				}
			}
			if (primeCheck == true) { // print int to console if boolean value stays true
				//System.out.print(a + " ");
				l.add(a);
			}
		}
		//System.out.println(l + "\n");
		return l;
	}
}