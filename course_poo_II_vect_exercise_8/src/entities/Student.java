package entities;

public class Student {
	
	// Attributes:
	private String name;
	private double score1;
	private double score2;
	
	
	// Constructor:
	public Student(String name, double score1, double score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}


	// Getters and Setters:
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getScore1() {
		return score1;
	}


	public void setScore1(double score1) {
		this.score1 = score1;
	}


	public double getScore2() {
		return score2;
	}


	public void setScore2(double score2) {
		this.score2 = score2;
	}
	
	
	// Avarage methods:
	public double avarage() {
		return (score1 + score2) / 2.0;
	}
	
	
	
	
	

}
