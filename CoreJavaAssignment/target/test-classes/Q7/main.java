package Q7;
//Import ArrayList to instantiate e 
//Import collections to gain access to sort method
import java.util.ArrayList;
import java.util.Collections;

public class main {
	//main method is entry point to program
	public static void main(String[] args) {
		//create arraylist e to add employees using Employee constructor
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Ric", "Philosophy", 22));
		e.add(new Employee("Diana", "Micro-Bio",23));
		
		//call the sort method and pass in e and utilize the SortByName class that was created by extending the comparator class
		Collections.sort(e, new SortByName());
		System.out.println("Sorted by name:"); //Specify type of sort
		for (int i = 0; i<e.size(); i++) { //use for loop to iterate over sorted list
			System.out.println(e.get(i));//prints each iteration of the arraylist to the console
			
		} System.out.println("\n"); //added outside of for loop to make it readable in the console
		// same as above except specify sort by SortByDepartment
		Collections.sort(e, new SortByDepartment());
		System.out.println("Sorted by Department:");
		for (int x = 0; x<e.size(); x++) {
			System.out.println(e.get(x));
			
		}System.out.println("\n");
		// Same as above except specify by SortByAge;
		Collections.sort(e,new SortByAge());
		System.out.println("Sorted by Age;");
		for (int y = 0; y<e.size(); y++) {
			System.out.println(e.get(y));
			
		}System.out.println("\n");
		
		
	}
}

