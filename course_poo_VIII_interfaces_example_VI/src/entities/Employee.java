package entities;

public class Employee implements Comparable<Employee>{
	// Attributes:
	private String name;
	private Double salary;
	
	/////////////////////////////
	
	// Constructor:
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	/////////////////////////////
	
	// Getters and Setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	

//	@Override
//	public int compareTo(Employee other) {
//		return this.name.compareTo(other.getName());
//	}
	
//	@Override
//	public int compareTo(Employee other) {
//		return this.salary.compareTo(other.getSalary());
//	}
	
	
	@Override
	public int compareTo(Employee other) {
		return - this.salary.compareTo(other.getSalary());
	}
	
	@Override
	public String toString() {
		return this.getName() + ", " + String.format("%.2f",this.getSalary());
	}

	
}
