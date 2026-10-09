package entities;

public class Account {
	// Attributes / Fields:
	private String holder;
	private int number;
	private double initialDeposit;
	private double balance;
	
	
	

	// Constructors:
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}

	public Account(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}
	
	// Methods:
	
	// Getters and Setters:
	// Holder name:
	public String getHolder() {
		return holder;
	}
	
	

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	// Account number:
	public int getNumber() {
		return number;
	}
	
	
	// Initial deposit
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	
	// Account balance:
	public double getBalance() {
		return balance;
	}
	
	
	// deposit method:
	public double deposit(double amount) {
		this.balance += amount;
		return this.balance;
		
	}
	
	// Withdrawal:
	public double withdrawal(double amount) {
		this.balance -= amount + 5.00;
		return this.balance;
	}
	
	// toString method:
	@Override
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
	
	
	
}
