package Q7;

//import Comparator interface
import java.util.Comparator;

//implement Comparator interface
public class SortByName implements Comparator<Employee>{
	//use compare method to compare both employee's name for order
	public int compare(Employee x, Employee y) {
		return x.name.compareTo(y.name);
	}
}
