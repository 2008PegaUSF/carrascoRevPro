package bankingApp;

public class CustomerAccount extends Customer implements Transactions{
int funds;

	public void deposit(int moneyM) {
		funds = funds + moneyM; 
		
	}

	public void withdraw(int moneyP) {
		funds = funds - moneyP;
		
	}

	public void transfer(CustomerAccount x, CustomerAccount y,Integer z) {
		x.funds = x.funds - z;
		y.funds = y.funds + z;
	}
	
}
