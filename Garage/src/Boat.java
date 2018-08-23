
public class Boat extends Vehicles {
	
	private int turbineSize;
	
	public Boat(String type, String colour, int turbineSize) {
		super(type, colour);
		// TODO Auto-generated constructor stub
		
		this.turbineSize = turbineSize;
	}


	
	public void setTurbineSize(int turbineSize) {
		this.turbineSize = turbineSize;
	}
	
	public int getTurbineSize() {
		return turbineSize;
	}

}
