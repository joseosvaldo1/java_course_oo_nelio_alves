package entities;


// Note: final in classes: prevents the class from being inherited.
// public final class SavingsAccount extends Account {
public class SavingsAccount extends Account {
	// Attributes:
	private Double interestRate;

	
	// Constructors:
	public SavingsAccount() {
		super();
	}
	


	public SavingsAccount(Integer number, String holder, 
			Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	
	// Getters and Setters:
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	// Other methods:
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	
	
//	Note: final in methods: prevents the method from being overridden.
//  public final void withdraw(double amount) {
//		balance -= amount;
//	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
