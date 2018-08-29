import java.util.Random;

public class Monster {
	
	private int monsterX;
	
	private int monsterY;
	
	private int monsterAttack;
	
	public Monster()
	{
		monsterMethod();
	}
	
	public void monsterMethod()
	{
		Random rand = new Random();
		
		int mX = rand.nextInt(10);
		int mY = rand.nextInt(10);
		int mA = rand.nextInt(3);
		this.monsterX = mX;
		this.monsterY = mY;
		this.monsterAttack = mA;
		
		
	}

	public int getMonsterX() {
		return monsterX;
	}

	public void setMonsterX(int monsterX) {
		this.monsterX = monsterX;
	}

	public int getMonsterY() {
		return monsterY;
	}

	public void setMonsterY(int monsterY) {
		this.monsterY = monsterY;
	}

	public int getMonsterAttack() {
		return monsterAttack;
	}

	public void setMonsterAttack(int monsterAttack) {
		this.monsterAttack = monsterAttack;
	}
	
	
	
	
	
	
}
