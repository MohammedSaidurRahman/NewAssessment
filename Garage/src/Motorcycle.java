
public class Motorcycle extends Vehicles {
	
	private int handleSize;
	
	
	
	public Motorcycle(String type, String wheels, String colour, int handleSize)
	{
		super(type, wheels, colour);
		this.setHandleSize(handleSize);

		
	}
	
	public int getHandleSize() {
		return handleSize;
	}
	
	public void setHandleSize(int HandleSize) {
		this.handleSize = handleSize;
	}

}
