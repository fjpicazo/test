package ver2;

public class Account {
	// Instance variable, only available inside this class.
	private double balance; // New comment for balance
	private String name;
	
	// Constructor
	public Account(double balance) {
		this("Unknown", balance);
	}
	
	// Constructor but better
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}
	
	// Getter for name
	public String getName() {
		return name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// A method that increases the balance by amount
	public void deposit(double amount) {
		if(amount>0) {
		balance += amount;
		}
	}
	
	// A method that decreases the balance by amount
	public void withdraw(double amount) {
		if(amount>0) {
		balance -= amount;
		}
	}
	
	// A method that merges the balance in two accounts with the same name
	public void mergeAccount(Account a) {
		if(this.getName().equals(a.getName())) {
			this.balance += a.getBalance();
		}
	}
	
	@Override
	public String toString() {
		String msg = "Name=" + name + ", Balance=$" + balance;
		return msg;
	}

	
	
	// Informal test code
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}


