package Q7;
//create employee class
public class Employee {
	//instantiate employee class members
	String name, department;
	int age;
	//constructor for Employee
	public Employee(String name, String department,int age ) {
		//utilizing this to avoid overshadowing variable
		this.name = name;
		this.department = department;
		this.age = age;
	}
	// Overriding toString 
	public String toString() {
		return this.name + " " + this.department + " " + this.age;
	}
}
