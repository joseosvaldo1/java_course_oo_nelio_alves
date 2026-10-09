package entities;

public class NaturalPerson extends Person{
	// Attributes / fields:
	private Double healthExpenditures;

	// Constructors:
	public NaturalPerson() {
		super();
	}


	public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	

	public Double getHealthExpense() {
		return healthExpenditures;
	}


	// Getters and Setters:
	public void setHealthExpense(Double healthExpense) {
		this.healthExpenditures = healthExpense;
	}

	
	@Override
	public double incomeTax() {
		double tax;
		if (annualIncome < 20000.0) {
			tax = annualIncome * 0.15 - 0.5*healthExpenditures;
		} else {
			tax = annualIncome * 0.25 - 0.5*healthExpenditures;
		}
		return tax;	
	}


}
