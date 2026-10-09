package entities;

public class LegalPerson extends Person {
	// Attributes / fields:
	private Integer numberOfEmployee;
	
	// Constructors:
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}


	// Getters and Setters:
	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}


	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}



	@Override
	public double incomeTax() {
		double tax;
		if (numberOfEmployee < 10) {
			tax = annualIncome * 0.16;
		} else {
			tax = annualIncome * 0.14;
		}

		return tax;
	}


	
	
	
}
