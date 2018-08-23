
public class Runner {
	
	public static void main(String[] args)
	{
		
		Car porsche = new Car("Car", "Red", 4);
		
//		porsche.setType("Car");
		
//		porsche.setColour("Red");
		
//		porsche.setWheels(4);
		
		Boat elan = new Boat("Boat", "Blue", 10);
		

		
		Plane virgin = new Plane("Plane", "White", 20);
		
		
		
		Garage myGarage = new Garage();
		
		myGarage.addToGarage(porsche);
		myGarage.addToGarage(elan);
		myGarage.addToGarage(virgin);
		
		myGarage.printing();
		
		
	}

}
