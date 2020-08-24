package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8 {
	
	public ArrayList<String> strRev() {
	//create Arrlist
	ArrayList<String> og = new ArrayList<String>(Arrays.asList("karan", "madam", "tom", "civic", 
			"radar", "jimmy", "kayak", "john", "refer", "billy", "did"));
	//new Arrlist to add reversed list
	ArrayList<String> reverse = new ArrayList<String>();
	//new Arrlist to add list of words that are palindromes
	ArrayList<String> pal = new ArrayList<String>();
	

	for(int x =0; x < og.size(); x++) {//for loop to access og arrList
		StringBuilder revSB = new StringBuilder(); //create new string placeholds
		revSB.append(og.get(x));//add iteration of name from og list to placehole
		revSB = revSB.reverse();//reverse the list
		String reverseS = revSB.toString(); //convert to string
		reverse.add(reverseS); //add tp ArrList
		if(reverse.get(x).equals(og.get(x))) { //compare arrlist to rev arrlist
			pal.add(reverse.get(x)); //if coniditon is fufilled then it is a plaindrom and you add it to to palindrom list
		}
	}//System.out.println(pal);
	return pal;
	}
	
}



