package model.services;



public class UsaInterestService implements InterestService {
	// Attributes:
	private double interestRate;

	// Constructor:
	public UsaInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	// Getters and Setters:
	@Override
	public double getInterestRate() {
		return interestRate;
	}


	
	
}
