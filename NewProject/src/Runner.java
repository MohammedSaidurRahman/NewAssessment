import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args)
	{
		
		Person Matt = new Person("Matt", "24", "Trainer");
		Matt.setName("Matt Stewart");
		
		 
		System.out.println("hi");
		System.out.println(Matt.getName());
		System.out.println(Matt.getAge());
		System.out.println(Matt.getJobTitle());
		
		
		
		Person Annie = new Person("Annie", "21", "Consultant");
		
		System.out.println("hi");
		System.out.println(Annie.getName());
		System.out.println(Annie.getAge());
		System.out.println(Annie.getJobTitle());
		
//		Person Print =  new Print(toString()); ~I tried to print out every record at once,
//												however I cannot do this, the proper way is below.
		
		System.out.println(Matt.toString());
		
		
	}
	
	
	
}


