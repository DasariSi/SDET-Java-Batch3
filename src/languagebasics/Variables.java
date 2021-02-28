package languagebasics;

public class Variables {

	int val1=15;
	static int val2=20;
	
	/**
	 * Print all variables and distinguish them as per variable type
	 * Local,Instance,Static
	 * @param args
	 */
	public static void main(String[] args) {

		
		Variables obj = new Variables();
		
		int val3=21;

		System.out.println("Instance Variable is "+obj.val1);
		System.out.println("Local Variable is "+val3);
		System.out.println("Static Variable is "+val2);
		
		
		int val1=17;
		System.out.println("Local Variable is "+val1);
		System.out.println("Instance GLobal Variable is"+obj.val1);
		
	}

}
