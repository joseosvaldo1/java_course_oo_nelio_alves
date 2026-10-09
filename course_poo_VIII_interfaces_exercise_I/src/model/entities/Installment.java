package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	// Attributes:
	private LocalDate date;
	private Double amount;
	
	// Constructors:
	public Installment() {
		
	}

	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	
	// Getters and setters:
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	// toString() method:
	@Override
	public String toString() {
		return this.date.format(fmt) + " - " + String.format("%.2f", this.amount);
	}
	
	
	
	
	
	
	
}
