package Q7;
// import Comparator
import java.util.Comparator;
//implement Comparator Interface using <Employee> as type of object
public class SortByAge implements Comparator<Employee>{
	//compare both Employees by age for sort
	public int compare(Employee x, Employee y) {
		return x.age - y.age;
	}

}
