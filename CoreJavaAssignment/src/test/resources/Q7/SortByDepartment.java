package Q7;
// Import Package
import java.util.Comparator;
// implement comparator Interface using <Employee> as type of object
public class SortByDepartment implements Comparator<Employee> {
	//Compares both Employee's by department for order
	public int compare(Employee x, Employee y) {
		return x.department.compareTo(y.department); //specify compareTo by department 
	}

}
