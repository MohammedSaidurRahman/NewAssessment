
public class Vehicles {

	private String type;
	
	private String wheels;
	 
	private String colour;
	
	public Vehicles(String type, String wheels, String colour)
	{ 
		this.setType(type);
 		this.setWheels(wheels);
		this.setColour(colour);

		
	}

	

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getWheels() {
		return wheels;
	}
	
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
