import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args)
	{
		// I wanted the treasure to have a random position every time however I did not want to truncate the value
		// of random int and lose accuracy so by doing this it is accurately a whole number every time for x & y
		double x = Math.random()*10;
		if(x>4.5)
		{
			x = 5;
		}
		else if(x<1 || x>1 && x<1.5)
		{
			x = 1;
		}
		else if(x>1.5 && x<2.5)
		{
			x = 2;
		}
		else if(x>2.5 && x<3.5)
		{
			x = 3;
		}
		else if(x>3.5 && x<4.5)
		{
			x = 4;
		}
		
		double y = Math.random()*10;
		if(y>4.5)
		{
			y = 5;
		}
		else if(y<1 || y>1 && y<1.5)
		{
			y = 1;
		}
		else if(y>1.5 && y<2.5)
		{
			y = 2;
		}
		else if(y>2.5 && y<3.5)
		{
			y = 3;
		}
		else if(y>3.5 && y<4.5)
		{
			y = 4;
		}
		
		//Objects 
		Player Mo = new Player(3,3); //imagine the map is a 5x5 grid, the player is spawning in 3x3 aka the middle
		
		Map map = new Map(5,5);
		
		Treasure gold = new Treasure(x,y);

		Position position = new Position();
		
		Scanner mainGame = new Scanner(System.in);
		
		
		//dont delete save for later reference 
		//Win condition
//		if(Mo.getY() == gold.getTreasureY() && Mo.getX() == gold.getTreasureX())
//		{
//				
//			System.out.println("You have found the treasure, you are now free");
//			
//		}
		
		

//		//Position checker
//		String input = mainGame.nextLine();
//		
//		if(input.equals("start"))
//		{
//			//Story.start();
//		}
//		if(input.equals("north"))
//		{
//			Mo.setX(Mo.getX() +1);
//			System.out.println(Mo.getX());
//		}
//		if(input.equals("south"))
//		{
//			Mo.setX(Mo.getX() -1);
//		}
//		if(input.equals("west"))
//		{
//			Mo.setY(Mo.getY() -1);
//		}
//		if(input.equals("east"))
//		{
//			Mo.setY(Mo.getY() +1);
//		}
//		
		Story.start();
		

		
	}

}
