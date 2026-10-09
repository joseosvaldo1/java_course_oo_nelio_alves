package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
	// Attributes:
	private Color color;

	// Constructor:
	public AbstractShape(Color color) {
		this.color = color;
	}

	// Getters and Setters:
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
