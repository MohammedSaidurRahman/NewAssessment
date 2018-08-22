
public class BlackJack {

	public int play(int a, int b)
	{
		
		if (a > 21 &&  b > 21)
		{
			return 0;
		} 
		else if(a > 21 &&  b <  21)
		{
			System.out.println(b);
		}
		else if (a < 21 &&  b > 21)
		{
			System.out.println(a);
		}
		else if ( a >  b)
		{
			System.out.println(a);
		}
		else if(b >  a)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("Draw");
		}
		
		
		return a;
		
	} 
	
}
