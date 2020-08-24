package questions;

public class Q3 {
	//Reverse a string 
		public char[] reversingString (String s) {
			char[] str = s.toCharArray();
			char[] rev = new char[str.length];
			int c = 0;
			for (int i = s.length(); i>0; i--) {
				rev[c] = str[i - 1];
				c++;
			}
			return rev;
	
		}
}
