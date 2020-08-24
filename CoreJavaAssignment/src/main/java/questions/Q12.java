package questions;
//import Arraylist so as to utilize constructor
import java.util.ArrayList;

public class Q12 {
	public ArrayList<Integer> q12() {
	ArrayList<Integer> li = new ArrayList<Integer>(); //assign an Arraylist to li
	for (int i = 1; i<=100; i++) { //use to generate number 1-100
		if (i % 2 == 0) { //nest conditional within for loop so as to only add even numbers to our Arraylist
			li.add(i); //use add method to insert values into array
		}
	}//enhanced for loop aka For-Each loop
	for (int x : li) { // specify variable type with new variable which li is passed thru
		System.out.print(x + " " ); //prints to console w/ spaces between the numbers
		
	}return li; //add line
	}
	
}
