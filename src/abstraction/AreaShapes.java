package abstraction;

public interface AreaShapes {

	/**
	 * abstract methods
	 */
	void getArea();
	void diplayResult();
	
	
	public static void message()
	{
		System.out.println("Static method is allowed in interfaces from java 8");
	}
	
	default void msg()
	{
		System.out.println("Default method allowed");
	}
}
