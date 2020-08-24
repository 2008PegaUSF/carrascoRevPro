package questions;

import java.util.ArrayList;

public class Q19 {
	public void listMov() {
	
	ArrayList<Integer> arrInt = new ArrayList<Integer>();
	for (int x = 1; x<=10; x++){
		arrInt.add(x);
		}
	System.out.println(arrInt);
	int c = 0;
	for (int x = 0; x<10; x++) {
		int a = arrInt.get(x);
		if (a%2 == 0) {
			c= a + c;
		}
	}
	System.out.println(c);
	int s = 0;
	for (int p = 0; p<10; p++) {
		int l = arrInt.get(p);
		if (l%2 != 0) {
			s= l + s;
	}
	}
	System.out.println(s);
	
	for (int f = 0; f<arrInt.size(); f++) {
		boolean priC = isPrime(arrInt.get(f)); 
		if (priC != true){
			arrInt.remove(f);
		}
	}System.out.println(arrInt + "\n");
	
	}
	public static boolean isPrime(int x) {

        //This will check for prime numbers
       if(x == 1 || x == 0) {
    	   return false;
       }

       if(x == 2) {
    	   return true;
       }


       //check if n is a multiple of 2
       if (x % 2 == 0) {
    	   return false;
       }

       //if not, then just check the odds
       for (int i = 3; i * i <= x; i += 2) {
           if (x % i == 0) {
               return false;
       }
       
       }return true;	
}
}