package entities;

public abstract class Person {
	// Attributes / fields:
	protected String name;
	protected Double annualIncome;
	
	// Constructors:
	public Person() {
	}

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	
	// Getters and Setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double incomeTax();

}
