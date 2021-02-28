package buildingblocks;

import languagebasics.LearnVariable;

public class HelloWorld {

	
	protected int val =10;
	protected void x()
	{
		System.out.println("Within same package diff class");
	}
	
	/**
	 * this is main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("Automation SDET -java");
		System.out.println("First");

		System.out.println("Program");

		// CLassName.VariableName == static variable access from any where
		System.out.println(LearnVariable.x);

	}

}
