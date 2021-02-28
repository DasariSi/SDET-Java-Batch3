package languagebasics;

public class LearnVariable {

	public static int x=15;
	int y=100; //instance variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			/**
			 * int = data type -- integer values
			 * x = my variable name
			 * 10 = value
			 */
			int x =10;
			//int x=15;  -- duplicate local variable
		
			
			
			System.out.println("Main Method x:"+x);
			eat();
			sleep();
	
			System.out.println(LearnVariable.x);//static variable
			
			LearnVariable obj = new LearnVariable();
			System.out.println(obj.y);
			System.out.println(obj.x);
			
			
	}
	
	public static void eat()
	{
		 
		int z=54;
		System.out.println("Local Variable:"+z);
		
		//System.out.println(y);
		System.out.println(x);
		System.out.println("eat");
	}
	
	public static void sleep()
	{
		System.out.println("sleep");
		
	}

}
