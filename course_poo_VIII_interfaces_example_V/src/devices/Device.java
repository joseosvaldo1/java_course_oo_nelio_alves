package devices;

public abstract class Device {
	// Attributes:
	public String serialNumber;

	// Constructor:
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	// Getters and Setters:
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// Abstract methods:
	public abstract void processDoc(String doc);
	
	
	
}
