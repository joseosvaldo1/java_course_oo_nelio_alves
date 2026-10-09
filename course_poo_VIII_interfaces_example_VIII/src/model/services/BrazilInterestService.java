package model.services;


public class BrazilInterestService implements InterestService {
	// Attributes:
	private double interestRate;

	// Constructor:
	public BrazilInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	// Getters and Setters:
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}


	
}
