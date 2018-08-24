import java.util.Scanner;

public class Story {
	

	
	//Start Screen
	public static void start()
	{		
			System.out.println("Welcome to Zork: QA");
			System.out.println("Please enter start to play");
			Scanner mainGame = new Scanner(System.in);
			String startGame = mainGame.nextLine();
			
			
				if(startGame.equals("start"))
				{
					System.out.println("You awake in a strange, misty forest.");
					
					Story.level1();
				}
				
			
	}
	
	public static String level1()
	{
		
		System.out.println("To the north you see a strange tree with carvings on it.");
		System.out.println("To the west you see a murky puddle.");
		System.out.println("All other paths are blocked by the trees.");
		System.out.println("What will you do?");
		System.out.println("Go: ");
		
		Scanner mainGame = new Scanner(System.in);
		String level1 = mainGame.nextLine();
			
			if(level1.equals("north"))
			{
				System.out.println("The tree has an eerie carving 'Mo is terrible for trying to act smart and breaking his code'.");
				Story.level2();
			}
			else if(level1.equals("west"))
			{
				System.out.println("There's nothing here so you decide to go back.");
				Story.level1();
			}
			else
			{
				System.out.println("The trees are blocking you and you can't get past.");
				Story.level1();
			}
		
		
		return null;
	}
	
	public static void level2()
	{
		System.out.println("Horrified that the tree knows your name you look around.");
		System.out.println("To the south is where you just came from.");
		System.out.println("To the west is a boat.");
		System.out.println("What will you do?");
		System.out.println("Go: ");
		
		Scanner mainGame = new Scanner(System.in);
		String level2 = mainGame.nextLine();
		
		if(level2.equals("north"))
		{
			System.out.println("To the north you see a giant wall.");
			System.out.println("You cannot go this way.");
			Story.level2();
		}
		else if(level2.equals("west"))
		{
			System.out.println("You jump onto the boat.");
			//Story.level3();
		}
		else if(level2.equals("south"))
		{
			System.out.println("There's nothing here so you decide to go back.");
			Story.level1();
		}
		else
		{
			System.out.println("You cannot go this way.");
			Story.level2();
		}
	
	
	return;
	}
	
	

}
