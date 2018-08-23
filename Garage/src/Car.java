
public class Car extends Vehicles {
	
	private int wheels;
	
	public Car(String type, String colour, int wheels)
	{
//		this.type = type;
		
//		Vehicles.colour = colour;
		
		super(type,colour);
		
		this.wheels = wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getWheels () {
		return wheels;
	}

}
