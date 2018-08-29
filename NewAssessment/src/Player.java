import java.util.Scanner;

public class Player {
	
	private int playerX;
	
	private int playerY;
	
	private int playerHealth = 3;
	
	
	public Player()
	{
		
		playerMethod();
		
	}
	
	public void playerMethod()
	{
	
		System.out.println("Please enter the direction you wish to travel: ");
		Scanner mainInput = new Scanner(System.in);
		String input = mainInput.nextLine();
		
		//move this into the player class later
		if(input.equals("North") || input.equals("north") || input.equals("n") || input.equals("N"))
		{
			playerY = playerY + 1;
		}
		if(input.equals("South") || input.equals("south") || input.equals("s") || input.equals("S"))
		{
			playerY = playerY - 1;
		}
		if(input.equals("West") || input.equals("west") || input.equals("w") || input.equals("W"))
		{
			playerX = playerX - 1;
		}
		if(input.equals("East") || input.equals("east") || input.equals("e") || input.equals("E"))
		{
			playerX = playerX + 1;
		}
		System.out.println("Position X: " + playerX);
		System.out.println("Position Y: " + playerY);
	}


	public int getPlayerX()
	{
		return playerX;
	}


	public void setPlayerX(int playerX)
	{
		this.playerX = playerX;
	}


	public int getPlayerY()
	{
		return playerY;
	}


	public void setPlayerY(int playerY)
	{
		this.playerY = playerY;
	}

	public int getPlayerHealth() {
		return playerHealth;
	}

	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}
	

}
