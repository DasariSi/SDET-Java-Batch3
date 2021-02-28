package buildingblocks;

import accessmodifer.LearnPrivateModifer;
import accessmodifer.LearnProtectedModifer;

public class LearnAccessModifier1 {
	
	private int x=10;
	
	public static void main(String[] args) {

		
		HelloWorld obj = new HelloWorld();
		System.out.println(obj.val);
		obj.x();
		
		
		
		//privateModifier();
		//protectedModifier();
		
	}

	/**
	 * private methoda is accessible 
	 */
	private static void privateMethodWithinSameClass()
	{
		System.out.println("Method is accessible within same class only");
	}
	
	public static void privateModifier()
	{
		
		LearnPrivateModifer  obj = new LearnPrivateModifer();
		//obj.val();
		//obj.disp();
		System.out.println("Private Methods or Variables are not accessible in diff package");
	}
	
	
	public static void protectedModifier()
	{
		
		LearnProtectedModifer obj = new LearnProtectedModifer();
		//obj.disp();
		//obj.val;
		
		
		
		
		
	}
	
	
}
