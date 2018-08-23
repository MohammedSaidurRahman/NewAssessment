import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicles> vehicleList = new ArrayList<>();
	
	
	private int carRepair = 500;
	private int boatRepair = 800;
	private int planeRepair =1000;
	private int tax;

	public void addToGarage(Vehicles vehicle) 
	{
		vehicleList.add(vehicle);
		
		
	}
	
	public void printing()
	{ 
		for (Vehicles vehicle : vehicleList) 
		{

			if(vehicle.getType() =="Plane")
			{
				tax = 4;
				planeRepair = planeRepair*tax;
				System.out.println("Repair bill with tax: " + planeRepair);
				System.out.println("Vehicle type: " + vehicle.getType());
				System.out.println("Colour of vehicle: " + vehicle.getColour());
				System.out.println("");
				
			}
			else if(vehicle.getType() =="Car")
			{
				tax = 3;
				carRepair = carRepair*tax;
				System.out.println("Repair bill with tax: " + carRepair);
				System.out.println("Vehicle type: " + vehicle.getType());
				System.out.println("Colour of vehicle: " + vehicle.getColour());
				System.out.println("");
			}
			else if(vehicle.getType() == "Boat")
			{
				tax = 2;
				boatRepair = boatRepair*tax;
				System.out.println("Repair bill with tax: " + boatRepair);
				System.out.println("Vehicle type: " + vehicle.getType());
				System.out.println("Colour of vehicle: " + vehicle.getColour());
				System.out.println("");
			}
			

			
			}
		}
	

   
    

}
