package bankingApp;

import java.io.Serializable;

public class Customer implements Serializable {
	String uname;
	String pw;
	int funds;
	String fname;
	String lname;
	
	public Customer(String fname, String lname, String uname, 
						String pw) {
		this.uname = uname;
		this.pw = pw;
		this.fname = fname;
		this.lname= lname;
		//this.funds = funds;
		
	}
	public String toString() {
        return "Username: " + uname + " Password: " + pw + " First Name: " + 
        			fname + " Last Name: " + lname;
	
	}
	
}
