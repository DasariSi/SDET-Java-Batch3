package exceptionhandling;

public class Throw {

	public static void main(String[] args) {

		int age=15;
		if(age <18)
			throw new ArithmeticException("Not Eligible for Driving");
		else
			System.out.println("Eligible");
		
		
		
		
		
	}

}
