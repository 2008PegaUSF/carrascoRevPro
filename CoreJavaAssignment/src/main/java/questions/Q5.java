package questions;

public class Q5 {
	public static String substring(String str, int idx) {
		char[] subString = new char[idx];
		for(int i=0; i<=idx-1; i++) {
			subString[i] = str.charAt(i);
		}String substr = new String(subString);
		System.out.println(substr);
		return substr;
	}
}
