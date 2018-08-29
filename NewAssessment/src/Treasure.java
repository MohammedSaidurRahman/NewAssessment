import java.util.Random;

public class Treasure {
	
	private int treasureX;
	
	private int treasureY;
	
	
	public Treasure()
	{
		
		this.treasureMethod();

	}
	
	public void treasureMethod()
	{
		Random rand = new Random();
		
		int tX = rand.nextInt(10);
		int tY = rand.nextInt(10);
		this.treasureX = tX;
		this.treasureY = tY;

	}

	public int getTreasureX() {
		return treasureX;
	}

	public int getTreasureY() {
		return treasureY;
	}


	
	
	



	

}
