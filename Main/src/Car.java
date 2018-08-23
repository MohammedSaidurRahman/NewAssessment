
public class Car {
	
	private String model;
	private String colour;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return this.colour;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", colour=" + colour + "]";
	}
	
	
}



