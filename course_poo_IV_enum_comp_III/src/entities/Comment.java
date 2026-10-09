package entities;

public class Comment {
	// Attributes:
	private String text;

	
	
	// Constructor:
	public Comment() {
	}
	
	public Comment(String text) {
		this.text = text;
	}

	
	// Getters and Setters:
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	// toString() method:
	@Override
	public String toString() {
		return "Comment [text=" + text + "]";
	}

	
	
	
	
	
	
}
