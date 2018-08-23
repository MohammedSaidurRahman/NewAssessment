
public class Plane extends Vehicles {
	
	public Plane(String type, String colour, int jetSize) {
		super(type, colour);
		// TODO Auto-generated constructor stub
		
		this.jetSize = jetSize;
	}

	private int jetSize;
	
	public void setJetSize(int jetSize) {
		this.jetSize = jetSize;
	}
	
	public int getJetSize() {
		return jetSize;
	}

}
