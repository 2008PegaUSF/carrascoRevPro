package questions;

public class Q16 {
	public static int strCharCount(String str) {
		int count = 0;//create counter
		for (int i=0; i<str.length(); i++) { //use for loop that does not exceed past the length of the string
			if (str.charAt(i) != ' ') { // use conditional expression that adds count whenever the string is not a space
				count++;//increase counter per character found
			}
		}
		System.out.println("The number of characters in " +"'"+ str + "'" + " is :" + count); //Print statement to console
		System.out.println("\n");
		return count;
	}
}
