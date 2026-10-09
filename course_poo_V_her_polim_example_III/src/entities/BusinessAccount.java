package entities;

public class BusinessAccount extends Account {
	
	// Attributes / Fields:
	private Double loanLimit;

	
	// Constructors:
	public BusinessAccount() {
		super();
	}



	public BusinessAccount(Integer number, String holder, 
			Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimit = loanLimite;
	}

	// Getters and Setters:
	public Double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	
	// Other methods:
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
	// toString() method:
	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" 
				+ loanLimit + ", balance=" 
				+ balance + ", getLoanLimit()=" 
				+ getLoanLimit()
				+ ", getNumber()=" 
				+ getNumber() 
				+ ", getHolder()=" 
				+ getHolder() 
				+ ", getBalance()=" 
				+ getBalance()
				+ ", getClass()=" 
				+ getClass() 
				+ ", hashCode()=" 
				+ hashCode() 
				+ ", toString()=" 
				+ super.toString()
				+ "]";
	}
		
	
	
	
	
}
