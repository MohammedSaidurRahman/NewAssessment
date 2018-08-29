

public class Runner {
	
	public static void main(String[] args)
	{
		
		
		Player mo = new Player();
		Treasure chest = new Treasure();
		Compass compass = new Compass(); // dont actually need to create a compass class
		Monster wolf = new Monster();
	
		
		int looper = 0;
	  
		
		double cX = 0;
		double cY = 0;
		double cDirection = 0;
		
		chest.treasureMethod();
		wolf.monsterMethod();
		
	
		
	
		while(looper == 0)
		{
			mo.playerMethod();
		//	System.out.println("Treasure X: " + chest.getTreasureX());
		//	System.out.println("Treasure Y: " + chest.getTreasureY());
			
			//code to check if player has touched the treasure chest
			if(mo.getPlayerX() == chest.getTreasureX() && mo.getPlayerY() == chest.getTreasureY())
			{
				System.out.println("You Win");
			}
			
			//wolf and player collision
			if(mo.getPlayerX() == wolf.getMonsterX() && mo.getPlayerY() == wolf.getMonsterY())
			{
				mo.setPlayerHealth(mo.getPlayerHealth()-wolf.getMonsterAttack());
				if(mo.getPlayerHealth()<=0)
				{
					System.out.println("You have no more health left.");
				}
			}
			
			
			//compass direction
			cX=(mo.getPlayerX()-chest.getTreasureX());
			cX = cX*cX;
			cY=(mo.getPlayerY()-chest.getTreasureY());
			cY = cY*cY;
			cDirection = Math.sqrt(cY + cX);
		//	compass.setCompassDirection(cDirection);
			System.out.println("Point of Interest:" + cDirection);
			System.out.println(wolf.getMonsterX());
			System.out.println(wolf.getMonsterY());
			System.out.println(mo.getPlayerHealth());
			


			
		}
		
		
	}

}
